package com.syne.demo;

public class Employee {

	private int id;
	private int deptId;
	private String name;
	private double salary;
	private double bonus;
	private double calcultedSal;

	public Employee(int id, int deptId, String name, double salary, double bonus) {
		super();
		this.id = id;
		this.deptId = deptId;
		this.name = name;
		this.salary = salary;
		this.bonus = bonus;
		this.calcultedSal = salary + salary * bonus;
	}

	public Employee(int id, int deptId, String name, double salary) {
		super();
		this.id = id;
		this.deptId = deptId;
		this.name = name;
		this.salary = salary;
		this.calcultedSal = salary + salary * bonus;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public int getDeptId() {
		return deptId;
	}

	public double getBonus() {
		return bonus;
	}
	
	public double getCalcultedSal() {
		return calcultedSal;
	}

}