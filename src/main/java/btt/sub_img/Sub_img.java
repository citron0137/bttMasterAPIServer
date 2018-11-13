package btt.sub_img;

import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

import javax.persistence.*;

@Entity
public class Sub_img {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int seq;
    private int sub_file_seq;
    private String img_path;
    private String img_hash;
    private String compare_hash;

    public Sub_img() {
    }

    public Sub_img(int sub_file_seq, String img_path, String img_hash, String compare_hash) {
        this.sub_file_seq = sub_file_seq;
	this.img_path = img_path;
        this.img_hash = img_hash;
        this.compare_hash = compare_hash;
    }
  
    public Sub_img(int seq, int sub_file_seq, String img_path, String img_hash, String compare_hash) {
	this.seq = seq;
	this.sub_file_seq = sub_file_seq;
        this.img_path = img_path;
        this.img_hash = img_hash;
        this.compare_hash = compare_hash;
    }
    
    //TODO getter /setter generate

    @Override
    public String toString() {
        return "Post{" +
                "seq=" + seq +
                ", sub_file_seq =" + sub_file_seq +
                ", img_path =" + img_path +
                ", img_hash =" + img_hash +
		", compare_hash =" + compare_hash +
                '}';
    }
}
