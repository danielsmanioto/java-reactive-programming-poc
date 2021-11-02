package com.danielsmanioto.springapi.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FibonacciService {

    public List<Integer> calculate(int until) {
        List<Integer> result = new ArrayList<>();

        int anterior = 1;
        int atual = 0;
        int saldo = 0;

        do {
            result.add(saldo);

            saldo = atual + anterior;
            anterior = atual;
            atual = saldo;

        } while(saldo <= until);

        return result;
    }
}
