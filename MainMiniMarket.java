public class MainMiniMarket {

	public static void main(String[] args) {
		Product food1 = new Product("Apple", 0.99, "pcs", 2001);
        Product food2 = new Product("Banana", 0.49, "pcs", 2002);
        Product food3 = new Product("Bread", 2.49, "pcs", 2003);
        Product food4 = new Product("Cheese", 3.99, "g", 2004);
        Product food5 = new Product("Milk", 1.99, "l", 2005);
        Product food6 = new Product("Pasta", 1.79, "pcs", 2006);
        Product food7 = new Product("Yogurt", 0.89, "pcs", 2007);
        Minimarket mini = new Minimarket("IgorYasha", "Ben Gurion, 25, Rehovot", 200);
        mini.addProduct(food1, 20);
        mini.addProduct(food2, 15);
        mini.addProduct(food3, 10);
        mini.addProduct(food4, 200);
        mini.addProduct(food5, 150);
        mini.addProduct(food6, 15.5);
        mini.addProduct(food7, 50);
        mini.displayProducts();
        Product food8 = new Product("Yogurt", 0.89, "pcs", 2007);
        mini.addProduct(food8, 10);
        mini.displayProducts();
        mini.removeProduct(2000, 10);
        mini.displayProducts();   
        System.out.println("Home Work1: ****************************");
        mini.findProduct(2000);
        System.out.println("Home Work2: ****************************");
        mini.changeNewPrice(2007, 1.00);
        System.out.println("Home Work3: ****************************");
        double res =  mini.getTotalCost();
        System.out.println("Total coast = " + res + "$");
	}
}
/*
Product
-------
name(String)
price(double)
unit(String) - edinica izmereniya
code(int)
quantity(double) - kolichestvo

set/get
constructor
toString()
==============

Minimarket
----------
name(String)
address(String)
stock(ArrayList<Product>)
set/get
constructor
+++++++++++
void addProduct(Product pr, double quantity)
void removeProduct(int code,double quantity)
void displayProducts()
-------------------------
HomeWork
public void findProduct(int code)
public void changeNewPrice(int code, double price)
*advanced
public double getTotalCost() - obshaya stoimost vseh tovarov v stoke

---------------------------------
void sortProductsBy(int criteria)
.................................
.................................
.................................






*/