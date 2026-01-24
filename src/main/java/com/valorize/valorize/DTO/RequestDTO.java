package com.valorize.valorize.DTO;


import com.valorize.valorize.DTO.enums.CoinSymbol;
import com.valorize.valorize.DTO.enums.InvestimentType;
import jakarta.validation.constraints.Min;

public record RequestDTO(
        @Min(1)
        float amountInput,

        CoinSymbol coinInputString,

        @Min(1)
        int amountDay,

        InvestimentType investimentType,

        CoinSymbol coinOutString
) {
}
