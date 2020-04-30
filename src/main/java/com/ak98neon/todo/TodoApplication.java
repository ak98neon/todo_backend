package com.ak98neon.todo;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoApplication {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(TodoApplication.class);
        app.setBannerMode(Banner.Mode.OFF);
        app.run(args);
    }

}
