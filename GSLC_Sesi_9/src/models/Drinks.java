package models;

public abstract class Drinks implements DisplayDrinks{
	String name;
	Integer price;
	
	public Drinks(String name, Integer price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}
	
	
	@Override
	public void displayInfo() {
		// TODO Override dari Interface
	}
	
	
}
