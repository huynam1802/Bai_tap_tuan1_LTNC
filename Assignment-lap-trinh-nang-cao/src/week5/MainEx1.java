package week5;

public class MainEx1 {
	
	public static void main(String[] args) {
		Circle circle = new Circle(3.0,"red",true);
		circle.printCircle();
		System.out.println(circle.getArea());
		System.out.println(circle.getDateCreated());
		System.out.println(circle.getPerimeter());
	}
    
}
