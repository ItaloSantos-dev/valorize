package com.valorize.valorize.external;


import com.valorize.valorize.model.Coin;
import tools.jackson.core.type.TypeReference;
import tools.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

public class CoinApi {
    HttpClient client;

    public CoinApi() {
        this.client = HttpClient.newHttpClient();
    }

    public List<Coin> getALlCoins() throws IOException, InterruptedException {
        List<Coin> coins = new ArrayList<>();
        HttpRequest request = HttpRequest.newBuilder(URI.create("https://brasilapi.com.br/api/cambio/v1/moedas")).build();
        HttpResponse response = client.send(request, HttpResponse.BodyHandlers.ofString());

        String responseString = response.body().toString();

        ObjectMapper mapper = new ObjectMapper();
        coins = mapper.readValue(responseString,
                new TypeReference<List<Coin>>() {}
        );
        return coins;

    }
}
