package com.fizzbuzz.converters;

public class FizzConverter implements Converter {

	private String CONVERTED_VALUE = "Fizz";
	
	private String THREE = "3";
	
	@Override
	public boolean meetsCondition(Integer number) {

		return number % 3 == 0 || number.toString().contains(THREE);
	}

	@Override
	public String convert(Integer number) {
		return CONVERTED_VALUE;
	}

}
