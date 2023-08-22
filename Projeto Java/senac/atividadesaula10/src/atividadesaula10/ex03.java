package atividadesaula10;

import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		int[] valor = new int[6];
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < 6; i++) {
			System.out.print("Valor["+i+"]: ");
			valor[i] = sc.nextInt();
		}//fim do for
		for(int i = 5; i>=0; i--) {
			System.out.println("Valor["+i+"]: " + valor[i]); 
		}//fim do for
	}//fim do main
}//fim do class
