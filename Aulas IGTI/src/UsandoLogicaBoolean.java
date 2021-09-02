
public class UsandoLogicaBoolean {

	public static void main(String[] args) {
		boolean ult3ParcelasQuitadas, comprovanteDeRenda, clienteDezestrelas, restricaoDeCredito;
		ult3ParcelasQuitadas = false;
		comprovanteDeRenda = false;
		clienteDezestrelas = true;
		restricaoDeCredito = false;
		
		boolean concederEmprestimo =  (ult3ParcelasQuitadas && comprovanteDeRenda || clienteDezestrelas) && !restricaoDeCredito;
		System.out.printf("Empréstimo concedido? \n%b", concederEmprestimo);
	}

}
