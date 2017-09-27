/**
 * 
 */
package com.brijinc.helloworldhystrix.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.brijinc.helloworldhystrix.model.Meal;
import com.brijinc.helloworldhystrix.service.OrderService;

/**
 * Restaurant Rest Controller. Sample controller to depict
 * the spring rest controller implementation
 * 
 * @author Raj Khanna, BRIJ Inc
 * @Version 1.0
 * @since 26-Sept-2017
 *
 */
@RestController
public class RestaurantRestController {

	@Autowired
	private OrderService orderService;
	
	@RequestMapping(value = "/order",method = RequestMethod.GET)
	public Meal check() {
		return orderService.getOrder();
	}
}
