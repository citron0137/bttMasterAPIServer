package btt.post;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

@RestController
public class PostController {
    @Autowired
    PostRespository postRespository;

    @GetMapping("/post")
    public List<Post> index(){
        return postRespository.findAll();
    }

    @GetMapping("/post/{seq}")
    public Post show(@PathVariable String seq){
        int postSeq = Integer.parseInt(seq);
        return postRespository.findOne(postSeq);
    }


    @PostMapping("/post")
    @Transactional
    public Post create(@RequestBody Map<String, String> body){
        int board_seq =Integer.parseInt(body.get("board_seq"));
        LocalDateTime post_date = LocalDateTime.parse(body.get("post_date"));
        String post_link = body.get("post_link");
        String post_name = body.get("post_name");
        String user_id = body.get("user_id");
        return postRespository.save(new Post(board_seq,post_date,post_link,post_name,user_id));
    }

    @DeleteMapping("/post/{seq}")
    @Transactional
    public boolean delete(@PathVariable String seq){
        int postSeq = Integer.parseInt(seq);
        postRespository.delete(postSeq);
        return true;
    }
}
