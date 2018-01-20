package poly.edu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import poly.edu.entity.Product;
import poly.edu.repository.ProductRepository;

@Service
public class ProductService {	
	@Autowired
	private ProductRepository productRepo;
	
	public List<Product> getAll(){
		return productRepo.findAll();
		//dadadsadsad
	}
}
