
public class OperadoresPrecedencia {

	public static void main(String[] args) {
		double a, b, c, d, resultado;
		
		a = 10;
		b = 20;
		c = 30;
		d = 10;
		
		resultado = a + b * c / d;
		
		System.out.println("Resultado: " + resultado);
		
		resultado = (a + b) * (c / d);
		
		System.out.println("Resultado: " + resultado);
	
	}

}
