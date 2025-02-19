package example.day02._3과제;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/day02/task2/board")  // 클래스 레벨에서 기본 URL 설정
public class BoardController2 {

    @Autowired
    BoardDao boardDao;

    // POST 매핑
    @PostMapping("")
    public boolean method1(@RequestBody BoardDto boardDto) {
        return boardDao.method1(boardDto);
    }

    // GET 매핑 (전체 리스트 조회)
    @GetMapping("")
    public List<BoardDto> method2() {
        return boardDao.method2();
    }

    // GET 매핑 (개별 조회)
    @GetMapping("/view")
    public BoardDto method3(@RequestParam(name = "bno") int bno) {
        return boardDao.method3(bno);
    }

    // PUT 매핑 (수정)
    @PutMapping("")
    public boolean method4(@RequestBody BoardDto boardDto) {
        return boardDao.method4(boardDto);
    }

    // DELETE 매핑 (삭제)
    @DeleteMapping("")
    public boolean method5(@RequestParam(name = "bno") int bno) {
        return boardDao.mehtod5(bno);
    }
}