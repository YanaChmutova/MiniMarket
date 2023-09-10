package com.telran.minimarket.sorting;

import java.util.Comparator;

import com.telran.minimarket.minimarket.Product;

public class ComparatorProductsByCode implements Comparator<Product>{

	@Override
	public int compare(Product p1, Product p2) {
	int code1 = p1.getCode();
	int code2 = p2.getCode();
		return Integer.compare(code1, code2);
	}

}
