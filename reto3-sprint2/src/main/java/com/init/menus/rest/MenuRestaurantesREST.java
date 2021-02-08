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
public class MenuRestaurantesREST {
//Restaurante 1
	String[] primeros1 = {"Jamón serrano - 4€","Espárragos blancos - 4€", "Morcilla de Briones - 5€"};
	String[] segundos1 = {"Puré de calabacín - 5€","Lasaña de carne - 8€", "Menestra de verduras - 6€"};
	String[] terceros1 = {"Copa de chocolate blanco - 3€","Postre de músico - 4€", "Brownie con helado - 4€"};
	@RequestMapping("/restaurante1")
	@GetMapping
	public ResponseEntity<Menu> getMenu(){
		 		
		Menu menu = new Menu();
		menu.setId(1L);
		menu.setName("restaurante 1");
		menu.setPrimeros(primeros1);
		menu.setSegundos(segundos1);
		menu.setTerceros(terceros1);
		
		return ResponseEntity.ok(menu);
	}
//Restaurante 2
	String[] primeros2 = {"Chorizo de Briones - 4€","Pimientos del piquillo con anchoa - 5€", "Revuelto de setas con gamba - 5€"};
	String[] segundos2 = {"Fideuá con sepia y gambas - 10€","Potaje de alubias - 8€", "Ensalada de muslitos de codornices - 7€"};
	String[] terceros2 = {"Sopa de fresas - 3€","Helado crocanti - 2€", "Helado de tiramisú - 2€"};
	@RequestMapping("/restaurante2")
	@GetMapping
	public ResponseEntity<Menu> getMenu2(){
		 		
		Menu menu = new Menu();
		menu.setId(2L);
		menu.setName("restaurante 2");
		menu.setPrimeros(primeros2);
		menu.setSegundos(segundos2);
		menu.setTerceros(terceros2);
		
		return ResponseEntity.ok(menu);
	}
//Restaurante 3
	String[] primeros3 = {"Gambas al ajillo - 4€", "Picadillo - 5€", "Paté de hongos con mermelada - 4€"};
	String[] segundos3 = {"Tabulé de quinoa con croquetas - 4€","Rulo de hojaldre con verduras - 6€", "Alcachofas rellenas de bacalao - 8€"};
	String[] terceros3 = {"Macedonia de frutas - 3€", "Tarta helada al whisky - 3€", "Flan de queso - 3€"};
	@RequestMapping("/restaurante3")
	@GetMapping
	public ResponseEntity<Menu> getMenu3(){
		 		
		Menu menu = new Menu();
		menu.setId(3L);
		menu.setName("restaurante 3");
		menu.setPrimeros(primeros3);
		menu.setSegundos(segundos3);
		menu.setTerceros(terceros3);
		
		return ResponseEntity.ok(menu);
	}
//Restaurante 4
	String[] primeros4 = {"Mousse de oca con mermelada - 3€", "Lomo ibérico de bellota - 4€", "Surtido de fritos - 3€"};
	String[] segundos4 = {"Huevos estrellados con patatas - 9€","Pasta del día - 8€", "Salmorejo con huevo, jamón y picos - 4€"};
	String[] terceros4 = {"Cuajada - 2€", "Arroz con leche - 3€", "Mousse de chocolate - 4€"};
	@RequestMapping("/restaurante4")
	@GetMapping
	public ResponseEntity<Menu> getMenu4(){
		 		
		Menu menu = new Menu();
		menu.setId(4L);
		menu.setName("restaurante 4");
		menu.setPrimeros(primeros4);
		menu.setSegundos(segundos4);
		menu.setTerceros(terceros4);
		
		return ResponseEntity.ok(menu);
	}
//Restaurante 5
	String[] primeros5 = {"Pulpo a la gallega - 4€", "Croquetas de jamón - 6€", "Trigueros a la plancha - 4€"};
	String[] segundos5 = {"Crema de zanahoria con costrones de pan - 6€","Pulpo a la gallega - 10€", "Arroz caldoso de marisco - 8€"};
	String[] terceros5 = {"Natillas - 2€", "Tarta de manzana - 3€", "Tarta de arroz - 4€"};
	@RequestMapping("/restaurante5")
	@GetMapping
	public ResponseEntity<Menu> getMenu5(){
		 		
		Menu menu = new Menu();
		menu.setId(5L);
		menu.setName("restaurante 5");
		menu.setPrimeros(primeros5);
		menu.setSegundos(segundos5);
		menu.setTerceros(terceros5);
		
		return ResponseEntity.ok(menu);
	}
//Restaurante 6
	String[] primeros6 = {"Picadillo - 4€", "Croquetas de bacalao - 4€", "Langostinos a la sartén - 6€"};
	String[] segundos6 = {"Tallarines con salmón - 15€","Gazpacho andalúz - 10€", "Fritura de pescado - 8€"};
	String[] terceros6 = {"Batido de fresa - 3€", "Tarta de queso - 4€", "Tarta de chocolate - 3€"};
	@RequestMapping("/restaurante6")
	@GetMapping
	public ResponseEntity<Menu> getMenu6(){
		 		
		Menu menu = new Menu();
		menu.setId(6L);
		menu.setName("restaurante 6");
		menu.setPrimeros(primeros6);
		menu.setSegundos(segundos6);
		menu.setTerceros(terceros6);
		
		return ResponseEntity.ok(menu);
	}

}

