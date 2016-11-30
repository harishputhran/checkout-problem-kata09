package com.clean.code.checkout;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.clean.code.checkout.item.Item;
import com.clean.code.checkout.item.ItemCodeEnum;

public class CheckoutSystem {

	public double calculateTotatlPrice(List<Item> itemsForBillingAtCheckout) {
		Double totalItemPrice = Double.valueOf(0.0);
		Map<ItemCodeEnum, Item> itemQuantityMap = null;
		if(itemsForBillingAtCheckout != null){
			itemQuantityMap = new HashMap<>();
			for(Item item : itemsForBillingAtCheckout){
				item.addQuantity();
				itemQuantityMap.put(item.getItemCode(), item);
			}
			
			for(ItemCodeEnum itemCode : itemQuantityMap.keySet()){
				totalItemPrice += itemQuantityMap.get(itemCode).getTotalPrice();
			}
		}		
		return totalItemPrice;
	}
}
