package poly.edu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import poly.edu.entity.InvoiceDetail;
import poly.edu.repository.InvoiceDetailsRepository;

@Service
@Transactional
public class InvoiceDetailService {

	@Autowired
	private InvoiceDetailsRepository ivdRepo;
	
	public List<InvoiceDetail> getAll(){
		return ivdRepo.findAll();
	}
}
