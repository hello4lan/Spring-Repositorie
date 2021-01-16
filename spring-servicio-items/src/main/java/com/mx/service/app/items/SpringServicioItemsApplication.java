package com.mx.service.app.items;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
//import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


@EnableCircuitBreaker
@EnableEurekaClient
@SpringBootApplication
@EnableFeignClients
//@RibbonClient(name="servicio-productos")
public class SpringServicioItemsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringServicioItemsApplication.class, args);
	}

}
