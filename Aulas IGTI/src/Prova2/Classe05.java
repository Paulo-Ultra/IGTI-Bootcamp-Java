package Prova2;

import java.util.Scanner;

public class Classe05 {
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int[] numeros = new int[10];
		int[] numerosFixos = new int [10];
		int[] numerosDigitados = new int [10];

		
		for (int i = 0; i < 10; i++) {
			System.out.printf("Digite o %dº numero:\n", i+1);
			numeros[i] = ent.nextInt();
			numerosDigitados[i] = numerosDigitados[i] + numeros[i];
			numerosFixos[i] = numeros[i];
			System.out.printf("%d x %d = %d\n", numerosDigitados[i], numerosFixos[i], numerosDigitados[i]*numerosFixos[i]);
				
			}
				
		}
			
	}


