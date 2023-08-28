package com.sym.bolgbackend.config;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 11353
 */
@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI springShopOpenAPI() {
        return new OpenAPI()
                .info(new Info().title("思与梦")
                        .description("思与梦博客项目API文档")
                        .version("v1")
                        .license(new License().name("github").url("https://github.com/siyumengi")))
                .externalDocs(new ExternalDocumentation()
                        .description("github")
                        .url("https://github.com/siyumengi"))
                ;
    }

}