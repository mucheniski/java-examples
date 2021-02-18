package designpatterns;

/*
 * https://github.com/design-patterns-for-humans/brazilian-portuguese
 * */

public class Programa {

	public static void main(String[] args) {

		try {
			Frete frete = new Frete(new DistanciaAte50KM(50));
			frete.calcula();
			System.out.println(frete.getValor());
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
