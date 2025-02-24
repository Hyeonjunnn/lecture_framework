package com.beyond.university.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * <p>
 *
 * <p>packageName    : com.beyond.university.config
 * <p>fileName       : SwaggerConfig
 * <p>author         : hjsong
 * <p>date           : 2025-02-21
 * <p>description    :
 */
/*
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-02-21        hjsong             최초 생성
 */

@Configuration
@OpenAPIDefinition(
        info = @Info(
                title = "University Service",
                description = "University Service API",
                version = "v1.0.0"
        )
)
public class SwaggerConfig {
    @Bean
    public OpenAPI openAPI() {
        return new OpenAPI()
                .components(new Components());
    }
}