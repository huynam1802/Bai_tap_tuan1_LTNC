package week5;

public class MainEx3 {
	public static void main(String[] args) {
		MyRectangle2D rec1 = new MyRectangle2D(0.0, 0.0, 4.0, 6.0);
		MyRectangle2D rec2 = new MyRectangle2D(1.0, 1.5, 2.0, 3.0);
		MyRectangle2D rec3 = new MyRectangle2D(1.0, 1.4, 2.0, 3.0);
		MyRectangle2D rec4 = new MyRectangle2D(1.0, 1.6, 2.0, 3.0);
		
		//check rec1 overlap rec2?
		
		System.out.println(rec1.contains(rec2));
		
		//check rec1 overlap rec3?
		System.out.println(rec1.contains(rec3));
		
		//check rec1 overlap rec4?
		System.out.println(rec1.contains(rec4));
	}
}
