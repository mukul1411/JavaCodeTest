package com.codetest.rec;

public class ProductOf2NumRecursion {

	public static void main(String[] args) {
		System.out.println(product(4,11));
	}

	public static int product(int n1, int n2)
    {
       if (n2 > 1)
       {
    	  // System.out.println("n1 : "+n1 +" n2 : "+n2);
           n1 += product(n1,n2-1) ;
         //  System.out.println("n1 : "+n1);
       }
          return n1;
    }
}
