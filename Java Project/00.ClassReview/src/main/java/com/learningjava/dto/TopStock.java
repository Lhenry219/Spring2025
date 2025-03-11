
package com.learningjava.dto;

public record TopStock(int rank, String symbol, String company, float quantRating,float wallStreetRating, float marketCap, float divYield) {

	public static TopStock populate(String row) {
		String columns[] = row.split(",");

		return new TopStock(Integer.parseInt(columns[0]), columns[1], columns[2],Float.parseFloat(columns[3]), Float.parseFloat(columns[4]), Float.parseFloat(columns[5]), Float.parseFloat(columns[6]));
	}

}

