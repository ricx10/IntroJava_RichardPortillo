package py.uaa.clase.java;

import java.util.Date;
public class Prueba {

	public void metodo1() {
		
	}
	public void metodo2() {
		
	}
	public void metodo3() {
		
	}
	
	public void pruebaLlamadaMetodoDeLaMismaClase() {
		metodo1();
		metodo2();
		metodo3();
		
		// print();
	}
	
	public static void imprimirFecha() {
	Date date = new Date();
	System.out.println("fecha actual" + date.getYear() + date.getMonth() + date.getDay());
	}
}
