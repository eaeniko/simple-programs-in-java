/* Imprima a soma de 1 até 1000 (inclusive).
Para isso você deve utilizar alguma variável extra que armazena a soma temporária e aumentá-la a cada novo passo. */ 

class ImprimeSoma{
    public static void main(String[] args){

        int soma = 0;

        for (int i = 1; i <= 1000; i++){
            soma = soma + i;            
        }
        System.out.println("O valor da soma e = " + soma);
    }
}