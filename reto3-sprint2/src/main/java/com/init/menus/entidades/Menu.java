package com.init.menus.entidades;

public class Menu {
	
	public long id;
	public String name;
	public String[] platos;
	
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
	public String[] getPlatos() {
		return platos;
	}
	public void setPlatos(String[] platos) {
		this.platos = platos;
	}
}
