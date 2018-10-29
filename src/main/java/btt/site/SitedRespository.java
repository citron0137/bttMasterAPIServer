package btt.site;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SitedRespository extends JpaRepository<Site,Integer> {

}
