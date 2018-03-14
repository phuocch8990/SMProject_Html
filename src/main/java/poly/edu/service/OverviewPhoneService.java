package poly.edu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import poly.edu.entity.OverviewPhone;
import poly.edu.repository.OverviewPhoneRepository;

@Service
@Transactional
public class OverviewPhoneService {
	
	@Autowired
	private OverviewPhoneRepository overviewRepo;
	
	public List<OverviewPhone> getAll(){
		return overviewRepo.findAll();
	}

}
