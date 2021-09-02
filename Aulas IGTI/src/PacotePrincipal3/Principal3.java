package PacotePrincipal3;

public class Principal3 {

	public static void main(String[] args) {
		
		Carro c1 = new Carro();
		c1.setnPortas(4);
		c1.setMarca("Fiat");
		c1.setModelo("Palio");
		c1.setnCavalos(150);
		System.out.printf("Marca: %s\nModelo: %s\nNúmero de Cavalos: %d\nNúmero de portas: %d", c1.getMarca(), c1.getModelo(), 
				c1.getnCavalos(), c1.getnPortas());
	}

}
