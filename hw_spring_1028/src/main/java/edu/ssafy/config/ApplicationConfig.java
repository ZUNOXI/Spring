package edu.ssafy.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import edu.ssafy.dto.Board;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class ApplicationConfig {

//	@Bean
//	public Board testBoard() {
//		
//		return new Board("200", "title", "content");
//	}

	@Bean
	public Docket postsApi() {
		return new Docket(DocumentationType.SWAGGER_2).groupName("public-api").apiInfo(apiInfo()).select()
				.apis(RequestHandlerSelectors.any()).paths(PathSelectors.ant("/api/rest*"))

				.build();
	}

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("SSAFY API").description("SSAFY API Reference for Developers")
				.termsOfServiceUrl("https://edu.ssafy.com").contact("ssafy@ssafy.com").license("SSAFY License")
				.licenseUrl("ssafy@ssafy.com").version("1.0").build();
	}
}
