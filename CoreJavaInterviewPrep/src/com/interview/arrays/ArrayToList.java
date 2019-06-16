package com.interview.arrays;

import java.util.Arrays;
import java.util.List;

public class ArrayToList {

	public static void main(String[] args) {
		
		
		String[] as = {"deen", "john","cs"};
		
		List<String> li = Arrays.asList(as);
		
		//System.out.println(li);
		li.set(3, "jacob");
		
		System.out.println(li);
		System.out.println( Arrays.asList(as));
		

	}

}
