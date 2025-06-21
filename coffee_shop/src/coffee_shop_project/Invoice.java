package coffee_shop_project;

import java.util.ArrayList;

public class Invoice {
	private Person p;
	private ArrayList<Order> order;
	
	public Invoice(String name, String addrs) {
		this.p = new Person(name, addrs);
		this.order = new ArrayList();
	}
	
	public void getDisplay() {
		for (Order i : this.order) {
			System.out.printf("%8s %5.4f N: %d %5.4f\n",
					i.getItem().getName(),
					i.getItem().getPrice(),
					i.getNumber(),
					i.getRP()
					);
		}
	}

	public static void main(String[] args) {
		
		//List of shop
		Item coffee = new Item("Coffee", 0.59);
		Item tea = new Item("Tea", 0.19);
		Item dessert = new Item("coffee", 1.69);
		
		Invoice inv = new Invoice(
				"Mr.J", 
				"1/38 Cha-am ,Phatchburi 76120"
				);
		
		inv.order.add(new Order(coffee,2));
		inv.order.add(new Order(tea,1));
		inv.order.add(new Order(dessert,3));
		
		inv.getDisplay();

	}

}
