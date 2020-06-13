package com.fizzbuzz.converters;

public interface Converter {

	public boolean meetsCondition(Integer number);
	
	public String convert(Integer number);
	
}
