package btt.torrent_file;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Map;

@RestController
@Transactional
public class Torrent_fileController {
    @Autowired
    Torrent_fileRespository torrent_fileRespository;

    @GetMapping("/torrent_file")
    public List<Torrent_file> index(){
        return torrent_fileRespository.findAll();
    }

    @GetMapping("/torrent_file/{seq}")
    public Torrent_file show(@PathVariable String seq){
        int torrent_fileSeq = Integer.parseInt(seq);
        return torrent_fileRespository.findOne(torrent_fileSeq);
    }

    @PostMapping("/torrent_file")
    @Transactional
    public Torrent_file create(@RequestBody Map<String, String> body){
        int post_seq = Integer.parseInt(body.get("post_seq"));
        String magnet = body.get("magenet");
        String infohash = body.get("infohash");
        String file_size = body.get("file_size");
        int state = Integer.parseInt(body.get("state"));
        return torrent_fileRespository.save(new Torrent_file(post_seq,magnet,infohash,file_size,state));
    }

    @DeleteMapping("/torrent_file/{seq}")
    @Transactional
    public boolean delete(@PathVariable String seq){
        int torrent_fileSeq = Integer.parseInt(seq);
        torrent_fileRespository.delete(torrent_fileSeq);
        return true;
    }
}

