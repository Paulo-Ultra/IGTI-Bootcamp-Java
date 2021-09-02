import java.util.*;
public class ClasseDeScan {

	public static void main(String[] args) {
		double nota1, nota2, nota3, nota4, frequencia, totalNotas;
		char statusAluno;
		boolean aprovado;
		String nomeAluno;
		
		Scanner entradaDeNotas = new Scanner (System.in);
		Scanner entradaDeCaractere = new Scanner (System.in);
		
		
		System.out.print("Digite o nome do(a) aluno(a): ");
		nomeAluno = entradaDeCaractere.nextLine();
		
		System.out.print("Digite um caractere para situação do(a) aluno(a) (O <-- OK, P <-- Pendência)");
		statusAluno = entradaDeCaractere.next().charAt(0);
		
		System.out.print("Digite a primeira nota: ");
		nota1 = entradaDeNotas.nextDouble();
		
		System.out.print("Digite a segunda nota: ");
		nota2 = entradaDeNotas.nextDouble();
		
		System.out.print("Digite a terceira nota: ");
		nota3 = entradaDeNotas.nextDouble();
		
		System.out.print("Digite a quarta nota: ");
		nota4 = entradaDeNotas.nextDouble();
		
		System.out.print("Digite a frequência do(a) aluno(a): ");
		frequencia = entradaDeNotas.nextDouble();
		
		totalNotas = nota1 + nota2 + nota3 + nota4;
		
		aprovado = totalNotas >= 70 && frequencia >= 0.75;
		
		System.out.printf("O (a) aluno(a) %s obteve nota final %.2f e frequência %.2f%%. A situação do(a) aluno(a) é %c.\n"
				+ "Aluno aprovado? %b.", nomeAluno, totalNotas, frequencia * 100, statusAluno, aprovado);
	
		
	}

}
