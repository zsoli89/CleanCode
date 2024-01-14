package com.cubix.cleancode.calculator;

import org.springframework.stereotype.Service;

@Service
public class Calculator {

    public Double add(Double a, Double b) {
        return a + b;
    }

    public Double substract(Double a, Double b) {
        return a - b;
    }

    public Double multiply(Double a, Double b) {
        return a * b;
    }

    public Double divide(Double a, Double b) {
        return a / b;
    }

    public Double squareRoot(Double a) {
        return Math.sqrt(a);
    }

    public Double power(Double a, Double b) {
        return Math.pow(a, b);
    }
}
