package designpatterns;

public class DistanciaAcimaDe50KM implements DistanciaStrategy {
	
	private int distancia;
	
	public DistanciaAcimaDe50KM(int distancia) {
		this.distancia = distancia;
	}

	@Override
	public double calcula() {
		System.out.println("Calculando frete acima 50KM - Valor informado: " + distancia);
		
		if (distancia <= 50) {
			throw new RuntimeException("Distância deve ser maior 50KM");
		}
		
		return (600 + (10 * distancia)) * 1.7;
	}

}
