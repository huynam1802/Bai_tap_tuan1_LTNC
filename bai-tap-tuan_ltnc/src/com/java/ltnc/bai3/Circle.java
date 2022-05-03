package com.java.ltnc.bai3;

public class Circle {
	
	private Point center;
	private double radius;
	
	public Circle(Point center, double radius) {
		super();
		this.center = center;
		this.radius = radius;
	}
	
	public boolean isCircle(double radius) {
		if(radius > 0) {
			return true;
		}else {
			return false;
		}
	}
	
	public Point getCenter() {
		return center;
	}
	public void setCenter(Point center) {
		this.center = center;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Circle [center=" + center + ", radius=" + radius + "]";
	}
	
	

}
