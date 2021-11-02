package com.danielsmanioto.com.springwebflux.service;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

@ExtendWith(SpringExtension.class)
class FibonacciServiceTest {

    @InjectMocks
    private FibonacciService fibonacciService;

    @Test
    @DisplayName("Should execute fibonacci with success")
    void shouldExecuteFibonacciSuccess() {
        List<Integer> numbers = fibonacciService.calculate(1597);
        Assertions.assertThat(numbers).isNotNull();
        Assertions.assertThat(numbers).hasSize(18);
    }

}
