package week5;

import java.util.Date;

public class MainEx2 {
	public static void main(String[] args) {
		
		// test class Person
		System.out.println("Test class Person: ");
		Person p = new Person();
		p.setName("Vu Duc Thinh 20182806");
		p.setAddress("Ha Noi");
		p.setEmailAdress("vuthinh0301@gmail.com");
		p.setPhoneNumber("0975371084");
		System.out.println(p.toString());
		
		System.out.println();
		
		//test Class Student
		System.out.println("Test Class Student: ");
		Student s1 = new Student();
		s1.setStatus(1);
		System.out.println(s1.toString());
		
		System.out.println();
		
		// Test class Employee
		System.out.println("Test class Employee: ");
		Employee e1 = new Employee();
		e1.setName("Vu Duc Thinh 20182806");
		e1.setAddress("Ha Noi");
		e1.setEmailAdress("vuthinh0301@gmail.com");
		e1.setPhoneNumber("0975371084");
		e1.setOffice("Marketing");
		e1.setSalary(1000);
		e1.setStartDate(new Date());
		System.out.println(e1.toString());
	}
}
