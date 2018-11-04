package btt.detect_hit;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Detect_hit {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int seq;

    private int sub_file_seq;
    private int original_movie_seq;

    @Convert(converter = Jsr310JpaConverters.LocalDateTimeConverter.class)
    private LocalDateTime search_date;

    public Detect_hit() {
    }

    public Detect_hit(int sub_file_seq, int original_movie_seq, LocalDateTime search_date) {
	this.sub_file_seq = sub_file_seq;
	this.original_movie_seq = original_movie_seq;
	this.search_date = search_date;
    }

    public Detect_hit(int seq, int sub_file_seq, int original_movie_seq, LocalDateTime search_date) {
	this.seq = seq;
	this.sub_file_seq = sub_file_seq;
	this.original_movie_seq = original_movie_seq;
	this.search_date = search_date;
    }
   
    public int getSeq(){
	return seq;
    }

    public void setSeq(int seq){
	this.seq = seq;
    }

    public int getSub_file_seq(){
	return sub_file_seq;
    }

    public void setSub_file_seq(int sub_file_seq){
	this.sub_file_seq = sub_file_seq;
    }

    public int getOriginal_movie_seq(){
	return original_movie_seq;
    }

    public void setOriginal_movie_seq(int original_movie_seq){
	this.original_movie_seq = original_movie_seq;
    }

    public LocalDateTime getSearch_date(){
	return search_date;
    }

    public void setSearch_date(LocalDateTime search_date){
	this.search_date = search_date;
    }

	
    @Override
    public String toString() {
        return "Post{" +
                "seq=" + seq +
                ", sub_file_seq=" + sub_file_seq +
                ", original_movie_seq=" + original_movie_seq +
                ", search_date=" + search_date +
                '}';
    }
}
