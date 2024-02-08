package com.app;

import com.app.model.Order;
import com.app.repository.OrderRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@Slf4j
@SpringBootApplication
public class Home {

	public static void main(String[] args) {
		SpringApplication.run(Home.class, args);
	}

	@Bean
	CommandLineRunner runner(OrderRepository repository) {
		return args -> {
			final Order order = repository.save(new Order(1, "potato", "I order a lot of potato"));
			log.info("new Order: {} {}", order.getName(), order.getDescription());
		};
	}
}
