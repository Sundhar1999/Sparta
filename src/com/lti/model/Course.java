package com.lti.model;

import java.time.LocalDate;

public class Course {
	    //member variables: instance and class variables
		private int id;
		private String name;
		private int duration;
		private double fees;
		private static String collegeName;
		//static block is executed even before main method
		static {
			collegeName="SVCE";
			//System.out.println("static block.");
		}

		public Course(int id, String name, int duration,double fees) {
			//System.out.println("Parameterized constructor");
			this.id = id;
			this.name = name;
			this.duration=duration;
			this.fees=fees;
		}
		
		public Course() {
			// TODO Auto-generated constructor stub
		}

		//Getter & Setter methods(accessor and mutator method)
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getDuration() {
			return duration;
		}
		public void setDuration(int duration) {
			this.duration = duration;
		}
		public double getFees() {
			return fees;
		}
		public void setFees(double fees) {
			this.fees = fees;
		}
		public void calculateMonthlyfee() {
			System.out.println("Monthly Fee"+(fees/duration));
		}
//		public static String getCollegeName() {
//			return collegeName;
//		}
////		public static void setCollegeName(String collegeName) {
////			Course.collegeName = collegeName;
////		}

	}

