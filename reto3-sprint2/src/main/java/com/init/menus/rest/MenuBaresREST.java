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
	String[] primeros1 = {"Patatas bravas - 10€","Patatas fritas - 8€", "Ensaladilla rusa - 12€"};
	String[] segundos1 = {"Agua - 1,50€","Cocacola - 2€", "Sprite 2€"};
	String[] terceros1 = {"Patatas - 3€","Doritos - 1,8€", "Gusanitos - 1,5€"};
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
	String[] primeros2 = {"Rabas fritas - 9€","Sepia a la plancha - 14€", "Champiñones al ajillo - 7€"};
	String[] segundos2 = {"Fanta de naranja - 2€","Fanta de limón - 2€", "Cocacola - 2€"};
	String[] terceros2 = {"Kit-kat - 1,5€","Doritos - 1,5€", "Oreos - 1€"};
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
	String[] primeros3 = {"Patatas mansas - 10€", "Rodajitas de longaniza - 12€", "Callos de ternera - 14€"};
	String[] segundos3 = {"7up - 1,5€","Sprite - 2€", "Zumo de naranja - 2€"};
	String[] terceros3 = {"Huesitos - 1€", "Kit-kat - 1€", "Gusanitos - 1€"};
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
	String[] primeros4 = {"Pan con tomate - 4€", "Gambas fritas - 6€", "Queso manchego - 5€"};
	String[] segundos4 = {"Batido de chocolate - 3€","Mosto - 1€", "Red bull - 2€"};
	String[] terceros4 = {"Fantasmitas - 1€ ", "Cheetos - 1€", "Chocolate - 1€"};
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
	String[] primeros5 = {"Tapa de quesos - 9€", "Entremeses variados - 10€", "Boquerones en vinagre - 8€"};
	String[] segundos5 = {"Cocacola - 2€","Kas - 1,5€", "Fanta - 2€"};
	String[] terceros5 = {"Patatas - 3€", "Doritos - 2€", "Papadeltas - 1,5€"};
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
	String[] primeros6 = {"Ensaladilla rusa - 10€", "Calamares a la Andaluza - 12€", "Rabas fritas - 10€"};
	String[] segundos6 = {"Zumos - 2€ ","Agua - 1,5", "Refrescos - 1,5€"};
	String[] terceros6 = {"Gusanitos - 1,5€", "Takis - 1€", "Kit-kat - 1€"};
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
	
}
