package Latam.com.bytebank.test;

public class TestSistemaInterno {

	public static void main(String[] args) {
		Latam.com.bytebank.modelo.SistemaInterno sistema = new Latam.com.bytebank.modelo.SistemaInterno();
		Latam.com.bytebank.modelo.Gerente gerente1 = new Latam.com.bytebank.modelo.Gerente();
		Latam.com.bytebank.modelo.Administrador admin = new Latam.com.bytebank.modelo.Administrador();
		
		sistema.autentica(gerente1);
		sistema.autentica(admin);
	}
}
