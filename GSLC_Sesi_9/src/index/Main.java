package index;

import java.util.Scanner;
import java.util.Vector;

import models.Coffee;
import models.Drinks;
import models.SoftDrink;

public class Main {
	
	Vector<Drinks> drinkList = new Vector<>();
	
	Scanner scan = new Scanner(System.in);
	
	
	public Main() {
		menu();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}
	
	
	public void menu() {
		int choice = 0;
		
		do {
			System.out.println("Shop and Drinks!");
			System.out.println("1. Add Drink");
			System.out.println("2. Delete Drink");
			System.out.println("3. Exit");
			System.out.print(">> ");
			choice = scan.nextInt(); scan.nextLine();
			
			System.out.println();
			
			switch (choice) {
			case 1:
				addDrinks();
				break;
			case 2:
				deleteDrinks();
				break;
			case 3:
				
				break;
			default:
				
				break;
			}
			
		} while (choice != 3);
		
	}
	
	
	public void addDrinks() {
		String name;
		Integer price;
		Integer type;
		
		do {
			System.out.println("What kind of drink do you want to add?");
			System.out.println("1. Soft Drink");
			System.out.println("2. Coffee");
			System.out.print(">> ");
			
			type = scan.nextInt(); scan.nextLine();
			
			if(type < 1 || type > 2) {
				System.out.println("Wrong input, try again!");
				System.out.println();
			}
		} while (type < 1 || type > 2);
		
		
		do {
			System.out.print("Input drink name [> 3 characters long]: ");
			name = scan.nextLine();
			
			if (name.length() <= 3) {
				System.out.println("Name must be more than 3 characters!"); 
				System.out.println();
			}
		} while (name.length() <= 3);
		
		
		do {
			System.out.print("Input drink price [1.000 - 100.000]: ");
			price = scan.nextInt(); scan.nextLine();
			
			if (price < 1000 || price > 100000) {
				System.out.println("Price must be between 1.000 to 100.000!");
				System.out.println();
			}
		} while (price < 1000 || price > 100000);
		
		
		if(type == 1) {
			String brand;
			do {
				System.out.print("Input drink brand: ");
				brand = scan.nextLine();
				
				if (brand.isEmpty()) {
					System.out.print("Brand cannot be empty!"); scan.nextLine();
					System.out.println();
				}
			} while (brand.isEmpty());
			
			System.out.println("Successfully added new drink!");
			drinkList.add(new SoftDrink(name, price, brand));
			for (int i = 0; i < drinkList.size(); i++) {
				drinkList.get(i).displayInfo();
			}
			System.out.println();
			
		}
		else if(type == 2) {
			Double caffeine;
			do {
				System.out.print("Input drink caffeine [>= 10]: ");
				caffeine = scan.nextDouble(); scan.nextLine();
				
				if (caffeine < 10) {
					System.out.print("Caffeine must at least be 10!"); scan.nextLine();
					System.out.println();
				}
			} while (caffeine < 10);
			
			System.out.println("Successfully added new drink!");
			drinkList.add(new Coffee(name, price, caffeine));
			for (int i = 0; i < drinkList.size(); i++) {
				drinkList.get(i).displayInfo();
			}
			System.out.println();
		}
		
		
	}
	
	
	public void deleteDrinks() {
		
	}
	
	
}
