package com.demo.IncrementCounter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
@Service
public class IncrementServiceImpl implements IncrementService{

	@Autowired
	private IncrementRepository incrementRepository;
	@Override
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public void incCount() {
		IncrementEntity c = incrementRepository.findById(1).orElse(new IncrementEntity());
		c.setSno(c.getSno()+1);
	
	}

}
