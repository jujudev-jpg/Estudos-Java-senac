package atividadesaula09;

import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int x; String nome, endereco; double y;
		System.out.println("Nome: ");
		nome = ler.next();
		System.out.println("Endereço: ");
		ler.nextLine();//bug no comendo nextLine
		endereco = ler.nextLine();
		System.out.println("X: ");
		x = ler.nextInt();
		System.out.println("Y: ");
		y = ler.nextDouble();
		System.out.printf("Nome: " + nome + "Endereço: " + endereco);
		System.out.println("X: " + x + "Y: " + y);

	}

}
