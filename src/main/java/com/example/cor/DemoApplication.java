package com.example.cor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import com.example.cor.domain.Request;
import com.example.cor.service.RequestHandlerService;

import java.util.concurrent.TimeUnit;

@SpringBootApplication
@EnableScheduling
public class DemoApplication {
	@Autowired
	private RequestHandlerService service;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Scheduled(fixedRate = 10, initialDelay = 2, timeUnit = TimeUnit.SECONDS)
	protected void demo() {
		Request req = new Request("request_" + System.currentTimeMillis());
		service.handle(req);
	}
}
