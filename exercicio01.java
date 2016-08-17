/* Na empresa onde trabalhamos, há tabelas com o quanto foi gasto em cada mês. Para fechar o balanço do primeiro trimestre, precisamos somar o gasto total. Sabendo que, em Janeiro, foram gastos 15000 reais, em Fevereiro, 23000 reais e em Março, 17000 reais, faça um programa que calcule e imprima o gasto total no trimestre. Siga esses passos:
1- Crie uma classe chamada BalancoTrimestral com um bloco main, como nos exemplos anteriores;
2- Dentro do main (o miolo do programa), declare uma variável inteira chamada gastosJaneiro e inicialize-a com 15000;
3 - Crie também as variáveis gastosFevereiro e gastosMarco, inicializando-as com 23000 e 17000, respectivamente, utilize uma linha para cada declaração;
4 -Crie uma variável chamada gastosTrimestre e inicialize-a com a soma das outras 3 variáveis: 
5- Imprima a variável gastosTrimestre.

Adicione código (sem alterar as linhas que já existem) na classe anterior para imprimir a média mensal de gasto, criando uma variável mediaMensal junto com uma mensagem.
Note que como somamos três meses a média será a soma dos três meses dividido por três.

Para isso, concatene a String com o valor, usando algo como "Valor da média mensal = " + mediaMensal.*/


class BalancoTrimestral {
	public static void main(String[] args) {
		int gastosJaneiro = 15000;
		int gastosFevereiro = 23000;
		int gastosMarco = 17000;
		int gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
		float mediaMensal = gastosTrimestre;

		System.out.println("Gastos do Trimestre: " + gastosTrimestre);
		System.out.println("Media mensal: " + mediaMensal/3);



	}
}