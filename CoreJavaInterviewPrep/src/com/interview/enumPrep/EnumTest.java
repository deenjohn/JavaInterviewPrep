package com.interview.enumPrep;


public class EnumTest {
	public static void main(String[] args) {
		System.out.println("Rating is (Using Class)::"+EnumTry.EXCEEDS_EXPECTATIONS.getRating());
		System.out.println("Rating is (Using Enum)::"+Rating.EXCEEDS_EXPECTATIONS.getRating());
	}
}
