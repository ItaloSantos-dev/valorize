package com.valorize.valorize.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Investiment {
    @JsonProperty("nome")
    private String name;

    @JsonProperty("valor")
    private float amount;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }
}
