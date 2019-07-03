package com.interview.generics.lowerBoundedWildcards;

import java.util.Arrays;
import java.util.List;

public class CopyFromTo {

	public static <T> void copy(List<? super T> dst, List<? extends T> src) {
		for (int i = 0; i < src.size(); i++) {
			dst.set(i, src.get(i));
		}
	}
	
	public static void main(String[] args) {
		List<Object> objs = Arrays.<Object>asList(2, 3.14, "four");
		List<Integer> ints = Arrays.asList(5, 6);
		CopyFromTo.copy(objs, ints);
		CopyFromTo.<Object>copy(objs, ints);
		CopyFromTo.<Number>copy(objs, ints);
		CopyFromTo.<Integer>copy(objs, ints);
	}
	
}
