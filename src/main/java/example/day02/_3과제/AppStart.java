package example.day02._3과제;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication // 1.
public class AppStart {
    public static void main(String[] args) { // 2.
        SpringApplication.run(example.day02._3과제.AppStart.class, args); // 3.
        // 1. spring 컨테이너(메모리) 초기화됨.
        // 2. 자동설정이 적용됨
        // 3. tomcat web server가 실행됨
        // 4. 확인 : 인터넷에서 'http://localhost:8080/' 접속 후 확인 가능.
    }
}
