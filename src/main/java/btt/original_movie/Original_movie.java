package btt.original_movie;

import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Original_movie {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int seq;

    private int client_seq;
    private String original_name;

    @Convert(converter = Jsr310JpaConverters.LocalDateTimeConverter.class)
    private LocalDateTime original_date;

    public Original_movie() {
    }

    public Original_movie(int client_seq, String original_name, LocalDateTime original_date) {
        this.client_seq = client_seq;
        this.original_name = original_name;
        this.original_date = original_date;
    }

    public Original_movie(int seq, int client_seq, String original_name, LocalDateTime original_date) {
        this.seq = seq;
        this.client_seq = client_seq;
        this.original_name = original_name;
        this.original_date = original_date;
    }

    public int getSeq() {
        return seq;
    }

    public void setSeq(int seq) {
        this.seq = seq;
    }

    public int getClient_seq() {
        return client_seq;
    }

    public void setClient_seq(int client_seq) {
        this.client_seq = client_seq;
    }

    public String getOriginal_name() {
        return original_name;
    }

    public void setOriginal_name(String original_name) {
        this.original_name = original_name;
    }

    public LocalDateTime getOriginal_date() {
        return original_date;
    }

    public void setOriginal_date(LocalDateTime original_date) {
        this.original_date = original_date;
    }

    @Override
    public String toString() {
        return "Original_movie{" +
                "seq=" + seq +
                ", client_seq=" + client_seq +
                ", original_name='" + original_name + '\'' +
                ", original_date=" + original_date +
                '}';
    }
}
