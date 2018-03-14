package poly.edu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import poly.edu.entity.Account;
import poly.edu.repository.AccountRepository;

@Service("userService")
@Transactional
public class AccountService /*implements UserService*/{

	@Autowired
	private AccountRepository accountRepo;
	
	
//	@Override
//	public Account findByUsernameAndPassword(String email, String password) {
//		return accountRepo.findByUsernameAndPassword(email, password);
//	}

	public List<Account> getAll() {
		return accountRepo.findAll();
	}

}
