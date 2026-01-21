package com.valorize.valorize.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Coin {
    @JsonProperty("simbolo")
    private String symbol;

    @JsonProperty("nome")
    private String name;

    @JsonProperty("tipo_moeda")
    private char coin_Type;
}
