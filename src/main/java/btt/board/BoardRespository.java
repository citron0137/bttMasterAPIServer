package btt.board;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BoardRespository extends JpaRepository<Board,Integer> {

    @Query(
            value = "SELECT * FROM boards b where b.board_link = :board_link",
            nativeQuery=true
    )
    public Optional<Board> findByBoard_link(@Param("board_link") String board_link);
}