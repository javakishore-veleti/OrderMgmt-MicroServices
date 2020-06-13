package jk.om.checkout.services;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import jk.om.common.conf.AppCommonConfig;

@SpringBootApplication
@EnableAutoConfiguration
@Import(AppCommonConfig.class)
public class CheckoutAppMain {
	public static void main(String[] args) {

		SpringApplication app = new SpringApplication(CheckoutAppMain.class);
		app.setAdditionalProfiles(new String[] { "checkout" });

		app.run(args);
	}
}
