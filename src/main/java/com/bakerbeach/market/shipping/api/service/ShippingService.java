package com.bakerbeach.market.shipping.api.service;

import com.bakerbeach.market.core.api.model.Cart;
import com.bakerbeach.market.core.api.model.Customer;
import com.bakerbeach.market.core.api.model.ShopContext;
import com.bakerbeach.market.shipping.api.model.ShippingContext;
import com.bakerbeach.market.shipping.api.model.ShippingInfo;

public interface ShippingService {

	ShippingInfo apply(ShippingContext shippingContext) throws ShippingServiceException;

	ShippingContext createShippingContext(ShopContext shopContext, Customer customer, Cart cart)
			throws ShippingServiceException;

	/**
	 * Checks and changes shippingContext if necessary.
	 * 
	 * @param shopContext
	 * @param shippingContext
	 * @return true if context contains contractor, origin and destination
	 * @throws ShippingServiceException
	 */
	Boolean checkShippingContext(ShopContext shopContext, ShippingContext shippingContext) throws ShippingServiceException;

}