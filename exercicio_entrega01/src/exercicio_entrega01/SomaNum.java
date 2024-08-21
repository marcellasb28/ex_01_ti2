package exercicio_entrega01;

import java.util.*; //para poder usar o scanner

class SomaNum {
	
		 public static Scanner sc = new Scanner(System.in);
		 
		 public static void main ( String args[]) {
			 //declaração de variáveis
			 int num1, num2, soma;

			 //Leituras
			 System.out.println("Digite um número:");
			 num1 = sc.nextInt();
			 System.out.println("Digite outro número");
			 num2 = sc.nextInt();
			 
			 //Somar
			 soma = num1 + num2;
			 
			 System.out.println("Soma:" + soma);
		 }

}
