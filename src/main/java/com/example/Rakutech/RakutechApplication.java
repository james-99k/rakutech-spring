package com.example.rakutech;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
public class RakutechApplication {

	public static void main(String[] args) {
		SpringApplication.run(RakutechApplication.class, args);
	}

	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("Hello %s!", name);
	}

//	@Configuration
//	public class WebMvcConfig  extends WebMvcConfigurerAdapter {
//
//		@Override
//		public void addResourceHandlers(ResourceHandlerRegistry registry) {
//			registry.setOrder(-1)
//					.addResourceHandler("/index.html")
//					.addResourceLocations("classpath:/templates");
//			super.addResourceHandlers(registry);
//		}
//	}

}
