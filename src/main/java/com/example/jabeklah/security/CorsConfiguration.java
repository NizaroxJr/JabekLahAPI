package com.example.jabeklah.security;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfiguration implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**") // Match all paths
                .allowedOrigins("http://localhost:4200", "http://localhost:4201", "http://localhost:4202") // Add your client URLs here
                .allowedMethods("GET", "POST", "PUT", "DELETE") // Add the HTTP methods allowed by your API
                .allowedHeaders("*"); // Add the allowed request headers
    }
}
