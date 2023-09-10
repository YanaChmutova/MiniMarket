import java.util.ArrayList;

public class Minimarket {
	private String name;
	private String address;
	private ArrayList <Product> stock = null;
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
	public Minimarket(String name, String address, int maxNames) {
		super();
		this.name = name;
		this.address = address;
		stock = new ArrayList<Product>(maxNames);
	}
public void addProduct(Product pr, double quantity) {
	boolean isExists = stock.contains(pr);
	if(isExists == false) {
		pr.setQuantity(quantity);
		stock.add(pr);
	}
	else {
		int index = stock.indexOf(pr);
		Product curr = stock.get(index);
		double currQ = curr.getQuantity();
		currQ+=quantity;
		curr.setQuantity(currQ);
	}
	stock.sort(null);
}
public void displayProducts() {
	
	
	System.out.println("============");
	System.out.println("Minimarket: " + name);
	System.out.println("Address: " + address);
	System.out.println("\tProducts: ");
	for(Product p : stock) {
		System.out.println(p);
		System.out.println("------------");
	}
	System.out.println("============");
}
public void removeProduct(int code, double quantity) {
	for(Product p: stock) {
		if(p.getCode() == code) {
			double currQ = p.getQuantity();
			if(currQ > quantity) {
				currQ-=quantity;
			}
			else {
				currQ = 0;
			}
			p.setQuantity(currQ);
			return;
		}	
	}
	System.out.println("*****************");
	System.out.println("Error! Wrong code->" + code);
	System.out.println("*****************");
}
public void findProduct(int code) {
	for(Product p: stock) {
		if(p.getCode() == code) {
			//System.out.println("Code:  " + code + " Name: " + p.getName() + " Price: " + p.getPrice() + " Unit: " + p.getUnit() + " Quantity: " + p.getQuantity());
			System.out.println("Code:  " + code + p.toString());
			return;
		}
		}
		System.out.println("*****************");
		System.out.println("Error! Wrong code->" + code);
		System.out.println("*****************");
}

public void changeNewPrice(int code, double price) {
	for(Product p: stock) {
		if(p.getCode() == code) {
			//System.out.println("Code:  " + code + " Name: " + p.getName() + " Price: " + p.getPrice() + " Unit: " + p.getUnit() + " Quantity: " + p.getQuantity());
			System.out.println("Code:  " + code + p.toString());
			p.setPrice(price);
			System.out.println("Code:  " + code + p.toString());
			return;
		}
	}
	System.out.println("*****************");
	System.out.println("Error! Wrong code->" + code);
	System.out.println("*****************");
}
public double getTotalCost() {
	double sum = 0;
	for(Product p: stock) {
		sum = sum + p.getPrice()*p.getQuantity();
	}
	return sum;
}
public void sortProductsBy(int criteria) {
	switch(criteria) {
	case ISortingCriteria.SORT_BY_NAME_REVERSE:
		break;
	}
}
}
