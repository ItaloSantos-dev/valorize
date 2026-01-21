package com.valorize.valorize.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
import java.util.List;

public class CoinQuotation {
    @JsonProperty("cotacoes")
    private List<Quotation> quotations;

    @JsonProperty("moeda")
    private String coin;

    @JsonProperty("data")
    private Date date;

    public List<Quotation> getQuotations() {
        return quotations;
    }

    public void setQuotations(List<Quotation> quotations) {
        this.quotations = quotations;
    }

    public String getCoin() {
        return coin;
    }

    public void setCoin(String coin) {
        this.coin = coin;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
