package designpatterns;

public class Frete {
	
	private DistanciaStrategy distancia;
	private double valor;
	
	public Frete(DistanciaStrategy distancia) {
		this.distancia = distancia;
	}
	
	public void calcula() {		
		valor = distancia.calcula();
	}

	public DistanciaStrategy getDistancia() {
		return distancia;
	}

	public double getValor() {
		return valor;
	}

}
