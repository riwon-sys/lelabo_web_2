package example.day03.mvc2_3tire.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController // 1. 첫 시작 ; MVC 패턴의 Controller 임을 어노테이션으로 알림
// * 스프링 컨테이너(메모리) 등록 함으로써 스프링이 (자동 또는 알아서) 컨트롤러 제어한다.
public class MvcController {
    // @Autowired // 이 클래스가 MvcService 의 bean(객체)를 의존성 주입 받음
    @Autowired MvcController mvcController;
}

