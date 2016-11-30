package com.clean.code.checkout.item;

/**
 * POJO for Item.
 * 
 * @author hputhr
 *
 */
public class Item {
	
	private ItemCodeEnum itemCode;
	
	private double price = 0.0;
	
	private double quantity;
	
	private boolean isDiscountAvailable = false;
	
	private double discountEligibleQuantity = 0;
	
	private double discountPrice = 0.0;
	
	/**
	 * Constructor with ItemCode
	 * @param itemCode
	 */
	public Item(ItemCodeEnum itemCode){
		this.itemCode = itemCode;
	}

	/**
	 * Getter for itemCode.
	 * @return ItemCodeEnum
	 */
	public ItemCodeEnum getItemCode() {
		return itemCode;
	}

	/**
	 * Setter for itemCode.
	 * @param ItemCodeEnum
	 */
	public void setItemCode(ItemCodeEnum itemCode) {
		this.itemCode = itemCode;
	}

	/**
	 * Getter for price.
	 * @return double
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * Setter for price.
	 * @param double
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * Getter for isDiscountAvailable.
	 * @return boolean
	 */
	public boolean isDiscountAvailable() {
		return isDiscountAvailable;
	}

	/**
	 * Setter for isDiscountAvailable.
	 * @param boolean
	 */
	public void setDiscountAvailable(boolean isDiscountAvailable) {
		this.isDiscountAvailable = isDiscountAvailable;
	}

	/**
	 * Getter for discountEligibleQuantity.
	 * @return double
	 */
	public double getDiscountEligibleQuantity() {
		return discountEligibleQuantity;
	}

	/**
	 * Setter for discountEligibleQuantity.
	 * @param double
	 */
	public void setDiscountEligibleQuantity(double discountEligibleQuantity) {
		this.discountEligibleQuantity = discountEligibleQuantity;
	}

	/**
	 * Getter for discountPrice.
	 * @return double
	 */
	public double getDiscountPrice() {
		return discountPrice;
	}

	/**
	 * Setter for discountPrice.
	 * @param double
	 */
	public void setDiscountPrice(double discountPrice) {
		this.discountPrice = discountPrice;
	}
	
	/**
	 * Getter for quantity.
	 * @return double
	 */
	public double getQuantity() {
		return quantity;
	}	
	
	/**
	 * Method to add Quantity of an Item.
	 * 
	 */
	public void addQuantity(){
		this.quantity++;
	}
	
	@Override
	public boolean equals(Object object){
		if(this == object){
			return true;
		}
		if(object == null || object.getClass() != this.getClass()){
			return false;
		}
		Item item = (Item) object;
		return (itemCode != null && itemCode.equals(item.getItemCode()));
	}
	
	@Override
	public int hashCode(){
		return itemCode.hashCode() * (22/7);
	}
}
