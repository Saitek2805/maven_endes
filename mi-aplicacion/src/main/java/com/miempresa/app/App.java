package com.miempresa.app;

import com.github.javafaker.Faker;

import Empleado.EmployeeManager;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main(String[] args) {
		int TOTAL = 100;
		Faker faker = new Faker();
		
		
	EmployeeManager manager = new EmployeeManager();
	manager.addEmployee("John Doe", 5);
	manager.addEmployee("Jane Smith", 2);

	for(int i=0; i<TOTAL; i++) {
		manager.addEmployee(faker.name().name(), faker.number().numberBetween(3, 20));
		
	}

	manager.printEmployees();
	}
}
