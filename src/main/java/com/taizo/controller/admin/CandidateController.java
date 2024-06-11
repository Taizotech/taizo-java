package com.taizo.controller.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.taizo.model.CanLeadModel;
import com.taizo.repository.CanLeadRepository;

@CrossOrigin
@RestController
@RequestMapping("/admin")
public class CandidateController {
	
	
	@Autowired
	CanLeadRepository canLeadRepository;
	
	@GetMapping("/canLeads")
	public List<CanLeadModel> getAllcanLeads (){
		
		return canLeadRepository.findAll();
	}

}
