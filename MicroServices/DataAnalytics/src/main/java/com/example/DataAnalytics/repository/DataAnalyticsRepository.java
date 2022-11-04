package com.example.DataAnalytics.repository;

import com.example.DataAnalytics.model.DataAnalytics;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DataAnalyticsRepository extends CrudRepository<DataAnalytics, Integer> {

    DataAnalytics findByCountry(String country);
}
