package com.pratice;

import java.util.ArrayList;
import java.util.List;

public class MutableModificationInCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<StringBuilder> sb = new ArrayList<StringBuilder>();
		sb.add(new StringBuilder("alpha"));
		sb.add(new StringBuilder("beta"));
		sb.add(new StringBuilder("gamma"));
		for(StringBuilder sbl : sb){
			sbl.append("88");
			System.out.println(sbl);
		}
		System.out.println(sb);
		
	}

}
