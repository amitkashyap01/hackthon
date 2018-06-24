package com.hclhackathon.teamten.hclbalanceenquiryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:configuration.properties")
public class HclBalanceEnquiryServiceApplication
{

	public static void main(String[] args)
	{
		SpringApplication.run(HclBalanceEnquiryServiceApplication.class, args);
	}
}
