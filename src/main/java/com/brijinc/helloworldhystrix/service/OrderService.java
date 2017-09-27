/**
 * 
 */
package com.brijinc.helloworldhystrix.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.stereotype.Service;

import com.brijinc.helloworldhystrix.model.Entry;
import com.brijinc.helloworldhystrix.model.Meal;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

/**
 * Sample Spring service implementing the circuit breaker pattern. This service
 * on multiple call will result into sending the traffic directly to the
 * fallback method.
 * 
 * @author Raj Khanna, BRIJ Inc
 * @Version 1.0
 * @since 26-Sept-2017
 *
 */
@Service
@EnableCircuitBreaker
public class OrderService {

	/**
	 * Create entries and return the meal order. This method is design to trip
	 * 50% of the time.
	 * 
	 * @return
	 */
	@HystrixCommand(fallbackMethod = "fallback")
	public Meal getOrder() {
		System.out.println("Called Order");
		if (Math.random() > 0.5) {
			throw new RuntimeException("Meal not found.");
		}
		Meal meal = new Meal();
		List<Entry> entries = new ArrayList<Entry>();
		Entry entry1 = new Entry("Chiken Tikka", 15);
		Entry entry2 = new Entry("Malai Kofta", 10);
		Entry entry3 = new Entry("Sarson Da Saag", 20);
		entries.add(entry1);
		entries.add(entry2);
		entries.add(entry3);
		meal.setEntries(entries);
		return meal;
	}

	/**
	 * This is the fallback method for the get order method.
	 * 
	 * @return
	 */
	public Meal fallback() {
		System.out.println("Called fallback");
		Meal meal = new Meal();
		List<Entry> entries = new ArrayList<Entry>();
		Entry entry1 = new Entry("No Meal is ready, kitchen is closed.", -1);
		entries.add(entry1);
		meal.setEntries(entries);
		return meal;
	}
}
