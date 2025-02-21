package example.day03.mvc2_3tire.model.repository;


import org.springframework.stereotype.Repository;

@Repository // 1. 첫 시작 ;
// @Mapper ( 마이바티스[DB 연동 라이브러리] ) 실무에서 주로 사용
// @Repository ( JPA[DB 매핑 라이브러리] ) 실무에서 주로 사용
// @Component (DAO [단순 JDBC 클래스])
// * 왜? 라이브러리 사용 하나요? 작업하는데 통일성을 유지하기 위해서.
public interface MvcRepository {

}
