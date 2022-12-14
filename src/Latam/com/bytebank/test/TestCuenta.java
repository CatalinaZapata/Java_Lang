package Latam.com.bytebank.test;

public class TestCuenta {

	public static void main(String[] args) {
		Latam.com.bytebank.modelo.CuentaCorriente cc = null;
		int num = 0;
		int resultado = 30/num;
		System.out.println(resultado);
		
		Latam.com.bytebank.modelo.CuentaAhorros ca = new Latam.com.bytebank.modelo.CuentaAhorros(2, 3);
		cc.deposita(2000);
		cc.transfiere(1000, ca);
		
		System.out.println(cc.getSaldo());
		System.out.println(ca.getSaldo());
	}
	
}
