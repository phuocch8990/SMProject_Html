package poly.edu.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

import poly.edu.entity.InvoiceDetail;
import poly.edu.service.InvoiceDetailService;

@RestController
@RequestMapping
public class InvoiceDetailController {
	
	public static final Logger logger = LoggerFactory.getLogger(InvoiceDetailController.class);
	
	@Autowired
	private InvoiceDetailService ivdService;
	
	@RequestMapping(value = {"/invoiceDetail"}, method = RequestMethod.GET)
	public String getListAll() {
		List<InvoiceDetail> list = ivdService.getAll();
		Gson gson = new Gson();
		String json = gson.toJson(list);
		return json;
	}

}
