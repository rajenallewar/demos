package com.syne.demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Java8_EmpSalaryCalculator {
	
    public static void main(String[] args) {
    	
        List<Employee> employees = Arrays.asList(
        		new Employee(1, 1000,"Chandra Shekhar", 100d,0.05d),
                new Employee(1, 1000, "Rajesh", 100));
        
        Double totalSalary = employees.stream().collect(Collectors.summingDouble(Employee::getCalcultedSal));
        System.out.println("Total Employees Salary : " + totalSalary);
        
    }
}
