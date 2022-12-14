package Latam.com.bytebank.test;

import Latam.com.bytebank.modelo.Cuenta;

public class CuentaEspecial extends Cuenta {

	@Override
	public void deposita(double valor) {
		super.saldo = 0.0;
		
	}
}
