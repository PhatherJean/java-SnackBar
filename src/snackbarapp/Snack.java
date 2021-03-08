package snackbarapp;

public class Snack
{
	private static int maxId;

	private int id;
	private String name;
	private int quantity;
	private double cost;
	private int vendingMachineId;

	public Snack(String name, int quantity, double cost, int vendingMachineId)
	{
		maxId++;
		this.name = name;
		this.quantity = quantity;
		this.cost = cost;
		this.vendingMachineId = vendingMachineId;
	}

	public int getId()
	{
		return id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public double getCost()
	{
		return cost;
	}

	public void setCost()
	{
		this.cost = cost;
	}

	public int getQuantity()
	{
		return quantity;
	}

	public void setAddQuantity(int quantity)
	{
		this.quantity = this.quantity + quantity;
	}

	public void setBuySnack(int quantity)
	{
		this.quantity = quantity - this.quantity;
	}

	public void setTotal(double cost, int quantity)
	{
		this.cost = cost * quantity;
	}



	
}