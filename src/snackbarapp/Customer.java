package snackbarrapp;

public class Customer
{
	private static int maxId = 0;

	private int id;
	private String name;
	private double cashOnHand;


	public Customer(String name, double cashOnHand)
	{
		maxId++;
		id = maxId;
		this.name = name;
		this.cashOnHand = cashOnHand;
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

	public double getCashOnHand()
	{
		return cashOnHand;
	}

	public void setAddCash(double cashOnHand)
	{
		this.cashOnHand = cashOnHand + this.cashOnHand;
	}

	public void setRemainingCash(double cashOnHand, double cost)
	{
		this.cashOnHand = this.cashOnHand - cost;
	}

}