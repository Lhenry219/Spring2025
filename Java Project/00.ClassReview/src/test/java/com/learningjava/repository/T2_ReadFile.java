
package com.learningjava.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.learningjava.dto.User;
import com.learningjava.utility.ReadFile;

public class T2_ReadFile {
	@Test
	void t1() {
		System.out.println("Developer: Henry Liu, " + new java.util.Date());
    	
	    String directory = System.getenv("cst3613data");
	      
	    String FileName = "/user-data.csv";

		ReadFile.process(directory + FileName);
	}
	@Test
	void t2() {
		
    	
	    String directory = System.getenv("cst3613data");
	      
	    String FileName = "/user-data.csv";
	    List<String> list = new ArrayList<>();
		ReadFile.process(directory + FileName, list::add);
		
	    int expected = 28;
	    int actual = list.size();

		assertEquals(expected,actual);
	}
	@Test
	void t3() {
		
    	
	    String directory = System.getenv("cst3613data");
	      
	    String FileName = "/user-data.csv";
	    List<String> list = new ArrayList<>();

		ReadFile.process(directory + FileName, list::add,1);
	    
	    int expected = 28;
	    int actual = list.size();
		assertEquals(expected,actual);
	}
	@Test
	void t4() {
		
    	
	    String directory = System.getenv("cst3613data");
	      
	    String fileName = "/user-data.csv";
	    List<User> list = new ArrayList<>();

		ReadFile.process(directory + fileName, list::add,1 ,User::populate,e -> false);
	    
	    int expected = 28;
	    int actual = list.size();
		assertEquals(expected,actual);
		
		list.stream().filter(e -> e.fullName().contains("e")).forEach(System.out::println);
	}

}

