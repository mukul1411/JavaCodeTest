package com.codetest.array;

import java.util.*;

/**
 */
public class PoisnousPlants {


	   /*
	   In simple words problem statement is that given a non-empty array of number in range of 1 to 10^9.
	   In each iteration we will remove any array element which is greater than its previous element.
	   After how many iteration there will be no removal. e.g [3 1 10 7 3 5 6 6] give this array after first iteration
	   it will be [3 1 7 3 6] and then [3 1 3 6] and then [3 1 6] and finally it will be [3 1]
	   thus after third iteration there will be no removal .
	   */
	    /**
	    * Method numberOfDaysNoD.
	    * @param arr ArrayList<Integer>
	    * @return int
	    */
	   private static int numberOfDaysNoD(ArrayList<Integer> arr){
	        int nDays = 0;
	        boolean haveKilled = true;
	        while(haveKilled){
	            haveKilled = false;
	            for(int i = arr.size()-1; i>0; i--){
	                if(arr.get(i)>arr.get(i-1)){
	                    arr.remove(i);
	                    haveKilled = true;
	                }
	            }
	            nDays++;
	        }
	        return --nDays;
	    }

	    /**
	     * Method main.
	     * @param args String[]
	     */
	    public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT.  */
	         Scanner in = new Scanner(System.in);
	         int a = in.nextInt();
	        ArrayList<Integer> arr = new ArrayList<Integer>(a);
	         for ( int i = 0 ; i < a ; i++ ){
	             arr.add(in.nextInt());
	         }
	        System.out.println(numberOfDaysNoD(arr));
	        in.close();
	    }

}
