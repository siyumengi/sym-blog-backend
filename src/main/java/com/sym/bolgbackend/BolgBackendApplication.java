package com.sym.bolgbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

/**
 * @author 思与梦
 */
@SpringBootApplication
@PropertySource(value = "classpath:application.yml")
public class BolgBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(BolgBackendApplication.class, args);
    }

}
