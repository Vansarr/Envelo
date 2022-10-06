package com.kanye.service;

import com.kanye.client.QuoteClient;
import com.kanye.domain.QuoteDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class QuoteService {

    private final QuoteClient quoteClient;

    public QuoteDto fetchQuote(){
        return quoteClient.getQuote();
    }

}
