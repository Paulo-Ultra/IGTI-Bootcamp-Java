import java.util.*;
public class UsoDoSwitch {

		public static void main(String[] args) {
			double n1 = 0, n2 = 0;
			double total = 0;
			char operacao = ' ';
			Scanner ent = new Scanner(System.in);
			
			System.out.println("Digite o primeiro valor: ");
			n1 = ent.nextInt();
			System.out.println("Digite o segundo valor: ");
			n2 = ent.nextInt();
			
			ent.nextLine();
			
			System.out.println("Digite a operação desejada (+,-,*,/,%): ");
			operacao = ent.nextLine().charAt(0);
			
			switch (operacao) {
			    case '+':
			        total = n1 + n2;
			    break;
			   
			    case '-':
			        total = n1 - n2;
			    break;
			    
			    case '*':
			        total = n1 * n2;
			    break;
			   
			    case '/':
			        total = n1 / n2;
			    break;
			    
			    case '%':
			        total = n1 % n2;
			    break;
			    default:
			      System.out.println ("Operação desconhecida.");
			  }
			if (operacao == '+' || operacao == '-' || operacao == '*' || operacao == '/' || operacao == '%')
			    System.out.printf("%.2f %c %.2f = %.2f", n1, operacao, n2, total);
		}
	}
