package com.interview.basics;

public class InitialiseBlock {
	
	public InitialiseBlock(){
		System.out.println("constructor");
	}
	
	{
		int x = 2 ;
		System.out.println("initialise block");
	}
	
	

	public static void main(String[] args) {
		
		InitialiseBlock i = new InitialiseBlock();
		

	}

}
