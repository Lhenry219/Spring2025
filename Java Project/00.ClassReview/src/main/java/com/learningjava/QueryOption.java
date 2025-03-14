package com.learningjava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

import com.learningjava.dto.TopStock;
import com.learningjava.dto.User;
import com.learningjava.repository.TopStockFunction;
import com.learningjava.utility.ReadFile;

public class QueryOption {
	private final static String directory = System.getenv("CST_3613_STOCK_DATA");
	
	static Map<String,Consumer<String>> map = new HashMap<>();
	
	static {
		map.put("-users",QueryOption::users);
		map.put("-topStocks",QueryOption::topStocks);
		map.put("-aboutMe",QueryOption::aboutMe);
	}
	
	private static void topStocks(String query) {
		

	    String fileName = "/Top Rated Stocks 2025-02-01.csv";
	    List<TopStock> list = new ArrayList<>();
	    ReadFile.process(directory + fileName, list::add, 1, TopStock::populate);

	    list.forEach(System.out::println);
	}
	private static void users(String query) {
		
	    String fileName = "/user-data.csv";
	    List<User> list = new ArrayList<>();
		ReadFile.process(directory + fileName, list::add,1 ,User::populate);
	    list.stream().forEach(System.out::println);
	}
	private static void aboutMe(String query) {
		System.out.println("Henry Liu love java");
	}

}
