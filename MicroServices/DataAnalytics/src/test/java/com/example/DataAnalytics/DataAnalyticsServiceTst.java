package com.example.DataAnalytics;

import com.example.DataAnalytics.model.DataAnalytics;
import com.example.DataAnalytics.repository.DataAnalyticsRepository;
import com.example.DataAnalytics.service.DataAnalyticsService;
import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RunWith(SpringRunner.class)
class DataAnalyticsServiceTst {

	@TestConfiguration
	static class dataAnalyticsServiceConfig{
		@Bean
		public DataAnalyticsService DataAnalyticsService(){
			return new DataAnalyticsService();
		}
	}

	@Autowired
	DataAnalyticsService dataAnalyticsService;

	@MockBean
	DataAnalyticsRepository dataAnalyticsRepository;

	@Test
	public void searchingDataAnalyticsByCountryTst() {
		DataAnalytics dataAnalytics = new DataAnalytics(1, "ES", 1);
		Assertions.assertEquals(dataAnalyticsService.getAnalyticsByCountry("ES").getCountry(), "ES");
	}

	@Test
	public void getAllDataAnalyticDataTst(){
		List<DataAnalytics> dataAnalyticsList = dataAnalyticsService.getAllAnalytics();
		Assertions.assertEquals(dataAnalyticsService.getAllAnalytics(), dataAnalyticsList);
	}
	@Test
	public void updateAllDataByClickTest(){
		DataAnalytics dataAnalytics = new DataAnalytics(1, "ES", 1);
		dataAnalyticsService.updateCountryAnalytics("ES").setClicks(2);
		Assertions.assertEquals(dataAnalyticsService.updateCountryAnalytics("ES"),2);

	}

	@Before
	public void setup() {
		DataAnalytics dataAnalytics = new DataAnalytics(1,"Pt", 1);
		DataAnalytics dataAnalytics1 = new DataAnalytics(2, "ES", 1);
		List<DataAnalytics> dataAnalyticsList = new ArrayList<>();
		dataAnalyticsList.add(dataAnalytics1);

		Mockito.when(dataAnalyticsRepository.findByCountry(dataAnalytics.getCountry()))
				.thenReturn((dataAnalytics));

		Mockito.when(dataAnalyticsRepository.findAll())
				.thenReturn(dataAnalyticsList);
	}




}

