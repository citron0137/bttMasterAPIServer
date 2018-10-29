package btt.torrent_file;

import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Torrent_file {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int seq;


}
