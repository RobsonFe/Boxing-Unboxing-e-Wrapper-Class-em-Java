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
		
		leia.close();

	}

}
