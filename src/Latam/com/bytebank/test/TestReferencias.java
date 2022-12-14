package Latam.com.bytebank.test;

public class TestReferencias {

	public static void main(String[] args) {
		
		// Elemento mas generico puede ser adaptado
		//                     al elemento mas especifico
		Latam.com.bytebank.modelo.Funcionario funcionario = new Latam.com.bytebank.modelo.Gerente();
		funcionario.setNombre("Diego");
		
		Latam.com.bytebank.modelo.Gerente gerente = new Latam.com.bytebank.modelo.Gerente();
		gerente.setNombre("Jimena");
		
		funcionario.setSalario(2000);
		gerente.setSalario(10000);
		
		gerente.iniciarSesion("_ddddd");
				
	}
	
}
