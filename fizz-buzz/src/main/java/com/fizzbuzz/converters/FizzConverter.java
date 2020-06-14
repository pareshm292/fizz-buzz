package com.fizzbuzz.converters;

public class FizzConverter implements Converter {

	private String CONVERTED_VALUE = "Fizz";
	
	@Override
	public boolean meetsCondition(Integer number) {

		return number % 3 == 0;
	}

	@Override
	public String convert(Integer number) {
		return CONVERTED_VALUE;
	}

}
