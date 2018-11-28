package btt.detect_detail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

@RestController
public class Detect_detailController {
    @Autowired
    Detect_detailRespository detect_detailRespository;

    @GetMapping("/detect_detail")
    public List<Detect_detail> index(){
        return detect_detailRespository.findAll();
    }

    @GetMapping("/detect_detail/{seq}")
    public Detect_detail show(@PathVariable String seq){
        int detect_detailSeq = Integer.parseInt(seq);
        return detect_detailRespository.findOne(detect_detailSeq);
    }
    
    @GetMapping("/detect_detail/search")
    public List<Detect_detail> search(@RequestParam(value="detect_hit_seq",defaultValue="false")String detect_hit_seq){
	int dhs = Integer.parseInt(detect_hit_seq);
	return detect_detailRespository.findByDetect_hit_seq(dhs);
    }


    @PostMapping("/detect_detail")
    @Transactional
    public Detect_detail create(@RequestBody Map<String, String> body){
        int detect_hit_seq =Integer.parseInt(body.get("detect_hit_seq"));
        int sub_img_seq =Integer.parseInt(body.get("sub_img_seq"));
        int original_img_seq =Integer.parseInt(body.get("original_img_seq"));
        int compare_hash =Integer.parseInt(body.get("compare_hash"));
        return detect_detailRespository.save(new Detect_detail(detect_hit_seq,sub_img_seq,original_img_seq,compare_hash));
    }

    @DeleteMapping("/detect_detail/{seq}")
    @Transactional
    public boolean delete(@PathVariable String seq){
        int detect_detailSeq = Integer.parseInt(seq);
        detect_detailRespository.delete(detect_detailSeq);
        return true;
    }
}
