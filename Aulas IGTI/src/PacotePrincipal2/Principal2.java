package PacotePrincipal2;

import java.util.*;
public class Principal2 {

	public static void main(String[] args) {

		Pessoa p1 = new Pessoa();
		Scanner entCaracter = new Scanner(System.in);
		Scanner entNumerico = new Scanner(System.in);
		char imprimirEndereco;
		
		System.out.println("Digite o nome: ");
		p1.nome = entCaracter.nextLine();
		
		System.out.println("Digite a idade: ");
		p1.idade = entNumerico.nextInt();
		
		System.out.println("Digite o CPF: ");
		p1.CPF = entCaracter.nextLine();
		
		System.out.println("Digite a rua: ");
		p1.endereco.logradouro = entCaracter.nextLine();
		
		System.out.println("Digite o número da casa: ");
		p1.endereco.numero = entNumerico.nextInt();
		
		System.out.println("Digite o complemento: ");
		p1.endereco.complemento = entCaracter.nextLine();
				
		System.out.println("Digite a cidade: ");
		p1.endereco.cidade = entCaracter.nextLine();
		
		System.out.println("Digite o Estado: ");
		p1.endereco.estado = entCaracter.nextLine();
		
		System.out.println("Digite a CEP: ");
		p1.endereco.cep	= entCaracter.nextLine();

		System.out.println("Deseja imprimir os dados com o endereço? ");
		imprimirEndereco = entCaracter.nextLine().charAt(0);

		
		System.out.printf("%s\n", p1.imprimirDadosPessoa(imprimirEndereco));

		Pessoa p2 = new Pessoa("Carlos Silva", 49, "000115351-07");
		p2.endereco.logradouro = "Avenida B";
		p2.endereco.numero = 892;
		p2.endereco.complemento = "Bairro Nobre";
		p2.endereco.cidade = "São Paulo";
		p2.endereco.estado = "SP";
		p2.endereco.cep = "10578-457";
		
		System.out.printf("\n%s\n", p2.imprimirDadosPessoa('S'));
		
		Pessoa p3 = new Pessoa("Beatriz Lima", 56, "0511819515151", "Avenida Souza", 98, "Casa Fundos", "Curitiba", "PR", "01515355");
		
		System.out.printf("\n%s\n", p3.imprimirDadosPessoa('S'));
		
	}

}
