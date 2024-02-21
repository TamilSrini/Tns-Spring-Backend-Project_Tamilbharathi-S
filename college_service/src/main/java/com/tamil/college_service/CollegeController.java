package com.tamil.college_service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.persistence.NoResultException;

@RestController
public class CollegeController {

	@Autowired
	private CollegeService service;

	@GetMapping("/collegeservice")
	public List<College> list() {
		return service.listAll();
	}

	@PostMapping("/collegeservice") // send data from interface to DB
	public void add(@RequestBody College c) {
		service.save(c);
	}
	
	@GetMapping("/collegeservice/{C_id}")
	public ResponseEntity<College> get(@PathVariable Integer C_id)
	{
		try
		{
			College cl=service.get(C_id);
			
			return new ResponseEntity<College>(cl,HttpStatus.OK);
		}
		catch(NoResultException e)
		{
			return new ResponseEntity<College>(HttpStatus.NOT_FOUND);
		}
	}
	
	
	@PutMapping("/collegeservice/{C_id}")
	public ResponseEntity<?> update(@RequestBody College c1, @PathVariable Integer C_id)
	{
		College existC=service.get(C_id);
		service.save(existC);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@DeleteMapping("/collegeservice/{C_id}")
	public void delete(@PathVariable Integer C_id)
	{
		service.delete(C_id);
	}

}

