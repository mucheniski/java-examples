package designpatterns;

public class DistanciaAte50KM implements DistanciaStrategy {
	
	private int distancia;
	
	public DistanciaAte50KM(int distancia) {
		this.distancia = distancia;
	}

	@Override
	public double calcula() {
		System.out.println("Calculando frete de 11 até 50KM - Valor informado: " + distancia);
		
		if (distancia > 50 || distancia <= 10) {
			throw new RuntimeException("Distância deve ser maior que 10 até 50KM");
		}
		
		return (400 + (8 * distancia)) * 1.4;
	}

}
