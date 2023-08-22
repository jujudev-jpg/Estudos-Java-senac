package orientacao_objeto;

public class Carro{
//Atributos
	public String  marca;
	public String modelo;
	public int ano;
	public boolean ligado;
	
	
//construtor
	this.marca = marca;
	this.modelo = modelo;
	this.ano = ano;
	this.ligado = false;
	
	

}

//Métodos
public void ligar() {
	if(ligado) {
		ligado=true;
		System.out.println("O carro está desligado!");
		
	}else {
		System.out.println("O carro está desligado!");		
		
	}
}

public void desligar() {
	if(ligado) {
		System.out.println("O carro está acelerando");
		
	}else {
		System.out.println("O carro precisa estar ligado");		
		
	}
}

public void acelerar() {
	if(ligado) {
		System.out.println("O carro está acelerando");
		
	}else {
		System.out.println("O carro precisa estar ligado");		
		
	}
}

public void frear() {
	if(ligado) {
		System.out.println("O carro está freando");
		
	}else {
		System.out.println("O carro precisa estar ligado para frear");		
		
	}
}

public void imprimir(){
	System.out.println("Marca: "+marca);
	System.out.println("Modelo: "+modelo);
	System.out.println("Ano: "+ano);
	System.out.println("Estado: "+ligado);
}