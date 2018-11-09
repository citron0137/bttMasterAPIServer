package btt.torrent_file;

import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Torrent_file {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int seq;

    private int post_seq;
    private String magnet;
    private String infohash;
    private String file_size;
    private int state;

    public Torrent_file(){}

}
