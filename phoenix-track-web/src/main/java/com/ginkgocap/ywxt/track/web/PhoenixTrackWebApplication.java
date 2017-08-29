package com.ginkgocap.ywxt.track.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan(basePackages = "com.ginkgocap.ywxt.track.web")
@SpringBootApplication
public class PhoenixTrackWebApplication {
	public static void main(String[] args) {
        SpringApplication.run(PhoenixTrackWebApplication.class, args);
    }
}
