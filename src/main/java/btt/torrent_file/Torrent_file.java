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

    public Torrent_file(int post_seq, String magnet, String infohash, String file_size, int state){
	this.post_seq = post_seq;
	this.magnet = magnet;
	this.infohash = infohash;
	this.file_size = file_size;
	this.state = state;
    }

    public Torrent_file(int seq, int post_seq, String magnet, String infohash, String file_size, int state){
	this.seq = seq;
	this.post_seq = post_seq;
	this.magnet = magnet;
	this.infohash = infohash;
	this.file_size = file_size;
	this.state = state;
    }

    


}
