
public class StringMetodos {

	public static void main(String[] args) {

		String nome, nome2;
		nome = "José da silva Costa";
		nome2 = "Maria Clara Souza Vieira";
		
		System.out.println(nome);
		System.out.println(nome2);
		
		int tamanhoDoNome = nome.length(), tamanhoDoNome2 = nome2.length();
		
		System.out.println("A variável nome tem " + tamanhoDoNome + " caracteres");
		System.out.println("A variável nome2 tem " + tamanhoDoNome2 + " caracteres");
		int totalDeCaracteres = tamanhoDoNome + tamanhoDoNome2;
		System.out.println("O número total de caracteres das duas strings é: " + totalDeCaracteres);
		
		String nomeConcatenados = nome.concat(nome2);
		System.out.println(nomeConcatenados);
		
		String nomeSemA = nome.replace('a', '8');
		System.out.println(nomeSemA);
		
		String somenteNome = nome2.substring(0, 11);
		System.out.println(somenteNome);
		
		String tudoMaiusculo = nome.toUpperCase();
		System.out.println(tudoMaiusculo);
		
		String tudoMinusculo = nome.toLowerCase();
		System.out.println(tudoMinusculo);

	}

}
