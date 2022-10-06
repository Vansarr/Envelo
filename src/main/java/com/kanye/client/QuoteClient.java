package com.kanye.client;

import com.kanye.config.KanyeConfig;
import com.kanye.domain.QuoteDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@RequiredArgsConstructor
@Component
public class QuoteClient {

    private final KanyeConfig kanyeConfig;
    private final RestTemplate restTemplate;

    public QuoteDto getQuote() {
        URI url = UriComponentsBuilder.fromHttpUrl(kanyeConfig.getKanyeApiEndpoint())
                .build()
                .encode()
                .toUri();

    QuoteDto quoteResponse = restTemplate.getForObject(url, QuoteDto.class);

    return quoteResponse;
    }
}