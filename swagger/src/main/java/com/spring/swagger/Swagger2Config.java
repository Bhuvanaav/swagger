package com.spring.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class Swagger2Config {
	@Bean
	public Docket SwaggerConfig() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.paths(PathSelectors.any())
				.apis( RequestHandlerSelectors.basePackage( "com.spring.swagger" ) )
				.build()
				.apiInfo(new ApiInfo("Movies Api", "Movie Management", "1.0", "http://spring.com/termsOfService",
						"Bhuvana", "openSource", "http://spring.com/license"));
				
				
	}

}
