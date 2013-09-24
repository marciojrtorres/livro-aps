package aps.livro;

import static java.lang.Math.random;

public class Dado {
    
    private int numero;
    private final int lados;

    public Dado() {        
        this(6); // cria um dado de seis lados por padrão
    }    

    public Dado(int lados) {
        this.lados = lados;
    }

    public static Dado deDezLados() {
        return new Dado(10); // ou return lados(10); // para acorrentar os métodos
    }

    public static Dado lados(int lados) {
        return new Dado(lados);
    }
   
    public int getNumero() {
        return numero;
    }

    public int getLados() {
        return lados;
    }

    public void joga() {      
        numero = (int) (random() * lados + 1);
    }

    @Override
    public String toString() {
        return String.valueOf(numero);
    }
    
}
