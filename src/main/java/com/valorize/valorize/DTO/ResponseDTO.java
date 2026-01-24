package com.valorize.valorize.DTO;


public record ResponseDTO(
        String coinOut,
        float amountTotal,
        float amountProfit,

        String coinInput,
        float amountCoinInput,

        String investment,
        int amountDays
        ) {
}
