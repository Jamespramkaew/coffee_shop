package coffee_shop_project;

public class Person {
	private String name;
	private String Address;
	
	public Person(String name, String addrs) {
		this.name = name;
		this.Address = addrs;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getAddrs() {
		return this.Address;
	}
}
