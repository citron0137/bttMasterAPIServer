package btt.reassem_sub_file;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@RestController
@Transactional
public class Reassem_sub_fileController {
    @Autowired
    Reassem_sub_fileRespository reassem_sub_fileRespository;

    @GetMapping("/reassem_sub_file")
    public List<Reassem_sub_file> index(){
        return reassem_sub_fileRespository.findAll();
    }

    @GetMapping("/reassem_sub_file/{seq}")
    public Reassem_sub_file show(@PathVariable String seq){
        int reassem_sub_fileSeq = Integer.parseInt(seq);
        return reassem_sub_fileRespository.findOne(reassem_sub_fileSeq);
    }



}
