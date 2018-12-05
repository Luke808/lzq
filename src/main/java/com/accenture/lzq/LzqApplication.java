package com.accenture.lzq;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication(scanBasePackages = "com.accenture.lzq")//扫描swaggerConfig
@MapperScan("com.accenture.lzq.mapper")//扫描GruopMapper
@EnableSwagger2//链接swagger
public class LzqApplication {

    public static void main(String[] args) {
        SpringApplication.run(LzqApplication.class, args);//启动图标运行
        /*SpringApplication springApplication = new SpringApplication(LzqApplication.class);//关闭图标运行
        springApplication.setBannerMode(Banner.Mode.OFF);
        springApplication.run(args);*/
    }
//    @Bean
//    public WebMvcConfigurer corsConfigurer() {
//
//        return new WebMvcConfigurer() {
//            @Override
//            public void addCorsMappings(CorsRegistry registry) {
//                registry.addMapping("/**")
//                        .allowedOrigins("*")
//                        .allowedMethods("*");
//            }
//        };

    }

