package com.hr.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.hr.Entity.HR;
import com.hr.Service.IhrService;

@RestController
@RequestMapping("/hr")
public class HRController {
	
	@Autowired
	private IhrService hrService;
	
	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("/{userID}")
	public HR getHr(@PathVariable("userID") Long userID) {
		HR hr = this.hrService.getHR(userID);
		List resources = this.restTemplate.getForObject("http://resource-service/resource/hr/" + userID, List.class);
		//List resources = this.restTemplate.getForObject("http://localhost:9000/resource/hr/" + userID, List.class);
		hr.setResource(resources);
		return hr;

	}

}