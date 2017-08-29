package com.ginkgocap.ywxt.track.web;

import com.ginkgocap.ywxt.track.web.task.KafkaConsumerTask;
import com.ginkgocap.ywxt.track.web.util.kafka.JavaKafkaSimpleConsumerAPI;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@ComponentScan(basePackages = "com.ginkgocap.ywxt.track.web")
@SpringBootApplication
public class PhoenixTrackWebApplication {
	public static void main(String[] args) {
        SpringApplication.run(PhoenixTrackWebApplication.class, args);
    }
}
