package com.ftwl;

import com.ftwl.frame.context.OperatorThreadcacheHolder;
import com.ftwl.frame.context.PageInfoHolder;
import com.ftwl.frame.context.ThreadInitCenter;
import com.ftwl.frame.util.ApplicationUtil;

import com.ftwl.ltp.springbootconfig.StartupRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.filter.CharacterEncodingFilter;

import javax.servlet.Filter;

@SpringBootApplication()
@EnableAutoConfiguration()
public class Application {

    private static OperatorThreadcacheHolder operatorThreadcacheHolder = new OperatorThreadcacheHolder();
    private static PageInfoHolder pageInfoHolder = new PageInfoHolder();


    public static void main(String[] args) {
        new ThreadInitCenter(operatorThreadcacheHolder, pageInfoHolder);
        ThreadInitCenter.init("Application.main", null, null, "system", "system");
        ApplicationUtil.setContext(SpringApplication.run(Application.class, args));
    }

    @Bean
    public Filter characterEncodingFilter() {
        CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();
        characterEncodingFilter.setEncoding("UTF-8");
        characterEncodingFilter.setForceEncoding(true);
        return characterEncodingFilter;
    }

    @Bean
    public OperatorThreadcacheHolder getOrgUserHolder() {
        return operatorThreadcacheHolder;
    }

    @Bean
    public PageInfoHolder getPageInfoHolder() {
        return pageInfoHolder;
    }


    @Bean
    public StartupRunner startupRunner() {
        return new StartupRunner();
    }

}
