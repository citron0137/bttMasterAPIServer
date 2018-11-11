package btt.post_img;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Map;

@RestController
public class Post_imgController {
    @Autowired
    Post_imgRespository post_imgRespository;

    @GetMapping("/post_img")
    public List<Post_img> index(){
        return post_imgRespository.findAll();
    }

    @GetMapping("/post_img/{seq}")
    public Post_img show(@PathVariable String seq){
        int post_imgSeq = Integer.parseInt(seq);
        return post_imgRespository.findOne(post_imgSeq);
    }

    @PostMapping("/post_img")
    public Post_img creat(@RequestBody Map<String, String> body){
        int post_seq = Integer.parseInt(body.get("post_seq"));
        String img_path = body.get("img_path");
        String img_hash = body.get("img_hash");
        return post_imgRespository.save(new Post_img(post_seq, img_path, img_hash));
    }

    @DeleteMapping("/post_img/{seq}")
    public boolean delete(@PathVariable String seq){
        int post_imgSeq = Integer.parseInt(seq);
        post_imgRespository.delete(post_imgSeq);
        return true;
    }
}
