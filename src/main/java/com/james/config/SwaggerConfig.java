package com.james.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @version 1.8
 * @ClassName SwaggerConfig
 * @Description TODO
 * @Author James
 * @date 2020/10/27 23:25
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
            // 指定构建api文档的详细信息的方法：apiInfo()
            .apiInfo(apiInfo())
            .select()
            // 指定要生成api接口的包路径，这里把controller作为包路径，生成controller中的所有接口
            .apis(RequestHandlerSelectors.basePackage("com.james.controller"))
            .paths(PathSelectors.any())
            .build();
        }
        /**
         * 构建api文档的详细信息
         * @return
         */
        private ApiInfo apiInfo() {
            return new ApiInfoBuilder()
                // 设置页面标题
                .title("Spring Boot集成Swagger2接口总览")
                // 设置接口描述
                .description("springBoot基本框架的搭建")
                // 设置版本
                .version("1.0")
                // 构建
                .build();
        }
}
