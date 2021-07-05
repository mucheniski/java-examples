package classe;

public class MetodosEmClasses {

    public static void main(String[] args) throws NoSuchFieldException {

        Pessoa pessoa = new Pessoa();

        var campo = Pessoa.class.getField("nome");
        System.out.println(campo);

    }

}
