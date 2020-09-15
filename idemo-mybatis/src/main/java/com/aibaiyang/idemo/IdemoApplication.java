package com.aibaiyang.idemo;

import com.aibaiyang.idemo.util.SpringContextUtil;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@MapperScan(basePackages = "com.aibaiyang.idemo.mapper")
public class IdemoApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(IdemoApplication.class, args);
		// 设置上下文
		SpringContextUtil.setApplicationContext(context);

	}

}
