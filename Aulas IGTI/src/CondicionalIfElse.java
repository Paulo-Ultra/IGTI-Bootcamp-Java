import java.util.Scanner;

public class CondicionalIfElse {

	public static void main(String[] args) {
		
		char caracterDigitado, resposta = 'K';
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Tente advinhar uma letra de A até Z: ");
		caracterDigitado = entrada.next().charAt(0);
		if (caracterDigitado == resposta)
			System.out.println("Resposta correta");
		else
			System.out.println("Tente novamente");
	}

}
