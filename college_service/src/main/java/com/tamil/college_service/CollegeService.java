package com.tamil.college_service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import jakarta.transaction.Transactional;

@Service
@Transactional
public class CollegeService {

	@Autowired
	private CollegeRepository repo;

	public List<College> listAll() {
		return repo.findAll();
	}
      // save the record
	public void save(College c1) {
		repo.save(c1);
	}
	//retrieving particular data
	public College get(Integer C_id)
	{
		return repo.findById(C_id).get();
	}
	//deleting particular data
	public void delete(Integer C_id)
	{
		repo.deleteById(C_id);
	}
	//update the record
	public void update(College c1)
	{
		repo.save(c1);
	}

}
