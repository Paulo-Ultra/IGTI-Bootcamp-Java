package Provas;

import java.util.Scanner;

public class ProvaModulo {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double n1 = 0, n2 = 0, n3 = 2, resultado;
		
		System.out.println("Digite um valor para variável n1: ");
		n1 = entrada.nextDouble();
		
		System.out.println("Digite um valor para variável n2: ");
		n2 = entrada.nextDouble();
		
		resultado = n1 * n2 / n3;
		System.out.printf("O valor total é: %.2f", resultado);

		}

		
	}


