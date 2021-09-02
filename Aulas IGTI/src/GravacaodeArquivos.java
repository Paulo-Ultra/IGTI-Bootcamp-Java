import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class GravacaodeArquivos {

	public static void main(String[] args) {


		try {
			FileWriter arquivo = new FileWriter("C:\\Users\\Grasi\\OneDrive\\Documentos\\Paulo\\saidaDeDados.txt");
			PrintWriter gravarArquivo = new PrintWriter(arquivo);
			
			for (int i = 0; i <= 1000; i++) {
				gravarArquivo.printf("Valor de i: %d%n", i);
				//Nesse tipo de programa de escrever em um arquivo ao invés de usar um "\n" se usa "%n"
			}
			
			gravarArquivo.close();
			arquivo.close();
			
		} catch (IOException e) {
			System.out.println("Ocorreu um erro ao gravar o arquivo " + e.getMessage());
		}
		
		System.out.println("Fim da execução.");
	}

}
