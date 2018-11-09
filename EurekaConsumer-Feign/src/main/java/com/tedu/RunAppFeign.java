package com.tedu;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@EnableFeignClients
@SpringCloudApplication
public class RunAppFeign {

	public static void main(String[] args) {
		SpringApplication.run(RunAppFeign.class, args);
	}
}
