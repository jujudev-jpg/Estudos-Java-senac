package atividadesaula08;

import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int num;

		System.out.println("Insira um valor para saber se é par ou ímpar: ");
		num = sc.nextInt();

		int parouimpar = num % 2;

		if (parouimpar == 0) {
			System.out.println("Par");
		} // fim if
		else {
			System.out.println("Impar");
		} // fim else

		sc.close();
	}// fim main

}// fim class
