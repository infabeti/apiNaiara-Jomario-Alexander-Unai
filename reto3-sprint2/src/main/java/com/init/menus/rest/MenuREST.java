package com.init.menus.rest;

import com.init.menus.entidades.Menu;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class MenuREST {
	
	
	@GetMapping
	public ResponseEntity<Menu> getMenu(){
		Menu menu = new Menu();
		menu.setId(1L);
		menu.setName("Menu 1");
		return ResponseEntity.ok(menu);
	}
	
	
	//@GetMapping // estaría escuchando la dirección 'localhost:8080/'
	//@RequestMapping(value="Hola", method=RequestMethod.GET) // estaría escuchando en 'localhost:8080/hola' y en el metodo GET
	public String hello() {
		return "Hola mundo";
	}
}