package aps.livro;

public class Main {

	public static void main (String[] args) {
		
        // situação de uso (construtor único):
		Dinheiro valor1 = new Dinheiro("R$", "Real", 45, 12);
		Dinheiro valor2 = new Dinheiro("£", "Libra", 34, 12);

		System.out.println(valor1);
		System.out.println(valor2);

		// situação de uso (construtor com defaults):
		Dinheiro valor3 = new Dinheiro(45, 12); // R$ 45,12
		Dinheiro valor4 = new Dinheiro(890);    // R$ 890,00

		System.out.println(valor3);
		System.out.println(valor4);

	}

}
