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

    public int getSeq() {
        return seq;
    }

    public void setSeq(int seq) {
        this.seq = seq;
    }

    public int getPost_seq() {
        return post_seq;
    }

    public void setPost_seq(int post_seq) {
        this.post_seq = post_seq;
    }

    public String getMagnet() {
        return magnet;
    }

    public void setMagnet(String magnet) {
        this.magnet = magnet;
    }

    public String getInfohash() {
        return infohash;
    }

    public void setInfohash(String infohash) {
        this.infohash = infohash;
    }

    public String getFile_size() {
        return file_size;
    }

    public void setFile_size(String file_size) {
        this.file_size = file_size;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Torrent_file{" +
                "seq=" + seq +
                ", post_seq=" + post_seq +
                ", magnet='" + magnet + '\'' +
                ", infohash='" + infohash + '\'' +
                ", file_size='" + file_size + '\'' +
                ", state=" + state +
                '}';
    }
}
