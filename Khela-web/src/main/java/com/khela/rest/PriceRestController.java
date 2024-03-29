package com.khela.rest;


import com.khela.domain.Price;
import com.khela.service.PriceService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping(value = "/rest/price")
public class PriceRestController {

    private final PriceService priceService;

    public PriceRestController(PriceService priceService) {
        this.priceService = priceService;
    }


    @PostMapping
    public ResponseEntity<Price> addPrice(@RequestBody Price price){
            return ResponseEntity.ok(priceService.addPrice(price));
    }

}
