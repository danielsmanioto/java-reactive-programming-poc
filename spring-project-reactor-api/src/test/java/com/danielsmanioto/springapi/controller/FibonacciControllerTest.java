package com.danielsmanioto.springapi.controller;

import com.danielsmanioto.springapi.service.FibonacciService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit.jupiter.SpringExtension;

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

        ResponseEntity<List<Integer>> response = fibonacciController.find();

        Assertions.assertThat(response).isNotNull();
        Assertions.assertThat(response.getStatusCode()).isEqualByComparingTo(HttpStatus.OK);
        Assertions.assertThat(response.getBody()).hasSize(8);
    }

}
