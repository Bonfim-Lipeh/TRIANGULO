package main;

import utilidades.FuncoesUteis;


public class Main {

	public static void main(String[] args) {

		FuncoesUteis fun1 = new FuncoesUteis();
		int Soma = fun1.soma(6, 600);
		System.out.println("O resultado da soma é:" + Soma);
		
		fun1.triangulo(9);
		
		System.out.println();
		FuncoesUteis.printArquivo("arquivo"); // Substitua "meuArquivo.txt" pelo caminho do seu arquivo
    		
	}

}
