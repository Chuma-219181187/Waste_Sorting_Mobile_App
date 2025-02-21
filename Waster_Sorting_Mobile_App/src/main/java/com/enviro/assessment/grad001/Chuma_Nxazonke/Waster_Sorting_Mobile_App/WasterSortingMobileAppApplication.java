package com.enviro.assessment.grad001.Chuma_Nxazonke.Waster_Sorting_Mobile_App;

import com.enviro.assessment.grad001.Chuma_Nxazonke.Waster_Sorting_Mobile_App.WasteCategory.WasteCategory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalTime;

@SpringBootApplication
public class WasterSortingMobileAppApplication {
	private static final Logger log = LoggerFactory.getLogger(WasterSortingMobileAppApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(WasterSortingMobileAppApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(WasterSortingMobileAppApplication app) {
		return (args) -> {
			WasteCategory category = new WasteCategory(1, "Plastic", "Brief description of the waste category", "Non-Disposable", "Banana", LocalTime.now());
			log.info("Application run successfully{}", category);
		};
	}
}
