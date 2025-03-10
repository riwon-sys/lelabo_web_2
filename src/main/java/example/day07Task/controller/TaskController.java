package example.day07Task.controller;


import example.day07Task.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController // 빈 등록
@RequestMapping("/day07Task/task") // 공통 URL
@CrossOrigin("http://localhost:5173") // CORS 정책 허용 , 특정 url만 허용 가능하도록 한다. , 우리의 리액트 서버 허용
public class TaskController {
    // [1] POST

    @Autowired
    private TaskService taskService;

    // [1] POST // http://localhost:8080/day07Task/task
    // { "name" : "차정원" , "phone" : "010-3222-3222" , "mail" : "salesteam_team@example.com" }
    @PostMapping("")
    public int onPost( @RequestBody Map<String,Object> map ){
        System.out.println("TaskController.onPost");
        System.out.println("map = " + map);

        return taskService.onPost( map );
    }



 }
