package com.interview.finalUse;

 class ImmutablePhoneNumber {

	 //Immutable
	private final long number;
	private final int areaCode;
	
	private ImmutablePhoneNumber(long number, int areaCode) {
		super();
		this.number = number;
		this.areaCode = areaCode;
	}

	//factory method
	public static ImmutablePhoneNumber create(long number, int areaCode) {
		
		return new ImmutablePhoneNumber(number, areaCode);
	}
	
	@Override
	public String toString() {
		return "ImmutablePhoneNumber [number=" + number + ", areaCode=" + areaCode + "]";
	}
	

}
 

 public class OutsideClassImmutablePhoneNumber {
	 public static void main(String[] args) {
			
		 //wont compile;
//		   ImmutablePhoneNumber imp = new ImmutablePhoneNumber(8447518252l, 91);
//			System.out.println(imp);
			
			ImmutablePhoneNumber im = ImmutablePhoneNumber.create(8447518252l, 91);
			System.out.println(im);
	
		}
	 
 }