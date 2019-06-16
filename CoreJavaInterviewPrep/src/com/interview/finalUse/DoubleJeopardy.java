package com.interview.finalUse;


//Solution 72: Final Jeopardy : effective java 

class Jeopardy {
	
  public static final String PRIZE = "$64,000"; //can not be overriden
  public static final void test() {
	  System.out.println("test parent");
  }
  
}

public class DoubleJeopardy extends Jeopardy {
	
	public static final String PRIZE = "2 cents";
	public static void main(String[] args) {
	  System.out.println(DoubleJeopardy.PRIZE);
	}
	
	//below code won't work
	
//	@Override
//	public static final void test() {
//		  System.out.println("test parent");
//	  }
	
}
