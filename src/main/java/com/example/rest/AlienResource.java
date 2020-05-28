package com.example.rest;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;



@RestController

public class AlienResource {
	 @Autowired
	   AlienRepository repo;
	
	 @GetMapping("aliens")
	public List<Alien> getAliens()
	{
	  
		List<Alien> aliens = (List<Alien>)repo.findAll();
		
		
		return aliens;
		}
  @GetMapping("aliens/{id}")
 public Alien getAlien(@PathVariable("id") int id) {
	  

	  Optional<Alien> optionalEntity =  repo.findById(id);
	  Alien a1 = optionalEntity.get();
	  System.out.println(a1);
    return a1;
     
  }
  @PostMapping("aliens")
  public Alien createAlien(@RequestBody Alien a1) {
    return repo.save(a1);
  }
  @PutMapping("aliens/{id}")
  public @ResponseBody Alien replaceAlien( @PathVariable("id") int id,@RequestBody Alien a1) {

	  a1.setId(a1.getId());
      a1.setName(a1.getName());
      a1.setPoints(a1.getPoints());
     
      repo.save(a1);
      return a1; 
  }
  @DeleteMapping("aliens/{id}")
  public void deleteAlien(@PathVariable("id") int id) {
    repo.deleteById(id);
  }
	
}
