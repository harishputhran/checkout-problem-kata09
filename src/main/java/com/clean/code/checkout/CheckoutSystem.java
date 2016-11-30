package com.clean.code.checkout;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CheckoutSystem {

	public double calculateTotatlPrice(List<String> itemsForBillingAtCheckout) {
		Double totalItemPrice = Double.valueOf(0.0);
		Map<String, Double> itemPriceMap = new HashMap<>();
		itemPriceMap.put("A", Double.valueOf(50.0));
		itemPriceMap.put("B", Double.valueOf(30.0));
		int countofItemA = 0;
		Double itemADiscountedPrice = Double.valueOf(130.0);
		
		if(itemsForBillingAtCheckout != null){			
			for(String item : itemsForBillingAtCheckout){
				if("A".equals(item)){
					countofItemA++;
				}else{
					totalItemPrice += itemPriceMap.getOrDefault(item, totalItemPrice);
				}				
			}
			int numberOf3ItemAs = countofItemA/3;
			int numberOfRemainingItemA = countofItemA % 3;
			totalItemPrice += itemADiscountedPrice * numberOf3ItemAs + numberOfRemainingItemA * itemPriceMap.get("A"); 
		}		
		return totalItemPrice;
	}

}
