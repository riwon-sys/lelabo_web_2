package example.day07Task.service;

import example.day07Task.mapper.TaskMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class TaskService {

    @Autowired
    private TaskMapper taskMapper;

    // [1] 번호 등록
    public int onPost( Map<String,Object> map ){
        System.out.println("TaskService.onPost");
        System.out.println("map = " + map);
        return taskMapper.onPost( map );
    }

}
