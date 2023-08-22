package senac;
import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		float num1, num2;
		
		System.out.println("Insira o primeiro valor: ");
		num1 = sc.nextFloat();
		System.out.println("Insira segundo valor: ");
		num2 = sc.nextFloat();
		
		
		float soma = num1 + num2;
		float sub = num1 - num2;
		float mult = num1 * num2;
		float div = num1 / num2;
		float res = num1 % num2;
		
		System.out.println("A soma dos valores foi: " + soma);
		System.out.println("A subtração dos valores foi: " + sub);
		System.out.println("A multiplicação dos valores foi: " + mult);
		System.out.println("A divisão dos valores foi: " + div);
		System.out.println("O resto da divisão é: " + res);
		
		sc.close();

	}

}
