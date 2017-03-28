package com.bakerbeach.market.shipping.api.service;

import com.bakerbeach.market.core.api.model.Cart;
import com.bakerbeach.market.core.api.model.Customer;
import com.bakerbeach.market.core.api.model.ShopContext;
import com.bakerbeach.market.shipping.api.model.ShippingContext;
import com.bakerbeach.market.shipping.api.model.ShippingInfo;

public interface ShippingService {

	ShippingContext createShippingContext(ShopContext shopContext, Customer customer, Cart cart)
			throws ShippingServiceException;

	Boolean checkShippingContext(ShopContext shopContext, Customer customer, Cart cart, ShippingContext shippingContext)
			throws ShippingServiceException;

	ShippingInfo apply(ShippingContext shippingContext) throws ShippingServiceException;

	@Deprecated
	Boolean checkShippingContext(ShopContext shopContext, ShippingContext shippingContext)
			throws ShippingServiceException;

}