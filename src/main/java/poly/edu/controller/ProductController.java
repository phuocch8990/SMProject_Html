package poly.edu.controller;

import java.util.ArrayList;
import java.util.List;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.google.gson.Gson;

import poly.edu.entity.Account;
import poly.edu.entity.OverviewPhone;
import poly.edu.entity.Product;
import poly.edu.service.OverviewPhoneService;
import poly.edu.service.ProductService;

@Controller
@RequestMapping
public class ProductController {
	
	public static final Logger logger = LoggerFactory.getLogger(ProductController.class);
	
	@Autowired
	private ProductService productService;

	@Autowired
	private OverviewPhoneService ovpService;

	@RequestMapping(value = "/product", method = RequestMethod.GET)
	public ResponseEntity<?> listAllProduct() {
		List<Product> product = new ArrayList<Product>();
		product = productService.getAll();
		Gson gson = new Gson();
		String json = gson.toJson(product);
		System.out.println(json);
		return new ResponseEntity<>(json, HttpStatus.OK);
	}

	
	@RequestMapping(value = "/productList", method = RequestMethod.GET)
	public ResponseEntity<List<OverviewPhone>> listAllUsers() {
		List<OverviewPhone> account = ovpService.getAll();
		account.forEach(System.out::println);
		if (account.isEmpty()) {
			return new ResponseEntity(HttpStatus.NO_CONTENT);
			// You many decide to return HttpStatus.NOT_FOUND
		}
		return new ResponseEntity<List<OverviewPhone>>(account, HttpStatus.OK);
	}
//	@RequestMapping(value = "/listproduct", method = RequestMethod.GET)
//	public ResponseEntity<?> listProduct() {
//		List<Product> product = new ArrayList<Product>();
//		product = productService.getAllList();
//		Gson gson = new Gson();
//		String json = gson.toJson(product);
//		System.out.println(json);
//		return new ResponseEntity<>(json, HttpStatus.OK);
//	}

}
