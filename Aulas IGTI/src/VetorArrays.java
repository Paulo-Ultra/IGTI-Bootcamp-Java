import java.util.*;
public class VetorArrays {
	
	
	  public static void main (String[]args)  {
	    
	    //tipo [] nome = new tipo [tamanho];
	    int[] numeros = new int[5];
	    int total = 0;
	    Scanner ent = new Scanner(System.in);
	    
	        System.out.println ("Digite o primeiro n�mero: ");
	        numeros[0] = ent.nextInt();
	        
	        System.out.println ("Digite o segundo n�mero: ");
	        numeros[1] = ent.nextInt();
	        
	        System.out.println ("Digite o terceiro n�mero: ");
	        numeros[2] = ent.nextInt();
	        
	        System.out.println ("Digite o quarto n�mero: ");
	        numeros[3] = ent.nextInt();
	        
	        System.out.println ("Digite o quinto n�mero: ");
	        numeros[4] = ent.nextInt();

	        total = numeros[0] + numeros[1] + numeros[2] + numeros[3] + numeros[4];
	    
	    System.out.printf("O total da soma �: %d.", total);
	  }
	}