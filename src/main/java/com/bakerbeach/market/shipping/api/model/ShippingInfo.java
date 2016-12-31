package com.bakerbeach.market.shipping.api.model;

import java.math.BigDecimal;

import com.bakerbeach.market.core.api.model.TaxCode;

public class ShippingInfo {

	private String shippingMethodKey;
	private BigDecimal charges;
	private TaxCode taxCode;

	public ShippingInfo(String shippingMethodKey) {
		this.shippingMethodKey = shippingMethodKey;
	}

	public String getShippingMethodKey() {
		return shippingMethodKey;
	}

	public void setShippingMethodKey(String shippingMethodKey) {
		this.shippingMethodKey = shippingMethodKey;
	}

	public BigDecimal getCharges() {
		return charges;
	}

	public void setCharges(BigDecimal charges) {
		this.charges = charges;
	}
	
	public TaxCode getTaxCode() {
		return taxCode;
	}
	
	public void setTaxCode(TaxCode taxCode) {
		this.taxCode = taxCode;
	}

}
