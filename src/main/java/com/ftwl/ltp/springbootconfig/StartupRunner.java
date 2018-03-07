package com.ftwl.ltp.springbootconfig;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;

/**
 * Created by inaeh on 2017/11/11.
 */
@Order(Ordered.LOWEST_PRECEDENCE)
public class StartupRunner implements CommandLineRunner {
    private static final Logger logger = LoggerFactory.getLogger(StartupRunner.class);

    @Override
    public void run(String... args) throws Exception {
    }
}