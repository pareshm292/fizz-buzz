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

}
