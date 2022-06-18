package com.proxeyApp.submitloan.web.restController.dto;
import java.io.Serializable;
//import java.time.Instant;
import java.util.Objects;

public class SubmitLoanDTO implements Serializable {

  private Long productId ;

  private String submittedOnDate ;

  private String expectedDisbursementDate ;

  private Double principal ;

  private int loanTermFrequency ;

  private int loanTermFrequencyType ;

  private int numberOfRepayments ;

  private int repaymentEvery ;

  private int repaymentFrequencyType ;

  private int repaymentFrequencyNthDayType ;

  private int repaymentFrequencyDayOfWeekType ;

  private int interestRatePerPeriod ;

  private int interestType ;

//  private boolean isEqualAmortization;

  private int amortizationType ;

  private int interestCalculationPeriodType;

  private Boolean allowPartialPeriodInterestCalcualtion;

  private int transactionProcessingStrategyId ;

  private Long clientId ;

  private String dateFormat ;

  private String locale ;

  private String loanType;


    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getSubmittedOnDate() {
        return submittedOnDate;
    }

    public void setSubmittedOnDate(String submittedOnDate) {
        this.submittedOnDate = submittedOnDate;
    }

    public String getExpectedDisbursementDate() {
        return expectedDisbursementDate;
    }

    public void setExpectedDisbursementDate(String expectedDisbursementDate) {
        this.expectedDisbursementDate = expectedDisbursementDate;
    }

    public Double getPrincipal() {
        return principal;
    }

    public void setPrincipal(Double principal) {
        this.principal = principal;
    }

    public int getLoanTermFrequency() {
        return loanTermFrequency;
    }

    public void setLoanTermFrequency(int loanTermFrequency) {
        this.loanTermFrequency = loanTermFrequency;
    }

    public int getLoanTermFrequencyType() {
        return loanTermFrequencyType;
    }

    public void setLoanTermFrequencyType(int loanTermFrequencyType) {
        this.loanTermFrequencyType = loanTermFrequencyType;
    }

    public int getNumberOfRepayments() {
        return numberOfRepayments;
    }

    public void setNumberOfRepayments(int numberOfRepayments) {
        this.numberOfRepayments = numberOfRepayments;
    }

    public int getRepaymentEvery() {
        return repaymentEvery;
    }

    public void setRepaymentEvery(int repaymentEvery) {
        this.repaymentEvery = repaymentEvery;
    }

    public int getRepaymentFrequencyType() {
        return repaymentFrequencyType;
    }

    public void setRepaymentFrequencyType(int repaymentFrequencyType) {
        this.repaymentFrequencyType = repaymentFrequencyType;
    }

    public int getRepaymentFrequencyNthDayType() {
        return repaymentFrequencyNthDayType;
    }

    public void setRepaymentFrequencyNthDayType(int repaymentFrequencyNthDayType) {
        this.repaymentFrequencyNthDayType = repaymentFrequencyNthDayType;
    }

    public int getRepaymentFrequencyDayOfWeekType() {
        return repaymentFrequencyDayOfWeekType;
    }

    public void setRepaymentFrequencyDayOfWeekType(int repaymentFrequencyDayOfWeekType) {
        this.repaymentFrequencyDayOfWeekType = repaymentFrequencyDayOfWeekType;
    }

    public int getInterestRatePerPeriod() {
        return interestRatePerPeriod;
    }

    public void setInterestRatePerPeriod(int interestRatePerPeriod) {
        this.interestRatePerPeriod = interestRatePerPeriod;
    }

    public int getInterestType() {
        return interestType;
    }

    public void setInterestType(int interestType) {
        this.interestType = interestType;
    }

//    public boolean getEqualAmortization() {
//        return isEqualAmortization;
//    }

//    public void setEqualAmortization(boolean equalAmortization) {
//        isEqualAmortization = equalAmortization;
//    }

    public int getAmortizationType() {
        return amortizationType;
    }

    public void setAmortizationType(int amortizationType) {
        this.amortizationType = amortizationType;
    }

    public int getInterestCalculationPeriodType() {
        return interestCalculationPeriodType;
    }

    public void setInterestCalculationPeriodType(int interestCalculationPeriodType) {
        this.interestCalculationPeriodType = interestCalculationPeriodType;
    }

