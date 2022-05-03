package week4;

import java.util.Date;

public class Account {
	private int id = 0;
	private double balance = 0.0;
	private static double annualInterestRate = 0.0;
	private Date dateCreated;
	
	public Account() {
		
	}
	
	public Account(int id, double annualInterestRate) {
		this.id = id;
		this.annualInterestRate = annualInterestRate;
		this.balance = 1000000.0;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public static double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public static void setAnnualInterestRate(double annualInterestRate) {
		Account.annualInterestRate = annualInterestRate;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}
	
	public double getMonthlyInterestRate() {
		return annualInterestRate/12;
	}
	
	public double getMonthlyInterest() {
		return balance*getMonthlyInterestRate();
	}
	
	public void withdraw(double amount) {
		if(balance >= amount) {
			balance -= amount;
		}else {
			System.out.println("Account not enough money");
		}
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
//	public static void main(String[] args) {
//		Account acc = new Account(1012,0.045);
//		acc.setBalance(20000000);
//		acc.setDateCreated(new Date());
//		acc.withdraw(1500000);
//		acc.deposit(3000000);
//		System.out.println("Balance = " + acc.getBalance());
//		System.out.println("Monthly interest = " + acc.getMonthlyInterest());
//		System.out.println("Date created: " + acc.getDateCreated());
//		
//	}
}
