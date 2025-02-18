package example.day02._3과제;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service // 스프링 컨테이너가 관리하는 서비스 클래스
public class BoardService {

    private final BoardDao boardDao; // DAO 의존성 선언

    // 생성자 주입 (권장 방식)
    @Autowired
    public BoardService(BoardDao boardDao) {
        this.boardDao = boardDao;
    }

    // 1️⃣ 글 작성
    public boolean writePost(BoardDto boardDto) {
        return boardDao.save(boardDto);
    }

    // 2️⃣ 전체 글 조회
    public List<BoardDto> getAllPosts() {
        return boardDao.findAll();
    }

    // 3️⃣ 개별 글 조회
    public Optional<BoardDto> getPostById(int bno) {
        return boardDao.findById(bno);
    }

    // 4️⃣ 글 수정
    public boolean updatePost(BoardDto boardDto) {
        return boardDao.update(boardDto);
    }

    // 5️⃣ 글 삭제
    public boolean deletePost(int bno) {
        return boardDao.delete(bno);
    }
}