package aps.livro;

public class Main {

	public static void main (String[] args) {
		
		Bolsa bolsa = new Bolsa(10);

		bolsa.adiciona("C#");
		bolsa.adiciona("Java");

		for (Object o : bolsa) {
			System.out.println(o);
		}

	}

}
