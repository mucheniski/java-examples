package bigdecimal;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/*
 * Documentação BigDecimal Java 8
 * https://docs.oracle.com/javase/8/docs/api/java/math/BigDecimal.htmld
 * */

public class OperacoesBigDeciamal {

    public static void main(String[] args) {

        somaDeUmaLista();

    }


    private static void contasBigDecimal() {
        System.out.println("Subtrai");
        System.out.println(new BigDecimal("2.00").subtract(new BigDecimal("1.1")));

        System.out.println("");
        System.out.println("Soma");
        System.out.println(new BigDecimal("2.00").add(new BigDecimal("1.2")));

        System.out.println("");
        System.out.println("Compara");
        System.out.println(new BigDecimal("2.00").compareTo(new BigDecimal("2.00")));

        System.out.println("");
        System.out.println("Divide");
        System.out.println(new BigDecimal("2.00").divide(new BigDecimal("2.00")));

        System.out.println("");
        System.out.println("Máximo");
        System.out.println(new BigDecimal("2.00").max(new BigDecimal("1.5")));

        System.out.println("");
        System.out.println("Mínimo");
        System.out.println(new BigDecimal("2.00").min(new BigDecimal("1.6")));

        System.out.println("");
        System.out.println("Potência");
        System.out.println(new BigDecimal("2.00").pow(2));

        System.out.println("");
        System.out.println("Multiplica");
        System.out.println(new BigDecimal("2.00").multiply(new BigDecimal("1.8")));

        System.out.println();

        // Verificar se é maior que zero
        BigDecimal big1 = new BigDecimal("0.1");
        BigDecimal big2 = new BigDecimal("0.2");
        BigDecimal bigResult = big1.add(big2);
        System.out.println(bigResult.toString());
        if(bigResult.doubleValue() >= 0){
            System.out.println("\nMaior que zero");
        } else {
            System.out.println("\n Menor que zero");
        }
    }

    // Multiplicar por integer
    public class Payment
    {
        BigDecimal itemCost  = BigDecimal.ZERO;
        BigDecimal totalCost = BigDecimal.ZERO;

        public BigDecimal calculateCost(int itemQuantity, BigDecimal itemPrice)
        {
            itemCost  = itemPrice.multiply(new BigDecimal(itemQuantity));
            totalCost = totalCost.add(itemCost);
            return totalCost;
        }
    }


    // Setar a quantidade de casas decimais manualmente
    public static void casasDecimais() {
        BigDecimal duasCasasDecimais = new BigDecimal(2);
        System.out.println(duasCasasDecimais.setScale(2));
    }


    // Arredondar BigDecimal
    public static void arredodarValores() {

        BigDecimal bg1 = new BigDecimal(16.543242123);
        bg1 = bg1.setScale(2, BigDecimal.ROUND_DOWN);
        System.out.println(bg1);

        BigDecimal bg2 = new BigDecimal(16.543242123);
        bg2 = bg2.setScale(2, BigDecimal.ROUND_UP);
        System.out.println(bg2);

    }

    public static void somaDeUmaLista() {

        List<BigDecimal> numbers = new ArrayList<>();
        numbers.add(new BigDecimal(5.0));
        numbers.add(new BigDecimal(5.0));
        numbers.add(new BigDecimal(5.0));

        BigDecimal sum = numbers.stream().reduce(BigDecimal.ZERO, BigDecimal::add);

        System.out.println("Soma dos BigDecimals: " + sum);
    }

}

