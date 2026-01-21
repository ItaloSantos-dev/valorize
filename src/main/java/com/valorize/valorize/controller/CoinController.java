package com.valorize.valorize.controller;

import com.valorize.valorize.model.Coin;
import com.valorize.valorize.service.CoinService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/coins")
public class CoinController {
    private CoinService coinService;

    public CoinController() {
        this.coinService = new CoinService();
    }
    @GetMapping
    //Função que pega as strings das moedas
    public List<Coin> coinsSymbolString(){
        return this.coinService.getCoinsSymbols();
    }
}
