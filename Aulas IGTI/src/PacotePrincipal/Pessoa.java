package PacotePrincipal;

public class Pessoa {

	int idade;
	double altura;
	double peso;
	String nome;
	
	String imprimeDados(){
	    return "Nome: " + nome + "\nIdade: " + Integer.toString(idade) + "\nPeso: " + Double.toString(peso) + "\nAltura: " + Double.toString(altura);
	}
		
	int anoNascimento() {
	    return 2021 - idade;
	}
		
	
}

