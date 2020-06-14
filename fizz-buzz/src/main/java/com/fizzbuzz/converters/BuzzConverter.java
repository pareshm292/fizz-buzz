package com.fizzbuzz.converters;

public class BuzzConverter implements Converter {

	private String CONVERTED_VALUE = "Buzz";
	
	@Override
	public boolean meetsCondition(Integer number) {
		return number % 5 == 0;
	}

	@Override
	public String convert(Integer number) {
		return CONVERTED_VALUE;
	}

}
