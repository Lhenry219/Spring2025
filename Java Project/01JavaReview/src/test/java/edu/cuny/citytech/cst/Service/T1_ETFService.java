<<<<<<< HEAD
package edu.cuny.citytech.cst.Service;


import static org.junit.jupiter.api.Assertions.assertTrue;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import edu.cuny.citytech.cst.service.ETFService;
import edu.cuny.citytech.utility.CSTFunction;

public class T1_ETFService {

	@Test
	@DisplayName("Sellecting the right stock")
	public void t1()
	{
		ETFService service = new ETFService();
		
		var list = service.getBestDividenstocks();
		
		list.forEach(System.out::println);
		System.out.println("Henry Liu; row count is:  "+list.size());
		
		assertTrue(list.size() < 300 && list.size() > 20, " erro not enough data" + list.size());
		

	}

}
=======
package edu.cuny.citytech.cst.Service;


import static org.junit.jupiter.api.Assertions.assertTrue;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import edu.cuny.citytech.cst.service.ETFService;
import edu.cuny.citytech.utility.CSTFunction;

public class T1_ETFService {

	@Test
	@DisplayName("Sellecting the right stock")
	public void t1()
	{
		ETFService service = new ETFService();
		
		var list = service.getBestDividenstocks();
		
		list.forEach(System.out::println);
		System.out.println("Henry Liu; row count is:  "+list.size());
		
		assertTrue(list.size() < 300 && list.size() > 20, " erro not enough data" + list.size());
		

	}

}
>>>>>>> 579b0bf1a55d39c60fe7beceaa336e584357bda4
