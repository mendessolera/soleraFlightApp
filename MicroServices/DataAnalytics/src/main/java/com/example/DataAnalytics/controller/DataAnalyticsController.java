package com.example.DataAnalytics.controller;

import com.example.DataAnalytics.model.DataAnalytics;
import com.example.DataAnalytics.service.DataAnalyticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DataAnalyticsController {

    @Autowired
    DataAnalyticsService dataAnalyticsService;

    @GetMapping("/dataanalytics")
    private List<DataAnalytics> getAllDataAnalytics(){
        return dataAnalyticsService.getAllAnalytics();
        }
    @GetMapping("/dataanalytics/{country}")
    private DataAnalytics getDataAnalyticByCountry(String country){
        return dataAnalyticsService.getAnalyticsByCountry(country);
    }
    @PutMapping("/dataanalytics/{country}")
    private DataAnalytics updateDataAnalytics(String country){
        return dataAnalyticsService.updateCountryAnalytics(country);
    }
}
