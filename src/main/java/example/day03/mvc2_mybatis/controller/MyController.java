package example.day03.mvc2_mybatis.controller;


import example.day03.mvc2_mybatis.model.dto.MyDto;
import example.day03.mvc2_mybatis.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController // 첫 번째 입력 ; HTTP servlet 매핑 지원 @Controller , @ResponseBody 포함 , @Component 컨테이너 빈 등록.
public class MyController {
    // [*] 스프링 컨테이너에서 객체/인스턴스를 주입
    @Autowired private MyService myService;

    // (1) PostMapping[POST] http://localhost:8080/day03/save [BODY: {"name":"유재석", "age":40}]
    @PostMapping("/day03/save")
    public int save (@RequestBody MyDto myDto){
        System.out.println("MyController.save"); // soutm : 메소드명
        System.out.println("myDto = " + myDto); // soutp : 매개변수

        int result = myService.save(myDto);
        return result;
    }

    // (2) GetMapping[GET] http://localhost:8080/day03/findall
    @PostMapping("/day03/findall")
    public List<MyDto> findAll(){
        System.out.println("MyController.findAll"); // soutm : 메소드명

        List<MyDto> result = myService.findAll();
        return result;
    }
    // (3) GetMapping[GET] http://localhost:8080/day03/find?id=1 [ queryString : id=1 ]
    @PostMapping("/day03/find")
    public MyDto find(@RequestParam("id") int id){
        System.out.println("MyController.find");
        System.out.println("id = " + id);
        // 컨트롤러에서 서비스에게 전달하고 응답받기
        MyDto result = myService.find(id);
        return result;
    }

    // (4) PutMapping[PUT] http://localhost:8080/day03/update [BODY: {"id":"1", "name":"유재석2", "age":"33"}]
    @PutMapping("/day03/update")
    public int update (@RequestBody MyDto myDto){
        System.out.println("MyController.update");
        System.out.println("myDto = " + myDto);
        //
        int result = myService.update(myDto);
        return result;
    }

    // (5) DeleteMapping[DELETE] http://localhost:8080/day03/delete?id=1 [queryString : id=1 ]
    @DeleteMapping("/day03/delete")
    public int delete(@RequestParam("id") int id){
        System.out.println("MyController.delete");
        System.out.println("id = " + id);
        //
        int result = myService.delete(id);
        return result;
    }


} // c e
