package com.kanye.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class QuoteDto {
    private String quote;

    @Override
    public String toString() {
        return this.getQuote();
    }
}
