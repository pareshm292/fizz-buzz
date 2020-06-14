package com.fizzbuzz;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Before;
import org.junit.Test;

import com.fizzbuzz.converters.Converters;

public class FizzBuzzTest {

	private Converters converters;

	@Before
	public void setup() {
		converters = new Converters();
	}

	@Test
	public void checkForInputWithNoConverters() {
		if(converters.getConverters().size() == 0) {
			String output = converters.convertInput(new Random().nextInt(99) + 1);
			assertEquals("" , output);
		}
		else {
			System.out.println("TestCase Passed, as Converter implementations were found.");
		}
	}
	
	
	@Test
	public void convert_numberDivisibleBy3_shouldReturnFizz() {
		
		String output = converters.convertInput(3);
		
		assertEquals("Fizz" , output);
		
		String output2 = converters.convertInput(21);
		
		assertEquals("Fizz" , output2);
		
	}
	
	@Test
	public void convert_numberDivisibleBy5_shouldReturnBuzz() {
		
		String output = converters.convertInput(5);
		
		assertEquals("Buzz" , output);
		
		String output2 = converters.convertInput(20);
		
		assertEquals("Buzz" , output2);
		
	}
	
	
	@Test
	public void convert_numberDivisibleBy3And5_shouldReturnFizzBuzz() {
		
		String output = converters.convertInput(15);
		
		assertEquals("FizzBuzz" , output);
		
		String output2 = converters.convertInput(45);
		
		assertEquals("FizzBuzz" , output2);
		
	}

}
