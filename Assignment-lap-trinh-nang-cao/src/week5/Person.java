package week5;

public class Person {
	private String name;
	private String address;
	private String phoneNumber;
	private String emailAdress;
	
	public Person() {
		
	}

	public Person(String name, String address, String phoneNumber, String emailAdress) {
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.emailAdress = emailAdress;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmailAdress() {
		return emailAdress;
	}

	public void setEmailAdress(String emailAdress) {
		this.emailAdress = emailAdress;
	}

	@Override
	public String toString() {
		return "name = " + name + ", address = " + address + ", phoneNumber = " + phoneNumber + ", emailAdress = "
				+ emailAdress;
	}
	
	
	
	
}
