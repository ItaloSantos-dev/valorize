package com.valorize.valorize.service;

import com.valorize.valorize.DTO.RequestDTO;
import com.valorize.valorize.DTO.ResponseDTO;
import com.valorize.valorize.external.CoinApi;
import com.valorize.valorize.external.InvestimentApi;
import com.valorize.valorize.model.Coin;
import com.valorize.valorize.model.Quotation;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.Date;

@Service
public class CalculatorService {
    private CoinApi coinApi;
    private InvestimentApi investimentApi;

    public CalculatorService() {
        this.coinApi = new CoinApi();
        this.investimentApi = new InvestimentApi();
    }

    public Object postCalculator(RequestDTO requestDTO){

        try{
            Quotation quotationCoinInput= this.coinApi.getById(requestDTO.coinInputString());
            Quotation quotationCoinOut= this.coinApi.getById(requestDTO.coinOutString());
            return null;
        }catch (IOException | InterruptedException e){
            return null;
        }
    }

}
