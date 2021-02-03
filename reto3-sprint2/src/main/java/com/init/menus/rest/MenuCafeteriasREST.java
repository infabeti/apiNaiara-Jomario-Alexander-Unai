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
public class MenuCafeteriasREST {
//Cafeteria 1
	String[] primeros1 = {"Expresso","Ristretto", "Cortado"};
	String[] segundos1 = {"Té verde","Té negro", "Té blanco"};
	String[] terceros1 = {"Cheesecake","Tiramisú", "Tres leches"};
	@RequestMapping("/cafeteria1")
	@GetMapping
	public ResponseEntity<Menu> getMenu(){
		 		
		Menu menu = new Menu();
		menu.setId(1L);
		menu.setName("Cafeteria 1");
		menu.setPrimeros(primeros1);
		menu.setSegundos(segundos1);
		menu.setTerceros(terceros1);
		
		return ResponseEntity.ok(menu);
	}
//Cafeteria 2
	String[] primeros2 = {"Americano","Largo", "Carajillo"};
	String[] segundos2 = {"Té rojo","Té azul", "Té de manzanilla"};
	String[] terceros2 = {"Tarta de santiago","Ópera", "Tarta de oreo"};
	@RequestMapping("/cafeteria2")
	@GetMapping
	public ResponseEntity<Menu> getMenu2(){
		 		
		Menu menu = new Menu();
		menu.setId(2L);
		menu.setName("Cafeteria 2");
		menu.setPrimeros(primeros2);
		menu.setSegundos(segundos2);
		menu.setTerceros(terceros2);
		
		return ResponseEntity.ok(menu);
	}
//Cafeteria 3
	String[] primeros3 = {"Café con leche","Café bombón", "Capuchino"};
	String[] segundos3 = {"Té de menta","Té de tila", "Té de valeriana"};
	String[] terceros3 = {"Tarta de chocolate negro","Tarta de chocolate blanco", "Tarta de tres chocolates"};
	@RequestMapping("/cafeteria3")
	@GetMapping
	public ResponseEntity<Menu> getMenu3(){
		 		
		Menu menu = new Menu();
		menu.setId(3L);
		menu.setName("Cafeteria 3");
		menu.setPrimeros(primeros3);
		menu.setSegundos(segundos3);
		menu.setTerceros(terceros3);
		
		return ResponseEntity.ok(menu);
	}
//Cafeteria 4
	String[] primeros4 = {"Mocca","Café irlandés", "Frappé"};
	String[] segundos4 = {"Té de anís","Té de romero", "Té de boldo"};
	String[] terceros4 = {"Tarta de oreo","Tarta de mikado", "Tarta de lacasitos"};
	@RequestMapping("/cafeteria4")
	@GetMapping
	public ResponseEntity<Menu> getMenu4(){
		 		
		Menu menu = new Menu();
		menu.setId(4L);
		menu.setName("Cafeteria 4");
		menu.setPrimeros(primeros4);
		menu.setSegundos(segundos4);
		menu.setTerceros(terceros4);
		
		return ResponseEntity.ok(menu);
	}
//Cafeteria 5
	String[] primeros5 = {"Azteca","Cortado", "Largo"};
	String[] segundos5 = {"Té de lavanda","Té de limón", "Té de jamaica"};
	String[] terceros5 = {"Cheesecake","Tarta de café", "Tarta de fresa"};
	@RequestMapping("/cafeteria5")
	@GetMapping
	public ResponseEntity<Menu> getMenu5(){
		 		
		Menu menu = new Menu();
		menu.setId(5L);
		menu.setName("Cafeteria 5");
		menu.setPrimeros(primeros5);
		menu.setSegundos(segundos5);
		menu.setTerceros(terceros5);
		
		return ResponseEntity.ok(menu);
	}
//Cafeteria 6
	String[] primeros6 = {"Capuchino","Con leche", "Americano"};
	String[] segundos6 = {"Té rojo","Manzanilla", "Té negro"};
	String[] terceros6 = {"Tarta de queso","Tarta de frambuesa", "Tarta de oreo"};
	@RequestMapping("/cafeteria6")
	@GetMapping
	public ResponseEntity<Menu> getMenu6(){
		 		
		Menu menu = new Menu();
		menu.setId(6L);
		menu.setName("Cafeteria 6");
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