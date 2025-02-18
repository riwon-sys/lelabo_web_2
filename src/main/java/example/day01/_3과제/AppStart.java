package example.day01._3과제;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // 1.

public class AppStart {
    public static void main(String[] args) { // 2.
        SpringApplication.run(example.day02._3과제.AppStart.class, args); // 3.
    }
}