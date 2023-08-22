package atividadesaula08;

public class ex05 {

	public static void main(String[] args) {
		int media = 5;
		
		switch (media) {
		case 0, 1, 2:
			System.out.println("SEM CONCEITO");
			break;
		case 3, 4, 5:
			System.out.println("CONCEITO: REGULAR");
			break;
		case 6, 7, 8:
			System.out.println("CONCEITO: BOM");
			break;
		case 9,10:
			System.out.println("CONCEITO: MUITO BOM");
			break;
		default:
			System.out.println("MÉDIA É DE 0 A 10 ");
			break;
		}

	}

}
