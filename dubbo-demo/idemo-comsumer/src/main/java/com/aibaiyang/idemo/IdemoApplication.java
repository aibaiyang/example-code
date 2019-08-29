package com.aibaiyang.idemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(value = {"classpath*:comsumer.xml"})
public class IdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(IdemoApplication.class, args);
	}

}
