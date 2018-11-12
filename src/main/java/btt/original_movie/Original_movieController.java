package btt.original_movie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

@RestController
public class Original_movieController {
    @Autowired
    Original_movieRespository original_movieRespository;

    @GetMapping("/original_movie")
    public List<Original_movie> index(){
        return original_movieRespository.findAll();
    }

    @GetMapping("/original_movie/{seq}")
    public Original_movie show(@PathVariable String seq){
        int original_movieSeq = Integer.parseInt(seq);
        return original_movieRespository.findOne(original_movieSeq);
    }


    @PostMapping("/original_movie")
    @Transactional
    public Original_movie create(@RequestBody Map<String, String> body){
        int client_seq =Integer.parseInt(body.get("client_seq"));
        String original_name = body.get("original_name");
        LocalDateTime original_date = LocalDateTime.parse(body.get("original_date"));
        return original_movieRespository.save(new Original_movie(client_seq,original_name,original_date));
    }

    @DeleteMapping("/original_movie/{seq}")
    @Transactional
    public boolean delete(@PathVariable String seq){
        int original_movieSeq = Integer.parseInt(seq);
        original_movieRespository.delete(original_movieSeq);
        return true;
    }
}
