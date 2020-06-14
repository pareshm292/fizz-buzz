package com.fizzbuzz.converters;

public class FizzBuzzConverter implements Converter {

	private String CONVERTED_VALUE = "FizzBuzz";
	
	@Override
	public boolean meetsCondition(Integer number) {
		return (number % 5 == 0) && (number % 3 == 0);
	}

	@Override
	public String convert(Integer number) {
		return CONVERTED_VALUE;
	}

}
