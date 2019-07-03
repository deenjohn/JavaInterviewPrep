package com.interview.generic.needForBound;

abstract class NewGift {
	abstract double getWeight();
}

class NewBook extends NewGift {
	public double getWeight() {
		return 3.2;
	}
}

class NewPhone extends NewGift {
	public double getWeight() {
		return 1.1;
	}
}

class NewParcel<T extends NewGift> {
	private T t;

	public void set(T t) {
		this.t = t;
	}

	public void shipParcel() {

		if (t.getWeight() > 10) //t is of type NewGift
			System.out.println("Ship by courier ABC");
		else
			System.out.println("Ship by courier XYZ");
	}

}

public class Bounded {
  public static void main(String[] args) {
	
}
}
