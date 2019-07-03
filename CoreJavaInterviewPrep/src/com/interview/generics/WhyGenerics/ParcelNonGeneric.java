package com.interview.generics.WhyGenerics;

class Parcel {
	private Object obj;

	public void set(Object obj) {
		this.obj = obj;
	}

	public Object get() {
		return obj;
	}
}

class Phone {
}

class Book {
}

public class ParcelNonGeneric {
	public static void main(String args[]) {
		Parcel parcel = new Parcel();
		parcel.set(new Book());
		System.out.println((Phone) parcel.get()); // runtime exception
	}
}