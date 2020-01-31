package com.example.restTesting.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.restTesting.domain.users;
import com.example.restTesting.repo.userRepo;
import com.exmaple.restTesting.error.ResourceNotFoundException;

@RestController
@RequestMapping("/user")
public class myController {

	@Autowired
	private userRepo userRepo;

	@GetMapping("/list")
	public List<users> getall() {
		System.out.println("bartide");
		return userRepo.findAll();

	}

	@PostMapping(value = "/add", produces = "application/json")
	public users adding(@RequestBody users user) {
		return userRepo.save(user);

	}
	
	@DeleteMapping("/delete")
	public void updateing(@RequestBody users user) {
		userRepo.delete(user);
	}
	
	@PutMapping("/update/{id}")
	public Optional<users> updating(@RequestBody users user,@PathVariable int id) // {id} is a path variable which is the part of URI 
	{		 
		return userRepo.findById(id)
			      .map(employee -> {
			        employee.setName(user.getName());
			        return userRepo.save(employee);
			      
			      });
	}
	
	@DeleteMapping("/deleteById/{idee}")
	public void deleting(@PathVariable int idee) {
		
		userRepo.deletetheId(idee);
		
		
	}
	
	@GetMapping("/hello")
	public String Hello(){
		return "hello welcome to tomcat";
		
	}


	/*
	 * @PostMapping(value="/add", produces = "application/json") public users
	 * retrive(@Valid @RequestBody users users) { return userRepo.save(users); }
	 */

}
