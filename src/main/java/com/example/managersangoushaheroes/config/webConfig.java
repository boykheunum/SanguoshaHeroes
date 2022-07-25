package com.example.managersangoushaheroes.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class webConfig implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler(
                        "/image/**",
                        "/css/**",
                        "/libs/**",
                        "/js/**")
                .addResourceLocations(
                        "classpath:/static/image/",
                        "classpath:/static/css/",
                        "classpath:/static/libs/",
                        "classpath:/static/js/");
    }

}