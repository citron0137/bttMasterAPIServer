package btt.original_img;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

@RestController
public class Original_imgController {
    @Autowired
    Original_imgRespository original_imgRespository;

    @GetMapping("/original_img")
    public List<Original_img> index(){
        return original_imgRespository.findAll();
    }

    @GetMapping("/original_img/{seq}")
    public Original_img show(@PathVariable String seq){
        int original_imgSeq = Integer.parseInt(seq);
        return original_imgRespository.findOne(original_imgSeq);
    }


    @PostMapping("/original_img")
    @Transactional
    public Original_img create(@RequestBody Map<String, String> body){
        int original_movie_seq =Integer.parseInt(body.get("original_movie_seq"));
        String img_path = body.get("img_path");
        String img_hash = body.get("img_hash");
        String compare_hash = body.get("compare_hash");

        return original_imgRespository.save(new Original_img(original_movie_seq,img_path,img_hash,compare_hash));
    }

    @DeleteMapping("/original_img/{seq}")
    @Transactional
    public boolean delete(@PathVariable String seq){
        int original_imgSeq = Integer.parseInt(seq);
        original_imgRespository.delete(original_imgSeq);
        return true;
    }
}
