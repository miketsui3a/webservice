package com.example.demo.dao;

import java.util.ArrayList;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.example.demo.model.Person;
import java.util.List;

@Repository("fakeDao")
public class FakePersonDao implements PersonDao{
	
	static List<Person> DB = new ArrayList<>();
	
	public int insertPerson(UUID id,Person person) {
		DB.add(new Person(id,person.getName()));
		return 1;
	}
}
