package btt.client_member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

@RestController
public class Client_memberController {
    
    @Autowired
    Client_memberRespository client_memberRespository;

    @GetMapping("/client_member")
    public List<Client_member> index(){
        return client_memberRespository.findAll();
    }

    @GetMapping("/client_member/{seq}")
    public Client_member show(@PathVariable String seq){
        int client_memberSeq = Integer.parseInt(seq);
        return client_memberRespository.findOne(client_memberSeq);
    }


    @PostMapping("/client_member")
    @Transactional
    public Client_member create(@RequestBody Map<String, String> body){
        String id = body.get("id");
        String tel = body.get("tel");
        return client_memberRespository.save(new Client_member(id,tel));
    }

    @DeleteMapping("/client_member/{seq}")
    @Transactional
    public boolean delete(@PathVariable String seq){
        int client_memberSeq = Integer.parseInt(seq);
        Client_memberRespository.delete(client_memberSeq);
        return true;
    }
}
