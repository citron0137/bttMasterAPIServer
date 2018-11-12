package btt.site;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SiteRespository extends JpaRepository<Site,Integer> {

    @Query("select s from Site s where s.site_link = :site_link")
    public List<Site> findBySite_link(@Param("site_link")String site_link);
}
