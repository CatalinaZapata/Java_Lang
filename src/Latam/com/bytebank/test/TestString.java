package Latam.com.bytebank.test;

import Latam.com.bytebank.modelo.CuentaAhorros;

public class TestString {
	public static void main(String[] args) {
	String nombre = "Alura";
	//Otra forma que est obsoleta: String nombre2 = new String("Alura");
	
	System.out.println("Antes de replace: " + nombre);
	nombre = nombre.replace("A", "a");
	nombre = nombre.concat(" cursos online");
	nombre = nombre.toUpperCase();
	nombre = nombre.toLowerCase();
	
	char letra = nombre.charAt(3);
	int index = nombre.indexOf("e");
	
	Object cuenta = new CuentaAhorros(200, 300);
	
	printLine(nombre);
	printLine(letra);
	printLine(index);
	printLine(new CuentaAhorros(200, 300));
	
	}
	
	public static void printLine(Object valor) {
		System.out.println(valor.toString());
	}
	
}
