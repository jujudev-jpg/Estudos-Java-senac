package atividadesaula06;

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		// problema exemplo
		
		//plano básico : 50reais -> 100min
		//a cada 1min a mais + 2reais
		
		Scanner sc = new Scanner(System.in);
		double valor1;
		double valor = 50;
		
		System.out.println("Minutos de telefone: ");
		valor1 = sc.nextDouble();
		
		
		if(valor1 > 100) {
			valor = valor + (valor1 - 100) * 2;
		}
		
		System.out.println("O valor a ser pago será R$"+valor);
		sc.close();
	}

}
