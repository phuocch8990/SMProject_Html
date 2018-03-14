package poly.edu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import poly.edu.entity.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long>{
//	public Account findByUsernameAndPassword(String email,String password);
	
}
