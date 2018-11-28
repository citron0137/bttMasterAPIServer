package btt.detect_detail;

import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Detect_detail {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int seq;

    private int detect_hit_seq;
    private int sub_img_seq;
    private int original_img_seq;
    private int compare_hash;

    public Detect_detail(int seq, int detect_hit_seq, int sub_img_seq, int original_img_seq, int compare_hash) {
        this.seq = seq;
        this.detect_hit_seq = detect_hit_seq;
        this.sub_img_seq = sub_img_seq;
        this.original_img_seq = original_img_seq;
        this.compare_hash = compare_hash;
    }

    public Detect_detail(int detect_hit_seq, int sub_img_seq, int original_img_seq, int compare_hash) {
        this.detect_hit_seq = detect_hit_seq;
        this.sub_img_seq = sub_img_seq;
        this.original_img_seq = original_img_seq;
        this.compare_hash = compare_hash;
    }

    public Detect_detail() {
    }

    public int getSeq() {
        return seq;
    }

    public void setSeq(int seq) {
        this.seq = seq;
    }

    public int getDetect_hit_seq() {
        return detect_hit_seq;
    }

    public void setDetect_hit_seq(int detect_hit_seq) {
        this.detect_hit_seq = detect_hit_seq;
    }

    public int getSub_img_seq() {
        return sub_img_seq;
    }

    public void setSub_img_seq(int sub_img_seq) {
        this.sub_img_seq = sub_img_seq;
    }

    public int getOriginal_img_seq() {
        return original_img_seq;
    }

    public void setOriginal_img_seq(int original_img_seq) {
        this.original_img_seq = original_img_seq;
    }

    public int getCompare_hash() {
        return compare_hash;
    }

    public void setCompare_hash(int compare_hash) {
        this.compare_hash = compare_hash;
    }

    @Override
    public String toString() {
        return "Detect_detail{" +
                "seq=" + seq +
                ", detect_hit_seq=" + detect_hit_seq +
                ", sub_img_seq=" + sub_img_seq +
                ", original_img_seq=" + original_img_seq +
                ", compare_hash=" + compare_hash +
                '}';
    }
}
