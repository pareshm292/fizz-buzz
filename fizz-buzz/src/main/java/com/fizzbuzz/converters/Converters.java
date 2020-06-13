package com.fizzbuzz.converters;

import java.util.ArrayList;
import java.util.List;

public class Converters {

	private List<Converter> converters ;
	
	public Converters() {
		this.converters = new ArrayList<>();
	}
	
	public String convertInput(Integer number) {
		
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
	
