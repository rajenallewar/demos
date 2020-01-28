package com.syne.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Java8_ForEach_On_Streams {
	
	public static void main(String[] args) {
		
		Customer customer = new Customer(1,"SSS",200,10);
		Customer customer1 = new Customer(2,"SSS",100,0);
		Customer customer2 = new Customer(3,"SSS",150,0);
		Customer customer3 = new Customer(4,"SSS",15,10);
		Customer customer4 = new Customer(5,"SSS",500,10);
		
		List<Customer> customers = new ArrayList<Customer>();
		customers.add(customer);
		customers.add(customer1);
		customers.add(customer2);
		customers.add(customer3);
		customers.add(customer4);
		
		List<Customer> customersWithMoreThan100Points = customers
				  .stream()
				  .filter(c -> c.getPoints() > 100)
				  .collect(Collectors.toList());
		List<Customer> customersWithIdGrtThan10 = customers.stream().filter(p -> p.getCustomerId()>2).collect(Collectors.toList());
		
		List<Customer> customersWithSameName = customers.stream().filter(d->"SSS".equalsIgnoreCase
				(d.getCustomerName())).collect(Collectors.toList());
		
		
		List<Customer> customersSal = customers.stream().filter(q -> {
			int totalSalary = 0;
			if(q.getBonus() > 0 ) {
				totalSalary += q.getBonus() + (q.getBonus() * q.getPoints());
				return true;
			} else {
				totalSalary += q.getBonus();
				return false;
			}
		}).collect(Collectors.toList());
		
		
		System.out.println("customersWithSameName" + customersWithSameName);
		
		System.out.println("customersWithIdGrtThan10 :: " + customersWithIdGrtThan10.size());
		
		System.out.println("totalCustomers :: " + customers.size());
		System.out.println("customersWithMoreThan100Points :: " + customersWithMoreThan100Points.size());
		System.out.println("customersWithLessThan100Points :: " + (customers.size() - customersWithMoreThan100Points.size()));
	}
	
}
