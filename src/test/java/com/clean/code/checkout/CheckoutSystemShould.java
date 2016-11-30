package com.clean.code.checkout;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class CheckoutSystemShould {	
	
	@Test
	public void return_price_as_0_when_no_items_at_checkout(){
		CheckoutSystem checkout = new CheckoutSystem();
		assertEquals(0.0d, checkout.calculateTotatlPrice(null), 0.0d);
	}
	
	@Test
	public void return_price_of_50__for_one_unit_of_itemA_at_checkout(){
		CheckoutSystem checkout = new CheckoutSystem();
		List<String> items = Arrays.asList("A");
		assertEquals(50.0d, checkout.calculateTotatlPrice(items), 0.0d);
	}
	
	@Test
	public void return_price_of_30__for_one_unit_of_itemA_at_checkout(){
		CheckoutSystem checkout = new CheckoutSystem();
		List<String> items = Arrays.asList("B");
		assertEquals(30.0d, checkout.calculateTotatlPrice(items), 0.0d);
	}
	
	@Test
	public void return_price_of_80_for_one_unit_of_itemA_and_itemB_at_checkout(){
		CheckoutSystem checkout = new CheckoutSystem();
		List<String> items = Arrays.asList("B", "A");
		assertEquals(80.0d, checkout.calculateTotatlPrice(items), 0.0d);
	}

}
