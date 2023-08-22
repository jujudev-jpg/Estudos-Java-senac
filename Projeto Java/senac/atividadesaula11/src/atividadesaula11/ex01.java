package atividadesaula11;

import java.util.Scanner;

public class ex01 {

	public static double scan() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a temperatura em Celsius: ");
		sc.close();
		return sc.nextDouble();
		
	}
	
	public static char scanc() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Deseja repetir sim ou não? s/n"+repeticao());
		return scanc();
	}
	
	public static char repeticao() {
		char resp = 's';
		
		while(resp != 'n'){
			
			System.out.print(scan());
		}
		
		if(resp == 'n'){
			System.out.println("Obrigada por usar nosso sistema!");
		}
		return resp;
		
	}
	
	public static void main(String[] args) {
		double c;
		c = scan();
		double formulaf = (9*c)/5+32;
		char s = 's';
		
		System.out.printf("Equivalente em Fahrenheit: %.1f%n",formulaf);
		System.out.println(scanc());
		

	}

}
