package com.learningjava.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.function.Predicate;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.learningjava.repository.ABCRepository.ABC;

public class T1_ABCRepository {
	@Test
	@DisplayName("Count all leters")
	void T1() {
		
		var repository = new ABCRepository();
		int expected = 26;
		int actual = repository.findAll().size();
		
		repository.findAll().forEach(System.out::print);
		
		assertEquals(expected, actual);
	}
	
	@Test
	@DisplayName("Count only the vowels")
	void T2()
	{
		var repository = new ABCRepository();
		int expected = 5;
		

		var list = repository.find(ABCFunctions.isVowel);
		
		for(ABC abc : list) {
			System.out.println(abc);
		}
		int actual = list.size();
		
		assertEquals(expected, actual);
	}
	
	@Test
	@DisplayName("Count only the consonant")
	void T3()
	{
		var repository = new ABCRepository();
		int expected = 21;
		

		var list = repository.find(ABCFunctions.isConsonant);
		
		for(ABC abc : list) {
			System.out.println(abc);
		}
		int actual = list.size();
		
		assertEquals(expected, actual);
	}
	
	@Test
	@DisplayName("Count divisible of 3")
	void T4() {
		
		var repository = new ABCRepository();
		int expected = 8;
		
		var list = repository.find(ABCFunctions.isDivisibleBy3);
		
		for(ABC abc : list) {
			System.out.println(abc);
		}
		int actual = list.size();
		assertEquals(expected, actual);
	}
	
}
