package example.day01._2REST;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

//@Controller // 1. bean(객체) 등록 2.http 서블릿 지원
@RestController // @Controller + @ResponseBody
@RequestMapping("/day01")
public class RestController2 {

    // [1] @ResponseBody : // 자동으로 함수  return 값을 http resp. 값을 app/json 으로 응답.
    // [2] @RestController : // @Controller + @ResponseBody + @RestControllerAdvice(GlobalExceptionHandler.class)
    // [3] @RequestMapping : // 공통 url mapping
    @GetMapping("/doget3")
    // @ResponseBody
    public int doGet3() {return 100;}  // 3. http method: GET }

    @GetMapping("/doget4")
    // @ResponseBody
    public String doGet4() { return "hello! i'm spring!!!";}
    // 3. http method: GET }
    // Content-Type :	text/plain;charset=UTF-8

    @GetMapping("/doget5")
    // @ResponseBody
    public Map<String, String> doGet5() {
        Map<String, String> map = new HashMap<>();
        map.put("name", "포동");
        map.put("name2", "유느");
        return map;
    }

    @GetMapping("/doget6")
    // @ResponseBody
    public boolean doGet6() {return true;}
}
