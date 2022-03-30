package com.java.ltnc.bai2;

import java.util.Scanner;
import static java.lang.Math.*;

public class ToaDo {
	public static void main(String[] args) {
		
		double x1, y1, x2, y2;
		Scanner sc = new Scanner(System.in);
		System.out.print("Moi ban nhap toa do diem thu nhat (x1, y1): \n");
		System.out.print("x1 = ");
		x1 = sc.nextDouble();
		System.out.print("y1 = ");
		y1 = sc.nextDouble();
		
		System.out.println();
		
		System.out.print("Moi ban nhap toa do diem thu nhat (x2, y2): \n");
		System.out.print("x2 = ");
		x2 = sc.nextDouble();
		System.out.print("y2 = ");
		y2 = sc.nextDouble();
		
		System.out.println();
		
		System.out.print("Khoang cach giua hai diem la: " + pow((pow(x1 - x2, 2) + pow(y1 - y2, 2)), 0.5));
		
	}
}


