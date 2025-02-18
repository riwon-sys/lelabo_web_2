package example.day02._3과제;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Component
class BoardService {
    void method(){
        System.out.println("BoardService.method");
    }
} //ce

class BoardControllerService {
    @Autowired
    private BoardService boardService;

    public void method() {
        boardService.method();
    }
}
@RestController // (1) HTTP URL 매핑 어노테이션 주입
public class BoardController2 {

    // (2) 현재 과제에서는 DB없으므로 리스트가 DB역할을 한다.
    private final List<BoardDto> boardTable = new ArrayList<>();
    private  int auto_increment =1; // bno 자동번호 역할

    // (3) POST 매핑으로 '/day02/task2/board' 주소의 body 값을 dto 로 매핑하여 함수 매개변수로 받는다. // 글쓰기
    @PostMapping("/day02/task2/board")
    public boolean method1(@RequestBody BoardDto boardDto) {
        boardDto.setBno(auto_increment++); // bno 자동��가
        boardTable.add(boardDto);
        return true;
    } // fe

    // (4) GET 매핑 // 글 전체 조회
    @GetMapping("/day02/task2/board")
    public List<BoardDto> method2() {
        return boardTable;
    } // fe

    // (5) GET 매핑 // 글 개별 조회
    @GetMapping("/day02/task2/board/view")
    public BoardDto method3(@RequestParam(name="bno")int bno) {
        for(int i=0; i<=boardTable.size()-1; i++){
            BoardDto boardDto = boardTable.get(i);
            if(boardDto.getBno() == bno) {return boardDto;}


        }
        return null; // bno not found.
    } // f e

    // (6)PUT 매핑 //개별 글 수정
    @PutMapping("/day02/task2/board/update")
    public boolean method4(@RequestBody BoardDto boardDto) {
        for(int i=0; i<=boardTable.size()-1; i++){
            BoardDto board = boardTable.get(i);
            if(board.getBno() == boardDto.getBno()) {
                boardTable.set(i, boardDto);
                return true;
            }
        }
        return false; // bno not found.
    } // f e

    // (7) DELETE 매핑 // 개별 글 삭제
    @DeleteMapping("/day02/task2/board/delete")
    public boolean method5(@RequestParam(name="bno")int bno) {
        for(int i=0; i<=boardTable.size()-1; i++){
            BoardDto board = boardTable.get(i);
            if(board.getBno() == bno) {
                boardTable.remove(i);
                return true;
            }
        }
        return false; // bno not found.
    } // f e
} // c e
