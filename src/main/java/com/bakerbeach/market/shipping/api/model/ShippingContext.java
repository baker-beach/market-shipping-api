package com.bakerbeach.market.shipping.api.model;

import com.bakerbeach.market.core.api.model.Address;
import com.bakerbeach.market.core.api.model.Cart;

public class ShippingContext {
	public static final String CONTEXT_KEY = "shippingContext.contextKey";

	private String currentShippingMethodCode = "";
	private Cart cart;
	private String customerId;
	private String orderId;
	private Address origin;
	private Address destination;

	public String getCurrentShippingMethodKey() {
		return currentShippingMethodCode;
	}

	public void setCurrentShippingMethodCode(String currentShippingMethodCode) {
		this.currentShippingMethodCode = currentShippingMethodCode;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	
	public Address getOrigin() {
		return origin;
	}
	
	public void setOrigin(Address origin) {
		this.origin = origin;
	}
	
	public Address getDestination() {
		return destination;
	}
	
	public void setDestination(Address destination) {
		this.destination = destination;
	}

}
