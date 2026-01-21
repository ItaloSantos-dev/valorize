package com.valorize.valorize.service;

import com.valorize.valorize.external.InvestimentApi;
import com.valorize.valorize.model.Investiment;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class InvestimentService {

    private InvestimentApi investimentApi;

    public InvestimentService() {
        this.investimentApi = new InvestimentApi();
    }

    public List<Investiment> getAllInvestiments(){
        try {
            return investimentApi.getAllInvestiments();
        }catch (IOException | InterruptedException e){
            return null;
        }
    }
}
