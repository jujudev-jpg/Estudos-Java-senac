package atividadesaula10;

import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] nome = new String[3];
		int [] idade = new int[3];
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i<3; i++) {
			System.out.println("Nome["+i+"]: ");
			nome[i]=sc.next();
			System.out.println("Idade["+i+"]: ");
			idade[i]=sc.nextInt();
		}
		
		for(int i = 0; i<3; i++) {
			System.out.println("Nome["+i+"]: "+nome[i]);
			System.out.println("Idade["+i+"]"+idade[i]);
		}
	}

}
