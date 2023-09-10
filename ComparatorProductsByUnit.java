package com.telran.minimarket.sorting;

import java.util.Comparator;

import com.telran.minimarket.minimarket.Product;

public class ComparatorProductsByUnit implements Comparator<Product> {

	@Override
	public int compare(Product p1, Product p2) {
		String unit1 = p1.getUnit();
		String unit2 = p2.getUnit();
		return unit1.compareToIgnoreCase(unit2);
	}

}
