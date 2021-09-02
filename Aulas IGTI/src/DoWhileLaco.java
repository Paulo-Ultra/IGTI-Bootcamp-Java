import java.util.*;

public class DoWhileLaco {

		public static void main(String[] args) {
		    char continuar = 'N';
		    Scanner entrada = new Scanner(System.in);
		    
		   /* System.out.println("Deseja continuar? (S - Sim ou N - Não) ");
		    continuar = entrada.nextLine().charAt(0);
		    while (continuar == 'S') {
		        System.out.println("Mensagem");
		        System.out.println("Deseja continuar? (S - Sim ou N - Não) ");
		        continuar = entrada.nextLine().charAt(0);
		    }*/
		    
		    do {
		        System.out.println("Mensagem");
		        System.out.println("Deseja continuar? (S - Sim ou N - Não) ");
		        continuar = entrada.nextLine().charAt(0);
		    } while (continuar == 'S'); 
		    
		}
	}
