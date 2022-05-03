package week5;

import java.util.Date;

public class Employee extends Person {
	private String office;
	private double salary;
	private Date startDate;
	
	
	
	public Employee() {
		super();
	}


	public Employee(String office, double salary, Date startDate) {
		super();
		this.office = office;
		this.salary = salary;
		this.startDate = startDate;
	}


	public String getOffice() {
		return office;
	}


	public void setOffice(String office) {
		this.office = office;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	public Date getStartDate() {
		return startDate;
	}


	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}


	@Override
	public String toString() {
		return super.toString()+ ", office = " + office + ", salary = " + salary + ", startDate = " + startDate;
	}
	
	
}
