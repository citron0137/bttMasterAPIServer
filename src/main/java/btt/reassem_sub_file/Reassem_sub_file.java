package btt.reassem_sub_file;

import javax.persistence.*;

@Entity
public class Reassem_sub_file {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int seq;

    private String site_link;

}
