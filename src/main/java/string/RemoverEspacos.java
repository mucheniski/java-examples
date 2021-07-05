package string;

public class RemoverEspacos {

    public static void main(String[] args) {

        String data = "2021-06-24T16: 40: 19.129Z";

        System.out.println(data.trim());
        System.out.println(data.replaceAll(" ", ""));

    }

}
