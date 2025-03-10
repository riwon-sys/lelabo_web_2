package example.day07task2.service;

import example.day07Task.mapper.TaskMapper;
import example.day07task2.model.dto.TaskDto2;
import example.day07task2.model.mapper.TaskMapper2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service // 스프링 컨테이너에 빈 등록
public class TaskService2 {

    // @Autowired // 인터페이스 매퍼 소괄호 까지 복붙 실행 후 입력 시작
    @Autowired private TaskMapper2 taskMapper;

    // [1] 등록
    public int phonePost(TaskDto2 taskDto){
        return taskMapper.phonePost(taskDto);
    } //  빨간불표시> 매퍼인터페이스 로 이동해서 입력 후 / 리턴값 입력하면 빨간불표시 사라짐
    // (1) phonePost 빨간불표시> 서비스클래스 로 이동해서
    // [2] 조회
    public List<TaskDto2>phoneGet() {
        return taskMapper.phoneGet();
    } //  빨간불표시> 매퍼인터페이스 로 이동해서 입력 후 / 리턴값 입력하면 빨간불표시 사라짐

}
