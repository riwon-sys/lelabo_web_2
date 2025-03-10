package example.day07task2.controller;

import example.day07task2.model.dto.TaskDto2;
import example.day07task2.service.TaskService2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/day07/task2")
public class TaskController2 {

    @Autowired
    private TaskService2 taskService2;
    // [1] 등록
    @PostMapping("")
    public int phonePost(@RequestBody TaskDto2 taskDto2){ // 리퀘스트 바디는 포스트하고 풋만 사용
        System.out.println("TaskController2.phonePost");
        System.out.println("taskDto = " + taskDto2);
        return taskService2.phonePost(taskDto2);
        // return 1; // (1) 임의로 1을 대입

        // (2) phonePost 빨간불표시> 서비스클래스 로 이동해서

        // [1] 등록
        // public int phonePost(TaskDto2 taskDto){ 입력

    }

    // [2] 조회
    @GetMapping("")
    public List<TaskDto2> phoneGet(){
        System.out.println("TaskController2.phoneGet");
        return taskService2.phoneGet();
        // return  null; // (1) 임의로 빈값

        // (2) phoneGet 빨간불표시> 서비스클래스 로 이동해서

        // [2] 조회
        // public List<TaskDto2>phoneGet(){ } 입력


    }
}
