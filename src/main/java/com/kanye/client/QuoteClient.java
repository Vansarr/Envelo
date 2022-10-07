package com.kanye.client;

import com.kanye.domain.QuoteDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@RequiredArgsConstructor
@Component
public class QuoteClient {

//    private final KanyeConfig kanyeConfig;
    private final RestTemplate restTemplate;

    public QuoteDto getQuote() {
        // I couldn't inject beans into main class, so I hard-coded API url in the method making kanyeConfig kinda obsolete
        URI url = UriComponentsBuilder.fromHttpUrl("https://api.kanye.rest/")
                .build()
                .encode()
                .toUri();

        return restTemplate.getForObject(url, QuoteDto.class);
    }
}
