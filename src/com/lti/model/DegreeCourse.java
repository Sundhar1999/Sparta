package com.lti.model;

public class DegreeCourse extends Course {
	DegreeLevel degreeLevel;
	boolean isPlacementAvailable;
	public DegreeCourse() {
		super();//calls the defaul constructor of the parent(course) class
	}
	public DegreeCourse(int id, String name, int duration, double fees,DegreeLevel degreeLevel,boolean isPlacementAvailable) {
		super(id, name, duration, fees); //calls parameterized constructor of parent class
		this.degreeLevel=degreeLevel;
		this.isPlacementAvailable=isPlacementAvailable;
		
	}
	public DegreeLevel getDegreeLevel() {
		return degreeLevel;
	}
	public void setDegreeLevel(DegreeLevel degreeLevel) {
		this.degreeLevel = degreeLevel;
	}
	public boolean isPlacementAvailable() {
		return isPlacementAvailable;
	}
	public void setPlacementAvailable(boolean isPlacementAvailable) {
		this.isPlacementAvailable = isPlacementAvailable;
	}
	public void calculateMonthlyFee() {
		System.out.println(super.getId()+" "+super.getName()+" "+super.getDuration());
		super.calculateMonthlyfee();
		if(isPlacementAvailable) {
		System.out.println("Total Fees: "+super.getFees()*1.1); 
		System.out.println("You need to pay: "+(super.getFees()*0.1)+"as placement fee."); 
		}
		else {
			System.out.println("Total Fees:"+(super.getFees()));
		}
}
}
