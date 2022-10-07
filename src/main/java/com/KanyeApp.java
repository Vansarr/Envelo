package com;

import com.kanye.client.QuoteClient;
import com.kanye.service.QuoteService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Scanner;

@SpringBootApplication
public class KanyeApp {

    public static void main(String[] args) {
        SpringApplication.run(KanyeApp.class, args);

        var restTemplate = new RestTemplate();
        var quoteClient = new QuoteClient(restTemplate);
        var quoteService = new QuoteService(quoteClient);

        var console = new Scanner(System.in);
        System.out.println("Type next if you wish to learn Kanye's Ancient Wisdom:");

        var seenQuotes = new ArrayList<>();

        while (console.hasNext("next")) {
            var kanyeQuote = quoteService.fetchQuote();

            while (seenQuotes.contains(kanyeQuote)) {
                kanyeQuote = quoteService.fetchQuote();
            }
            seenQuotes.add(kanyeQuote);
            System.out.println("A Wise Kanye once said: " + kanyeQuote);
            console.next();
        }
    }
}
