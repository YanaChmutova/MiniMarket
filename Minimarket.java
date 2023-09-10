package com.telran.minimarket.minimarket;

import java.util.ArrayList;

import com.telran.minimarket.sorting.*;

public class Minimarket {
private String name;
private String address;
private ArrayList<Product> stock = null;

public Minimarket(String name, 
		String address,int maxNames) {
	super();
this.name = name;
this.address = address;
stock = new ArrayList<Product>(maxNames);
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
///////////////////////////////////////////
public void addProduct(Product pr,
		           double quantity)
{
	boolean isExists = stock.contains(pr);
	if(isExists == false)
	{
		pr.setQuantity(quantity);
		stock.add(pr);
	}
	else {
		int index = stock.indexOf(pr);
		Product curr = stock.get(index);
		double currQ = curr.getQuantity();
		currQ += quantity;
		curr.setQuantity(currQ);
	}
	stock.sort(null);	
}
//////////////////////////////////////////
public void displayProducts()
{
System.out.println("==================");
System.out.println("Name: " + name);
System.out.println("Address: " + address);
System.out.println("\tProducts:");
for(Product p: stock)
{
	System.out.println(p);
	System.out.println("------------");
}
System.out.println("==================");
}
//////////////////////////////////////////
public void 
removeProduct(int code,double quantity)
{
for(Product p : stock)
{
	if(p.getCode() == code)
	{
		double currQ = p.getQuantity();
		if(currQ > quantity)
		{
			currQ -= quantity;
		}
		else {
			currQ = 0;
		}
		p.setQuantity(currQ);
		return;
	}
}
System.out.println("********************");
System.out.println("ERROR: wrong code->" 
                                  + code);
System.out.println("********************");
}
///////////////////////////////////////
public void findProduct(int code)
{
	for(Product pr : stock)
	{
		if(pr.getCode() == code)
		{
			System.out.println("====================");
			System.out.println(pr);
			System.out.println("====================");
			return;
		}
	}
System.out.println("********************");
System.out.println("ERROR: wrong code->" 
	                            + code);
System.out.println("********************");
}
///////////////////////////////////////////////////
public void changePrice(int code,
		             double newPrice)
{
	for(Product pr : stock)
	{
		if(pr.getCode() == code)
		{
			pr.setPrice(newPrice);
			return;
		}
	}
System.out.println("********************");
System.out.println("ERROR: wrong code->" 
	                            + code);
System.out.println("********************");
}
/////////////////////////////////////////
public double getTotalCost()
{
	double totalCost = 0;
	for(Product pr : stock)
	{
		double q = pr.getQuantity();
		double p = pr.getPrice();
		double pCost = q*p;
		totalCost += pCost;
	}
	return totalCost;
}
////////////////////////////////////
public void sortProductsBy(int criteria)
{
switch(criteria)
{
case 
  ISortingCriteria.SORT_BY_NAME_REVERSE:
	ComparatorProductsByNameReverse cmp1 = new ComparatorProductsByNameReverse();
	stock.sort(cmp1);
	break;
case
ISortingCriteria.SORT_BY_PRICE:
	ComparatorProductsByPrice cmp2 = new ComparatorProductsByPrice();
	stock.sort(cmp2);
	break;
case
ISortingCriteria.SORT_BY_CODE_REVERSE:
	ComparatorProductsByCodeReverse cmp3 = new ComparatorProductsByCodeReverse();
	stock.sort(cmp3);
	break;
case
ISortingCriteria.SORT_BY_PRICE_REVERSE:
	ComparatorProductsByPriceReverse cm4 = new ComparatorProductsByPriceReverse();
	stock.sort(cm4);
	break;
case
ISortingCriteria.SORT_BY_CODE:
	ComparatorProductsByCode cmp5 = new ComparatorProductsByCode();
	stock.sort(cmp5);
	break;	
case 
ISortingCriteria.SORT_BY_NAME:
	ComparatorProductsByName cmp6 = new ComparatorProductsByName();
	stock.sort(cmp6);
	break;	
case 
ISortingCriteria.SORT_BY_UNIT:
	ComparatorProductsByUnit cmp7 = new ComparatorProductsByUnit();
	stock.sort(cmp7);
	break;	
case 
ISortingCriteria.SORT_BY_UNIT_REVERSE:
	ComparatorProductsByUnitReverse cmp8 = new ComparatorProductsByUnitReverse();
	stock.sort(cmp8);
	break;	
case
ISortingCriteria.SORT_BY_QUANTITY:
	ComparatorProductsByQuantity cmp9 = new ComparatorProductsByQuantity();
	stock.sort(cmp9);
	break;
case
ISortingCriteria.SORT_BY_QUANTITY_REVERSE:
	ComparatorProductsByQuantityReverse cmp10 = new ComparatorProductsByQuantityReverse();
	stock.sort(cmp10);
	break;
}
}
}
