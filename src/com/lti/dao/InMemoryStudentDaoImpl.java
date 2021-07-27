package com.lti.dao;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

import javax.swing.text.Position;

import com.lti.model.Course;
import com.lti.model.Student;
public class InMemoryStudentDaoImpl implements StudentDao {
	
	static List<Student>students=new ArrayList<Student>();
	static Set<Course> courses=new HashSet<Course>();
	static Map<Student,Course> enrollments=new HashMap<>();
	
	
	public InMemoryStudentDaoImpl() {
		 students.add(new Student(1001,"John",LocalDate.of(2000, 12, 12)));
		 students.add(new Student(1002,"Jack",LocalDate.of(2001, 06, 01)));
		 students.add(new Student(1003,"Steve",LocalDate.of(2002, 10, 20)));
		 students.add(new Student(1004,"Rob",LocalDate.of(2003, 05, 11)));
		 students.add(new Student(1005,"Ricky",LocalDate.of(2004, 04, 23)));
	
		 courses.add(new Course(10001,"Java",4,3000));
		 courses.add(new Course(10002,"PHP",3,4000));
		 courses.add(new Course(10003,"Python",5,6000));
	}
	
	public Course findACourse(int courseId) {
		for(Course course:courses) {
			if(((Course) courses).getId()==courseId)
				return course;
		}
		return null;
	}
	@Override
	public boolean addStudent(Student student) {
		return students.add(student);

	}
	@Override
	public void updateStudent(Student student) {
		
		Student existingStudent=findAStudent(student.getId());
		if(existingStudent!=null) {
			int position=students.indexOf(existingStudent);
			students.set(position, student);
			System.out.println("Student uppdated successfully!");
		}
		
		else {
			System.out.println("Student not found");
		}
	}

	@Override
	public void removeStudent(int id) {
		Student existingStudent=findAStudent(id);
		if(existingStudent!=null) {
			int position=students.indexOf(existingStudent);
			students.remove(position);
			System.out.println("Student unregistered");
		}
		
		else {
			System.out.println("Student not found");
		}

	}
	@Override
	public Student findAStudent(int id) {
		for(Student st:students) {
			if(st.getId()==id) {
				return st;
			}
		}
		return null;
	}
	@Override
	public List<Student> viewAllStudents() {
		return students;

	}
	@Override
	public void enroll(int studentId, int courseId) {
		Student student=findAStudent(studentId);
		Course course=findACourse(courseId);
		if(student==null||course==null) {
			System.out.println("Enrolled Successfully");
		}
		else {
			enrollments.put(student,course);
			System.out.println("Enrolled successfully");
		}
		enrollments.put(student, course);
		
	}

	@Override
	public Set<Entry<Student, Course>> viewEnrollments() {
		
		return enrollments.entrySet();
	}

}
