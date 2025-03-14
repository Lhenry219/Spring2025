
package com.learningjava.repository;

import java.util.List;
import java.util.function.Function;

import com.learningjava.dto.TopStock;

public class TopStockFunction {
	
	// the objective is to return the symbol of largest dividend yield
	public static Function<List<TopStock>, String> GetMax = list-> { 
		float max = Float.MIN_VALUE;
		String symbol = "N/A";
		for(TopStock topStock : list) {
			if (topStock.divYield() > max)
				max = topStock.divYield();
				symbol = topStock.symbol();
		}
		return symbol;
		};
}

