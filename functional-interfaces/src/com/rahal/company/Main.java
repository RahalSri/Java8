package com.rahal.company;

public class Main {

	public static void main(String[] args) {
		InterestCalculator x = (a, b) ->{
			return a*b;
		};

		float f = x.calculateInterestAmount(3, 9);
		System.out.println(f);
	}

}
