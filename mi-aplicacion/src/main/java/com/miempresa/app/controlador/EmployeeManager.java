package com.miempresa.app.controlador;
/**
 * @version 1.0
 * @author Keiner Hurtado
 */
import java.util.ArrayList;
import java.util.List;

import com.miempresa.app.modelo.Employee;

public class EmployeeManager {
	List<Employee> empleados = new ArrayList<Employee>();
	
/**
 * Añade un empleado mediante las variables name y years y lo añade a la lista
 * @param name nombre del empleado
 * @param years años que lleva en la empresa
 */
public void addEmployee(String name, int years) {
	Employee e1=new Employee(name,years);
	empleados.add(e1);
}
/**
 * Imprime la información de los empleados
 */
public void printEmployees() {
System.out.println("List of employees: ");
 for (Employee e :empleados) {
	 System.out.println(e);
 }
}

}