    public Boolean getAllowPartialPeriodInterestCalcualtion() {
        return allowPartialPeriodInterestCalcualtion;
    }

    public void setAllowPartialPeriodInterestCalcualtion(Boolean allowPartialPeriodInterestCalcualtion) {
        this.allowPartialPeriodInterestCalcualtion = allowPartialPeriodInterestCalcualtion;
    }

    public int getTransactionProcessingStrategyId() {
        return transactionProcessingStrategyId;
    }

    public void setTransactionProcessingStrategyId(int transactionProcessingStrategyId) {
        this.transactionProcessingStrategyId = transactionProcessingStrategyId;
    }

    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    public String getDateFormat() {
        return dateFormat;
    }

    public void setDateFormat(String dateFormat) {
        this.dateFormat = dateFormat;
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public String getLoanType() {
        return loanType;
    }

    public void setLoanType(String loanType) {
        this.loanType = loanType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SubmitLoanDTO that = (SubmitLoanDTO) o;
        return loanTermFrequency == that.loanTermFrequency && loanTermFrequencyType == that.loanTermFrequencyType && numberOfRepayments == that.numberOfRepayments && repaymentEvery == that.repaymentEvery && repaymentFrequencyType == that.repaymentFrequencyType && repaymentFrequencyNthDayType == that.repaymentFrequencyNthDayType && repaymentFrequencyDayOfWeekType == that.repaymentFrequencyDayOfWeekType && interestRatePerPeriod == that.interestRatePerPeriod && amortizationType == that.amortizationType && interestCalculationPeriodType == that.interestCalculationPeriodType && transactionProcessingStrategyId == that.transactionProcessingStrategyId && Objects.equals(productId, that.productId) && Objects.equals(submittedOnDate, that.submittedOnDate) && Objects.equals(expectedDisbursementDate, that.expectedDisbursementDate) && Objects.equals(principal, that.principal) && Objects.equals(interestType, that.interestType) && Objects.equals(allowPartialPeriodInterestCalcualtion, that.allowPartialPeriodInterestCalcualtion) && Objects.equals(clientId, that.clientId) && Objects.equals(dateFormat, that.dateFormat) && Objects.equals(locale, that.locale) && Objects.equals(loanType, that.loanType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId, submittedOnDate, expectedDisbursementDate, principal, loanTermFrequency, loanTermFrequencyType, numberOfRepayments, repaymentEvery, repaymentFrequencyType, repaymentFrequencyNthDayType, repaymentFrequencyDayOfWeekType, interestRatePerPeriod, interestType, amortizationType, interestCalculationPeriodType, allowPartialPeriodInterestCalcualtion, transactionProcessingStrategyId, clientId, dateFormat, locale, loanType);
    }

    @Override
    public String toString() {
        return "SubmitLoanDTO{" +
                "productId=" + productId +
                ", submittedOnDate=" + submittedOnDate +
                ", expectedDisbursementDate=" + expectedDisbursementDate +
                ", principal=" + principal +
                ", loanTermFrequency=" + loanTermFrequency +
                ", loanTermFrequencyType=" + loanTermFrequencyType +
                ", numberOfRepayments=" + numberOfRepayments +
                ", repaymentEvery=" + repaymentEvery +
                ", repaymentFrequencyType=" + repaymentFrequencyType +
                ", repaymentFrequencyNthDayType=" + repaymentFrequencyNthDayType +
                ", repaymentFrequencyDayOfWeekType=" + repaymentFrequencyDayOfWeekType +
                ", interestRatePerPeriod=" + interestRatePerPeriod +
                ", interestType=" + interestType +
//                ", isEqualAmortization=" + isEqualAmortization +
                ", amortizationType=" + amortizationType +
                ", interestCalculationPeriodType=" + interestCalculationPeriodType +
                ", allowPartialPeriodInterestCalcualtion=" + allowPartialPeriodInterestCalcualtion +
                ", transactionProcessingStrategyId=" + transactionProcessingStrategyId +
                ", clientId=" + clientId +
                ", dateFormat='" + dateFormat + '\'' +
                ", locale='" + locale + '\'' +
                ", loanType='" + loanType + '\'' +
                '}';
    }
}
