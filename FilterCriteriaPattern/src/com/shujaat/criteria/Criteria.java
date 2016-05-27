package com.shujaat.criteria;

import java.util.List;

import com.shujaat.person.Person;

public interface Criteria 
{
	   public List<Person> meetCriteria(List<Person> persons);
}
