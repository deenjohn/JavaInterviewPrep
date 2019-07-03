package com.interview.generic.needForBound;

abstract class Gift {
	abstract double getWeight();
}

class Book extends Gift {
	public double getWeight() {
		return 3.2;
	}
}

class Phone extends Gift {
	public double getWeight() {
		return 1.1;
	}
}

class Parcel<T> {
	private T t;

	public void set(T t) {
		this.t = t;
	}

	public void shipParcel() {
		/*
		 * if (t.getWeight() > 10) //won't compile, t is of type Object
		 * System.out.println("Ship by courier ABC"); else
		 * System.out.println("Ship by courier XYZ"); }
		 */
	}
}

public class NeedForBounded {

}
