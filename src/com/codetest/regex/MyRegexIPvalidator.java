package com.codetest.regex;

import java.util.Scanner;

/**
 *
 * @author Atlas08
 *
 *         Java Regex Hackerrank: Write a class called MyRegex which will
 *         contain a string pattern. You need to write a regular expression and
 *         assign it to the pattern such that it can be used to validate an IP
 *         address. Use the following definition of an IP address: IP address is
 *         a string in the form “A.B.C.D”, where the value of A, B, C, and D may
 *         range from 0 to 255. Leading zeros are allowed. The length of A, B,
 *         C, or D can’t be greater than 3.
 *
 *         Some Valid IP Address
 *          000.12.12.034
 *          121.234.12.12
 *          23.45.12.56
 *
 *         Some invalid IpAddess
 *         000.23.12.12.1
 *         666.66.235.23
 *         .213.123.23.23
 *         23.45.22.32.
 *         I.Am.Not.An.IP
 *
 *         In this problem you will be provided strings containing any
 *         combination of ASCII characters. You have to write a regular
 *         expression to find the valid IPs. Just write the MyRegex class which
 *         contains a String . The string should contain the correct regular
 *         expression. (MyRegex class MUST NOT be public)
 *
 *         Sample Input
 *
 *         000.12.12.034
 *         121.234.12.12
 *         23.45.12.56
 *         00.12.123.123123.123
 *         122.33
 *         Hello.IP
 *
 *         Sample Output
 *
 *         true
 *         true
 *         true
 *         false
 *         false
 *         false
 *
 */

public class MyRegexIPvalidator {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner (System.in);
		while(stdIn.hasNext()){
			String ipAddress = stdIn.next();
			System.out.println(ipAddress.matches(new MyRegex().pattern));
		}
	}

}

class MyRegex{
	String pattern;
	MyRegex(){
		String soonya_255 = "(\\d{1,2}|(0|1)||d{2}|2[0-4]\\d|25[0-5])";
		pattern = soonya_255 + "\\." + soonya_255 + "\\." +soonya_255 + "\\." + soonya_255;
	}
}