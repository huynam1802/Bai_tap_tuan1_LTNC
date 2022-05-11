package week6;

public class MainEx3 {
	public static void main(String[] args) {
		Circle circle = new Circle(5.0);
		
		Rectangle rec = new Rectangle(2.0, 3.0, "green", true);
		
		Square square = new Square(8.0, "yellow", false);
		
		
		GeometricObject geo = new Circle();
		GeometricObject[] arrGeo = {circle, rec, square};
		
		// hien thi dien tich tung hinhf trong mang
		System.out.println("Sum Area: " + geo.sumArea(arrGeo));
		
		// hien thi thong tin tung hinh trong mang
		for(GeometricObject g : arrGeo) {
			g.printInfo();
		}
		
	}
}
