package com.example.demo.dao;

import java.util.ArrayList;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.example.demo.model.Person;
import java.util.List;
import java.util.Optional;

@Repository("fakeDao")
public class FakePersonDao implements PersonDao{
	
	static List<Person> DB = new ArrayList<>();
	
	public int insertPerson(UUID id,Person person) {
		DB.add(new Person(id,person.getName()));
		return 1;
	}
	
	public List<Person> selectAllPeople(){
		return DB;
	}
	
	public int deletePeopleById(UUID id) {
		return 1;
	}

	public Optional<Person> selectPersonById(UUID id){
		return DB.stream().filter(person -> person.getId().equals(id)).findFirst();
	}
	
	public int updatePersonById(UUID id, String name) {
		return 1;
	};
}
