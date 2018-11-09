package com.tedu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.tedu.feign.HelloFeign;

@RestController
public class HelloController {
	
	@Autowired
	private HelloFeign feign;
	
	@RequestMapping("hello/{name}")
	@HystrixCommand(fallbackMethod="hellofallback")
	public String hello(@PathVariable String name){
		
		return feign.hello(name);
	}
	
	
	public String hellofallback(String name){
		
		return "开弓没有回头箭";
	}
}
