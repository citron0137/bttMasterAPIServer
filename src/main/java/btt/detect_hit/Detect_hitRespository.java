package btt.detect_hit;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import java.util.List;
import java.util.Optional;

@Repository
public interface Detect_hitRespository extends JpaRepository<Detect_hit,Integer> {
    
    @Query("select d from Detect_hit d where d.original_movie_seq = :original_movie_seq")
    public List<Detect_hit> findByOriginal_movie_seq(@Param("original_movie_seq")int original_movie_seq );

}
