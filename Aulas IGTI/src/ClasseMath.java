import java.math.*;

public class ClasseMath {

			public static void main(String[] args) {
			//x^2 + 12x - 13 = 0
			//2x^2 - 16x - 18 = 0
			
			double a, b, c;
			a = 1;
			b = 12;
			c = -13;
			
			double delta = 0;
			
			delta = (b * b) - (4 * a * c);
			
			System.out.printf("O valor do delta ?: %.0f\n", delta);
			
			double x_Linha = 0;
			x_Linha = (-b + Math.sqrt(delta)) / (2 * a);
			System.out.printf("O valor de x' ?: %.2f\n", x_Linha);
			
			double x_DuasLinhas = 0;
			x_DuasLinhas = (-b - Math.sqrt(delta)) / (2 * a);
			System.out.printf("O valor de x'' ?: %.2f", x_DuasLinhas);
			
		}
}

	

