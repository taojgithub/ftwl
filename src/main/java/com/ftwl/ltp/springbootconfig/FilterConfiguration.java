package com.ftwl.ltp.springbootconfig;


import com.ftwl.ltp.FtwlFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfiguration {

    /**
     * FtwlFilter
     *
     * @return
     */
    @Bean
    public FilterRegistrationBean indexFilterRegistration() {
        FilterRegistrationBean registration = new FilterRegistrationBean(new FtwlFilter());
        registration.addUrlPatterns("/*");
        return registration;
    }
}
