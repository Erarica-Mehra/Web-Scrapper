package com.scrapper.app.model;

import java.math.BigDecimal;

public class Item {

	private String title;
	private BigDecimal price;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Item(String title, BigDecimal price) {
		super();
		this.title = title;
		this.price = price;
	}

}
