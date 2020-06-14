package com.fizzbuzz.converters;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Converters {

	private List<Converter> converters ;
	
	public Converters() {
		this.converters = new ArrayList<Converter>(Arrays.asList(
				new FizzBuzzConverter(),
				new FizzConverter(),
				new BuzzConverter(),
				new DefaultConverter()
				));
		
	}
	
	public String convertInput(Integer number) {
		
		if(number < 1) {
			throw new IllegalArgumentException("Number cannot be less than 1.");
		}
		
		for (Converter converter : converters) {
			if(converter.meetsCondition(number)) {
				return converter.convert(number);
			}
		}
		
		System.out.println("Converter not found.");
		return "";
	}

	public List<Converter> getConverters() {
		return converters;
	}
	
	
}
	
