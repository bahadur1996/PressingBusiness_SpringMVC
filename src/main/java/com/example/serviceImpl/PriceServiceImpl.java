package com.example.serviceImpl;

import com.example.domain.Price;
import com.example.mapper.PriceMapper;
import com.example.repository.PriceRepository;
import com.example.service.PriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PriceServiceImpl implements PriceService {

    @Autowired
    private PriceMapper priceMapper;

    @Autowired
    private PriceRepository priceRepository;

    @Override
    public Price addPrice(Price price) {
        return priceMapper.entityToDomain().map(priceRepository.save(priceMapper.domainToEntity().map(price)));
    }

    @Override
    public Price editPrice(Price price) {
        return null;
    }

    @Override
    public void deletePrice(Long priceId) {

    }

    @Override
    public Price getPriceDetails(Long priceId) {
        return null;
    }

    @Override
    public List<Price> getAllPrices() {
        return priceMapper.listEntityToListDomain(priceRepository.findAll());
    }
}
