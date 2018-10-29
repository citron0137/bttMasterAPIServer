package btt.site;

import javax.persistence.*;

@Entity
public class Site {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int seq;

    private String site_link;

    public Site(){}

    public Site(String site_link){
        setSite_link(site_link);
    }

    public Site(int seq, String site_link){
        setSeq(seq);
        setSite_link(site_link);
    }

    public void setSeq(int seq){
        this.seq = seq;
    }

    public int getSeq() {
        return seq;
    }

    public String getSite_link() {
        return site_link;
    }

    public void setSite_link(String site_link) {
        this.site_link = site_link;
    }

    @Override
    public String toString(){
        return "board{" +
                "seq =" + seq +
                ", board_link'"+site_link+'\''+
                '}';
    }
}
