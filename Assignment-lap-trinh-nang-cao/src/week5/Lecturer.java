package week5;

public class Lecturer extends Employee{
	
	private int officeHours;
	private String title;
	public Lecturer() {
		super();
	}
	public Lecturer(int officeHours, String title) {
		super();
		this.officeHours = officeHours;
		this.title = title;
	}
	public int getOfficeHours() {
		return officeHours;
	}
	public void setOfficeHours(int officeHours) {
		this.officeHours = officeHours;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	@Override
	public String toString() {
		return super.toString() + ", officeHours=" + officeHours + ", title=" + title;
	}
	
	
}
