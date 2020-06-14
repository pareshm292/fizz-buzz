package com.fizzbuzz.converters;

public class DefaultConverter implements Converter {

	@Override
	public boolean meetsCondition(Integer number) {
		return true;
	}

	@Override
	public String convert(Integer number) {
		return number.toString();
	}

}
