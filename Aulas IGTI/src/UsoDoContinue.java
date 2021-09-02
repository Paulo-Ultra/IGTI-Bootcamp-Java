import java.util.Scanner;

public class UsoDoContinue {

	public static void main(String[] args) {
		    Scanner entrada = new Scanner(System.in);
		    int numero = 0, somatorio = 0;
		    do {
		        
		        System.out.println("Digite os números ou 0 para sair: ");
			numero = entrada.nextInt();
			
			 if (numero == 18)
			        continue;
		        // O continue faz com que o número 18, no caso, não seja somado.
		        
		        somatorio = somatorio + numero;
		        
		    } while (numero > 0);
		
			    
			System.out.printf("O somatório foi: %d.", somatorio);
		}
	}

