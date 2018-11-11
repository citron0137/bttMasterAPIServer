package btt.post;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int seq;

    private int board_seq;

    @Convert(converter = Jsr310JpaConverters.LocalDateTimeConverter.class)
    private LocalDateTime post_date;

    private String post_link;
    private String post_name;
    private String user_id;

    public Post() {
    }

    public Post(int board_seq, LocalDateTime post_date, String post_link, String post_name, String user_id) {
        this.board_seq = board_seq;
        this.post_date = post_date;
        this.post_link = post_link;
        this.post_name = post_name;
        this.user_id = user_id;
    }

    public Post(int seq, int board_seq, LocalDateTime post_date, String post_link, String post_name, String user_id) {
        this.seq = seq;
        this.board_seq = board_seq;
        this.post_date = post_date;
        this.post_link = post_link;
        this.post_name = post_name;
        this.user_id = user_id;
    }

    public int getSeq() {
        return seq;
    }

    public void setSeq(int seq) {
        this.seq = seq;
    }

    public int getBoard_seq() {
        return board_seq;
    }

    public void setBoard_seq(int board_seq) {
        this.board_seq = board_seq;
    }

    public LocalDateTime getPost_date() {
        return post_date;
    }

    public void setPost_date(LocalDateTime post_date) {
        this.post_date = post_date;
    }

    public String getPost_link() {
        return post_link;
    }

    public void setPost_link(String post_link) {
        this.post_link = post_link;
    }

    public String getPost_name() {
        return post_name;
    }

    public void setPost_name(String post_name) {
        this.post_name = post_name;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    @Override
    public String toString() {
        return "Post{" +
                "seq=" + seq +
                ", board_seq=" + board_seq +
                ", post_date=" + post_date +
                ", post_link='" + post_link + '\'' +
                ", post_name='" + post_name + '\'' +
                ", user_id='" + user_id + '\'' +
                '}';
    }
}
