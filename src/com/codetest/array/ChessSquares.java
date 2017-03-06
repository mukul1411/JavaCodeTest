package com.codetest.array;

/**
 */
public class ChessSquares {
 /**
  * Method main.
  * @param args String[]
  */
 public static void main(String[] args) {
	
	 int count =0;
	 
	 for(int i=0; i <8 ;i++){
		 for(int j =0;j <8; j++){
			 
			 if(i%2 == j%2){
				 count ++;
			 }
		 }
	 }
	 System.out.println(count);
	
}
}
