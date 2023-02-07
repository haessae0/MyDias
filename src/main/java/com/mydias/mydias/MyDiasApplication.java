package com.mydias.mydias;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class MyDiasApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyDiasApplication.class, args);
    }

}
