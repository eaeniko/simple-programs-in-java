class Funcionario {

	double salarioAnual;
	double salario;
	String id;
	String departamento;
	String dataEntrada;
	String nome;
	String rg;
	String cpf;

	public void recebeAumento(double aumento) {
		this.salario += aumento;
	}

	public double calculaGanhoAnual() {
		
		return	salarioAnual *= 12;
	}
}

class Pessoa {
	String nome;
	String rg;
	String cpf;
}
class TestaFuncionario {

    public static void main(String[] args) {
        Funcionario f1 = new Funcionario();

        f1.nome = "Hugo";
        f1.salario = 100;
        f1.recebeAumento(50);

        System.out.println("salario atual:" + f1.salario);
        System.out.println("ganho anual:" + f1.calculaGanhoAnual());
    }
}