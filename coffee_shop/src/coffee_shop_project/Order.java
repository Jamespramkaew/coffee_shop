package coffee_shop_project;

public class Order {
	private Item item;
	private int number;
	private double resultPrice = 0.0;
	
	public Order(Item itm, int n) {
		this.item = itm;
		this.number = n;
		this.addItem();
	}
	
	public void addItem() {
		this.resultPrice = this.number * this.item.getPrice();
	}
	
	public Item getItem() {
		return this.item;
	}
	
	public int getNumber() {
		return this.number;
	}
	
	public double getRP() {
		return this.resultPrice;
	}
	
	//Test
	public double getResultP() {
		return this.resultPrice;
	}
}
