import java.util.*;

public class ArrayComFor {


	  public static void main (String[]args)  {
	    
	    //tipo [] nome = new tipo [tamanho];
	    int[] numeros = new int[5];
	    int total = 0, i = 0;
	    Scanner ent = new Scanner(System.in);
	    
	    for (i = 0; i < 5; i++) {
	        System.out.printf ("Digite o %dº número: ", i+1);
	        numeros[i] = ent.nextInt();
	        total = total + numeros[i];
	        System.out.printf("Total parcial: %d \n", total);
	    }
	   
	    System.out.printf("O total da soma é: %d.", total);
	  }
	}
