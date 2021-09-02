import java.util.*;
public class CondicionalIfElseExemplo {

	public static void main(String[] args) {

		double n1, n2, n3, total, mediaAvaliacoes, frequencia;
		String situacao;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite a primeira nota: ");
		n1 = entrada.nextDouble();
		
		System.out.print("Digite a segunda nota: ");
		n2 = entrada.nextDouble();
		
		System.out.print("Digite a terceira nota: ");
		n3 = entrada.nextDouble();
		
		total = n1 + n2 + n3;
		mediaAvaliacoes = total / 3;
		
		System.out.println("Digite a frequ�ncia do(a) aluno(a): ");
		frequencia = entrada.nextDouble();
		
		if (total >= 70 && frequencia >= 0.75)
			situacao = "Aprovado";
		else if (total >= 40 && total < 70 && frequencia >= 0.75)
			situacao = "Recupera��o";
		else
			situacao = "Reprovado";
		
		System.out.printf("O(a) aluno(a) obteve nota total %.2f e m�dia de avalia��o de %.2f. A frequ�ncia foi %.2f."
				+ "Com isso o(a) aluno(a) est� %s.", total, mediaAvaliacoes, frequencia * 100, situacao);
		
		
		
	}

}
