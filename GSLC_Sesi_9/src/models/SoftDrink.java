package models;

public class SoftDrink extends Drinks{
	private String brand;

	public SoftDrink(String name, Integer price, String brand) {
		super(name, price);
		this.brand = brand;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	
	@Override
	public void displayInfo() {
		// TODO Auto-generated method stub
	}
}
