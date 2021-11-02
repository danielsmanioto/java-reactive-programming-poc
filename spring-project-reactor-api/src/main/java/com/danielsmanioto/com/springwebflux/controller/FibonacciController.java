package com.danielsmanioto.com.springwebflux.controller;

import com.danielsmanioto.com.springwebflux.service.FibonacciService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/fibonacci")
public class FibonacciController {

    private final FibonacciService service;

    public FibonacciController(FibonacciService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<Integer>> find() {
        List<Integer> result = service.calculate(1597);

        System.out.println(result);

        return ResponseEntity.ok(result);
    }

}
