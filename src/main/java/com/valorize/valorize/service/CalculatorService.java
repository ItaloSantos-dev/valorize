package com.valorize.valorize.service;

import com.valorize.valorize.DTO.RequestDTO;
import com.valorize.valorize.DTO.ResponseDTO;
import com.valorize.valorize.external.CoinApi;
import com.valorize.valorize.external.InvestimentApi;
import com.valorize.valorize.model.Coin;
import com.valorize.valorize.model.Investiment;
import com.valorize.valorize.model.Quotation;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class CalculatorService {
    private CoinApi coinApi;
    private InvestimentApi investimentApi;

    public CalculatorService() {
        this.coinApi = new CoinApi();
        this.investimentApi = new InvestimentApi();
    }

    public Object postCalculator(RequestDTO requestDTO){
        Quotation quotationCoinInput ;
        Quotation quotationCoinOut;
        Investiment investimentType;

        try{
            quotationCoinInput = this.coinApi.getById(requestDTO.coinInputString());
            quotationCoinOut = this.coinApi.getById(requestDTO.coinOutString());
            investimentType= this.investimentApi.getInvestimentById(requestDTO.investimentType());

        }catch (IOException | InterruptedException e){
            return e.getMessage();
        }
        double amountInBRL = coinInputToBRL(quotationCoinInput, requestDTO.amountInput());

        double rendimentAfterTime = rendimentInTime(investimentType, amountInBRL, requestDTO.amountDay());

        double amountFinalInCoinInput = amountFinalToCoinOut(quotationCoinOut, rendimentAfterTime);

        return amountFinalInCoinInput;







    }

    public double rendimentInTime(Investiment investiment, double amountInBRL, int amountDays){
        double taxForDay = Math.pow( (1 + (double)investiment.getAmount()/100) , (double)1/252 ) -1;
        double amountFinal = amountInBRL * Math.pow( (1+taxForDay), amountDays );
        return amountFinal;
    }


    public double coinInputToBRL(Quotation quotationCoinInput, double amountInput){
        // 5 unidades de Dólar = 5*6 = 30 reais
        return  amountInput * quotationCoinInput.getQuotationBuy();
    }

    public double amountFinalToCoinOut(Quotation quotationCoinOut, double amountFinal){
        //30 reais para dolar = 30 /  5.6 = +-6
        return (double)amountFinal / quotationCoinOut.getQuotationBuy();
    }

}
