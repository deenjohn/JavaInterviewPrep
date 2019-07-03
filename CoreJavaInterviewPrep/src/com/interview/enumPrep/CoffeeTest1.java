package com.interview.enumPrep;

enum CoffeeSize { BIG, HUGE, OVERWHELMING } // this cannot be // private or protected

class Coffee {
 
 //public static enum CoffeeSize { BIG, HUGE, OVERWHELMING }
 CoffeeSize size;
 
}

public class CoffeeTest1 {
	public static void main(String[] args) {
	   Coffee drink = new Coffee();
	   System.out.println(drink.size.HUGE);
	   drink.size = CoffeeSize.BIG; // enum outside class
	   System.out.println(CoffeeSize.valueOf("BIG"));
	}
}