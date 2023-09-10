package com.telran.minimarket.sorting;

import java.util.Comparator;

import com.telran.minimarket.minimarket.Product;

public class ComparatorProductsByPrice implements Comparator<Product> {

	@Override
	public int compare(Product p1, Product p2) {
		double price1 = p1.getPrice();
		double price2 = p2.getPrice();
		return Double.compare(price1, price2);
	}

}
