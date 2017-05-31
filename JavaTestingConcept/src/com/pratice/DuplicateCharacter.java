package com.pratice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharacter {

	String s = "bhaupratapsingh";
public void duplicate(String str){
	char[]  c = str.toCharArray();
	Map<Character,Integer> hm = new HashMap<Character,Integer>();
	for(Character ch :c){
		if(hm.containsKey(ch)){
			hm.put(ch, hm.get(ch)+1);
		}
		else{
			hm.put(ch, 1);
		}
		Set<Character> keyset = hm.keySet();
		for(Character keych : keyset){
			System.out.println(keych+" "+hm.get(keych));
		}
	}
}

}
