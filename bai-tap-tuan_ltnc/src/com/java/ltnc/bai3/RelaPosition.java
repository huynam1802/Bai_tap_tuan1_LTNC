package com.java.ltnc.bai3;

import java.util.Scanner;

import com.java.util.Distance;

public class RelaPosition {
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Circle circle1, circle2;
		double x1, y1, x2, y2, r1, r2;
		
		
		System.out.print("Moi ban nhap toa do tam hinh tron thu nhat (x1, y1): \n");
		System.out.print("x1 = ");
		x1 = sc.nextDouble();
		System.out.print("y1 = ");
		y1 = sc.nextDouble();
		Point i1 = new Point(x1,y1);
		
		System.out.println();
		
		System.out.print("Moi ban nhap toa do tam hinh tron thu hai (x2, y2): \n");
		System.out.print("x2 = ");
		x2 = sc.nextDouble();
		System.out.print("y2 = ");
		y2 = sc.nextDouble();
		Point i2 = new Point(x2,y2);
		
		System.out.println();
		
		System.out.print("Moi ban nhap ban kinh hinh tron thu nhat: ");
		r1 = sc.nextDouble();
		
		while(r1 <= 0) {
			System.out.println("Ban kinh khong hop le, moi ban nhap lai: r1 = ");
			r1 = sc.nextDouble();
		}
		circle1 = new Circle(i1,r1);
		
		System.out.println();

		System.out.print("Moi ban nhap ban kinh hinh tron thu hai: ");
		r2 = sc.nextDouble();
		
		while(r2 <= 0) {
			System.out.println("Ban kinh khong hop le, moi ban nhap lai: r2 = ");
			r2 = sc.nextDouble();
		}
		circle2 = new Circle(i2,r2);
		
		double distance = Distance.distance(i1,i2);
		
		System.out.println();

		
		if(distance <= (circle1.getRadius() - circle2.getRadius()) && (circle1.getRadius() > circle2.getRadius())) {
			System.out.println("Hinh tron thu hai nam ben trong hinh tron thu nhat");
		}
		else if(distance <= (circle2.getRadius() - circle1.getRadius()) && (circle1.getRadius() < circle2.getRadius())) {
			System.out.println("Hinh tron thu hai nam ben ngoai hinh tron thu nhat");
		}
		else if(distance <= (circle1.getRadius() + circle2.getRadius())) {
			System.out.println("Hinh tron thu hai giao voi hinh tron thu nhat");
		}
		
	}
}
