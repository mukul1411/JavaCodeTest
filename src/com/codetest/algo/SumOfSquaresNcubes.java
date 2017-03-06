package com.codetest.algo;

import java.util.Scanner;

public class SumOfSquaresNcubes {

    public static void main(String[] args) {

        int n,sum1=0, sum2=0;
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter value n : ");
        n = scan.nextInt();
        int i=1;
        while(i <= n)  {
            sum1 = sum1 + (i * i);//calculates sum of squares
            sum2 = sum2 + (i * i * i);////calculates sum of cubes
            i++;
        }
        System.out.println("Sum of squares up to n : " + sum1);
        System.out.println("Sum of cubes up to n : " + sum2);
        sum1 = (n * (n+1) * ( ( 2 * n ) + 1 ) ) /6;
        sum2 = ((n * n) * ( n + 1 ) * ( n + 1 ) ) / 4;
        System.out.println("Sum of squares up to n [n(n+1)(2n+1)/6 ]: " + sum1);
        System.out.println("Sum of cubes up to n [n2(n+1)2/4]: " + sum2);
        scan.close();
    }
}
/*
  input:
Enter value n :
5

output:
Sum of squares up to n : 55
Sum of cubes up to n : 225
Sum of squares up to n [n(n+1)(2n+1)/6 ]: 55
Sum of cubes up to n [n2(n+1)2/4]: 225
*/
/*
 input:
 Enter value n :
9

output:
Sum of squares up to n : 285
Sum of cubes up to n : 2025
Sum of squares up to n [n(n+1)(2n+1)/6 ]: 285
Sum of cubes up to n [n2(n+1)2/4]: 2025

*/