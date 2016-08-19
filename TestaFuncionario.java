class Funcionario {

	double salarioAnual;
	double salario;
	double salarioAumento;
	Data dataEntrada;
	String id;
	String departamento;
	String nome;
	String rg;
	String cpf;

	 void recebeAumento(double aumento) {
		this.salarioAumento = salario + aumento;
	}

	double calculaGanhoAnual() {
		
		return	salarioAnual = salarioAumento * 12;
	}

	void mostra() {
		System.out.println("\nNome:" + this.nome);
		System.out.println("Salario:" + this.salario);
		System.out.println("Seu aumento:" + this.salarioAumento);
		System.out.println("Salario anual:" + this.salarioAnual);
		System.out.println("Departamento:" + this.departamento);
		System.out.println("Data de Entrada:" + this.dataEntrada.getFormatada());
		System.out.println("RG: " + this.rg);
	}

} 
class Data {
	int dia;
	int mes;
	int ano;

	void preencheData(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	String getFormatada() {
		return this.dia + "/" + this.mes + "/" + this.ano;
	}

}

class TestaFuncionario {

    public static void main(String[] args) {
        Funcionario f1 = new Funcionario();

        f1.nome = "Hugo";
        f1.salario = 100;
        f1.recebeAumento(50);
        f1.departamento = "Sp";
        f1.rg = "123456789";
        f1.calculaGanhoAnual();
        f1.dataEntrada = new Data();
        f1.dataEntrada.preencheData(1,07,2016);
        f1.mostra();


        Funcionario f2 = new Funcionario();
        f2.nome = "Nikolai";
        f2.salario = 300;
        f2.recebeAumento(120);
        f2.departamento = "Sp";
        f2.dataEntrada.preencheData(18,8,2016);
        f2.rg = "01010101";
        f2.calculaGanhoAnual();

        f2.mostra();

        Funcionario f3 = f2;
        if(f2 == f3) {
        	System.out.println("iguais");
        } else {
        	System.out.println("Diferentes");
        }
    }
}