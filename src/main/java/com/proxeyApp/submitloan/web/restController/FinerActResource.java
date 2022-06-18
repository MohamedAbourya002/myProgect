package com.proxeyApp.submitloan.web.restController;

import com.proxeyApp.submitloan.config.FinerActConstants;
import com.proxeyApp.submitloan.errors.ErrorConstants;
import com.proxeyApp.submitloan.errors.ResponseError;
import com.proxeyApp.submitloan.web.restController.dto.ClientDto;
import com.proxeyApp.submitloan.web.restController.dto.ResponseDTO;
import com.proxeyApp.submitloan.web.restController.dto.SubmitLoanDTO;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api")
public class FinerActResource {

    private final RestTemplate restTemplate;


    public FinerActResource(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("/loans")
    public Object getLoans() {

        HttpHeaders headers = new HttpHeaders();
//        headers.setAccept("application/json; charset=utf8");
        headers.set("Content-Type", "application/json; charset=utf8");
        headers.setBasicAuth("bWlmb3M6cGFzc3dvcmQ=");
        headers.set("Fineract-Platform-TenantId", "default");
        HttpEntity<String> entity = new HttpEntity<>("body", headers);

        try {
            ResponseEntity<Object> loanList = restTemplate.exchange(FinerActConstants.LOAN_PRODUCT_URL, HttpMethod.GET, entity, Object.class);
            return loanList;
        }

        catch (final HttpClientErrorException e) {
            ResponseError responseError = new ResponseError(ErrorConstants.ERR_VALIDATION,e.getStatusCode().value(),"004",e.getResponseBodyAsString());
            return new ResponseEntity(responseError, HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping("/loans")
    public ResponseEntity<ResponseDTO> createNewLoan(@RequestBody SubmitLoanDTO submitLoanDTO) {

        submitLoanDTO.setDateFormat("dd MMMM yyyy");
        submitLoanDTO.setLocale("en");

        HttpHeaders headers = new HttpHeaders();
        headers.set("Content-Type", "application/json; charset=utf8");
        headers.setBasicAuth("bWlmb3M6cGFzc3dvcmQ=");
        headers.set("Fineract-Platform-TenantId", "default");

        HttpEntity<SubmitLoanDTO> entity = new HttpEntity<>(submitLoanDTO, headers);

        try {
            ResponseEntity<ResponseDTO> dtoResponseEntity = restTemplate.exchange(FinerActConstants.SUBMIT_URL, HttpMethod.POST, entity, ResponseDTO.class);
            return dtoResponseEntity;
        }

        catch (final HttpClientErrorException e) {
            ResponseError responseError = new ResponseError(ErrorConstants.ERR_VALIDATION,e.getStatusCode().value(),"004",e.getResponseBodyAsString());
            return new ResponseEntity(responseError, HttpStatus.BAD_REQUEST);
        }
    }


    @PostMapping("/loans/create-client")
    public Object createClient(@RequestBody ClientDto clientDto) {

        clientDto.setDateFormat("dd MMMM yyyy");
        clientDto.setLocale("en");

        HttpHeaders headers = new HttpHeaders();
        headers.set("Content-Type", "application/json; charset=utf8");
        headers.setBasicAuth("bWlmb3M6cGFzc3dvcmQ=");
        headers.set("Fineract-Platform-TenantId", "default");

        HttpEntity<ClientDto> entity = new HttpEntity<>(clientDto, headers);
        try {
            ResponseEntity<Object>  dtoResponseEntity = restTemplate.exchange(FinerActConstants.CLIENT_URL, HttpMethod.POST, entity, Object.class);
            return dtoResponseEntity;

        }
        catch (final HttpClientErrorException e) {
            ResponseError responseError = new ResponseError(ErrorConstants.ERR_VALIDATION,e.getStatusCode().value(),"004",e.getResponseBodyAsString());
            return new ResponseEntity(responseError, HttpStatus.BAD_REQUEST);
        }
        
    }

}
