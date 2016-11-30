package com.clean.code.checkout;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.clean.code.checkout.item.Item;
import com.clean.code.checkout.item.ItemCodeEnum;

/**
 * Class responsible for determining Pricing for Products at Checkout
 * 
 * @author hputhr
 *
 */
public class CheckoutSystem {

	/**
	 * Method that calculates the total price for items in Checkout Page.
	 * 
	 * @param List<Item>
	 * @return double
	 */
	public Double calculateTotatlPrice(List<Item> itemsForBillingAtCheckout) {
		Double totalItemPrice = Double.valueOf(0.0);
		if(itemsForBillingAtCheckout != null){
			Map<ItemCodeEnum, Item> itemQuantityMap = mapEachItemAndItsQuantity(itemsForBillingAtCheckout);
			return determineFinalPriceForOrderedItems(itemQuantityMap);
		}		
		return totalItemPrice;
	}

	/**
	 * Method to map each itemcode with its total quantity.
	 * 
	 * @param List<Item>
	 * @return Map<ItemCodeEnum, Item>
	 */
	protected Map<ItemCodeEnum, Item> mapEachItemAndItsQuantity(List<Item> itemsForBillingAtCheckout) {
		Map<ItemCodeEnum, Item> itemQuantityMap = new HashMap<>(itemsForBillingAtCheckout.size());
		for(Item item : itemsForBillingAtCheckout){
			item.addQuantity();
			itemQuantityMap.put(item.getItemCode(), item);
		}
		return itemQuantityMap;
	}
	
	/**
	 * Method that determines the final price based on the item code 
	 * and its final quantity along with the discounts if applicable.
	 * 
	 * @param Map<ItemCodeEnum, Item>
	 * @return Double
	 */
	protected Double determineFinalPriceForOrderedItems(Map<ItemCodeEnum, Item> itemQuantityMap) {
		Double totalItemPrice = Double.valueOf(0.0);
		for(ItemCodeEnum itemCode : itemQuantityMap.keySet()){
			totalItemPrice += itemQuantityMap.get(itemCode).getTotalPrice();
		}
		return totalItemPrice;
	}
}
