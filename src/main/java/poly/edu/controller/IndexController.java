package poly.edu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import poly.edu.entity.Product;
import poly.edu.service.ProductService;

@RestController
public class IndexController {
	@Autowired
	private ProductService productService;
	private ModelAndView mav;
	
	@RequestMapping(value = {"/","/index"}, method = RequestMethod.GET)
	public ModelAndView getIndex() {
		mav = new ModelAndView("index");
		List<Product> list = productService.getAll();
		
		list.forEach(System.out::println);
		mav.addObject("listProduct", list);
		
		return mav;
	}
}
