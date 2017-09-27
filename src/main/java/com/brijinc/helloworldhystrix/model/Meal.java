/**
 * 
 */
package com.brijinc.helloworldhystrix.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Sample ENtry class representing an entry in a restaurant order.
 * 
 * @author Raj Khanna, BRIJ Inc
 * @Version 1.0
 * @since 26-Sept-2017
 *
 */
public class Meal {

	/**
	 * List of entries in the meal.
	 */
	private List<Entry> entries = new ArrayList<Entry>();

	/**
	 * @return the entries
	 */
	public List<Entry> getEntries() {
		return entries;
	}

	/**
	 * @param entries
	 *            the entries to set
	 */
	public void setEntries(List<Entry> entries) {
		this.entries = entries;
	}
}
