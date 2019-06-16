package com.interview.set;

import java.util.TreeSet;

public class TreeSetUsage {

	public static void main(String[] args) {
		
		
		TreeSet<Integer> ts =new TreeSet<Integer>();  
		
		 ts.add(1830); 
		  ts.add(1205);  
		  ts.add(1320);  
		  ts.add(1505);  
		  ts.add(1545);  
		  
		  
		 System.out.println(ts.headSet(1400)); 
		
		 String s1="Welcome";  
		 String s2="Welcome";
		 
		 System.out.println(s1  == s2);
		

	}

}
