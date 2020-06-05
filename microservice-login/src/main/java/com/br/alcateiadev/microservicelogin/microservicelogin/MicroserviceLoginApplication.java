package com.br.alcateiadev.microservicelogin.microservicelogin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class MicroserviceLoginApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceLoginApplication.class, args);
	}

}
