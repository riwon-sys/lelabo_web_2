package example.day07task2.model.mapper;

import example.day07task2.model.dto.TaskDto2;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface TaskMapper2 {

    // [ * ]클래스 서비스 퍼플릭부분 부터 소괄호 까지 복사해서 복사 붙여넣기 실행

    // [1] 등록
    // [ * ]클래스 서비스 퍼플릭부분 부터 소괄호 까지 복사해서 복사 붙여넣기 실행
    @Insert("Insert into phonebook (pname,pphone)values (#{pname},#{pphone})")
    public int phonePost(TaskDto2 taskDto);

    // [2] 조회
    // [ * ]클래스 서비스 퍼플릭부분 부터 소괄호 까지 복사해서 복사 붙여넣기 실행
    @Select("Select * from phonebook")
    public List<TaskDto2> phoneGet();
}
