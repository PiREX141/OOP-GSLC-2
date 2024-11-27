package models;

public class Coffee extends Drinks{
	private Double caffeine;

	public Coffee(String name, Integer price, Double caffeine) {
		super(name, price);
		this.caffeine = caffeine;
	}

	public Double getCaffeine() {
		return caffeine;
	}

	public void setCaffeine(Double caffeine) {
		this.caffeine = caffeine;
	}
	
	
	@Override
	public void displayInfo() {
		// TODO Auto-generated method stub
		System.out.printf("%s, %d, %s\n", name, price, caffeine);
	}
	
}
