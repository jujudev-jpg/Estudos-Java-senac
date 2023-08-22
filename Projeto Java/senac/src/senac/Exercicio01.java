package senac;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira seu nome: ");
		String x = sc.next();
		System.out.println();
		System.out.println("O seu nome é: "+x);
		
		
		sc.close();
		
	}

}
