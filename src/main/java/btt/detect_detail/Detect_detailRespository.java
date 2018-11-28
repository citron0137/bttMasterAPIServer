package btt.detect_detail;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import java.util.List;
import java.util.Optional;

@Repository
public interface Detect_detailRespository extends JpaRepository<Detect_detail,Integer> {
    
    @Query("select d from Detect_detail d where d.detect_hit_seq = :detect_hit_seq")
    public List<Detect_detail> findByDetect_hit_seq(@Param("detect_hit_seq")int detect_hit_seq );

}
