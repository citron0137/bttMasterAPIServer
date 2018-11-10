package btt.reassem_file;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.math.BigInteger;
import java.net.InetAddress;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

@RestController
@Transactional
public class Reassem_fileController {
    @Autowired
    Reassem_fileRespository reassem_fileRespository;

    @GetMapping("/reassem_file")
    public List<Reassem_file> index(){
        return reassem_fileRespository.findAll();
    }

    @GetMapping("/reassem_file/{seq}")
    public Reassem_file show(@PathVariable String seq){
        int reassem_fileSeq = Integer.parseInt(seq);
        return reassem_fileRespository.findOne(reassem_fileSeq);
    }

    @PostMapping("/reassem_file")
    @Transactional
    public Reassem_file create(@RequestBody Map<String, String> body) {
        try {
            String uri = body.get("uri");
            BigInteger ip = new BigInteger(InetAddress.getByName(body.get("ip")).getAddress());
            LocalDateTime reassem_date = LocalDateTime.parse(body.get("ressem_date"));
            int state = Integer.parseInt(body.get("state"));
            return reassem_fileRespository.save(new Reassem_file(uri,ip,reassem_date,state));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @DeleteMapping("/reassem_file/{seq}")
    public boolean delete(@PathVariable String seq){
        int reassem_fileSeq = Integer.parseInt(seq);
        reassem_fileRespository.delete(reassem_fileSeq);
        return true;
    }
}

