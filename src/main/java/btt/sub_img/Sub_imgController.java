package btt.sub_img;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

@RestController
public class Sub_imgController {
    @Autowired
    Sub_imgRespository sub_imgRespository;

    @GetMapping("/sub_img")
    public List<Sub_img> index(){
        return sub_imgRespository.findAll();
    }

    @GetMapping("/sub_img/{seq}")
    public Sub_img show(@PathVariable String seq){
        int sub_imgSeq = Integer.parseInt(seq);
        return sub_imgRespository.findOne(sub_imgSeq);
    }


    @PostMapping("/sub_img")
    @Transactional
    public Sub_img create(@RequestBody Map<String, String> body){
        
	int sub_file_seq =Integer.parseInt(body.get("sub_file_seq"));
	String img_path = body.get("img_path");
	String img_hash = body.get("img_hash");
	String compare_hash = body.get("compare_hash");
        return sub_imgRespository.save(new Sub_img(sub_file_seq, img_path, img_hash, compare_hash));
    }

    @DeleteMapping("/sub_img/{seq}")
    @Transactional
    public boolean delete(@PathVariable String seq){
        int sub_imgSeq = Integer.parseInt(seq);
        sub_imgRespository.delete(sub_imgSeq);
        return true;
    }
}
