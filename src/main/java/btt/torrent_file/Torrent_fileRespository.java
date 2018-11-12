package btt.torrent_file;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Torrent_fileRespository extends JpaRepository<Torrent_file,Integer> {

}
