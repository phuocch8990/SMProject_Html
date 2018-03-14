package poly.edu.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import poly.edu.entity.Account;
import poly.edu.service.AccountService;

@Controller
@RequestMapping
public class LoginController {

	public static final Logger logger = LoggerFactory.getLogger(LoginController.class);
	
	@Autowired
	private AccountService accountService;
	

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ResponseEntity<List<Account>> listAllUsers() {
		List<Account> account = accountService.getAll();
		account.forEach(System.out::println);
		if (account.isEmpty()) {
			return new ResponseEntity(HttpStatus.NO_CONTENT);
			// You many decide to return HttpStatus.NOT_FOUND
		}
		return new ResponseEntity<List<Account>>(account, HttpStatus.OK);
	}
	
}
