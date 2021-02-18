package designpatterns;

public class DistanciaAte10KM implements DistanciaStrategy {
	
	private int distancia;
	
	public DistanciaAte10KM(int distancia) {
		this.distancia = distancia;
	}	

	@Override
	public double calcula() {
		System.out.println("Calculando frete até 10KM - Valor informado: " + distancia);
		
		if (distancia > 10) {
			throw new RuntimeException("Distância deve ser até 10KM");
		}
		
		return (200 + (5 * distancia)) * 1.2;
	}
	
}
