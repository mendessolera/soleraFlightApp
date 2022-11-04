package com.example.DataAnalytics.service;

import com.example.DataAnalytics.model.DataAnalytics;
import com.example.DataAnalytics.repository.DataAnalyticsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DataAnalyticsService {

    @Autowired
    DataAnalyticsRepository dataAnalyticsRepository;

    public List<DataAnalytics> getAllAnalytics(){
        List<DataAnalytics> allAnalytics = new ArrayList<>();
        dataAnalyticsRepository.findAll().forEach(dataAnalytics -> allAnalytics.add(dataAnalytics));
        return allAnalytics;
    }
    public DataAnalytics getAnalyticsByCountry(String country){
        return dataAnalyticsRepository.findByCountry(country);
    }
    public DataAnalytics saveNewCountryAnalytics(DataAnalytics dataAnalytics){
        return dataAnalyticsRepository.save(dataAnalytics);
    }
    public DataAnalytics updateCountryAnalytics(String country){
        int click = dataAnalyticsRepository.findByCountry(country).getClicks();
        dataAnalyticsRepository.findByCountry(country).setClicks(click+1);
        return dataAnalyticsRepository.findByCountry(country);

    }
}
