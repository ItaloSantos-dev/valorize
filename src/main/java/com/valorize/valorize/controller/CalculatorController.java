package com.valorize.valorize.controller;

import com.valorize.valorize.DTO.RequestDTO;
import com.valorize.valorize.DTO.ResponseDTO;
import com.valorize.valorize.model.Coin;
import com.valorize.valorize.service.CalculatorService;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

@RestController
@RequestMapping("/valorize/api/calculator")
public class CalculatorController {
    private CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @PostMapping
    public ResponseDTO postCalculator(@RequestBody RequestDTO requestDTO){
        //Validar entradas
        return this.calculatorService.postCalculator(requestDTO);
    }

}
