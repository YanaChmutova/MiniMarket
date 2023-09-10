

public class Product implements Comparable<Product>{
	private String name;
	private double price;
	private String unit;
	private int code;
	private double quantity = 0;
	public Product(String name, double price, String unit, int code) {
		super();
		this.name = name;
		this.price = price;
		this.unit = unit;
		this.code = code;

	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public double getQuantity() {
		return quantity;
	}
	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return " name: " + name + ", price: " + price + ", unit: " + unit + ", code: " + code + ", quantity: " + quantity;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (this.code != other.code)
			return false;
		return true;
	}
	@Override
	public int compareTo(Product other) {
		int res = this.name.compareToIgnoreCase(other.name);
		return res;
	}
	
	
}
