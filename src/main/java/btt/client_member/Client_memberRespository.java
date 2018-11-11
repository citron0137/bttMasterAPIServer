package btt.client_member;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Client_memberRespository extends JpaRepository<Client_member,Integer> {

}
