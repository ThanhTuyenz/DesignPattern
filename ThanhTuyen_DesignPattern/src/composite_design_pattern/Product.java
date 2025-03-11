package composite_design_pattern;

public class Product implements Item {
	private String name;
	private double price;

	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return name + " : " + price + " VND";
	}

}
