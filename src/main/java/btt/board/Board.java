package btt.board;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int seq;

    private int site_seq;
    private String board_link;

    public Board(){}

    public Board(int site_seq, String board_link){
        this.setSite_seq(site_seq);
        this.setBoard_link(board_link);
    }

    public Board(int seq, int site_seq, String board_link){
        this.setSeq(seq);
        this.setSite_seq(site_seq);
        this.setBoard_link(board_link);
    }

    public void setSeq(int seq){
        this.seq = seq;
    }

    public int getSeq() {
        return seq;
    }

    public void setSite_seq(int site_seq) {
        this.site_seq = site_seq;
    }

    public int getSite_seq() {
        return site_seq;
    }


    public String getBoard_link() {
        return board_link;
    }

    public void setBoard_link(String board_link) {
        this.board_link = board_link;
    }

    @Override
    public String toString(){
        return "board{" +
                "seq =" + seq +
                ", site_seq="+site_seq +
                ", board_link'"+board_link+'\''+
                '}';
    }
}
