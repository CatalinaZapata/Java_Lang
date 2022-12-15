package Latam.com.bytebank.test;

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
	System.out.println("Despues del replace: " + nombre);
	System.out.println(letra);
	System.out.println(index);
}
}
