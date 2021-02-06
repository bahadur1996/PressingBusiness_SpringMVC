package com.example.service;

import com.example.domain.Price;

import java.util.List;

public interface PriceService {
    Price addPrice(Price price);
    Price editPrice(Price price);
    void deletePrice(Long priceId);
    Price getPriceDetails(Long priceId);
    List<Price> getAllPrices();
}
