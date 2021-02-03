package com.init.menus.rest;

import com.init.menus.entidades.Menu;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/menu1")
@CrossOrigin (origins = "http://localhost:3000")
public class MenuREST {
		
	String[] platos1 = {"Patatas bravas","Patatas fritas", "Ensaladilla rusa"};
	String[] bebidas1 = {"Agua","Cocacola", "Sprite"};
	String[] snacks1 = {"Patatas","Doritos", "Gusanitos"};
	@GetMapping
	public ResponseEntity<Menu> getMenu(){
		 		
		Menu menu = new Menu();
		menu.setId(1L);
		menu.setName("bar 1");
		menu.setPlatos(platos1);
		menu.setBebidas(bebidas1);
		menu.setSnacks(snacks1);
		
		return ResponseEntity.ok(menu);
	}
	
	//@GetMapping // estaría escuchando la dirección 'localhost:8080/'
	//@RequestMapping(value="Hola", method=RequestMethod.GET) // estaría escuchando en 'localhost:8080/hola' y en el metodo GET
	public String hello() {
		return "Hola mundo";
	}
}
