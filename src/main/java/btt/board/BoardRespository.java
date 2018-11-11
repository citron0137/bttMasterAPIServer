package btt.board;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BoardRespository extends JpaRepository<Board,Integer> {

    @Query("select * from Board b where b.board_link = :board_link")
    public List<Board> findByBoard_link(@Param("board_link")String board_link);
}