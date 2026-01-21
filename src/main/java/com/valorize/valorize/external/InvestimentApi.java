package com.valorize.valorize.external;

import com.valorize.valorize.model.Investiment;
import tools.jackson.core.type.TypeReference;
import tools.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

public class InvestimentApi {
    HttpClient client;

    public InvestimentApi() {
        this.client = HttpClient.newHttpClient();
    }

    public List<Investiment> getAllInvestiments() throws IOException, InterruptedException {
        List<Investiment> investiments = new ArrayList<>();

        HttpRequest request = HttpRequest.newBuilder(URI.create("https://brasilapi.com.br/api/taxas/v1")).build();
        HttpResponse response = client.send(request, HttpResponse.BodyHandlers.ofString());
        String responseString = response.body().toString();

        ObjectMapper mapper = new ObjectMapper();
        investiments = mapper.readValue(responseString,
                new TypeReference<List<Investiment>>() {}
        );

        return investiments;
    }

}
