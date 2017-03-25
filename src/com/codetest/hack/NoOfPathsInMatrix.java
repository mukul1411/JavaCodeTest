package com.codetest.hack;

import java.io.IOException;
import java.util.Scanner;

public class NoOfPathsInMatrix {

    int m,n;
    int arr[][]=null;

	public static void main(String[] args) throws IOException {
		NoOfPathsInMatrix obj = new NoOfPathsInMatrix();
		Scanner sc = new Scanner((System.in));
		System.out.println("Enter the no of rows in matrix : ");
		obj.m = sc.nextInt();
		System.out.println("Enter the no of cols in matrix : ");
		obj.n = sc.nextInt();
		obj.arr = new int[obj.m][obj.n];
		for (int i = 0; i < obj.m; i++) {
			System.out.println("Enter " + (i + 1) + "th row : ");
			for (int j = 0; j < obj.n; j++) {
				obj.arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("No of paths : " + obj.noOfPaths(obj.arr, 0, 0));
		System.out.println("No of paths : " + numberOfPaths(obj.arr, 0, 0));
		sc.close();
	}

    int noOfPaths(int a[][], int i,int j)
    {
        if(i==m-1 && j==n-1)
            return a[i][j];
        else if (i==m-1)
            return a[i][j+1];
        else if (j==n-1)
            return a[i+1][j];
        else if(a[i][j]==1)
            return noOfPaths(a,i+1,j) + noOfPaths(a,i,j+1);
        else
            return 0;
    }
    
    static int numberOfPaths(int [][]a, int M, int N) {
    	int m = a.length;
    	int n = a[0].length;

    	if(M == m-1 && N == n-1 || a[M][N] == 0)
    	return a[M][N];
    	else if (M == m-1)
    	return numberOfPaths(a, M, N + 1);
    	else if (N == n-1)
    	return numberOfPaths(a, M + 1, N);
    	else if(a[M][N] == 1)
    	return numberOfPaths(a, M+1, N) + numberOfPaths(a, M, N + 1);
    	else
    	return 0;

    	}
}