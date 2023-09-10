package com.telran.minimarket.sorting;

import java.util.Comparator;

import com.telran.minimarket.minimarket.Product;

public class ComparatorProductsByPriceReverse implements Comparator<Product> {

	@Override
	public int compare(Product p1, Product p2) {
		double pr1 = p1.getPrice();
		double pr2 = p2.getPrice();
		return Double.compare(pr2, pr1);
	}
	

}
