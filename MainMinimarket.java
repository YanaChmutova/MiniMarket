import com.telran.minimarket.minimarket.*;
import com.telran.minimarket.sorting.ISortingCriteria;


public class MainMinimarket {
public static void main(String[] args) 
{
Product p1 = 
new Product("Milk", 1.99, "Litre", 1001);
Product p2 = 
new Product("Bread", 2.49, "Loaf", 1002);
Product p3 = 
new Product("Eggs", 3.75, "Dozen", 1003);
Product p4 = 
new Product("Apples", 0.99,"Kilogram",1004);
Product p5 = 
new Product("Pasta", 1.25, "Pack", 1005);
Product p6 = 
new Product("Rice", 2.75, "Kilogram", 1006);
Product p7 = 
new Product("Yogurt", 0.89, "Cup", 1007);

Minimarket mini = 
new Minimarket("Igor",
		     "Ben Gurion 25,Rehovot",200);
mini.addProduct(p1, 20);
mini.addProduct(p2, 15);
mini.addProduct(p3, 10);
mini.addProduct(p4, 200);
mini.addProduct(p5, 30);
mini.addProduct(p6, 15.5);
mini.addProduct(p7, 50);

mini.displayProducts();
Product p8 = 
new Product("Rice", 2.75,"Kilogram",1006);
mini.addProduct(p8, 10);
mini.displayProducts();

mini.removeProduct(1004,50);
mini.displayProducts();
mini.findProduct(1002);

mini.changePrice(1002,2.51);
mini.findProduct(1002);

double cost = mini.getTotalCost();
System.out.println("Total cost= "+cost);
System.out.printf("Total cost= %.2f\n",cost);
mini.sortProductsBy(ISortingCriteria.SORT_BY_PRICE);
mini.displayProducts();

mini.sortProductsBy(ISortingCriteria.SORT_BY_PRICE_REVERSE);
mini.displayProducts();

mini.sortProductsBy(ISortingCriteria.SORT_BY_CODE);
mini.displayProducts();

mini.sortProductsBy(ISortingCriteria.SORT_BY_CODE_REVERSE);
mini.displayProducts();

mini.sortProductsBy(ISortingCriteria.SORT_BY_NAME);
mini.displayProducts();

mini.sortProductsBy(ISortingCriteria.SORT_BY_NAME_REVERSE);
mini.displayProducts();

mini.sortProductsBy(ISortingCriteria.SORT_BY_PRICE);
mini.displayProducts();

mini.sortProductsBy(ISortingCriteria.SORT_BY_PRICE_REVERSE);
mini.displayProducts();

mini.sortProductsBy(ISortingCriteria.SORT_BY_UNIT);
mini.displayProducts();

mini.sortProductsBy(ISortingCriteria.SORT_BY_UNIT_REVERSE);
mini.displayProducts();

mini.sortProductsBy(ISortingCriteria.SORT_BY_QUANTITY);
mini.displayProducts();

mini.sortProductsBy(ISortingCriteria.SORT_BY_QUANTITY_REVERSE);
mini.displayProducts();

}
}
/*
    Product
    ------
    name(String)
    price(double)
    unit(String)
    code(int)
    quantity(double)
    
    set/get
    constructors
    toString()
    =============
    
    Minimarket
    ----------
    name(String)
    address(String)
    stock(ArrayList<Product>)
    set/get
    constructor
    +++++++++++
void addProduct(Product pr,double quantity)
void removeProduct(int code,double quantity)
void displayProducts()
---------------------------
homework:
public void findProduct(int code)
public void changePrice(int code,
                    double newPrice) 
advanced:
public double getTotalCost()

------------------------------
void sortProductsBy(int criteria)
...............................
...............................
...............................
    

*/