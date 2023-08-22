package atividadesaula10;

import java.util.Scanner;

public class ex06 {
	
	public static int somar(int n1, int n2){
		int soma;
		soma = n1+n2;
		return soma;
	}
	public static int lerNr(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um número inteiro: ");
		return sc.nextInt();
	}

	public static void main(String[] args) {
		int nr1, nr2;
		nr1 = lerNr();
		nr2 = lerNr();
		System.out.println("A soma é: "+somar(nr1, nr2));

	}

}
