package jk.om.checkout.services;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

import jk.om.common.conf.AppCommonConfig;

@SpringBootApplication
@EnableAutoConfiguration
@Import(AppCommonConfig.class)
@ComponentScan(basePackages = { "jk.om.adapter.db", "jk.om.common.conf", "jk.om.checkout.services", })
public class CheckoutAppMain {
	public static void main(String[] args) {

		SpringApplication app = new SpringApplication(CheckoutAppMain.class);
		app.setAdditionalProfiles("checkout", "database");

		app.run(args);
	}
}
