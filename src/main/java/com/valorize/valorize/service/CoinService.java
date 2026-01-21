package com.valorize.valorize.service;

import com.valorize.valorize.external.CoinApi;
import com.valorize.valorize.model.Coin;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class CoinService {
    private CoinApi coinApi;

    public CoinService() {
        this.coinApi = new CoinApi();
    }

    public List<Coin> getCoinsSymbols(){
        List<Coin> coins = null;
        try {
            coins = coinApi.getALlCoins();
        }catch (IOException | InterruptedException e){
            return null;
        }
        return coins;
    }
}
