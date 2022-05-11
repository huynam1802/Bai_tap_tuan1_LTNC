package week6;

public class Square extends GeometricObject  {
	private double side;
	
	public Square() {
		super();
	}
	
	public Square(double side, String color, boolean filled) {
		super(color, filled);
		this.side = side;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}
	
	@Override
	public double getArea() {
		return this.side * this.side;
	}
	
	@Override
	public void printInfo() {
		System.out.println("Square: \n side: "+ this.side + "\n filled: " + this.isFilled() + "\n color: " + this.getColor());
	}
}
