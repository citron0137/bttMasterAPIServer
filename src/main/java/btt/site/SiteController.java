package btt.site;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Map;

@RestController
@Transactional
public class SiteController {
    @Autowired
    SiteRespository siteRespository;

    @GetMapping("/site")
    public List<Site> index(){
        return siteRespository.findAll();
    }

    @GetMapping("/site/{seq}")
    public Site show(@PathVariable String seq){
        int siteSeq = Integer.parseInt(seq);
        return siteRespository.findOne(siteSeq);
    }
    @GetMapping("/board/search")
    public List<Site> search(@RequestParam(value="site_link",defaultValue="false")String site_link){
        return siteRespository.findBySite_link(site_link);
    }
    @PostMapping("/site")
    @Transactional
    public Site create(@RequestBody Map<String, String> body){
        String site_link = body.get("site_link");
        return siteRespository.save(new Site(site_link));
    }

    @DeleteMapping("/site/{seq}")
    @Transactional
    public boolean delete(@PathVariable String seq){
        int siteSeq = Integer.parseInt(seq);
        siteRespository.delete(siteSeq);
        return true;
    }
}
