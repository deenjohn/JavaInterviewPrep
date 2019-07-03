package com.interview.generics.WhyGenerics;


class ParcelGeneric<T> {
	private T obj;

	public void set(T obj) {
		this.obj = obj;
	}

	public T get() {
		return obj;
	}
}

class Phone1 {
	
}

class Book1 {

	@Override
	public String toString() {
		return "Book1";
	}
	
}

public class BetterParcel{
	public static void main(String args[]) {
		ParcelGeneric<Book1> parcel = new ParcelGeneric<>();
		parcel.set(new Book1());
		System.out.println(parcel.get()); 
	}
}