package com.toast.provider.dept.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * @author 土司先生
 * @time 2023/3/24
 * @describe
 */
@Configuration
public class SwaggerConfig {
    private ApiInfo getApiInfo() {
        return new ApiInfoBuilder().title("【土司面包】雇员微服务")
                .description("纤云弄巧，飞星传恨，银汉迢迢暗度。" +
                        "金风玉露一相逢，便胜却人间无数。柔情似水，佳期如梦，忍顾鹊桥归路！" +
                        "两情若是长久时，又岂在朝朝暮暮。 -- 《鹊桥仙》[宋] 秦观")
                .contact(new Contact("土司边", "", "1234@toast.com"))
                .license("土司-用户管理")
                .version("1.0.0")
                .build();
    }

    @Bean
    public Docket getDocket() { // 配置Swagger
        return new Docket(DocumentationType.SWAGGER_2) // 文档类型
                .apiInfo(this.getApiInfo()) // 接口描述
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.toast.provider.member.controller")) // 扫描包
                .paths(PathSelectors.any()).build();
    }
}
