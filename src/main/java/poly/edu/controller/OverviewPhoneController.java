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

import poly.edu.entity.OverviewPhone;
import poly.edu.entity.Product;
import poly.edu.repository.OverviewPhoneRepository;
import poly.edu.service.OverviewPhoneService;

@Controller
@RequestMapping
public class OverviewPhoneController {
	
	public static final Logger logger = LoggerFactory.getLogger(OverviewPhoneController.class);
	
	@Autowired
	private OverviewPhoneService overViewPhoneSC;
	
	@RequestMapping(value = "/overviewPhone" , method = RequestMethod.GET)
	public ResponseEntity<?> listAllPhone(){
		List<OverviewPhone> product = new ArrayList<OverviewPhone>();
		product = overViewPhoneSC.getAll();
		Gson gson = new Gson();
		String json = gson.toJson(product);
		System.out.println(json);
		return new ResponseEntity<>(json, HttpStatus.OK);
	}

}
