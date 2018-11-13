package btt.sub_file;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

@RestController
public class Sub_fileController {
    @Autowired
    Sub_fileRespository sub_fileRespository;

    @GetMapping("/sub_file")
    public List<Sub_file> index(){
        return sub_fileRespository.findAll();
    }

    @GetMapping("/sub_file/{seq}")
    public Sub_file show(@PathVariable String seq){
        int sub_fileSeq = Integer.parseInt(seq);
        return sub_fileRespository.findOne(sub_fileSeq);
    }


    @PostMapping("/sub_file")
    @Transactional
    public Sub_file create(@RequestBody Map<String, String> body){
        
	int torrent_file_seq =Integer.parseInt(body.get("torrent_file_seq"));
	String file_name = body.get("file_name");
	long file_size = Long.parseLong(body.get("file_size"));
	String file_extension = body.get("file_extension");
        return sub_fileRespository.save(new Sub_file(torrent_file_seq, file_name, file_size, file_extension));
    }

    @DeleteMapping("/sub_file/{seq}")
    @Transactional
    public boolean delete(@PathVariable String seq){
        int sub_fileSeq = Integer.parseInt(seq);
        sub_fileRespository.delete(sub_fileSeq);
        return true;
    }
}
