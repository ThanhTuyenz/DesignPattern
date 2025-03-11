package composite_design_pattern;

public class Main {
	public static void main(String[] args) {
		Item product1 = new Product("Ca phe", 30000);
		Item product2 = new Product("Tra xanh", 20000);
		Item product3 = new Product("Banh ngot", 10000);
		
		Table table = new Table();
		table.add(product1);
		table.add(product2);
		
		Table table2 = new Table();
		table2.add(product3);
		table2.add(product2);
		
		System.out.println(table);
		System.out.println("\n" + table2);
	}

}
