package com.codetest.algo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CountCharOccurence {

public static void main(String[] args) {
	Map<Character,Integer> map = new HashMap<Character,Integer>();
	String s = "hgdyyfuioop678gffff";
	for (int i = 0; i < s .length(); i++) {
	  char c = s.charAt(i);
	  if (map.containsKey(c)) {
	    int cnt = map.get(c);
	    map.put(c, ++cnt);
	  } else {
	    map.put(c, 1);
	  }
	}

	Set<Entry<Character, Integer>> set = map.entrySet();
	Iterator<Entry<Character, Integer>> iter = set.iterator();
	while(iter.hasNext()){
		Map.Entry<Character, Integer> entry = iter.next();
		System.out.println("Key :"+ entry.getKey() +""+ "  Value :"+ entry.getValue());
	}

}
}
