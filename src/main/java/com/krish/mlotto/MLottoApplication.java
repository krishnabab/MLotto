package com.krish.mlotto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan({"com.krish.mlotto","com.krish.mlotto.rest"})
@ComponentScan
public class MLottoApplication {
	 public static void main(String[] args) {
		SpringApplication.run(MLottoApplication.class, args);
	}
}