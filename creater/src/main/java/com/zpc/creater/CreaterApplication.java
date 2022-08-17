package com.zpc.creater;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Administrator
 */
@SpringBootApplication(scanBasePackages = "com.zpc")
public class CreaterApplication {

    public static void main(String[] args) {
        SpringApplication.run(CreaterApplication.class, args);
    }

}
