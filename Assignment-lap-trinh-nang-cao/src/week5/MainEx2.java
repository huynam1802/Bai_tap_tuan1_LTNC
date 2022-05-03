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
		
		System.out.println();
		
		// Test class Lecturer
		System.out.println("Test class Lecturer: ");
		Lecturer l = new Lecturer();
		l.setName("Vu Duc Thinh 20182806");
		l.setAddress("Ha Noi");
		l.setEmailAdress("vuthinh0301@gmail.com");
		l.setPhoneNumber("0975371084");
		l.setOffice("Marketing");
		l.setSalary(1000);
		l.setStartDate(new Date());
		l.setOfficeHours(5);
		l.setTitle("Teacher");
		System.out.println(l.toString());
		
		System.out.println();
		
		// Test class Staff
		System.out.println("Test class Staff: ");
		Staff staff = new Staff();
		staff.setName("Vu Duc Thinh 20182806");
		staff.setAddress("Ha Noi");
		staff.setEmailAdress("vuthinh0301@gmail.com");
		staff.setPhoneNumber("0975371084");
		staff.setOffice("Marketing");
		staff.setSalary(1000);
		staff.setStartDate(new Date());
		staff.setRank("10");
		System.out.println(staff.toString());
	}
}
