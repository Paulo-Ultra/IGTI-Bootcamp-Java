import java.util.Scanner;

public class PraticaIntegrada {

		public static void main(String[] args) {
			Scanner entCaractere = new Scanner(System.in);
	        Scanner entNumero = new Scanner(System.in);

			char operacao = ' ';
			int[] numeros = new int[1000];
			int i = 0, somatorio = 0, contaPares = 0;;
			double media = 0;
			
			do {
			    System.out.printf("Menu de op��es: \n D - para digitar novos n�meros:\n"
			    + "Z - para somat�rio dos n�meros:\n V - visualizar todos os n�meros digitados:\n"
			    + "P - para quantidade de n�meros digitados:\n M - m�dia simples dos n�meros digitados:\n"
			    + "Q -  quantidade de pares:\n S - para sair do programa: ");
			    operacao = entCaractere.nextLine().charAt(0);
			    
			    switch (operacao) {
			        case 'D': 
			            System.out.println ("Digite o n�mero desejado:\n ");
			            numeros[i] = entNumero.nextInt();
			            i++;
			            break;
			            
			          case 'Z':
			            for (int j = 0; j < i; j++) {
			                somatorio = somatorio + numeros[j];
			            }
			            System.out.printf("O somatorio foi: %d\n", somatorio);
			            break;
			            
			           case 'V':
			               for (int j = 0; j < i; j++) {
			               System.out.printf("%d\n", numeros[j]);
			            }
			            break;
			            
			            case 'P':
			                System.out.printf("Foram digitados %d n�meros.\n", i);
			            
			            break;
			            
			            case 'M':
			                for (int j = 0; j < i; j++) {
			                somatorio = somatorio + numeros[i];
			                }       
			                
			                media = somatorio / i;
			                System.out.printf("A m�dia foi: %.2f\n", media);
			                break;
			                
			            case'Q':
			                for (int j = 0; j < i; j++) {
			                    if (numeros[j] % 2 == 0)
			                        contaPares = contaPares +1;
			                } 
			                
			                System.out.printf("A quantidade de n�meros par�s �: %d\n", contaPares);
			                break;
			                
			                case 'S': 
			                break;
			                default: 
			                    System.out.println("Op��o inv�lida");
			                    
			    }
			    
			} while (operacao != 'S');
			
			System.out.println("Fim da execu��o!");
			
		}
	}

