package btt.site;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

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

}
