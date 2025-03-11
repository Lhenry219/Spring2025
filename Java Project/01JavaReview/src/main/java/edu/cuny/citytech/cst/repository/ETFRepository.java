<<<<<<< HEAD
package edu.cuny.citytech.cst.repository;

import java.util.ArrayList;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import com.learning.java.data.repository.ExcelRepository;


import edu.cuny.citytech.cst.gpa.DTO.ETF;

public class ETFRepository {

	static List<ETF> etfList = new ArrayList<>();
	
	static {
		String fileName = System.getenv("CST_3613_STOCK_DATA")+ "/etf/Top ETFs by Quant 2025-01-16.xlsx";
		
		//developer: Henry Liu
		var repository = new ExcelRepository<ETF>(fileName, 0, 1);
		repository.populate(ETF.class, etfList::add);
	}
	public List<ETF> findAll(){
		return etfList;
	}
	public List<ETF> find(Predicate<ETF> predicate){
		return etfList.stream().filter(predicate).toList();
	}
}
=======
package edu.cuny.citytech.cst.repository;

import java.util.ArrayList;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import com.learning.java.data.repository.ExcelRepository;


import edu.cuny.citytech.cst.gpa.DTO.ETF;

public class ETFRepository {

	static List<ETF> etfList = new ArrayList<>();
	
	static {
		String fileName = System.getenv("CST_3613_STOCK_DATA")+ "/etf/Top ETFs by Quant 2025-01-16.xlsx";
		
		//developer: Henry Liu
		var repository = new ExcelRepository<ETF>(fileName, 0, 1);
		repository.populate(ETF.class, etfList::add);
	}
	public List<ETF> findAll(){
		return etfList;
	}
	public List<ETF> find(Predicate<ETF> predicate){
		return etfList.stream().filter(predicate).toList();
	}
}
>>>>>>> 579b0bf1a55d39c60fe7beceaa336e584357bda4
