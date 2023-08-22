package atividadesaula09;

import java.util.Scanner;

public class ex09 {

	public static void main(String[] args) {
		int idade;
		int contMaioridade = 0;
		
		Scanner sc = new Scanner(System.in);
		
		for (int x = 1; x <= 5; x++) {
			System.out.print("Idade: ");
			idade = sc.nextInt();
			
			if (idade >= 18) {
				contMaioridade++;
			}//fim if

			System.out.println("Maiores que 18: " + contMaioridade);
		}//fim for

	}//fim main
}//fim class