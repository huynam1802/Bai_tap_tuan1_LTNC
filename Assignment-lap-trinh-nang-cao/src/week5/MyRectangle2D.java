package week5;

public class MyRectangle2D {
	
	private double x = 0;
	private double y = 0;
	private double width = 1;
	private double height = 1;
	
	public MyRectangle2D() {
		
	}
	
	
	
	public MyRectangle2D(double x, double y, double width, double height) {
		super();
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}



	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
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
	
	public double getArea() {
		return this.width * this.height;
	}
	
	public double getPerimeter() {
		return 2*(this.width * this.height);
	}
	
	public boolean contains(double a, double b) {
		if(((a >= this.x - this.width/2) && (a <= this.x + this.width/2)) &&
				((b >= this.y - this.height/2) && (b <= this.y + this.height/2))) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean contains(MyRectangle2D r) {
		if(this.contains(r.x - r.width/2, r.y + r.height/2) && 
		   this.contains(r.x + r.width/2, r.y + r.height/2) && 
		   this.contains(r.x + r.width/2, r.y - r.height/2) && 
		   this.contains(r.x - r.width/2, r.y - r.height/2)) {
			return true;
		}else {
			return false;
		}
	}
	
}
