package week6.ex1;

public class Rectangle extends GeometricObject {
	private double width;
	private double height;
	
	public Rectangle() {
		super();
	}

	public Rectangle(double width, double height, String color, boolean filled) {
		super(color, filled);
		this.width = width;
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	@Override
	public double getArea() {
		return this.width * this.height;
	}
	
	public double getPerimeter() {
		return 2 * (this.width + this.height);
	}
	
	@Override
	public void printInfo() {
		System.out.println("Rectangle: \n width: "+ this.width + "\n height: " + this.height + "\n filled: " + this.isFilled() + "\n color: " + this.getColor());
	}

}
