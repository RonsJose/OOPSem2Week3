package atu.ie.oopsem2week3.controller;

import atu.ie.oopsem2week3.service.StatsService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stats")
public class StatsController {
    private final StatsService statsService;

    public  StatsController(StatsService statsService) {
        this.statsService = statsService;
    }
    @GetMapping("/percentage")
    public ResponseEntity<?> percentage(@RequestParam int a, @RequestParam int b) {
        if (a < 0 || b < 0) {
            return ResponseEntity
                    .badRequest()
                    .body("Please enter a positive integer");
        }

        float result = statsService.percentage(a, b);
        return ResponseEntity.ok(result);
    }
}
