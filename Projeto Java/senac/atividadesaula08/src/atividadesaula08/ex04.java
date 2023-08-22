package atividadesaula08;

import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		String fruta;

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o nome da fruta para saber o valor:");
		fruta = sc.nextLine();

		switch (fruta) {
		case "Maçã", "maça", "maçã", "MAÇÃ":
			System.out.println("Maçã custa R$2,0");
			break;
		case "Melancia":
			System.out.println("Melancia custa R$5.0");
			break;
		case "Morango":
			System.out.println("Morango custa R$4,0");
			break;
		case "Jaca":
			System.out.println("Jaca custa R$3,0");
			break;

		default:
			System.out.println("Não temos essa opção");
		}// fim case

	}// fim main
}// fim class
