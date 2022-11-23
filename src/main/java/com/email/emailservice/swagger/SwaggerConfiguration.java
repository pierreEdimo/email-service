package com.email.emailservice.swagger;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class SwaggerConfiguration {
    @Bean
    public OpenAPI customOpenApi() {

        return new OpenAPI()
                .info(new Info()
                        .title("Email-Api")
                        .version("1.0.0")
                        .description("Houlala Email-service est le service d'E-mail d'Houlala, "
                        )
                        .license(new License().name("MIT"))
                );
    }

}
