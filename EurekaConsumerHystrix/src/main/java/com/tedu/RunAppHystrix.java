package com.tedu;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@EnableFeignClients
@SpringCloudApplication
public class RunAppHystrix {

	public static void main(String[] args) {
		SpringApplication.run(RunAppHystrix.class, args);
	}
}
