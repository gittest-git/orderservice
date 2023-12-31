package com.user.orderservice;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class OrderserviceApplication {

	public static Logger logger = LoggerFactory.getLogger(OrderserviceApplication.class);

	@PostConstruct
	public void init(){
		logger.info("Application OrderService Started....");
	}

	@GetMapping("/getOrders")
	public String getOrders()
	{
		return "All ordered items";
	}

	public static void main(String[] args) {
		SpringApplication.run(OrderserviceApplication.class, args);
	}

}
