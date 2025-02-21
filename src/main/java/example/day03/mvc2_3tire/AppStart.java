package example.day03.mvc2_3tire;


import com.sun.tools.javac.Main;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // 1. 첫 시작 ; 현재 클래스와 동일패키지와 하위패키지 들의 컴포넌트 들을 스캔한다.
// 컴포넌트(모듈/레고조각) 란? MVC패턴의 계층 클래스들
// @Component 또는  @Restcontroller @Controller @Service @Repository @Configuration @Mapper 등등
public class AppStart {
    public static void main(String[] args) { // 2.
        SpringApplication.run(AppStart.class, args); // 3. Spring Boot 시작

        // 4. 확인 : 인터넷에서 'http://localhost:8080/' 접속 후 확인 가능.

    }
}
