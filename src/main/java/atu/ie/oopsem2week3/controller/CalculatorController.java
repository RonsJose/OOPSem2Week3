package atu.ie.oopsem2week3.controller;

import atu.ie.oopsem2week3.service.CalculatorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calc") //Defines base path
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping("/add") //Another endpoint
    public ResponseEntity<Integer> add(@RequestParam int a, @RequestParam int b) {
        int result = calculatorService.add(a, b); //Calls service
        return ResponseEntity.ok(result);
    }

    @GetMapping("/divide") //Another endpoint
    public ResponseEntity <?> divide(@RequestParam int a, @RequestParam int b) {
        if (b == 0) { //Checks for 0 error
            return ResponseEntity
                    .badRequest()
                    .body("Division by zero is not allowed");
        }
        int result = calculatorService.divide(a, b); //Calls service
        return ResponseEntity.ok(result);
    }
}
