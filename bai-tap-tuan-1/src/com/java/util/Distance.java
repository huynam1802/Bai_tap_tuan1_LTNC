
package com.java.util;

import static java.lang.Math.pow;

import com.java.ltnc.bai3.Point;

public class Distance {
	public static double distance(Point a, Point b) {
		return Math.pow((pow(a.getX() - b.getX(), 2) + pow(a.getY() - b.getY(), 2)), 0.5);
	}
}
