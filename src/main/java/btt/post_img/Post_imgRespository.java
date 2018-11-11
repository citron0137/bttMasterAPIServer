package btt.post_img;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Post_imgRespository extends JpaRepository<Post_img,Integer> {

}
