package com.agile.calculator;

import com.agile.utils.Utils;

public class Calculator {

	public int divide(String n1) {
		int result = -9999;		
		String separator = ",";
		// if doesn't contain a comma call this
		if(!n1.contains(","))
			separator = String.format("%s", Utils.validSeperator(n1));    // slows down test
		String[] numbers = n1.split(separator);
		for(String number : numbers) {
			if(!Utils.isNumeric(number)) {  
				return result;
			}
		}
		result = Utils.toNumber(numbers[0]) / Utils.toNumber(numbers[1]);
		return result;
	}
	
	public int multiply(String n1) {
		int result = -9999;		
		String[] numbers = n1.split(",");	
		for(String number : numbers) {
			if(!Utils.isNumeric(number)) {  // check number is valid
				return result;
			}
		}
		result = Utils.toNumber(numbers[0]) * Utils.toNumber(numbers[1]);
		return result;
	}
	
	public int subtract(String n1) {
		int result = -9999;		
	
		String[] numbers = n1.split(",");
		for(String number : numbers) {
			if(!Utils.isNumeric(number)) {  // check number is valid
				return result;
			}
		}
		result = Utils.toNumber(numbers[0]) - Utils.toNumber(numbers[1]);
		return result;
	}
	
	public int add(String n1) {
		int result = 0;
		
		if (n1.length() == 0) {
			return result;
		}else if (Utils.isNumeric(n1)) {
			return Utils.toNumber(n1);
		}

		String[] numbers = n1.split("[\n,]");
		
		for(String number : numbers) {
			if(!Utils.isNumeric(number)) {  // check number is valid
				return result;
			} else {
				int toNumber = Utils.toNumber(number);
				if (toNumber < 0) {
					throw new RuntimeException("Negative numbers not allowed");
				}
				result += toNumber;
			}
		}
		
		return result;
	}
}
