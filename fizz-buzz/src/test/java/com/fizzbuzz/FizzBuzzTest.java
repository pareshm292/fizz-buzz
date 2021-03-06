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
		
		System.out.println("***** Sanity Check TEST for no converters present *****");
		
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


	@Test
	public void convert_numberNotDivisibleBy3Or5_shouldReturnItself() {

		String output = converters.convertInput(11);

		assertEquals("11" , output);

		String output2 = converters.convertInput(44);

		assertEquals("44" , output2);

	}

	@Test(expected = IllegalArgumentException.class)
	public void convert_numberLessThan1_shouldThrowError() {

		String output = converters.convertInput(-5);

		assertEquals("-5" , output);

		String output2 = converters.convertInput(-88);

		assertEquals("44" , output2);

	}
	
	@Test
	public void convert_numberNotDivisibleBy3ButContains3_shouldReturnFizz() {

		String output = converters.convertInput(23);

		assertEquals("Fizz" , output);

		String output2 = converters.convertInput(43);

		assertEquals("Fizz" , output2);

	}
	
	
	@Test
	public void convert_numberNotDivisibleBy5ButContains5_shouldReturnBuzz() {

		String output = converters.convertInput(52);

		assertEquals("Buzz" , output);

		String output2 = converters.convertInput(56);

		assertEquals("Buzz" , output2);

	}

	/*
	 * No Assertions in this test, it is just to print output..
	 */
	@Test
	public void printOutputFor1To100() {

		System.out.println("***** PRINTING OUTPUT FOR 1 - 100 *****");
		
		for(int i = 1 ; i <= 100 ; i++) {
			System.out.println(converters.convertInput(i));
		}

		System.out.println("***** END *****");
	}

}
