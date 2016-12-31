package com.bakerbeach.market.shipping.api.service;

import com.bakerbeach.market.shipping.api.model.ShippingContext;
import com.bakerbeach.market.shipping.api.model.ShippingInfo;

public interface ShippingMethod {

	ShippingInfo apply(ShippingContext context) throws ShippingMethodException;

}
