package com.lti.main;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import com.lti.model.Course;
import com.lti.model.DegreeCourse;
import com.lti.model.DiplomaCourse;
import com.lti.model.Student;

public class Info {

	public static void display(Student student) {
		System.out.println(student.getId()+" "+student.getName()+" "+student.getDateOfBirth()+" "+
	    Student.getCollegeName()+" "+Arrays.toString(student.getPhoneNumber()));

	}
	
	public static void display(Student[] students) {
		for(int i=0;i<students.length;i++)
		{
			display(students[i]);
		}
	}

	public static void display(List<Student> students) {
//		for(Student st:students) {
//			display(st);
//
//		}
		ListIterator<Student> studs1=students.listIterator();
		while(studs1.hasNext())
		{
			Student st=studs1.next();
			display(st);
		}
		System.out.println("--------------------------------------------");
		while(studs1.hasPrevious())
		{
			Student st1=studs1.previous();
			display(st1);
		}
	}

	//-----------------------------------------x--------------------------------------------//
	
//	public static void display(Course course) {
//		System.out.println(course.getId()+" "+course.getName()+" "+course.getDuration()+" "+
//	    Course.getCollegeName()+" "+course.getFees());
//
//	}
//	
//	public void display(Course[] course) {
//		for(int i=0;i<course.length;i++)
//		{
//			display(course[i]);
//		}
//	}
//
//	public static void display1(Course[] course) {
//		for(int i=0;i<course.length;i++)
//		{
//			display(course[i]);
//		}
//	}
//	
//	public static void display1(List<Course> course) {
//		ListIterator<Course> c1=course.listIterator();
//		while(c1.hasNext())
//		{
//			Course cs=c1.next();
//			display(cs);
//		}
//		System.out.println("--------------------------------------------");
//		while(c1.hasPrevious())
//		{
//			Course cs1=c1.previous();
//			display(cs1);
//		}
//	}
////		ListIterator<Student> studs=students.iterator();
////		while(studs.hasNext())
////		{
////			Student st=studs.next();
////			display(st);
////		}
////		ListIterator<Student> studs1=students.listIterator();
////		while(studs1.hasPrevious()) {
////			Student st1=studs1.previous();
////			display(st1);
////		}
////	}
	public static void displayCourse(DegreeCourse degreecourse) {
		degreecourse.calculateMonthlyFee();
	}
	public static void displayDegreeCourse(DegreeCourse degreecourse) {
		degreecourse.calculateMonthlyFee();
	}
	public static void displayCourse(Course course) {
		course.calculateMonthlyfee();
	}
}


