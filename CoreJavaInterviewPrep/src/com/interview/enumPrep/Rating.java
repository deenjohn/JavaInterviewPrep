package com.interview.enumPrep;

//enum is very much like this 

public class Rating {
	
	private final int ratingValue;
	
	public static final Rating EXCEEDS_EXPECTATIONS = new Rating(6);
	public static final Rating EXCELLENT = new Rating(5);
	public static final Rating SUPERB = new Rating(4);
	public static final Rating NICE = new Rating(3);
	public static final Rating NEEDS_IMPROVEMENT = new Rating(2);
	public static final Rating POOR = new Rating(1);
	
	public Rating(int ratingValue){
		this.ratingValue = ratingValue;
	}
	
	public int getRating(){
		return ratingValue;
	}
}
