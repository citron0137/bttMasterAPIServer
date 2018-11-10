package btt.board;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Map;

@RestController
public class BoardController {
    @Autowired
    BoardRespository boardRespository;

    @GetMapping("/board")
    public List<Board> index(){
        return boardRespository.findAll();
    }

    @GetMapping("/board/{seq}")
    public Board show(@PathVariable String seq){
        int boardSeq = Integer.parseInt(seq);
        return boardRespository.findOne(boardSeq);
    }

    @PostMapping("/board")
    @Transactional
    public Board create(@RequestBody Map<String, String> body){
        int site_seq = Integer.parseInt(body.get("site_seq"));
        String board_url = body.get("board_link");
        return boardRespository.save(new Board(site_seq,board_url));
    }

    @DeleteMapping("/board/{seq}")
    @Transactional
    public boolean delete(@PathVariable String seq){
        int boardSeq = Integer.parseInt(seq);
        boardRespository.delete(boardSeq);
        return true;
    }
}
