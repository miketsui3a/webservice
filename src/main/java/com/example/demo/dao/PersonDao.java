package com.example.demo.dao;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.example.demo.model.Person;

public interface PersonDao {
	
	public int insertPerson(UUID id, Person person);
	
	default int insertPerson(Person person) {
		return insertPerson(UUID.randomUUID(),person); 
	}
	
	public List<Person> selectAllPeople();
	
	int deletePeopleById(UUID id);
	
	Optional<Person> selectPersonById(UUID id);
	
	int updatePersonById(UUID id, String name);
}
