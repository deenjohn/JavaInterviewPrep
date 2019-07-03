package com.interview.generics.comparable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

class Fruit implements Comparable<Fruit> {
 
	int size ;
	
	public Fruit(int x) {
		this.size = x ;
	}
	
	@Override
	public int compareTo(Fruit fruit) {
		// TODO Auto-generated method stub
		if (size == fruit.size) return 0 ;
		return size > fruit.size ? 1 : -1 ;
	}
	
	public static <T extends Comparable<? super T>> T max(Collection<?extends T > coll) {
		 T candidate = coll.iterator().next();
		 for (T elt : coll) {
		 if (candidate.compareTo(elt) < 0) candidate = elt;
		 }
		 return candidate;
		}
	
}

class Apple extends Fruit {
	public Apple(int i){
		super(i);
	}
	
	@Override
	public String toString() {
		return "Apple [size=" + size + "]";
	}
}

class Orange extends Fruit {
     
	public Orange(int i) {
		super(i);
		
	}

	@Override
	public String toString() {
		return "Orange [size=" + size + "]";
	}

	
	
	
}

public class AppleOrangeFruit {
	
	public static void main(String[] args) {
		
		ArrayList<Fruit> al=new ArrayList<Fruit>();  
		al.add(new Apple(4));  
		al.add(new Apple(2));  
		al.add(new Orange(1));  
		  
		Collections.sort(al);
		
		for(Fruit fruit:al){  
			System.out.println(fruit.size);  
		}
		
		System.out.println(Fruit.max(al));
		
		ArrayList<Orange> al1=new ArrayList<Orange>();  
		al1.add(new Orange(2));  
		al1.add(new Orange(5));  
		al1.add(new Orange(1));  
		  
		Collections.sort(al1);
		System.out.println(Fruit.max(al1));
		
	}

}


