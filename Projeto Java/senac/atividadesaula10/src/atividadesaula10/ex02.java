package atividadesaula10;

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		String[]pais;
		pais = new String[5];
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i<5; i++) {
			System.out.println("PAIS["+i+"]: ");
			pais[i]=sc.next();
		}//fim for
		
		for (int i = 0; i < 5; i++) {
			System.out.println("PAIS["+i+"]: "+ pais[i]);
		}//fim for
	}//fim main

}//fim class
