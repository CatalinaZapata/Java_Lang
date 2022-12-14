package Latam.com.bytebank.test;

public class TestFuncionario {

	public static void main(String[] args) {
		Latam.com.bytebank.modelo.Funcionario diego = new Latam.com.bytebank.modelo.Contador();
		diego.setDocumento("Diego");
		diego.setDocumento("444556665");
		diego.setSalario(2000);
		diego.setTipo(0);
		
		System.out.println(diego.getSalario());
		System.out.println(diego.getBonificacion());
	}
}
