package com.example.demo.dao;

import java.util.UUID;

import com.example.demo.model.Person;

public interface PersonDao {
	
	public int insertPerson(UUID id, Person person);
	
	default int insertPerson(Person person) {
		return insertPerson(UUID.randomUUID(),person); 
	}
}
