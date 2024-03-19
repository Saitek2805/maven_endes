package Empleado;

public class EmployeeManager {
String[] employeeNames = new String[10];
int[] employeeYears = new int[10];
int numberOfEmployees = 0;
public void addEmployee(String name, int years) {
if (numberOfEmployees < 10) {
employeeNames[numberOfEmployees] = name;
employeeYears[numberOfEmployees] = years;
numberOfEmployees++;
System.out.println(name + " added to the system.");
} else {
System.out.println("Cannot add more employees, system is full.");
}
}
public void printEmployees() {
System.out.println("List of employees:");
for (int i = 0; i < numberOfEmployees; i++) {
System.out.println(employeeNames[i] + ", Years in company: " +
employeeYears[i]);
}
}
public static void main(String[] args) {
EmployeeManager manager = new EmployeeManager();
manager.addEmployee("John Doe", 5);
manager.addEmployee("Jane Smith", 2);
manager.printEmployees();
}
}