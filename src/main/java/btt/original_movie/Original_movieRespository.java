package btt.original_movie;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Original_movieRespository extends JpaRepository<Original_movie,Integer> {

}
