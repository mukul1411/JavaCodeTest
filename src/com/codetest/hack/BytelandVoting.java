package com.codetest.hack;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 
 * @author Atlas08
 *          It’s election time in Byteland. M citizens casted one vote
 *         for one person. To win the election, a candidate must earn more votes
 *         than half of the total number of voters.
 * 
 *         Challenge: Who won the election? It’s guaranteed that, for the given
 *         input, there will always be a winner.
 * 
 *         Input Format
 * 
 *         The first line of input contains a single integer , denoting the
 *         number of citizens.
 * 
 *         The  line of the following lines contains a lowercase English
 *         letter string, denoting the candidate who gets the vote of the th
 *         citizen.
 * 
 *         Constraints
 * 
 *         Each name consists of to lowercase English letters. Citizens can only
 *         vote for existing candidates. Output Format
 * 
 *         First and only line of output: the name (in lowercase English
 *         letters) of the winning candidate.
 * 
 *         Sample Input
 * 
 *         5 
 *         jack 
 *         john 
 *         jake 
 *         john 
 *         john 
 *         
 *         Sample Output
 * 
 *         john 
 *         
 *         Explanation
 * 
 *         The candidate named "john" gets votes, which is larger than half of
 *         the number of voters.
 *
 */

public class BytelandVoting {

	 public static void main(String[] args) {
	       Scanner in = new Scanner(System.in);
	        int M = in.nextInt();
	        String[] votes = new String[M];
	        for ( int i = 0 ; i < M ; i++ ){
	        	votes[i]= in.next();
	        }
	       System.out.println(electionWinner(votes));
	       in.close();
	    }

	    static String electionWinner(String[] votes) {
			Map<String, Integer> map = new HashMap<>();
			int max = 0;
			for (String vote : votes) {
				if (map.get(vote) == null)
					map.put(vote, 1);
				else {
					int count = map.get(vote) + 1;
					map.put(vote, count);
					max = Math.max(max, count);
				}
				// map.put(vote, map.getOrDefault(vote, 0)+1);
			}
			String winner = null;
			for (Map.Entry<String, Integer> entry : map.entrySet()) {
				if (entry.getValue() == max)
					winner = entry.getKey();
			}

			return winner;
		}

}
