package com.ggn.probs.design.principles;

//Keep it simple stupid
public class KISS {
	// This is better solution
	public boolean isEvenOne(int input) {
		return input % 2 == 0 ? true : false;
	}

	// Over engineering
	public boolean isEvenTwo(String input) {
		int length = input.length();

		int digit = input.charAt(length - 1);

		if (digit == 0 || digit == 2 || digit == 4 || digit == 6 || digit == 8)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {

	}

}
