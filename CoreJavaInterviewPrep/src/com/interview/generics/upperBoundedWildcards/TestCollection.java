package com.interview.generics.upperBoundedWildcards;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestCollection {

	public static void main(String[] args) {
		
		List<Number> nums = new ArrayList<Number>();
		List<Integer> ints = Arrays.asList(1, 2);
		List<Double> dbls = Arrays.asList(2.78, 3.14);
		
		//public boolean addAll(Collection<? extends E> c);
		//E for nums is Number
		nums.addAll(ints);
		nums.addAll(dbls);
		
	}
}
