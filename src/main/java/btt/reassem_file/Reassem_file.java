package btt.reassem_file;

import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

import javax.persistence.*;
import java.math.BigInteger;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.time.LocalDateTime;

@Entity
public class Reassem_file {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int seq;

    private String uri;
    private BigInteger ip;

    @Convert(converter = Jsr310JpaConverters.LocalDateTimeConverter.class)
    private LocalDateTime reassem_date;
    private int state;

    public Reassem_file() {
    }

    public Reassem_file(String uri, BigInteger ip, LocalDateTime reassem_date, int state) {
        this.uri = uri;
        this.ip = ip;
        this.reassem_date = reassem_date;
        this.state = state;
    }

    public Reassem_file(int seq, String uri, BigInteger ip, LocalDateTime reassem_date, int state) {
        this.seq = seq;
        this.uri = uri;
        this.ip = ip;
        this.reassem_date = reassem_date;
        this.state = state;
    }

    public int getSeq() {
        return seq;
    }

    public void setSeq(int seq) {
        this.seq = seq;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public BigInteger getIp() {
        return ip;
    }

    public void setIp(BigInteger ip) {
        this.ip = ip;
    }

    public LocalDateTime getReassem_date() {
        return reassem_date;
    }

    public void setReassem_date(LocalDateTime reassem_date) {
        this.reassem_date = reassem_date;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Reassem_file{" +
                "seq=" + seq +
                ", uri='" + uri + '\'' +
                ", ip='" + ip + '\'' +
                ", reassem_date=" + reassem_date +
                ", state= '" + state + '\'' +
                '}';
    }
}
