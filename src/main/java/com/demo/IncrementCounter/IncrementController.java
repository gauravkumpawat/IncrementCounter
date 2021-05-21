package com.demo.IncrementCounter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class IncrementController {

	@Autowired
	private IncrementService incrementService;
	
	@GetMapping("/")
	public void incCount() {
		
		incrementService.incCount();
		
	}
	
	
}
