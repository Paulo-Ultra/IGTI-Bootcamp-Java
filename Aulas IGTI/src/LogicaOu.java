
public class LogicaOu {
	public static void main(String[] args) {
		boolean p, q, s;
		p = false; q = false;
		s = p || q;
		System.out.printf("p: %b; q: %b; s: %b\n", p, q, s);
		
	
		p = true; q = false;
		s = p || q;
		System.out.printf("p: %b; q: %b; s: %b\n", p, q, s);
		
	
		p = false; q = true;
		s = p || q;
		System.out.printf("p: %b; q: %b; s: %b\n", p, q, s);
		
	
		p = true; q = true;
		s = p || q;
		System.out.printf("p: %b; q: %b; s: %b\n", p, q, s);
	}

}
