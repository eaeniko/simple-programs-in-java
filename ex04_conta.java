class Conta {
	int numero;
	String titular;
	double saldo;
	int agencia;

	void deposita(double valorASerDepositado) {

		this.saldo += valorASerDepositado ;
	}

	void saca(double valorASerSacado) {
		if (this.saldo >= valorASerSacado){

			this.saldo -= valorASerSacado;	
		}
	}
	void transfere(double valor, Conta destino) {
		this.saldo -= valor;
		destino.saldo += valor;
	}
};

class Programa {

	public static void main(String[] args) {
		Conta mauricio = new Conta();
		mauricio.numero = 123;
		mauricio.saldo = 800.0;
		mauricio.titular = "Mauricio Aniche";
		mauricio.agencia = 842;

		mauricio.deposita(100.0);
		mauricio.saca(5000.0);

		Conta guilherme = new Conta();
		guilherme.numero = 456;
		guilherme.saldo = 1200.0;

		guilherme.deposita(100.0);

		mauricio.transfere(100.0, guilherme);

		System.out.println(mauricio.saldo);
		System.out.println(guilherme.saldo);
	};
};