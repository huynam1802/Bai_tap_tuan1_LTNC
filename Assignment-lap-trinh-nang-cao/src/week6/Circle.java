package week6;

public class Circle extends GeometricObject{
	private double radius;
	
	public Circle() {
		
	}
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public Circle(double radius, String color, boolean filled) {
		super(color,filled);
		this.radius = radius;
	}
	
	public double getRadius() {
		return this.radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	@Override
	public double getArea() {
		return Math.pow(this.radius, 2)* Math.PI;
	}
	
	public double getPerimeter() {
		return this.radius*2*Math.PI;
	}
	
	public double getDiameter() {
		return this.radius*2;
	}
	
	@Override
	public void printInfo() {
		System.out.println("Circle: \n radius: "+ this.radius + "\n filled: " + this.isFilled() + "\n color: " + this.getColor());
	}
}
