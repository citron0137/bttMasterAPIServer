package btt.detect_hit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

@RestController
public class Detect_hitController {
    @Autowired
    Detect_hitRespository detect_hitRespository;

    @GetMapping("/detect_hit")
    public List<Detect_hit> index(){
        return detect_hitRespository.findAll();
    }

    @GetMapping("/detect_hit/{seq}")
    public Detect_hit show(@PathVariable String seq){
        int detect_hitSeq = Integer.parseInt(seq);
        return detect_hitRespository.findOne(detect_hitSeq);
    }
    
    @GetMapping("/detect_hit/search")
    public List<Detect_hit> search(@RequestParam(value="original_movie_seq",defaultValue="false")String original_movie_seq){
	int oms = Integer.parseInt(original_movie_seq);    
	return detect_hitRespository.findByOriginal_movie_seq(oms);
    }


    @PostMapping("/detect_hit")
    @Transactional
    public Detect_hit create(@RequestBody Map<String, String> body){
        int sub_file_seq =Integer.parseInt(body.get("sub_file_seq"));
        int original_movie_seq =Integer.parseInt(body.get("original_movie_seq"));
        LocalDateTime search_date = LocalDateTime.parse(body.get("search_date"));
        return detect_hitRespository.save(new Detect_hit(sub_file_seq, original_movie_seq, search_date));
    }

    @DeleteMapping("/detect_hit/{seq}")
    @Transactional
    public boolean delete(@PathVariable String seq){
        int detect_hitSeq = Integer.parseInt(seq);
        detect_hitRespository.delete(detect_hitSeq);
        return true;
    }
}
