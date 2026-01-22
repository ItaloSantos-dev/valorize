package com.valorize.valorize.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


@JsonIgnoreProperties
public class Quotation {
    @JsonIgnore
    private String coinName;

    public String getCoinName() {
        return coinName;
    }

    public void setCoinName(String coinName) {
        this.coinName = coinName;
    }

    @JsonProperty("paridade_compra")
    private double parityBuy;

    @JsonProperty("paridade_venda")
    private double paritySell;

    @JsonProperty("cotacao_compra")
    private double quotationBuy;

    @JsonProperty("cotacao_venda")
    private double quotationSell;

    public double getParityBuy() {
        return parityBuy;
    }

    public void setParityBuy(double parityBuy) {
        this.parityBuy = parityBuy;
    }

    public double getParitySell() {
        return paritySell;
    }

    public void setParitySell(double paritySell) {
        this.paritySell = paritySell;
    }

    public double getQuotationBuy() {
        return quotationBuy;
    }

    public void setQuotationBuy(double quotationBuy) {
        this.quotationBuy = quotationBuy;
    }

    public double getQuotationSell() {
        return quotationSell;
    }

    public void setQuotationSell(double quotationSell) {
        this.quotationSell = quotationSell;
    }
}
