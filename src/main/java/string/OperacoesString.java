package string;

import org.apache.commons.lang3.StringUtils;

import javax.swing.*;
import javax.swing.text.MaskFormatter;
import java.awt.*;
import java.text.ParseException;

public class OperacoesString {
	
	public static void main(String[] args) {
		preencheString();
	}
	
	// Preencher uma string com caracteres a esqueda leftPad ou a direita rightPad
	// Precisa baixar o jar do StringUtils https://mvnrepository.com/artifact/org.apache.commons/commons-lang3/3.10
	public static void preencheString() {		
//		String nome1 = "Nome maior que 5";
//		String nome2 = "123";
//
//		nome1 = (nome1.length() < 5 ? StringUtils.leftPad(nome1, 5, "#") : "Entrou no truncate");
//		nome2 = (nome2.length() < 5 ? StringUtils.leftPad(nome2, 5, "#") : "Não entrou no truncate");
//
//		System.out.println("Nome1: " + nome1);
//		System.out.println("Nome2: " + nome2);
//
//		String frase = "primeira letra maiuscula";
//		String fMaiuscula = StringUtils.capitalize(frase);
//		System.out.println(fMaiuscula);

		//String cpfCnpj = "05012993942";
		String cpfCnpj = "hhhhhhhhhhhhhhhhhhhh";


		System.out.println(cpfCnpj.substring(3,cpfCnpj.length()-2));

		try {
			String mascara = "###.###.###-##";
			if (cpfCnpj.length() > 11) {
				mascara = "##.###.###/####-##";
			}

			MaskFormatter formatador = new MaskFormatter(mascara);
			formatador.setValidCharacters("1234567890");
			formatador.setValueContainsLiteralCharacters(false);
			String cpfFormatado = formatador.valueToString(cpfCnpj);
			System.out.println(cpfFormatado);
			String testeFormatado = "***" + cpfFormatado.substring(3,cpfFormatado.length()-2) + "**";
			System.out.println(testeFormatado);
		} catch (ParseException e) {
			throw new RuntimeException("Valor gerado não bate com o padrão: ", e);
		}


	}
	

}
