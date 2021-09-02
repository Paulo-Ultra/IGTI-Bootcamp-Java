package PacotePrincipal;
import java.util.*;

public class ClassePrincipal {

		public static void main(String[] args) {
			Scanner ent = new Scanner (System.in);
			
			Pessoa p1 = new Pessoa();
			p1.nome = "João do Nascimento";
			p1.idade = 25;
			p1.altura = 1.81;
			p1.peso = 70;
			
			System.out.printf("%s\nAno de Nascimento: %d\n", p1.imprimeDados(), p1.anoNascimento());
			
			Pessoa p2 = new Pessoa();
			p2.nome = "Ana Maria";
			p2.idade = 23;
			p2.altura = 1.61;
			p2.peso = 51;
			
			System.out.printf("\n%s\nAno de Nascimento: %d", p2.imprimeDados(), p2.anoNascimento());
			
		}
	}
