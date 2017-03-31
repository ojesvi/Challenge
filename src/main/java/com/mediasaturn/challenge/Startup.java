package com.opentext.challenge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * @author Ojesvi
 * @since 16.01.2017
 */
@SpringBootApplication
public class Startup extends SpringBootServletInitializer{

    public static void main(String[] args) {
        SpringApplication.run(Startup.class, args);
    }

}
