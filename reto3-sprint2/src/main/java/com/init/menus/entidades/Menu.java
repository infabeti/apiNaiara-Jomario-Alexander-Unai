package com.init.menus.entidades;

public class Menu {
	
	public long id;
	public String name;
	public String[] platos;
	public String[] bebidas;
	public String[] snacks;
	
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
	public String[] getBebidas() {
		return bebidas;
	}
	public void setBebidas(String[] bebidas) {
		this.bebidas = bebidas;
	}
	public String[] getSnacks() {
		return snacks;
	}
	public void setSnacks(String[] snacks) {
		this.snacks = snacks;
	}
}
