package com.syne.demo;

public class Customer {
	
	private int customerId;
	private String customerName;
	private int points;
	private int bonus;
	
	public Customer(int customerId, String customerName, int points, int bonus) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.points = points;
		this.bonus = bonus;
	}
	
	/**
	 * @return the customerId
	 */
	public int getCustomerId() {
		return customerId;
	}
	/**
	 * @return the customerName
	 */
	public String getCustomerName() {
		return customerName;
	}
	/**
	 * @return the points
	 */
	public int getPoints() {
		return points;
	}

	/**
	 * @return the bonus
	 */
	public int getBonus() {
		return bonus;
	}
	
}
