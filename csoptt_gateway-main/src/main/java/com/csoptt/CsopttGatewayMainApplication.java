package com.csoptt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * 启动类
 * 可被注册中心发现
 * 可作为网关
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
public class CsopttGatewayMainApplication {

	public static void main(String[] args) {
		SpringApplication.run(CsopttGatewayMainApplication.class, args);
	}
}
