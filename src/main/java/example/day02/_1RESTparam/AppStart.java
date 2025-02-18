package example.day02._1RESTparam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

 // http://192.168.40.73:8080/day02/task1/board/
@SpringBootApplication // [1]. @SpringBootApplication :

public class AppStart {
    public static void main(String[] args) { // [2].
        SpringApplication.run(example.day01._2REST.AppStart.class); // [3].

        // 1. spring 컨테이너(메모리) 초기화됨.
        // 2. 자동설정이 적용됨
        // 3. tomcat web server가 실행됨
        // 4. 확인 : 인터넷에서 'http://localhost:8080/' 접속 후 확인 가능.

    }
}
