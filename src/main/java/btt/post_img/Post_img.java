package btt.post_img;

import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Post_img {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int seq;

    private int post_seq;
    private String img_path;
    private String img_hash;

    public Post_img() {
    }

    public Post_img(int post_seq, String img_path, String img_hash) {
        this.post_seq = post_seq;
        this.img_path = img_path;
        this.img_hash = img_hash;
    }

    public Post_img(int seq, int post_seq, String img_path, String img_hash) {
        this.seq = seq;
        this.post_seq = post_seq;
        this.img_path = img_path;
        this.img_hash = img_hash;
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

    public String getImg_path() {
        return img_path;
    }

    public void setImg_path(String img_path) {
        this.img_path = img_path;
    }

    public String getImg_hash() {
        return img_hash;
    }

    public void setImg_hash(String img_hash) {
        this.img_hash = img_hash;
    }

    @Override
    public String toString() {
        return "Post_img{" +
                "seq=" + seq +
                ", post_seq=" + post_seq +
                ", img_path='" + img_path + '\'' +
                ", img_hash='" + img_hash + '\'' +
                '}';
    }
}
