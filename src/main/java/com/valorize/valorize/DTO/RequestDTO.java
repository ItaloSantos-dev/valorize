package com.valorize.valorize.DTO;

public record RequestDTO(
        float amountInput,
        String coinInputString,
        int amountDay,
        String investimentType,
        String coinOutString
) {
}
