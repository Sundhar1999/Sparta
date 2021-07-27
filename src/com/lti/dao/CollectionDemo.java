package com.lti.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import com.lti.model.Student;

public class CollectionDemo {
	
	public static void main(String[] args) {
		
//	--------LIST---------	
//		List<Student> students=new ArrayList<Student>();
//		students.add(new Student(1,"John",LocalDate.of(2000,04,12)));
//		students.add(new Student(2,"Mark",LocalDate.of(2001,04,12)));
//		students.add(new Student(3,"Kevin",LocalDate.of(2002,04,12)));
//		students.add(new Student(4,"Peter",LocalDate.of(2003,04,12)));
//		
//		Student st=new Student(3,"Kevin",LocalDate.of(2002, 05, 14));
//		System.out.println(students.indexOf(st));
//		
//		List<Integer>nums=new ArrayList<Integer>();
//		nums.add(10);
//		nums.add(20);
//		nums.add(30);
//		nums.add(40);
//		
//		System.out.println(nums.indexOf(70));
		
		
		//Set<String> names=new HashSet<String>();
		Set<String> names=new TreeSet<String>();
		names.add(new String("Simant"));
		names.add(new String("Sundhar"));
		names.add(new String("siddesh"));
		names.add(new String("Riya"));
		names.add(new String("Ram"));
		//names.add(null);
		//names.add(null);
		
		System.out.println(names);
		//System.out.println(names.contains("Sundhar"));
		System.out.println(names.remove("Sundhar"));
		names.add("Prem");
		System.out.println(names);
	
		
		//Map<Integer,String> credentials=new HashMap<Integer,String>();
		Map<Integer,String> credentials=new TreeMap<Integer,String>();
		credentials.put(1001, "pass@123");
		credentials.put(1002, "pass@111");
		credentials.put(1003, "pass@122");
		credentials.put(1004, "pass@333");
		credentials.put(1005, "pass@444");
		credentials.put(1006, "pass@222");
		
		System.out.println(credentials);
		
		//there are two ways we can convert Map into set: 1.entryset() 2.keyset()
		
		Set<Entry<Integer,String>> entrySet=credentials.entrySet();
		Iterator<Entry<Integer,String>> iterator=entrySet.iterator();
		
		while(iterator.hasNext()) {
			Entry<Integer,String>items=iterator.next();
			System.out.println(items.getKey()+" "+items.getValue());
		}
		
		Iterator<String> allNames=names.iterator();
		while(allNames.hasNext()) {
			String name=allNames.next();
			System.out.println(name);
			
		}
	}

//	private static void iterator() {
//		// TODO Auto-generated method stub
//		
//	}

}
