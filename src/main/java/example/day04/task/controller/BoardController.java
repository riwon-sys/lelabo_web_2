package example.day04.task.controller;


import example.day04.task.model.dto.BoardDto;
import example.day04.task.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping( "/day04/task/board")
public class BoardController {
           // 스프링 컨테이너에 빈 (인스턴스) 주입
           @Autowired
           private BoardService boardService;


           // [1]   1. 글쓰기           POST       "/day04/task/board"
                  // 요청자료 : { "title" : "" , "content" : "" }
                  // 응답자료 : true 또는 false
           @PostMapping("/day04/task/board")
           public boolean _write(@RequestBody() BoardDto boardDto) {
               System.out.println("BoardController._write");
               System.out.println("boardDto = " + boardDto);
               boolean result = boardService._write(boardDto);
               System.out.println("BoardController._write");
               return result;
           }

           // [2]   2. 전체 글 조회      GET        "/day04/task/board"
                  //            요청자료 : x
                  //            응답자료 : [ { "bno": "" , "title" : "" , "content" : "" } ,
                  //                        { "bno": "" , "title" : "" , "content" : "" }  ]
           @GetMapping("day04/task/board")
           public List<BoardDto> _findAll() {
               System.out.println("BoardController._findAll");
               List<BoardDto> result = boardService._findAll();
               System.out.println("BoardController._findAll");
               return result;
           }
           // [3]   3. 개별 글 조회      GET        "/day04/task/board/view"
                  //            요청자료 : ?bno=1
                  //            응답자료 : { "bno": "" , "title" : "" , "content" : "" }
           @GetMapping("/day04/task/board/view")
           public BoardDto _find(@RequestParam(name="bno") int bno) {
               System.out.println("BoardController._find");
               System.out.println("bno = " + bno);
               BoardDto result = boardService._find(bno);
               System.out.println("BoardController._find");
               return result;
           }

           // [4]   4. 개글 글 수정      PUT        "/day04/task/board"
                  //            요청자료 : { "bno": "" , "title" : "" , "content" : "" }
                  //            응답자료 : true 또는 false
           @PutMapping("/day04/task/board")
           public boolean _update(@RequestBody() BoardDto boardDto) {
               System.out.println("BoardController._update");
               System.out.println("boardDto = " + boardDto);
               boolean result = boardService._update(boardDto);
               System.out.println("BoardController._update");
               return result;
           }

           // [5]   5. 개별 글 삭제      DELETE     "/day04/task/board"
                  //            요청자료 : ?bno=1
                  //            응답자료 : true 또는 false

            /** 개별 글 삭제 */
            @DeleteMapping("/day04/task/board")
            public boolean _delete(@RequestParam(name="bno") int bno) {
               System.out.println("BoardController._delete");
               System.out.println("bno = " + bno);
               boolean result = boardService._delete(bno);
               System.out.println("BoardController._delete");
               return result;
            }
}
