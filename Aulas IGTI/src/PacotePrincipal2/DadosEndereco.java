package PacotePrincipal2;

public class DadosEndereco {

	String logradouro;
	int numero;
	String complemento;
	String cidade;
	String estado;
	String cep;
	
	String imprimirDadosEndereco( ) {
		return "\nRua " + logradouro + ", " + Integer.toString(numero) + ", " + "\nCidade: " + cidade + "\nEstado: " + estado + "\nCEP " + cep;
	}
}
