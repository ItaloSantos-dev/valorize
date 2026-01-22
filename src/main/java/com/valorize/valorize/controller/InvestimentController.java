package com.valorize.valorize.controller;

import com.valorize.valorize.model.Investiment;

import com.valorize.valorize.service.InvestimentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/valorize/investiments")
public class InvestimentController {

    private InvestimentService investimentService;

    public InvestimentController(InvestimentService investimentService) {
        this.investimentService = investimentService;
    }

    @GetMapping
    public List<Investiment> getAllInvestiments(){
        return this.investimentService.getAllInvestiments();
    }
}
