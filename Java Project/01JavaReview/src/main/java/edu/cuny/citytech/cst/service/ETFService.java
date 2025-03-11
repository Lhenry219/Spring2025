<<<<<<< HEAD
package edu.cuny.citytech.cst.service;

import java.util.ArrayList;
import java.util.List;

import edu.cuny.citytech.cst.gpa.DTO.ETF;
import edu.cuny.citytech.cst.gpa.DTO.ETFpoints;
import edu.cuny.citytech.cst.repository.ETFRepository;

public class ETFService {

	private List<ETF> list = new ETFRepository().findAll();
	
	public List<ETFpoints> getBestDividenstocks(){
		
		List<ETFpoints> listOfETFPoint = list.stream().map(ETFpoints::new).toList();
		
		return listOfETFPoint;
	}
}
=======
package edu.cuny.citytech.cst.service;

import java.util.ArrayList;
import java.util.List;

import edu.cuny.citytech.cst.gpa.DTO.ETF;
import edu.cuny.citytech.cst.gpa.DTO.ETFpoints;
import edu.cuny.citytech.cst.repository.ETFRepository;

public class ETFService {

	private List<ETF> list = new ETFRepository().findAll();
	
	public List<ETFpoints> getBestDividenstocks(){
		
		List<ETFpoints> listOfETFPoint = list.stream().map(ETFpoints::new).toList();
		
		return listOfETFPoint;
	}
}
>>>>>>> 579b0bf1a55d39c60fe7beceaa336e584357bda4
