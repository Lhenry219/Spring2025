<<<<<<< HEAD
package edu.cuny.citytech.cst.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import java.util.function.Predicate;

import org.junit.jupiter.api.Test;

import edu.cuny.citytech.cst.gpa.DTO.ETF;


public class T1_ETFRepository {
	@Test 
	public void t1(){
		var repository = new ETFRepository();
		
		List<ETF> list = repository.findAll();
		
		//list.forEach(System.out::println);
		
		assertTrue(list.size()> 1_500);
	}
	@Test 
	public void t2(){

	}
}
=======
package edu.cuny.citytech.cst.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import java.util.function.Predicate;

import org.junit.jupiter.api.Test;

import edu.cuny.citytech.cst.gpa.DTO.ETF;


public class T1_ETFRepository {
	@Test 
	public void t1(){
		var repository = new ETFRepository();
		
		List<ETF> list = repository.findAll();
		
		//list.forEach(System.out::println);
		
		assertTrue(list.size()> 1_500);
	}
	@Test 
	public void t2(){

	}
}
>>>>>>> 579b0bf1a55d39c60fe7beceaa336e584357bda4
