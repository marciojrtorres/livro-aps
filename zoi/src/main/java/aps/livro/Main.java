package aps.livro;

public class Main {

	public static void main (String[] args) {
		
		Bolsa bolsa = new Bolsa(10);

		bolsa.adiciona("C#", "Java", "Python", "Ruby");

		for (Object o : bolsa) {
			System.out.println(o);
		}

	}

}
