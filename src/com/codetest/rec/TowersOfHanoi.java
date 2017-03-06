package com.codetest.rec;

import java.util.Scanner;

public class TowersOfHanoi {

    /** print out instructions for moving n discs to
    the left (if left is true) or right (if left is false) */
	public static void moves(int n, boolean left) {
		if (n == 0)
			return;
		moves(n - 1, !left);
		if (left)
			System.out.println(n + " left");
		else
			System.out.println(n + " right");
	   moves(n - 1, !left);
	}

    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        moves(n, true);
        in.close();
    }

}