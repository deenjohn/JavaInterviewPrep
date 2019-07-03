package com.interview.generics.lowerBoundedWildcards;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TestComparable {

	//<T extends Comparable<? super T>> T max(Collection<? extends T> coll)
	public static <T extends Comparable<? super T>> T max(Collection<? extends T> coll) {
		T candidate = coll.iterator().next();
		for (T elt : coll) {
			if (candidate.compareTo(elt) < 0)
				candidate = elt;
		}
		return candidate;
	}
	
	public static void main(String[] args) {
		
		List<Integer> ints = Arrays.asList(0,1,2);
		
		List<String> strs = Arrays.asList("zero","one","two");
		
		List<Number> nums = Arrays.asList(0,1,2,3.14);
		
		TestComparable.max(ints);
		TestComparable.max(strs);
		
		// TestComparable.max(nums); //won't work
		
		
	}

}
