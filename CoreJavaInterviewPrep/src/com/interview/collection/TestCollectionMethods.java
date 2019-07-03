package com.interview.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestCollectionMethods {
	
	  public static final String[] EMPTY_STRING_ARRAY = new String[0];

	public static void main(String[] args) {
		
		
		ArrayList<String> list=new ArrayList<String>();//Creating arraylist    
	      list.add("Ravi");//Adding object in arraylist    
	      list.add("Vijay");    
	      
	      //testing toArray method
	      //https://docs.oracle.com/
	      //javase/8/docs/api/java/util/Collection.html#toArray-T:A-
     
	      list.toArray(new String[0]);
	      //or
	      String[] sa = list.toArray(EMPTY_STRING_ARRAY);
	      System.out.println(sa);
	      
	      List<Object> l = Arrays.asList("zero","one",2);
	      //String[] a = l.toArray(new String[0]); // run-time error
	      System.out.println(l);
	      
	      //it does not work with arrays of primitive type:
	      
	      List<Integer> l1 = Arrays.asList(0,1,2);
	    //  int[] a = l1.toArray(new int[0]); // compile-time error

	}

}
