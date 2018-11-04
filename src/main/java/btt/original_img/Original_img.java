package btt.original_img;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Original_img {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int seq;

    private int original_movie_seq;

    private String img_path;
    private String img_hash;
    private String compare_hash;

    public Original_img(){}

    public Original_img(int original_movie_seq, String img_path, String img_hash, String compare_hash){
	this.original_movie_seq = original_movie_seq;
	this.img_path = img_path;
	this.img_hash = img_hash;
	this.compare_hash = compare_hash;
    }

    public Original_img(int seq, int original_movie_seq, String img_path, String img_hash, String compare_hash){
	this.seq = seq;
	this.original_movie_seq = original_movie_seq;
	this.img_path = img_path;
	this.img_hash = img_hash;
	this.compare_hash = compare_hash;
    }

    public void setSeq(int seq){
	this.seq = seq;
    }

    public int getSeq(){
	return seq;
    }

    public void setOriginal_movie_seq(int original_movie_seq){
	this.original_movie_seq = original_movie_seq;
    }

    public int getOriginal_movie_seq(){
	return original_movie_seq;
    }

    public void setImg_path(String img_path){
	this.img_path = img_path;
    }

    public String getImg_path() {
        return img_path;
    }

    public String getImg_hash() {
        return img_hash;
    }

    public void setImg_hash(String img_hash) {
        this.img_hash = img_hash;
    }

    public String getCompare_hash() {
        return compare_hash;
    }

    public void setCompare_hash(String compare_hash) {
        this.compare_hash = compare_hash;
    }

    @Override
    public String toString() {
        return "Original_img{" +
                "seq=" + seq +
                ", original_movie_seq=" + original_movie_seq +
                ", img_path='" + img_path + '\'' +
                ", img_hash='" + img_hash + '\'' +
                ", compare_hash='" + compare_hash + '\'' +
                '}';
    }
}
