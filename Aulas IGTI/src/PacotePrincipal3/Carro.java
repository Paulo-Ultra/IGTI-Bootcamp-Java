package PacotePrincipal3;

public class Carro {
	
	private int nPortas;
	private String marca;
	private String modelo;
	private int nCavalos;
	
	//SET -> Atribui Valores
	//GET -> Recupera Valores
	
	public int getnPortas() {
		return nPortas;
	}
	
	public void setnPortas(int nPortas) {
		this.nPortas = nPortas;
		// this.nPortas -> Propriedade Nportas recebe o argumento nPortas
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getnCavalos() {
		return nCavalos;
	}

	public void setnCavalos(int nCavalos) {
		this.nCavalos = nCavalos;
	}
	
	
}
