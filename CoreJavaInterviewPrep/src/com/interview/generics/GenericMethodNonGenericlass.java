package com.interview.generics;

public class GenericMethodNonGenericlass {

	public <E> void deliver(E[] array) {
		for (E item : array) {
			System.out.println("Delivering - " + item);
		}
	}

	
	public static void main(String[] args) {
		GenericMethodNonGenericlass gc = new GenericMethodNonGenericlass();
		Integer[] arr = new Integer[2];
		arr[0] = 1 ;arr[1] = 2 ;
		
		gc.deliver(arr);
		
	}
}



