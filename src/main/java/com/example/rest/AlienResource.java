package com.example.rest;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlienResource {
	@Autowired
	AlienRepository repo;
	
  @RequestMapping("aliens")
	public List<Alien> getAliens()
	{
		List<Alien> aliens = (List<Alien>) repo.findAll();
		
		
		return aliens;
		}
	
}
