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
		int n = 0;
		double result = 0.0;
		System.out.println("==================================");
		System.out.printf("%20s\n","INVOICE");
		System.out.println("==================================");
		System.out.printf(" %-10s\n %-30s\n",this.p.getName(),this.p.getAddrs());
		System.out.println("----------------------------------");
		System.out.printf("%s %6s %12s %7s\n","Index","List","Qty","Price");
		for (Order i : this.order) {
			System.out.printf("%3d %8s %8.2f  %d  %6.2f\n",
					n++,
					i.getItem().getName(),
					i.getItem().getPrice(),
					i.getNumber(),
					i.getRP()
					);
			
			result = result + i.getResultP();
		}
		System.out.println("----------------------------------");
		System.out.printf("%25s %6.2f\n","Totle Price:", result);
		System.out.println("==================================\n");
	}

	public static void main(String[] args) {
		
		//List of shop
		Item coffee = new Item("Coffee", 0.59);
		Item tea = new Item("Tea", 0.19);
		Item dessert = new Item("coffee", 1.69);
		
		//User's Address
		Invoice inv = new Invoice(
				"Mr.J", 
				"1/38 Cha-am ,Phatchburi 76120"
				);
		
		//Order Here
		inv.order.add(new Order(coffee,2));
		inv.order.add(new Order(tea,1));
		inv.order.add(new Order(dessert,3));
		
		
		inv.getDisplay();
		
		inv.order.remove(2);
		inv.order.add(new Order(dessert,1));
		
		inv.getDisplay();
		//Order Here
	}

}
