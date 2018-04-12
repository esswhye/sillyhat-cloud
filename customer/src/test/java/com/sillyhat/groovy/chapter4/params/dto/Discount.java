package com.sillyhat.groovy.chapter4.params.dto;

import lombok.Data;

@Data
public class Discount {
	private final Customer customer;

	public Discount(Customer customer) {
		this.customer = customer;
	}

	public int calculateDiscountPercentFor(Product product, Order ofOrder) {
		if (customer.getBonusPoints() > 20000) {
			return 100;
		}
		if (customer.getBonusPoints() > 4000) {
			return 75;
		}
		if (product.isDailyDeal()) {
			return 50;
		}
		int orderDiscount = 0;
		if (ofOrder.getTotalPrice() >= 200) {
			orderDiscount = 10;
		}
		int actualDiscount = Math.max(orderDiscount,
				product.getDiscountPercent());

		if (customer.isVip()) {
			return Math.max(15, actualDiscount);
		}

		// Normal case
		return actualDiscount;
	}
}
