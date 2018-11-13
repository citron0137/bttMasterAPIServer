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

    public int getSeq() {
        return seq;
    }

    public void setSeq(int seq) {
        this.seq = seq;
    }

    public int getSub_file_seq() {
        return sub_file_seq;
    }

    public void setSub_file_seq(int sub_file_seq) {
        this.sub_file_seq = sub_file_seq;
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

    public String getCompare_hash() {
        return compare_hash;
    }

    public void setCompare_hash(String compare_hash) {
        this.compare_hash = compare_hash;
    }

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
