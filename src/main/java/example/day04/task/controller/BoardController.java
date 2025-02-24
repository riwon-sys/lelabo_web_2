package example.day04.task.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping( "/day04/task/board")
public class BoardController {
           // 스프링 컨테이너에 빈 (인스턴스) 주입


           // [1]   1. 글쓰기           POST       "/day04/task/board"
                  // 요청자료 : { "title" : "" , "content" : "" }
                  // 응답자료 : true 또는 false


           // [2]   2. 전체 글 조회      GET        "/day04/task/board"
                  //            요청자료 : x
                  //            응답자료 : [ { "bno": "" , "title" : "" , "content" : "" } ,
                  //                        { "bno": "" , "title" : "" , "content" : "" }  ]

           // [3]   3. 개별 글 조회      GET        "/day04/task/board/view"
                  //            요청자료 : ?bno=1
                  //            응답자료 : { "bno": "" , "title" : "" , "content" : "" }


           // [4]   4. 개글 글 수정      PUT        "/day04/task/board"
                  //            요청자료 : { "bno": "" , "title" : "" , "content" : "" }
                  //            응답자료 : true 또는 false


           // [5]   5. 개별 글 삭제      DELETE     "/day04/task/board"
                  //            요청자료 : ?bno=1
                  //            응답자료 : true 또는 false


}
