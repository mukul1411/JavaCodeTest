package com.codetest.array;

/**
 */
public class Print2dArrayMatrix {
	/**
	 * Method main.
	 * @param args String[]
	 */
	public static void main(String[] args) {

		int[][] matrix = {
				{1,2,3,10},
				{1,2,3, 11},
				{4,5,6, 12},
				{7,8,9, 13}
		};
		//use for each loop as below to avoid IndexOutOfBoundException  //need to check matrix != null if implements as a method
		 System.out.println("1st Way #################### ");
		//for each row in the matrix
		for (int[] row : matrix) {
			//for each number in the row
			for (int j : row) {
				System.out.print(j + " ");
			}
			System.out.println("");
		}
		 System.out.println("2nd Way #################### ");
		for (int i = 0; i < matrix.length; i++) {
		    for (int j = 0; j < matrix[i].length; j++) {
		          System.out.print( matrix[i][j] + " ");
		    	//System.out.print("i"+i + "j"+ j+ " = " +  matrix[i][j] + " ");
		    }
		    System.out.println();
		}

		 System.out.println("The Boundary Elements are:");
	        for(int i = 0; i < matrix.length; i++)
	        {
	            for(int j = 0; j < matrix[i].length; j++)
	            {
	                if(i==0 || j==0 || i ==  matrix.length -1 || j == matrix[i].length-1) //condition for accessing boundary elements
	                    System.out.print(matrix[i][j]+"\t");
	                else
	                    System.out.print(" \t");
	            }
	            System.out.println();
	        }
   }
}
