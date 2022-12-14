package Latam.com.bytebank.test;

public class testCuentaExceptionSaldo {
	public static void main(String[] args) {
		Latam.com.bytebank.modelo.Cuenta cuenta = new Latam.com.bytebank.modelo.CuentaAhorros(123, 456);
		cuenta.deposita(200);
		try {
			cuenta.saca(210);
		} catch (Latam.com.bytebank.modelo.SaldoInsuficienteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
