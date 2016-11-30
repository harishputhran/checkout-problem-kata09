package com.clean.code.checkout;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import com.clean.code.checkout.item.Item;
import com.clean.code.checkout.item.ItemCodeEnum;

@RunWith(JUnit4.class)
public class CheckoutSystemShould {
	
	private Item itemA;
	private Item itemB;
	private Item itemC;
	
	@Before
	public void setUp(){
		itemA = new Item(ItemCodeEnum.A);
		itemA.setDiscountAvailable(true);
		itemA.setDiscountEligibleQuantity(3);
		itemA.setDiscountPrice(130.0d);
		itemA.setPrice(50.0d);
		
		itemB = new Item(ItemCodeEnum.B);
		itemB.setDiscountAvailable(true);
		itemB.setDiscountEligibleQuantity(2);
		itemB.setDiscountPrice(45.0d);
		itemB.setPrice(30.0d);
		
		itemC = new Item(ItemCodeEnum.C);
		itemC.setPrice(20.0d);
	}
	
	@Test
	public void return_price_as_0_when_no_items_at_checkout(){
		CheckoutSystem checkout = new CheckoutSystem();
		assertEquals(0.0d, checkout.calculateTotatlPrice(null), 0.0d);
	}
	
	@Test
	public void return_price_of_50_for_one_unit_of_itemA_at_checkout(){
		CheckoutSystem checkout = new CheckoutSystem();
		List<Item> items = Arrays.asList(itemA);
		assertEquals(50.0d, checkout.calculateTotatlPrice(items), 0.0d);
	}
	
	@Test
	public void return_price_of_30_for_one_unit_of_itemB_at_checkout(){
		CheckoutSystem checkout = new CheckoutSystem();
		List<Item> items = Arrays.asList(itemB);
		assertEquals(30.0d, checkout.calculateTotatlPrice(items), 0.0d);
	}
	
	@Test
	public void return_price_of_80_for_one_unit_of_itemA_and_itemB_at_checkout(){
		CheckoutSystem checkout = new CheckoutSystem();
		List<Item> items = Arrays.asList(itemB, itemA);
		assertEquals(80.0d, checkout.calculateTotatlPrice(items), 0.0d);
	}
	
	@Test
	public void return_discount_price_of_130_for_3_units_of_itemA_at_checkout(){
		CheckoutSystem checkout = new CheckoutSystem();
		List<Item> items = Arrays.asList(itemA, itemA, itemA);
		assertEquals(130.0d, checkout.calculateTotatlPrice(items), 0.0d);
	}

}
