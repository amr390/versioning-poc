package be.cipal.poc

import org.springframework.web.servlet.config.annotation.EnableWebMvc
import org.springframework.context.annotation.Configuration

import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry

@EnableWebMvc
@Configuration
public class Statics extends WebMvcConfigurerAdapter{

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        if (!registry.hasMappingForPattern("/commons/**")) {
            registry.addResourceHandler("/commons/**").addResourceLocations(
                "classpath:contract/commons/");
        }
        registry.addResourceHandler("/addressbook/*.xsd").addResourceLocations(
            "classpath:/contract/address-book/");
    }
}

