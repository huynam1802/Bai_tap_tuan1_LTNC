package week5;

public class Student extends Person {
	
	public static final int FRESHMAN = 1, SOPHOMORE= 2, JUNIOR = 3, SENIOR = 4;
	private int status = FRESHMAN;
	
	
	
	public Student() {
		super();
	}

	public Student(int status) {
		super();
		this.status = status;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	@Override
	public String toString() {
		String str = "";
		switch (status) {
		case 1:
			str =  ", status = freshman";
			break;
		case 2:
			str = ", status = sophomore";
			break;
		case 3:
			str = ", status = junior";
			break;	
		case 4:
			str = ", status = senior";
			break;	
		default:
			break;
		}
		
		return super.toString() + str;
	}
	
	
}
