package com.danielsmanioto.com.springwebflux.controller;

import com.danielsmanioto.com.springwebflux.service.FibonacciService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import reactor.core.publisher.Flux;

import java.util.Arrays;
import java.util.List;

@ExtendWith(SpringExtension.class)
class FibonacciControllerTest {

    @InjectMocks
    private FibonacciController fibonacciController;

    @Mock
    private FibonacciService service;

    @Test
    @DisplayName("Should execute fibonacci with success")
    void shouldExecuteFibonacciSuccess() {
        Mockito.when(service.calculate(Mockito.anyInt())).thenReturn(Arrays.asList(0, 1, 1, 2, 3, 5, 8, 13));

        Flux<List<Integer>> response = fibonacciController.find();

        Assertions.assertThat(response).isNotNull();
    }

}
