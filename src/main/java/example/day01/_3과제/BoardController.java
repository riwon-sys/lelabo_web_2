package example.day01._3과제;


import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/day01/task")
public class BoardController {

    // 글쓰기
    @PostMapping("/board")
    public boolean boardWrite() { // 보드 롸이트
        return true;
    }

    // 전체 글 조회
    @GetMapping("/board")
    public List<Map<String, String>> getAllBoards() { // 올 겟 보드
        List<Map<String, String>> list = new ArrayList<>();

        Map<String, String> map1 = new HashMap<>();
        map1.put("bno", "1");
        map1.put("btitle", "제목1");
        list.add(map1);

        Map<String, String> map2 = new HashMap<>();
        map2.put("bno", "2");
        map2.put("btitle", "제목2");
        list.add(map2);

        return list;
    }

    // 개별 글 조회
    @GetMapping("/board/view")
    public Map<String, String> getBoard() { //겟 보드
        Map<String, String> map1 = new HashMap<>();
        map1.put("bno", "1");
        map1.put("btitle", "제목1");
        return map1;
    }

    // 개별 글 수정
    @PutMapping("/board")
    public boolean boardUpdate() { // 보드 업데이트
        return true;
    }

    // 개별 글 삭제
    @DeleteMapping("/board")
    public int boardDelete() { // 보드 딜리트
        return 3;  // 삭제된 글 번호 반환
    }
}

