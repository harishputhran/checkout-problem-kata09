package com.clean.code.checkout;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class CheckoutSystemShould {	
	
	@Test
	public void should_Return_0_When_No_Items_During_Checkout(){
		CheckoutSystem checkout = new CheckoutSystem();
		assertEquals(0, checkout.calculateTotatlPrice(null));
	}

}
