package Empleado;

public class Employee {
	String nombre;
	Integer anios;
	public Employee(String nombre, Integer anios) {
		this.nombre = nombre;
		this.anios = anios;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getAnios() {
		return anios;
	}
	public void setAnios(Integer anios) {
		this.anios = anios;
	}
	public String toString() {
		return "Employee: "+this.nombre+ " Years in the company: "+this.anios;
	}
	
	
}
