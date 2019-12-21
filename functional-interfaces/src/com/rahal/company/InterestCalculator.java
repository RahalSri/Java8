package com.rahal.company;

@FunctionalInterface
public interface InterestCalculator {
	float calculateInterestAmount(float amount, float interestRate);

}
