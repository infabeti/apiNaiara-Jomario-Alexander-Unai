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
	String[] primeros1 = {"Jamón serrano","Espárragos blancos", "Morcilla de Briones"};
	String[] segundos1 = {"Puré de calabacín","Lasaña de carne", "Menestra de verduras"};
	String[] terceros1 = {"Copa de chocolate blanco","Postre de músico", "Brownie con helado"};
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
	String[] primeros2 = {"Chorizo de Briones","Pimientos del piquillo con anchoa", "Revuelto de setas con gamba"};
	String[] segundos2 = {"Fideuá con sepia y gambas","Potaje de alubias", "Ensalada de muslitos de codornices"};
	String[] terceros2 = {"Sopa de fresas","Helado crocanti", "Helado de tiramisú"};
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
	String[] primeros3 = {"Gambas al ajillo", "Picadillo", "Paté de hongos con mermelada"};
	String[] segundos3 = {"Tabulé de quinoa con croquetas","Rulo de hojaldre con verduras", "Alcachofas rellenas de bacalao"};
	String[] terceros3 = {"Macedonia de frutas", "Tarta helada al whisky", "Flan de queso"};
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
	String[] primeros4 = {"Mousse de oca con mermelada", "Lomo ibérico de bellota", "Surtido de fritos"};
	String[] segundos4 = {"Huevos estrellados con patatas","Pasta del día", "Salmorejo con huevo, jamón y picos"};
	String[] terceros4 = {"Cuajada", "Arroz con leche", "Mousse de chocolate"};
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
	String[] primeros5 = {"Pulpo a la gallega", "Croquetas de jamón", "Trigueros a la plancha"};
	String[] segundos5 = {"Crema de zanahoria con costrones de pan","Pulpo a la gallega", "Arroz caldoso de marisco"};
	String[] terceros5 = {"Natillas", "Tarta de manzana", "Tarta de arroz"};
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
	String[] primeros6 = {"Picadillo", "Croquetas de bacalao", "Langostinos a la sartén"};
	String[] segundos6 = {"Tallarines con salmón","Gazpacho andalúz", "Fritura de pescado"};
	String[] terceros6 = {"Batido de fresa", "Tarta de queso", "Tarta de chocolate"};
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
	//@GetMapping // estaría escuchando la dirección 'localhost:8080/'
	//@RequestMapping(value="Hola", method=RequestMethod.GET) // estaría escuchando en 'localhost:8080/hola' y en el metodo GET
	public String hello() {
		return "Hola mundo";
	}
}

