/**
 * 
 */
package com.brijinc.helloworldhystrix.model;

/**
 * Sample model class for capturing ordered meal at the restaurant.
 * 
 * @author Raj Khanna, BRIJ Inc
 * @Version 1.0
 * @since 26-Sept-2017
 *
 */
public class Entry {

	/**
	 * Name of the meal entry.
	 */
	private String name;
	
	/**
	 * Price of the meal entry.
	 */
	private double price;

	/**
	 * @param name
	 * @param price
	 */
	public Entry(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}
}
