package com.lti.main;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.lti.model.Course;
import com.lti.model.DegreeCourse;
import com.lti.model.DegreeLevel;
import com.lti.model.DiplomaCourse;
import com.lti.model.Student;
import com.lti.model.Type;

public class App {

	public static void main(String[] args) {
		//scenario1();
		scenario9();
	}
	public static void scenario1() {
		Student student=new Student();
		String[] student1phoneNumbers= {"882542","7654354"};
		String[] student2phoneNumbers= {"882542","7654354"};
		Student student1=new Student(101, "John", LocalDate.now(),student1phoneNumbers);
		Student student2=new Student(102, "Mark", LocalDate.of(2003,12,31),student2phoneNumbers);
	
	    Info info=new Info();
	    info.display(student1);
	    info.display(student2);
	}
	public static void scenario2() {
		//int[] num=new int[10];
		Student[] students=new Student[3];
		String[] student1phoneNumbers= {"882542","765434"};
		String[] student2phoneNumbers= {"945321","542145"};
		String[] student3phoneNumbers= {"800142","914756"};
	
       students[0]=new Student(101, "John", LocalDate.now(),student1phoneNumbers);
       students[1]=new Student(102, "Mark", LocalDate.now(),student2phoneNumbers);
       students[2]=new Student(103, "Bob", LocalDate.now(),student3phoneNumbers);
       
       Info info=new Info();
       info.display(students);
	}
	public static void scenario3() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of students");
		int noOfStudents=sc.nextInt();
		Student[] students=new Student[noOfStudents];
		for(int i=0;i<students.length;i++)	
		{
			System.out.println("Enter your id,name,date of birth(dd/MM/yyyy)");
			int id=sc.nextInt();
			String name=sc.next();
			String date=sc.next();
			DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd/MM/yyyy");
			LocalDate dateOfBirth=LocalDate.parse(date,formatter);
			
			students[i]=new Student(id,name,dateOfBirth);
		}
		
		Info.display(students);
		
	}
	public static void scenario4() {
		List<Student> students=new ArrayList<Student>();
        Scanner sc=new Scanner(System.in);
        do {
            System.out.println("Enter your id,name,date of birth(dd/MM/yyyy)");
            int id=sc.nextInt();
            String name=sc.next();
            String date=sc.next();
            DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate dateOfBirth=LocalDate.parse(date, formatter);
            
            //storing student object in collection
            students.add(new Student(id,name,dateOfBirth));
            System.out.println("Press 0 to stop?");
            int num=sc.nextInt();
            if(num==0) break;
        }while(true);
        
        Info.display(students);
	}
	
//---------------------------------------------------x---------------------------------------
	
//	public static void scenario5() {
//		Course course=new Course();
//		Course course1=new Course(1001, "John", 3,10000);
//		Course course2=new Course(1002, "Ram", 5,20000);
//	
//	    Info info=new Info();
//	    info.display(course1);
//	    info.display(course2);
//	}
//	public static void scenario6() {
//		//int[] num=new int[10];
//		Course[] course=new Course[3];
//	
//       course[0]=new Course(1001, "John", 3,10000);
//       course[1]=new Course(1002, "Mark", 5,20000);
//       course[2]=new Course(1003, "Bob", 10,40000);
//       
//       Info info=new Info();
//       info.display(course);
//	}
//	public static void scenario7() {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter no of courses");
//		int noOfCourses=sc.nextInt();
//		Course[] course=new Course[noOfCourses];
//		for(int i=0;i<course.length;i++)
//		{
//			System.out.println("Enter your id,name,duration,fees");
//			int id=sc.nextInt();
//			String name=sc.next();
//		    int duration=sc.nextInt();
//			double fees=sc.nextDouble();
//			
//			course[i]=new Course(id,name,duration,fees);
//		}
//		
//		Info.display1(course);
//		
//	}
//	public static void scenario8() {
//		List<Course> course=new ArrayList<Course>();
//        Scanner sc=new Scanner(System.in);
//        do {
//        	System.out.println("Enter your id,name,duration,fees");
//        	int id=sc.nextInt();
//			String name=sc.next();
//		    int duration=sc.nextInt();
//			double fees=sc.nextDouble();
//            
//            //storing course object in collection
//            course.add(new Course(id,name,duration,fees));
//            System.out.println("Press 0 to stop?");
//            int num=sc.nextInt();
//            if(num==0) break;
//        }while(true);
//        
//        Info.display1(course);
//	}
		public static void scenario9() {
			DegreeCourse degreeCourse=new DegreeCourse(101,"Btech",96,10000,DegreeLevel.Bachelors,true);
			Info.displayCourse(degreeCourse);
			
			DiplomaCourse diplomaCourse=new DiplomaCourse(102,"Agri",24,20000, Type.Academic);
			Info.displayCourse(diplomaCourse);
			
		}
	}
