package example.day01._2REST;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// [주요 기능]
    // 1.@SpringBootApplication : @ Configuration 어노테이션을 포함하며, Spring 컨테이너 (메모리) 에 bean(객체) 설정을 등록할 수 있도록 도와주는 어노테이션
    // 2.@EnableAutoConfiguration : spring boot의 auto-configuration 기능을 활성화.
    //   // 웹서버 내장형인 'tomcat'을 설정
    // 3.@ComponentScan : 현재 클래스 기준으로 동일한 패키지 및 하위 패키지를 자동으로 스캔한다.
    //   // 스캔대상 : spring 컨테이너(메모리)에 등록할 대상 bean(객체)
    //   // 스캔 어노테이션 : @Component @Controller @Service @Repository @Mapper 등등 주로 MVC 어노테이션

public class AppStart { // 처음

    public static void main(String[] args) { // 1.
        SpringApplication.run(AppStart.class); // 2.

        // 1. spring 컨테이너(메모리) 초기화됨.
        // 2. 자동설정이 적용됨
        // 3. tomcat web server가 실행됨
        // 4. 확인 : 인터넷에서 'http://localhost:8080/' 접속 후 확인 가능.

    }
}
