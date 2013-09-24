package aps.livro;

public class Main {

    public static void main (String[] args) {
    	
        // está claro quantos lados tem o dado?
        Dado dado = new Dado();
        dado.joga();
        System.out.println(dado);

        // está claro que 10 significa o número de lados?
        dado = new Dado(10);

        // métodos estáticos de fabricação tornam o código legível
        dado = Dado.deDezLados();
        dado.joga();
        System.out.println(dado);

        // métodos fábrica são mais comunicativos que construtores
        dado = Dado.lados(18);
        dado.joga();
        System.out.println(dado);
        
    }

}
