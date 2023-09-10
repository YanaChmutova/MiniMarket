package com.telran.minimarket.sorting;

import java.util.Comparator;

import com.telran.minimarket.minimarket.Product;

public class ComparatorProductsByName implements Comparator<Product>{

	@Override
	public int compare(Product p1, Product p2) {
		String name1 = p1.getName();
		String name2 = p2.getName();
		return name1.compareToIgnoreCase(name2);
	}


}
