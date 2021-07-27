package com.lti.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

import com.lti.model.Course;
import com.lti.model.Student;

public class PersistentSrudentDaoImpl implements StudentDao {
	Connection conn;
	String sql;
	PreparedStatement stmt;
	CallableStatement cstmt;
	ResultSet rs;
	public PersistentSrudentDaoImpl() {
		conn=ConnectionFactory.getConnection();
	}
	@Override
	public boolean addStudent(Student student) {
		/*sql="insert into student values(seq_student.nextval,?,?)";  //dynamic query
		try {
			stmt=conn.prepareStatement(sql);
			stmt.setString(1,student.getName());
			stmt.setDate(2,Date.valueOf(student.getDateOfBirth())); //converted java.time.LocalDate(java8) to java.sql.Date(old)
			//stmt.setInt(3,  student.getId());
			int rec=stmt.executeUpdate();
			if(rec>0) {
				return true;
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return false;
	}*/
		//---------insert student using procedure---------
		sql="{Call insertStudent(?,?)}";
		int res;
		try {
			cstmt=conn.prepareCall(sql);
			cstmt.setString(1, student.getName());
			cstmt.setDate(2, Date.valueOf(student.getDateOfBirth()));
			res=cstmt.executeUpdate();
			
			if(res>0)
				return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public void updateStudent(Student student) {
		sql="Update student set name=?,dob=? where id=?";
		try {
			stmt=conn.prepareStatement(sql);
			stmt.setString(1,student.getName());
			stmt.setDate(2,Date.valueOf(student.getDateOfBirth())); //converted java.time.LocalDate(java8) to java.sql.Date(old)
			stmt.setInt(3,  student.getId());
			int rec=stmt.executeUpdate();
			if(rec>0) {
				System.out.println("Record updated successfully");
			}
			else {
				System.out.println("Sorry no record found");
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}

	@Override
	public void removeStudent(int id) {
		sql="delete student where id=?";
		try {
			stmt=conn.prepareStatement(sql);
			stmt.setInt(1,id);
			int rec=stmt.executeUpdate();
			if(rec>0) {
				System.out.println("Student Removed successfully");
			}
			else {
				System.out.println("Student not found");
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}

	@Override
	public Student findAStudent(int id) {
		sql="select * from student where id=?";
		try {
			stmt=conn.prepareStatement(sql);
			stmt.setInt(1, id);
			rs = stmt.executeQuery();
			if(rs.next()) {
				int id1=rs.getInt(1);
				String name=rs.getString(2);
				Date dob=rs.getDate(3);
				Student st=new Student(id1, name, dob.toLocalDate());
				return st;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Student> viewAllStudents() {
		List<Student> students=new ArrayList<Student>();
		sql="select * from student";
		try {
			stmt=conn.prepareStatement(sql);
			rs = stmt.executeQuery();
			while(rs.next()) {
				int id1=rs.getInt(1);
				String name=rs.getString(2);
				Date dob=rs.getDate(3);
				Student st=new Student(id1,name,dob.toLocalDate());
				students.add(st);
			}
			return students;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public void enroll(int studentId, int courseId) {
		// TODO Auto-generated method stub

	}

	@Override
	public Set<Entry<Student, Course>> viewEnrollments() {
		// TODO Auto-generated method stub
		return null;
	}

}
