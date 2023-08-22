package atividadesaula10;

public class Ex01 {

	public static void main(String[] args) {
		String [] animais;
		animais = new String[5];
		animais[0]="cachorro";
		animais[1]="gato";
		animais[2]="coelho";
		animais[3]="vaca";
		animais[4]="cavalo";
		
		for(int i=0; i<4; i++) {
			System.out.println(animais[i]);
		}
		
		for(int i=4; i>0; i++) {
			System.out.println(animais[i]);
		}

	}

}
