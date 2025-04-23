package com.alquimiasoft.minegocio;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "API Minegocio", version = "1.0.0"))
public class MinegocioApplication {

	public static void main(String[] args) {
		SpringApplication.run(MinegocioApplication.class, args);
	}

}
