package com.proxeyApp.submitloan.config;

import org.springframework.beans.factory.annotation.Value;

/**
 * Application constants.
 */
public final class FinerActConstants {

    public static final String FINERACT_BASE_URL="https://api.lnddo.loan/fineract-provider/api/v1/" ;


    public static final String LOAN_URL = FINERACT_BASE_URL+"/loans";
    public static final String SUBMIT_URL = FINERACT_BASE_URL+"/loans";
    public static final String CLIENT_URL = FINERACT_BASE_URL+"/clients";
    public static final String LOAN_PRODUCT_URL = FINERACT_BASE_URL+"/loanproducts";

    private FinerActConstants() {
    }
}
