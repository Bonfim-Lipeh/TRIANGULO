package utilidades;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class FuncoesUteis {
	
	//introdução do método soma
	public int soma(int a, int b){
		return a + b;
	}
	
	//método de construção do triangulo
	public void triangulo(int altura) {
		
		for(int i = 1; i <= altura; i++) { // for para implementar espaços
			for(int j = 1; j < i; j++) {// for para implementar o x, em relação aos espaços
				System.out.print("x");
			}
			
			System.out.println();
		}
	}
	
	//introduzindo o String arquivo para imprimir o resultado para o usuário
	public static void printArquivo(String arquivo) {
        try {
            File meuArquivo = new File(arquivo);
            Scanner leitor = new Scanner(meuArquivo);
            while (leitor.hasNextLine()) {
                String linha = leitor.nextLine();
                System.out.println(linha);
            }
            leitor.close();
        } catch (FileNotFoundException excessao) {
            System.out.println(arquivo);
        }
    }
}