package com.accounts.dto;

public class AccountDto {

    private  long id;
    private  String nrb;
    private  String currency;
    private  Double availableFunds;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNrb() {
        return nrb;
    }

    public void setNrb(String nrb) {
        this.nrb = nrb;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Double getAvailableFunds() {
        return availableFunds;
    }

    public void setAvailableFunds(Double availableFunds) {
        this.availableFunds = availableFunds;
    }
}
