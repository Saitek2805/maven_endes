package Empleado;

import java.util.ArrayList;
import java.util.List;

import com.github.javafaker.Faker;

public class EmployeeManager {
	List<Employee> empleados = new ArrayList<Employee>();
	

public void addEmployee(String name, int years) {
	Employee e1=new Employee(name,years);
	empleados.add(e1);
}
public void printEmployees() {
System.out.println("List of employees: ");
 for (Employee e :empleados) {
	 System.out.println(e);
 }
}

}