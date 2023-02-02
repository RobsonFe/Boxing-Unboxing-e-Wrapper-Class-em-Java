package Aplicacao;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int x = 20;
		
		Object obj = x;
		
		System.out.println(obj);
		
		// Boxing É o processo de conversão de um objeto tipo referência para um objeto tipo valor compatível.
		// onde a variavel "obj" pega o valor da memoria Stack, e coloca em um objeto e aponta para a memoria Heap.
		// Com isso é feito um "encaixotamento" do valor.
		
		int y = (int) obj; 
		// Casting é o processo de conversão de uma variavel. 
		
		System.out.println(y);
		
		// Unboxing É o processo de conversão de um objeto tipo referência para um objeto tipo valor compatível
		// Esse processo vai tirar o valor do objeto e transformar em tipo valor e deixa de ser tipo objeto fazendo esse casting.
		
		char Character;
		int Integer;
		float Float;
		double Double;
		boolean Bolean;
		byte Byte;
		short Short;
		long Long;
		
		// Wrapper Classes são classes equivalentes aos tipos primitivos, ou seja, são compativeis com os tipos primitivos sem precisar fazer casting.
		// Muito utilizado na hora de comparar classes ao banco de dados, por isso é importante usar o tipo classe e não tipo primitivo. 
	 
		// Wrapper Class aceitam valores nulos, caso voce crie uma aplicação onde precise aceitar um valor nulo (onde o usuario tem a opção de colocar os dados ou não) o programa irã funcionar normalmente.
		// Exemplo: Onde o usuario não é obrigado a preencher uma data de aniversario, apenas Nome e CPF.  
		
		// Exemplo de como usar uma Wrapper Class em um Objeto. 
		
		//public class Product {
			
		//	public String name;
		//	public Double price;
		//	public Integer quantity;
		
	    //          	}
		
		
		leia.close();

	}

}
