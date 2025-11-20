import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//package com.yupi.usercenter.config;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.CorsRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//
//@Configuration
//public class CorsConfig implements WebMvcConfigurer {
//
//    @Override
//    public void addCorsMappings(CorsRegistry registry) {
//        registry.addMapping("/**") // 对所有路径应用CORS配置
//                .allowedOrigins("http://localhost:3000") // 允许的来源域，即你的前端地址
//                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS") // 明确允许 OPTIONS 请求方法
//                .allowCredentials(true) // 是否允许发送Cookie
//                .maxAge(3600); // 预检请求的有效期，单位秒
//    }
//}