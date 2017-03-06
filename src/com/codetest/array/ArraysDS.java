package com.codetest.array;

import java.util.Scanner;

/**
 */
public class ArraysDS {

	/**
	 * Method main.
	 * @param args String[]
	 */
	public static void main(String[] args) {
	       Scanner stdIn = new Scanner (System.in);
	        int num = stdIn.nextInt();
	        int arr [] = new int [num] ;
	         for(int i=0; i < num; i++){
		            arr[i] = stdIn.nextInt();
		    }
	         System.out.println("Array content in order:");
	         for(int i=0; i < arr.length; i++){
	        	 System.out.print(arr[i] +" ");
		    }
	         System.out.println("\nArray content in Reverse order:");
	         for (int i= arr.length - 1; i>=0; i--){
	        	 System.out.print(arr[i] +" ");
	         }

	         stdIn.close();
	    }

}
