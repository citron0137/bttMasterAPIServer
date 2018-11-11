package btt.board;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardRespository extends JpaRepository<Board,Integer> {

}
