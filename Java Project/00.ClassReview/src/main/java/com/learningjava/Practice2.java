
package com.learningjava;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;


public class Practice2 extends Practice1{
	
	static boolean booboo(Integer yyy) {
		
		return yyy % 3 == 0;
	}
	static boolean _5(Integer input)
	{
		return input % 5 ==0;
	}
	static boolean isGreaterThan50(Integer input)
	{
		return input > 50;
	}
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i = 1; i < 101; i++)
		{
			list.add(i);
		}
		
		Predicate<Integer> evenNumbers = e-> e % 2 ==0 ;
		
		List<Integer>filterList= list.stream()
				.filter(Practice2::_5)
				.filter(Practice2::isGreaterThan50)
				.filter(evenNumbers)
				.filter(e-> e % 30 == 0)
				.toList();
		
		System.out.println("filterList: " + filterList);

		
		
		
	}
	public static void e2(String[] args) {
		List<Integer> number = new ArrayList<Integer>();
		number.add(3);
		number.add(13);
		number.add(103);
		
		float total = 0,average;
		for(Integer current : number) {
			total = total + current;
		}
		
		average = total/number.size();
		System.out.println("total= " + total);
		System.out.println("average= " + average);
	}

	public static void e1() {
		// TODO Auto-generated method stub
		List data = new ArrayList();
		
		data.add("apple");
		data.add("Microsoft");
		data.add(45);
		data.add(100);
		data.add(new Float(3));
		
		float total = 0;
		for(Object currentRow : data) {
			if(currentRow instanceof Float)
			total = total + (float)currentRow;
			if(currentRow instanceof Integer) 
				total = total + (int)currentRow;
			
		}
		System.out.println("total= " + total);
	}

}

