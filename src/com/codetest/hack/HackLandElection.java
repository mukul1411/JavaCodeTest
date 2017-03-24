package com.codetest.hack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Atlas08
 *         There are n citizens voting in this year's HackLand election.
 *         Each voter writes the name of their chosen candidate on a ballot and
 *         places it in a ballot box. The candidate with the highest number of
 *         votes wins the election; if two or more candidates have the same
 *         number of votes, then the tied candidates' names are ordered
 *         alphabetically and the last name wins.
 *
 *         Complete the electionWinner function in your editor. It has 1
 *         parameter: an array of strings, votes, describing the votes in the
 *         ballot box. This function must review these votes and return a string
 *         representing the name of the winning candidate.
 *
 *         Input Format The locked stub code in your editor reads the following
 *         input from stdin and passes it to your function: The first line
 *         contains an integer, n, denoting the size of the votes array. Each
 *         line i of the n subsequent lines (where 0 ≤ i < n) of strings
 *         contains a citizen's vote in the form of a candidate's name.
 *
 *         Constraints 1 ≤ n ≤ 104
 *
 *         Output Format Your function must return a string denoting the name of
 *         the winner. This is printed to stdout by the locked stub code in your
 *         editor.
 *
 */
public class HackLandElection {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        String[] votes = new String[a];
        for ( int i = 0 ; i < a ; i++ ){
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
		List<String> res = new ArrayList<>();
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			if (entry.getValue() == max)
				res.add(entry.getKey());
		}
		Collections.sort(res);
		return res.get(res.size() - 1);
	}

}
