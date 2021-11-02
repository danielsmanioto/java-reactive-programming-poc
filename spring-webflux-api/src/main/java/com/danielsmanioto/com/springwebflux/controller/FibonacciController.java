package com.danielsmanioto.com.springwebflux.controller;

import com.danielsmanioto.com.springwebflux.service.FibonacciService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.util.List;

@RestController
@RequestMapping("/fibonacci")
public class FibonacciController {

    private final FibonacciService service;

    public FibonacciController(FibonacciService service) {
        this.service = service;
    }

    @GetMapping
    public Flux<List<Integer>> find() {
        Flux<List<Integer>> result = Flux.just(service.calculate(1597));

        System.out.println(result);

        return result;
    }

}
