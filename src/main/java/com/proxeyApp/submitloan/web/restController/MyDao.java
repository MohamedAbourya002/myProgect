package com.proxeyApp.submitloan.web.restController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.RequestEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@Component
public class MyDao {

    // This is the RestTemplate for DownstreamApi.MY_API_1
    private RestTemplate restTemplateApi1;

    public MyDao(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplateApi1 = restTemplateBuilder
                .errorHandler(new MyApiRestTemplateErrorHandler())
                .build();
    }

    public void updateStuff(String param1) {
        URI uri = UriComponentsBuilder
                .fromUriString("https://downstream-api.com/stuff/{param}")
                .build(param1);

        RequestEntity<Void> requestEntity = RequestEntity
                .post(uri)
                .build();

        restTemplateApi1.exchange(requestEntity, Object.class);
    }

    // TODO other API calls

}