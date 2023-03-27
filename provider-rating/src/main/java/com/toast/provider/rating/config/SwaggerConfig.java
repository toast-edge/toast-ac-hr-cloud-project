package com.toast.provider.rating.config;

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
 * @time 2023/3/23
 * @describe
 */
@Configuration
public class SwaggerConfig {
    private ApiInfo getApiInfo() {
        return new ApiInfoBuilder().title("【土司面包】部门微服务")
                .description("余幼时即嗜学。家贫，无从致书以观，每假借于藏书之家，手自笔录，计日以还。天大寒，砚冰坚，手指不可屈伸，弗之怠。" +
                        "录毕，走送之，不敢稍逾约。以是人多以书假余，余因得遍观群书。既加冠，益慕圣贤之道 。又患无硕师名人与游，尝趋百里外，从乡之先达执经叩问。" +
                        "先达德隆望尊，门人弟子填其室，未尝稍降辞色。余立侍左右，援疑质理，俯身倾耳以请；或遇其叱咄，色愈恭，礼愈至，不敢出一言以复；俟其欣悦，则又请焉。" +
                        "故余虽愚，卒获有所闻。当余之从师也，负箧曳屣行深山巨谷中。穷冬烈风，大雪深数尺，足肤皲裂而不知。" +
                        "至舍，四支僵劲不能动，媵人持汤沃灌，以衾拥覆，久而乃和。" +
                        "寓逆旅，主人日再食，无鲜肥滋味之享。同舍生皆被绮绣，戴朱缨宝饰之帽，腰白玉之环，左佩刀，右备容臭，烨然若神人；" +
                        "余则缊袍敝衣处其间，略无慕艳意，以中有足乐者，不知口体之奉不若人也。盖余之勤且艰若此。" +
                        "今虽耄老，未有所成，犹幸预君子之列，而承天子之宠光，缀公卿之后，日侍坐备顾问，四海亦谬称其氏名，况才之过于余者乎？" + "\n" +
                        "　　今诸生学于太学，县官日有廪稍之供，父母岁有裘葛之遗，无冻馁之患矣；坐大厦之下而诵诗书，无奔走之劳矣；" +
                        "          有司业、博士为之师，未有问而不告、求而不得者也；凡所宜有之书，皆集于此，不必若余之手录，假诸人而后见也。" +
                        "其业有不精、德有不成者，非天质之卑，则心不若余之专耳，岂他人之过哉！\n" +
                        "\n" +
                        "　　东阳马生君则，在太学已二年，流辈甚称其贤。余朝京师，生以乡人子谒余，撰长书以为贽，辞甚畅达。" +
                        "与之论辨，言和而色夷。自谓少时用心于学甚劳，是可谓善学者矣。其将归见其亲也，余故道为学之难以告之。" +
                        "谓余勉乡人以学者，余之志也；诋我夸际遇之盛而骄乡人者，岂知予者哉！--《送东阳马生序》[明] 宋濂")
                .contact(new Contact("土司边", "", "1234@toast.com"))
                .license("土司-授权管理")
                .version("1.0.0")
                .build();
    }
    @Bean
    public Docket getDocket() { // 配置Swagger
        return new Docket(DocumentationType.SWAGGER_2) // 文档类型
                .apiInfo(this.getApiInfo()) // 接口描述
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.toast.provider.access.controller")) // 扫描包
                .paths(PathSelectors.any()).build();
    }
}
