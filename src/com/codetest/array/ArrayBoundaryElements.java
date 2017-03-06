package com.codetest.array;

import java.io.IOException;
import java.util.Scanner;

/**
 */
public class ArrayBoundaryElements {

	/**
	 * Method main.
	 * @param args String[]
	 * @throws IOException
	 */
	public static void main(String args[]) throws IOException {
		int i, j, m, n;
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the no. of  rows: "); // Inputting the number of rows
		m = sc.nextInt();
		System.out.print("Enter the no. of columns: "); // Inputting the number of columns
		n = sc.nextInt();

		int arr[][] = new int[m][n]; // Creating the array

		/* Inputting the array */
		for (i = 0; i < m; i++) {
			for (j = 0; j < n; j++) {
				System.out.print("Enter the elements: ");
				arr[i][j] = sc.nextInt();
			}
		}

		System.out.println("The Boundary Elements are:");
		for (i = 0; i < m; i++) {
			for (j = 0; j < n; j++) {
				// condition for accessing boundary elements
				if (i == 0 || j == 0 || i == m - 1 || j == n - 1)
					System.out.print(arr[i][j] + "\t");
				else
					System.out.print(" \t");
			}
			System.out.println();
		}
		sc.close();
	}
}
