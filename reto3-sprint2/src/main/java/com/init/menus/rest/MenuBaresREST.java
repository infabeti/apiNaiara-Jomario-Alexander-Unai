package com.init.menus.rest;

import com.init.menus.entidades.Menu;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SuppressWarnings("unused")
@RestController
@RequestMapping("/")
@CrossOrigin (origins = "http://localhost:3000")
public class MenuBaresREST {
//Bar 1
	String[] primeros1 = {"Patatas bravas","Patatas fritas", "Ensaladilla rusa"};
	String[] segundos1 = {"Agua","Cocacola", "Sprite"};
	String[] terceros1 = {"Patatas","Doritos", "Gusanitos"};
	@RequestMapping("/bar1")
	@GetMapping
	public ResponseEntity<Menu> getMenu(){
		 		
		Menu menu = new Menu();
		menu.setId(1L);
		menu.setName("bar 1");
		menu.setPrimeros(primeros1);
		menu.setSegundos(segundos1);
		menu.setTerceros(terceros1);
		
		return ResponseEntity.ok(menu);
	}
//Bar 2
	String[] primeros2 = {"Rabas fritas","Sepia a la plancha", "Champiñones al ajillo"};
	String[] segundos2 = {"Fanta de naranja","Fanta de limón", "Cocacola"};
	String[] terceros2 = {"Kit-kat","Doritos", "Oreos"};
	@RequestMapping("/bar2")
	@GetMapping
	public ResponseEntity<Menu> getMenu2(){
		 		
		Menu menu = new Menu();
		menu.setId(2L);
		menu.setName("bar 2");
		menu.setPrimeros(primeros2);
		menu.setSegundos(segundos2);
		menu.setTerceros(terceros2);
		
		return ResponseEntity.ok(menu);
	}
//Bar 3
	String[] primeros3 = {"Patatas mansas", "Rodajitas de longaniza", "Callos de ternera"};
	String[] segundos3 = {"7up","Sprite", "Zumo de naranja"};
	String[] terceros3 = {"Huesitos", "Kit-kat", "Gusanitos"};
	@RequestMapping("/bar3")
	@GetMapping
	public ResponseEntity<Menu> getMenu3(){
		 		
		Menu menu = new Menu();
		menu.setId(3L);
		menu.setName("bar 3");
		menu.setPrimeros(primeros3);
		menu.setSegundos(segundos3);
		menu.setTerceros(terceros3);
		
		return ResponseEntity.ok(menu);
	}
//Bar 4
	String[] primeros4 = {"Pan con tomate", "Gambas fritas", "Queso manchego"};
	String[] segundos4 = {"Batido de chocolate","Mosto", "Red bull"};
	String[] terceros4 = {"Fantasmitas", "Cheetos", "Chocolate"};
	@RequestMapping("/bar4")
	@GetMapping
	public ResponseEntity<Menu> getMenu4(){
		 		
		Menu menu = new Menu();
		menu.setId(4L);
		menu.setName("bar 4");
		menu.setPrimeros(primeros4);
		menu.setSegundos(segundos4);
		menu.setTerceros(terceros4);
		
		return ResponseEntity.ok(menu);
	}
//Bar 5
	String[] primeros5 = {"Tapa de quesos", "Entremeses variados", "Boquerones en vinagre"};
	String[] segundos5 = {"Cocacola","Kas", "Fanta"};
	String[] terceros5 = {"Patatas", "Doritos", "Papadeltas"};
	@RequestMapping("/bar5")
	@GetMapping
	public ResponseEntity<Menu> getMenu5(){
		 		
		Menu menu = new Menu();
		menu.setId(5L);
		menu.setName("bar 5");
		menu.setPrimeros(primeros5);
		menu.setSegundos(segundos5);
		menu.setTerceros(terceros5);
		
		return ResponseEntity.ok(menu);
	}
//Bar 6
	String[] primeros6 = {"Ensaladilla rusa", "Calamares a la Andaluza", "Rabas fritas"};
	String[] segundos6 = {"Zumos","Agua", "Refrescos"};
	String[] terceros6 = {"Gusanitos", "Takis", "Kit-kat"};
	@RequestMapping("/bar6")
	@GetMapping
	public ResponseEntity<Menu> getMenu6(){
		 		
		Menu menu = new Menu();
		menu.setId(6L);
		menu.setName("bar 6");
		menu.setPrimeros(primeros6);
		menu.setSegundos(segundos6);
		menu.setTerceros(terceros6);
		
		return ResponseEntity.ok(menu);
	}
	//@GetMapping // estaría escuchando la dirección 'localhost:8080/'
	//@RequestMapping(value="Hola", method=RequestMethod.GET) // estaría escuchando en 'localhost:8080/hola' y en el metodo GET
	public String hello() {
		return "Hola mundo";
	}
}
