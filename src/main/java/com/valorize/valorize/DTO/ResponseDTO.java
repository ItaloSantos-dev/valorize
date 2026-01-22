package com.valorize.valorize.DTO;


public record ResponseDTO(
        String coinOut,
        float amountTotal,

        String coinInput,
        float amountCoinInput,

        String investment,
        int amountDays
        ) {
}
