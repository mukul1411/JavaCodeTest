package com.codetest.algo;

import java.util.Scanner;

public class AddBinaryClass {

	public static void main(String[] args) throws Exception {

	    Scanner in = new Scanner(System.in);
	    String a = in.next();
	    String b = in.next();
	    String resultString = addBinary(a, b);
	    System.out.println(resultString.replaceFirst("^0+(?!$)", ""));

	    in.close();

	  }

	   private static String addBinary(String aFirst, String bSecond) {

	        int la = aFirst.length();
	        int lb = bSecond.length();

	        int max = Math.max(la, lb);

	        StringBuilder sum = new StringBuilder("");
	        int carry = 0;

	        for(int i = 0; i < max; i++){
	            int m = getBit(aFirst, la - i - 1);
	            int n = getBit(bSecond, lb - i - 1);
	            int add = m + n + carry;
	            sum.append(add % 2);
	            carry = add / 2;
	        }

	        if(carry == 1)
	            sum.append("1");

	        return sum.reverse().toString();

	    }

	    private static int getBit(String s, int index){
	        if(index < 0 || index >= s.length())
	            return 0;

	        if(s.charAt(index) == '0')
	            return 0;
	        else
	            return 1;

	    }

}
