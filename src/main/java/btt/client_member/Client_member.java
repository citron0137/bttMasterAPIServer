package btt.client_member;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Client_member {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int seq;

    private String id;
    private String tel;

    public Client_member() {
    }

    public Client_member(String id, String tel) {
	this.id = id;
	this.tel = tel;
    }

    public Client_member(int seq, String id, String tel) {
	this.seq = seq;
	this.id = id;
	this.tel = tel;
   }

   public int getSeq(){
	return this.seq;
    }

    public void setSeq(int seq){
	this.seq = seq;
    }

    public String getId(){
	return this.id;
    }

    public void setId(String id){
	this.id = id;
    }

    public String getTel(){
	return this.tel;
    }

    public void setTel(String tel) {
	this.tel = tel;
    }

    @Override
    public String toString() {
        return "Client_member{" +
                "seq=" + seq +
                ", id='" + id + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }
}
