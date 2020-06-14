package com.fizzbuzz.converters;

public class BuzzConverter implements Converter {

	private String CONVERTED_VALUE = "Buzz";
	
	private String FIVE = "5";
	
	@Override
	public boolean meetsCondition(Integer number) {
		return number % 5 == 0 || number.toString().contains(FIVE);
	}

	@Override
	public String convert(Integer number) {
		return CONVERTED_VALUE;
	}

}
