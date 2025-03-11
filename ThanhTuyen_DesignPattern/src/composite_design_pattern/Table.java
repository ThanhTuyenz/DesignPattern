package composite_design_pattern;

import java.util.ArrayList;
import java.util.List;

public class Table implements Item {
	private List<Item> items = new ArrayList<Item>();
	
	public void add(Item item) {
		items.add(item);
	}

	@Override
	public double getPrice() {
		double price = 0;
		for (Item item : items) {
			price += item.getPrice();
		}
		return price;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("Ban gom: \n");
		for (Item item : items) {
			sb.append(" - ").append(item.toString()).append("\n");
		}
		sb.append("Tong tien: ").append(getPrice()).append(" VND");
		return sb.toString();
	}
	

}
