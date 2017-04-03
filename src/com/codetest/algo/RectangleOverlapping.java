package com.codetest.algo;

import java.util.Scanner;

public class RectangleOverlapping {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String input = in.next();
        int[] inputNumbers = new int[8];
        int i=0;
        for (String token : input.split("\\s+")) {
        	  inputNumbers[i] = Integer.parseInt(token);
        	  i++;
        }

		Point l1 = new Point(inputNumbers[0] , inputNumbers[1]);
		Point r1 = new Point(inputNumbers[2] , inputNumbers[3]);
		Point l2 = new Point(inputNumbers[4] , inputNumbers[5]);
		Point r2 = new Point(inputNumbers[6] , inputNumbers[7]);
		Rectangle first = new Rectangle(l1, r1);
		Rectangle second = new Rectangle(l2, r2);
		if (first.isOverLapping(second)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		in.close();
	}
}
// Axis points
class Point {
	int x;
	int y;

	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
}

// Rectangle with points
class Rectangle {
	private final Point topLeft;
	private final Point bottomRight;

	public Rectangle(Point topLeft, Point bottomRight) {
		this.topLeft = topLeft;
		this.bottomRight = bottomRight;
	}

	public boolean isOverLapping(Rectangle other) {
			    if(this.topLeft.x > other.bottomRight.x        // Rectangle A is right to B
				|| this.bottomRight.x < other.topLeft.x // R1 is left to R2
				|| this.topLeft.y < other.bottomRight.y // R1 is above R2
				|| this.bottomRight.y > other.topLeft.y) { // R1 is below R1
			return false;
		}
		return true;
	}
}
