package example.day07Task.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;

import java.util.Map;

@Mapper
public interface TaskMapper {

    // [1] 등록  // @어노테이션 선택
    @Insert(" insert into phonebook( pname ,  pphone , pemail ) values( #{pname} , #{ pphone } , #{pmail} ) ")

    @Options( useGeneratedKeys = true , keyProperty = "pno" )
    public int onPost( Map<String,Object> map );

}
/*
* // [1] 등록
    // 선택 .xml vs @어노테이션
    // @Insert( " insert into student( name , kor , mata ) values( #{ 매개변수 } , #{ 매개변수 } , #{ 매개변수 } ) ")
    @Insert( " insert into student( name , kor , math ) values( #{ name } , #{ kor } , #{ math } ) ")
    @Options( useGeneratedKeys = true , keyProperty = "sno" )
    int save( HashMap< String , Object> map );
*
* */