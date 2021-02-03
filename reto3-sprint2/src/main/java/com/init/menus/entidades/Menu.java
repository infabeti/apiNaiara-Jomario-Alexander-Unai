package com.init.menus.entidades;

public class Menu {
	
	public long id;
	public String name;
	public String[] primeros;
	public String[] segundos;
	public String[] terceros;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String[] getPrimeros() {
		return primeros;
	}
	public void setPrimeros(String[] primeros) {
		this.primeros = primeros;
	}
	public String[] getSegundos() {
		return segundos;
	}
	public void setSegundos(String[] segundos) {
		this.segundos = segundos;
	}
	public String[] getTerceros() {
		return terceros;
	}
	public void setTerceros(String[] terceros) {
		this.terceros = terceros;
	}
}
