package com.shujaat.main;

import com.shujaat.iterator.Iterator;

import com.shujaat.iterator.NameRepository;

public class IteratorPatternDemo {

	public static void main(String[] args) 
	{
		 NameRepository namesRepository = new NameRepository();
		 
	     for(Iterator iter = namesRepository.getIterator(); iter.hasNext();)
	     {
	         String name = (String)iter.next();
	         System.out.println("Name : " + name);
	         }
	     }
	}
