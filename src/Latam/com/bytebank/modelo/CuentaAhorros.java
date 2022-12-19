package Latam.com.bytebank.modelo;
/**
 * @
 * @author Catalina
 *
 */
public class CuentaAhorros extends Cuenta {
	
	public CuentaAhorros(int agencia, int numero) {
		super(agencia, numero);
	}

	@Override
	public void deposita(double valor) {
		this.setSaldo(this.getSaldo() + valor);
	}
	
	@Override
		public String toString() {
			String cuenta = "Numero: " + this.getNumero() + ", Agencia:" + this.getAgencia();
			return cuenta;
		}

}

