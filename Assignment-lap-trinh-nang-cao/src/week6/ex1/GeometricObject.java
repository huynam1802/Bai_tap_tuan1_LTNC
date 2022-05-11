package week6.ex1;

import java.util.Date;

public abstract class GeometricObject {
	private String color = "white";
	private boolean filled = false;
	private Date dateCreated;
	
	public GeometricObject(){
		this.dateCreated = new Date();
	}
	
	public GeometricObject(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
		this.dateCreated = new Date();
	}
	
	public String getColor() {
		return this.color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public boolean isFilled() {
		return this.filled ? true : false;
	}
	
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	
	public Date getDateCreated() {
		return this.dateCreated;
	}


	@Override
	public String toString() {
		return "GeometricObject [color=" + color + ", filled=" + filled + ", dateCreated=" + dateCreated + "]";
	}
	
	public abstract double getArea();
	
	public abstract void printInfo();
	
	public double sumArea(GeometricObject[] geos) {
		double sumArea = 0;
		for(GeometricObject geo : geos) {
			sumArea += geo.getArea();
		}
		return sumArea;
	}
	
}
