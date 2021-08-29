package com.mao.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;


@SpringBootApplication
@EnableZuulProxy
public class SpringZuulApp9527 {

	public static void main(String[] args) {
		SpringApplication.run(SpringZuulApp9527.class, args);
	}
}
