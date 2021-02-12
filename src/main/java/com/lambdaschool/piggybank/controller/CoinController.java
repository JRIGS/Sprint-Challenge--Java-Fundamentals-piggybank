package com.lambdaschool.piggybank.controller;

import com.lambdaschool.piggybank.models.Coin;
import com.lambdaschool.piggybank.repositories.CoinRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CoinController
{
    @Autowired
    CoinRepository coinRepository;

    // http://localhost:2019/coins/total
    @GetMapping(value = "/coins/total", produces = {"application/json"})
    public ResponseEntity<?> listAllCoins()
    {
        List<Coin> myCoinList = new ArrayList<>();
        coinRepository.findAll().iterator().forEachRemaining(myCoinList::add);
        return new ResponseEntity<>(myCoinList, HttpStatus.OK);
    }
}
