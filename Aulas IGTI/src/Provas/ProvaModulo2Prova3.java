package Provas;
import java.util.*;
public class ProvaModulo2Prova3 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
			double nota1 = 0, nota2 = 0, nota3 = 0, notaTotal = 0, frequencia = 0;
			double notaCorte = 50, freqCorte = 60;
					
			System.out.print("Digite a primeira nota: ");
			nota1 = entrada.nextDouble();
			System.out.print("Digite a segunda nota: ");
			nota2 = entrada.nextDouble();
			System.out.print("Digite a terceira nota: ");
			nota3 = entrada.nextDouble();
			System.out.println("Digite a frequ�ncia do(a) aluno(a): ");
			frequencia = entrada.nextDouble();
			
			notaTotal = nota1 + nota2 + nota3;
			if (notaTotal >= notaCorte && frequencia >= freqCorte)
				System.out.println("Aprovado");
			else if (notaTotal >= (notaCorte - notaCorte *0.20) && frequencia >= freqCorte)
				System.out.println("Prova Especial");
			else if (notaTotal >= 80)
				System.out.println("Aprovado direto.");
			else
				System.out.println("Reprovado");			
					
	}

}

			