package btt.sub_file;

import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

import javax.persistence.*;

@Entity
public class Sub_file {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int seq;
    private int torrent_file_seq;
    private String file_name;
    private long file_size;
    private String file_extension;

    //@Convert(converter = Jsr310JpaConverters.LocalDateTimeConverter.class)
    //private LocalDateTime search_date;

    public Sub_file() {
    }

    public Sub_file(int torrent_file_seq, String file_name, long file_size, String file_extension) {
        this.torrent_file_seq = torrent_file_seq;
	this.file_name = file_name;
        this.file_size = file_size;
        this.file_extension = file_extension;
    }
  
    public Sub_file(int seq, int torrent_file_seq, String file_name, long file_size, String file_extension) {
	this.seq = seq;
        this.torrent_file_seq = torrent_file_seq;
        this.file_name = file_name;
        this.file_size = file_size;
        this.file_extension = file_extension;
    }

    public int getSeq() {
        return seq;
    }

    public void setSeq(int seq) {
        this.seq = seq;
    }

    public int getTorrent_file_seq() {
        return torrent_file_seq;
    }

    public void setTorrent_file_seq(int torrent_file_seq) {
        this.torrent_file_seq = torrent_file_seq;
    }

    
    public String getFile_name() {
        return file_name;
    }

    public void setFile_name(String file_name) {
        this.file_name = file_name;
    }

    public long getFile_size(){
	return file_size;
    }

    public void setFile_size(long file_size){
  	this.file_size = file_size;
    }
 
    public String getFile_extension(){
	return file_extension;
    }
   
    public void setFile_extension(String file_extension){
   	this.file_extension = file_extension;
    }
    @Override
    public String toString() {
        return "Post{" +
                "seq=" + seq +
                ", torrent_file_seq =" + torrent_file_seq +
                ", file_name =" + file_name +
                ", file_size =" + file_size +
		", file_extension =" + file_extension +
                '}';
    }
}
