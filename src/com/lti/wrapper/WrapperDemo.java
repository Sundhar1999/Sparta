package com.lti.wrapper;

import java.util.ArrayList;
import java.util.List;

public class WrapperDemo {

	public static void main(String[] args) {
		// Boxing (primitive to class)
		
		int num=10;
		Integer inum=num; //autoboxing
		List<Integer> nums=new ArrayList<Integer>();
		nums.add(inum);
		nums.add(20);// here 20 which is a value is autoboxed into integer and then gets added to collection.
		nums.add(new Integer(50));
		
		Double salary = new Double(5600.80);
		
		double sal=salary.doubleValue();
		System.out.println(sal);
	}

}
