package com.kanye.domain;

import lombok.Data;

@Data
public class QuoteDto {
    private String quote;

    @Override
    public String toString() {
        return this.getQuote();
    }
}
