package Prova2;

import java.util.Scanner;

public class Classe12 {
	public static void main(String[] args) {
		int n1 = 0;
		boolean resultado;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um número inteiro: ");
		n1 = entrada.nextInt();
		
		resultado = (n1 % 2 == 0);
		System.out.printf("%b", resultado);
	}
}
