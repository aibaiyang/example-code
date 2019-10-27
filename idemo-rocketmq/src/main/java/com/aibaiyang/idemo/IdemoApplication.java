package com.aibaiyang.idemo;

import com.aibaiyang.idemo.service.MySource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

@SpringBootApplication
@EnableBinding({MySource.class })
public class IdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(IdemoApplication.class, args);
	}

}
