package com.velocity.collection;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		LinkedHashSet<Integer> hs= new LinkedHashSet<Integer>();
		hs.add(11);
		hs.add(22);
		hs.add(33);
		hs.add(44);
		hs.add(11);
		
		for(Integer i:hs) {
			System.out.println(i);
			
		}
		

	}

}
