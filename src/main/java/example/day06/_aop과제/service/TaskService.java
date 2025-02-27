package example.day06._aop과제.service;

import example.day06._aop과제.model.mapper.TaskMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

@Service
public class TaskService {

    @Autowired
    private TaskMapper taskMapper;

    // [1] 학생 점수 등록
    public int save( Map<String,Object> map ){
        System.out.println("TaskService.save");
        System.out.println("map = " + map);
        return taskMapper.save( map );
    }
    // [2] 학생 전체 조회
    public List<Map<String,Object>> findAll(){
        return taskMapper.findAll();
    }

}