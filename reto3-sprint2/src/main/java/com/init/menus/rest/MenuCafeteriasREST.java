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
	String[] primeros1 = {"Expresso - 2€","Ristretto - 3€ ", "Cortado 1,5€"};
	String[] segundos1 = {"Té verde - 2€","Té negro - 2,5€", "Té blanco - 2€"};
	String[] terceros1 = {"Cheesecake - 1,5€","Tiramisú - 2€", "Tres leches - 2€"};
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
	String[] primeros2 = {"Americano 1,5€","Largo - 2€", "Carajillo - 3€"};
	String[] segundos2 = {"Té rojo - 3€","Té azul - 4€", "Té de manzanilla - 3€"};
	String[] terceros2 = {"Tarta de santiago - 4€","Ópera - 2€", "Tarta de oreo - 4€"};
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
	String[] primeros3 = {"Café con leche - 1,5€","Café bombón - 2€", "Capuchino - 2€"};
	String[] segundos3 = {"Té de menta - 2€","Té de tila - 3€", "Té de valeriana - 3€"};
	String[] terceros3 = {"Tarta de chocolate negro- 4€","Tarta de chocolate blanco - 3€", "Tarta de tres chocolates - 4€"};
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
	String[] primeros4 = {"Mocca - 2€ ","Café irlandés - 2,5€", "Frappé - 2€"};
	String[] segundos4 = {"Té de anís - 2,5€","Té de romero - 2€", "Té de boldo - 3€"};
	String[] terceros4 = {"Tarta de oreo - 2€","Tarta de mikado - 3,5€ ", "Tarta de lacasitos - 4€ "};
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
	String[] primeros5 = {"Azteca - 1€","Cortado - 1€", "Largo - 1,5€"};
	String[] segundos5 = {"Té de lavanda - 1,5€","Té de limón - 2€", "Té de jamaica - 2€"};
	String[] terceros5 = {"Cheesecake - 2,5€","Tarta de café - 3,5€", "Tarta de fresa - 3€"};
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
	String[] primeros6 = {"Capuchino - 2€","Con leche - 1,5€", "Americano - 1,5€"};
	String[] segundos6 = {"Té rojo - 2€","Manzanilla - 3€", "Té negro - 2€"};
	String[] terceros6 = {"Tarta de queso - 4€","Tarta de frambuesa - 3€", "Tarta de oreo - 2€"};
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
	
}