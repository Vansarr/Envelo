package com.kanye.controller;

import com.kanye.domain.QuoteDto;
import com.kanye.service.QuoteService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/kanye")
@RequiredArgsConstructor
public class QuoteController {

    private final QuoteService quoteService;


    @GetMapping
    public ResponseEntity<QuoteDto> getQuote() {
        return ResponseEntity.ok(quoteService.fetchQuote());
    }
}
