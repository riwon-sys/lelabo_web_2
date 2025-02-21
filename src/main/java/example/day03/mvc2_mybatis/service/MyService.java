package example.day03.mvc2_mybatis.service;

import example.day03.mvc2_mybatis.model.dto.MyDto;
import example.day03.mvc2_mybatis.model.mapper.MyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public  class MyService {
    @Autowired private MyMapper myMapper;

    // [1] 등록 로직
    public int save(MyDto myDto){
        System.out.println("MyService.save"); // soutm 자동완성
        System.out.println("myDto = " + myDto); //soutp 자동완성

        // 서비스는 mapper 인터페이스 요청하고 응답받는다.
        int result = myMapper.save(myDto);
        return result;
    }

    // [2] 전체조회 로직

    public List<MyDto>findAll(){
        System.out.println("MyService.findAll"); //soutm 자동완성
        List<MyDto> result = myMapper.findAll();
        return result;

    }

    // [3] 개별조회 로직
    public MyDto find(int id){
        System.out.println("MyService.find"); //soutm 자동완성
        System.out.println("id = " + id); // soutp 자동완성
        MyDto result = myMapper.find(id);
        return result;
    }
    // [4] 개별수정 로직
    public int update(MyDto myDto){
        System.out.println("MyService.update");
        System.out.println("myDto = " + myDto);
        int result = myMapper.update(myDto);
        return result;
    }
    // [5] 개별삭제 로직
    public int delete(int id){
        System.out.println("MyService.delete"); //soutm 자동완성
        System.out.println("id = " + id); // soutp 자동완성
        int result = myMapper.delete(id);
        return result;
    }

} // c e