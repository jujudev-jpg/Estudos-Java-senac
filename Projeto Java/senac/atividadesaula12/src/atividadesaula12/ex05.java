package atividadesaula12;

import java.util.Scanner;

public class ex05 {
	
	public static void main(String[] args) {
		int numeroUsuario;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um número: ");
		numeroUsuario = sc.nextInt();
		
		
		
		if ( numeroUsuario%2==0) {
			System.out.println("Seu número é par!");
			
		} else {
			System.out.println("Seu número é ímpar!");

		}
		
		sc.close();
	}

}
