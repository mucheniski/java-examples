package string;

import org.apache.commons.lang3.StringUtils;

public class OperacoesString {
	
	public static void main(String[] args) {
		preencheString();
	}
	
	// Preencher uma string com caracteres a esqueda leftPad ou a direita rightPad
	// Precisa baixar o jar do StringUtils https://mvnrepository.com/artifact/org.apache.commons/commons-lang3/3.10
	public static void preencheString() {		
		String nome1 = "Nome maior que 5";
		String nome2 = "123";
		
		nome1 = (nome1.length() < 5 ? StringUtils.leftPad(nome1, 5, "#") : "Entrou no truncate");
		nome2 = (nome2.length() < 5 ? StringUtils.leftPad(nome2, 5, "#") : "Entrou no truncate");
		
		System.out.println("Nome1: " + nome1);
		System.out.println("Nome2: " + nome2);

		String frase = "primeira letra maiuscula";
		String fMaiuscula = StringUtils.capitalize(frase);
		System.out.println(fMaiuscula);
	}
	

}
