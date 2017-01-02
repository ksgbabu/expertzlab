package com.expertzlab.mvc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;

@Configuration
public class MvcConfig extends WebMvcConfigurerAdapter {

    private static Logger logger = LoggerFactory.getLogger(MvcConfig.class);
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {

        registry.addViewController("/home").setViewName("home");
        registry.addViewController("/").setViewName("home");
        registry.addViewController("/hello").setViewName("hello");
        registry.addViewController("/login").setViewName("login");
    }

    @Bean
    public LocaleChangeInterceptor getLocaleChangeIntercetpor(){
        return new LocaleChangeInterceptor();
    }

   @Override
    public void addInterceptors(InterceptorRegistry registry){

       logger.debug("adding interceptor");
        registry.addInterceptor(getLocaleChangeIntercetpor());
    }

}