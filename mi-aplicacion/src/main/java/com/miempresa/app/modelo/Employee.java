package com.miempresa.app.modelo;
/**
 * @version 1.0
 * @author Keiner Hurtado
 */
public class Employee {
	private String nombre;
	private Integer anios;
	/**
	 * 
	 * @param nombre Nombre del empleado
	 * @param anios	Años que lleva el empleado en la empresa
	 */
	public Employee(String nombre, Integer anios) {
		this.nombre = nombre;
		this.anios = anios;
	}
	/**
	 * 
	 * @return nombre del empleado
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * 
	 * @param nombre del empleado
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * 
	 * @return Años que lleva el empleado en la empresa
	 */
	public Integer getAnios() {
		return anios;
	}
	/**
	 * 
	 * @param anios Años que lleva el empleado en la empresa
	 */
	public void setAnios(Integer anios) {
		this.anios = anios;
	}
	/**
	 * Transforma el toString para poder ver la informacion de cada objeto de forma completa
	 */
	public String toString() {
		return "Employee: "+this.nombre+"\n" +"Years in the company: "+this.anios;
	}
	
	
}
