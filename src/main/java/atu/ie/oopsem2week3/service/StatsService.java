package atu.ie.oopsem2week3.service;

import org.springframework.stereotype.Service;

//Service to get the percentage
@Service
public class StatsService {
    public float percentage(int a, int b) {
        return ((float)a / b) * 100 ;
    }
}
