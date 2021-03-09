package snackbarapp;

public class Main
{
	public static void main(String[] args)
	{
		System.out.println("Welcome to your Local Snack Bar");

		Customer c1 = new Customer("Jane", 37.75);
		Customer c2 = new Customer("Bob", 45.75);

		Snack s1 = new Snack("Soda", 19, 2.50, 0);
		Snack s2 = new Snack("Water", 20, 2.75, 0);
		Snack s3 = new Snack("Chips", 36, 1.75, 1);
		Snack s4 = new Snack("Chocolate Bar", 35, 1.00, 1);
		Snack s5 = new Snack("Pretzel", 38, 2.00, 1);

		Vendingmachine v0 = new Vendingmachine("Drinks");
		Vendingmachine v1 = new Vendingmachine("Food");
		System.out.println();

		System.out.println(c1.getName() + " cash on hand " + c1.getCashOnHand());
		s1.setAddQuantity(2);
		System.out.println("Quantity of " + s1.getName() + " is " + s1.getQuantity());
		System.out.println();

		c1.setRemainingCash(2.00);
		System.out.println(c1.getName() + " cash on hand " + c1.getCashOnHand());
		s5.setBuySnack(9);
		System.out.println("Quantity of " + s5.getName() + " is " + s5.getQuantity());
		System.out.println();

		c2.setRemainingCash(17.61);
		System.out.println(c2.getName() + " cash on hand " + c2.getCashOnHand());
		s1.setBuySnack(2);
		System.out.println("Quantity of " + s1.getName() + " is " + s1.getQuantity());
		System.out.println();

		c1.setAddCash(10.00);
		System.out.println(c1.getName() + " cash on hand " + c1.getCashOnHand());
		System.out.println();

		c1.setRemainingCash(1.00);
		System.out.println(c1.getName() + " cash on hand " + c1.getCashOnHand());
		System.out.println("Quantity of " + s4.getName() + " is " + s4.getQuantity());
		System.out.println();

		s5.setAddQuantity(12);
		System.out.println("Quantity of " + s5.getName() + " is " + s5.getQuantity());
		System.out.println();

		c2.setRemainingCash(6.00);
		System.out.println(c2.getName() + " cash on hand " + c2.getCashOnHand());
		s5.setBuySnack(3);
		System.out.println("Quantity of " + s5.getName() + " is " + s5.getQuantity());
		System.out.println();

// Stretch goal
		
		System.out.println("Snack: " + s3.getName());
		System.out.println("Vending Machine: " + v1.getName());
		System.out.println("Quantity: " + s3.getQuantity());
		System.out.println("Total Cost: " + "$"+ s3.getTotal(s3.getCost(), s3.getQuantity()));
		System.out.println();

		System.out.println("Snack: " + s4.getName());
		System.out.println("Vending Machine: " + v1.getName());
		System.out.println("Quantity: " + s4.getQuantity());
		System.out.println("Total Cost: " + "$"+ s4.getTotal(s4.getCost(), s4.getQuantity()));
		System.out.println();

		System.out.println("Snack: " + s5.getName());
		System.out.println("Vending Machine: " + v1.getName());
		System.out.println("Quantity: " + s5.getQuantity());
		System.out.println("Total Cost: " + "$"+ s5.getTotal(s5.getCost(), s5.getQuantity()));
		System.out.println();

		System.out.println("Snack: " + s1.getName());
		System.out.println("Vending Machine: " + v0.getName());
		System.out.println("Quantity: " + s1.getQuantity());
		System.out.println("Total Cost: " + "$"+ s1.getTotal(s1.getCost(), s1.getQuantity()));
		System.out.println();

		System.out.println("Snack: " + s2.getName());
		System.out.println("Vending Machine: " + v0.getName());
		System.out.println("Quantity: " + s2.getQuantity());
		System.out.println("Total Cost: " + "$"+ s2.getTotal(s2.getCost(), s2.getQuantity()));
		System.out.println();

	}	
}