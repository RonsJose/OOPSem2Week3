package atu.ie.oopsem2week3.service;

import org.springframework.stereotype.Service;

//Service for adding and dividing
@Service
public class CalculatorService {

    public int add(int a, int b) {
        return a+b;
    }

    public int divide(int a, int b) {
        return a/b;
    }
}
