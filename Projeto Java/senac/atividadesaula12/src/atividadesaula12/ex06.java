package atividadesaula12;

import java.util.Scanner;

public class ex06 {

	public static void main(String[] args) {
		// lanchonete
		/*			Cardápio da lanchonete
		 * Descrição do produto    cod		preço
		 * cachorro quente         100  	R$8,0
		 * */
		Scanner sc = new Scanner(System.in);
		int cod,qtd;
		double preco, total = 0;
		
		System.out.println("======== Lanchonete Senac =========");
		System.out.println("Código | Descrição       | Preço  ");
		System.out.println("  100  | Cachorro Quente | R$ 8,00");
		System.out.println("  200  | Hambúrguer      | R$ 13,00");
		System.out.println("  300  | Batata Frita    | R$ 10,00");
		System.out.println("  400  | Refrigerante    | R$ 5,00");
		System.out.println("Digite 0 para encerrar o pedido!");
		
		do {
			System.out.print("Digite o código do item: ");
			cod=sc.nextInt();
			if(cod == 0){
				break;
			}
			
			System.out.println("Digite a quantidade deseja: ");
			qtd=sc.nextInt();
			
			switch(cod) {
			case 100:
				preco = 8.00;
				System.out.println("Cachorro quente | Quantidade: " + qtd + "| Preço Total: R$" + (preco * qtd));
				total+=preco*qtd;
				break;
				
			case 200:
				preco = 13.00;
				System.out.println("Hambúrguer      | Quantidade: " + qtd + "| Preço Total: R$" + (preco * qtd));
				total+=preco*qtd;
				break;
				
			case 300:
				preco = 8.00;
				System.out.println("Batata Frita    | Quantidade: " + qtd + "| Preço Total: R$" + (preco * qtd));
				total+=preco*qtd;
				break;
				
			case 400:
				preco = 8.00;
				System.out.println("Refrigerante    | Quantidade: " + qtd + "| Preço Total: R$" + (preco * qtd));
				total+=preco*qtd;
				break;
				
			default:
				System.out.println("Código inválido!");
				break;
			}
			
			
		}while(true);
		System.out.println("Total do Pedido: R$" +total);
		sc.close();
	}

}
