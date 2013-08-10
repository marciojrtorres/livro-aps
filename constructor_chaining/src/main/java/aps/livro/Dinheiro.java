package aps.livro;


public class Dinheiro {
     
    private String simbolo;
    private String moeda;
    private int inteiro;
    private int decimal;
 
    public Dinheiro(String simbolo, String moeda, int inteiro, int decimal) {
        this.simbolo = simbolo;
        this.moeda = moeda;
        this.inteiro = inteiro;
        this.decimal = decimal;


        // a validação pode ser feita neste construtor apenas
        // já que os demais construtores chamam este (centralizam neste):
        
        if (inteiro < 0) {
            throw new IllegalArgumentException("inteiro negativo: " + inteiro);
        }
        if (decimal < 0) {
            throw new IllegalArgumentException("decimal negativo: " + decimal);
        }

    }

    // os construtores a seguir facilitam a inicialização do objeto
    // disponibilizando valores default na chamada ao construtor
    // completo

    public Dinheiro(int inteiro, int decimal) {
        this("R$", "Real", inteiro, decimal); // este construtor chama o construtor completo
    }
     
    public Dinheiro(int inteiro) {
        this("R$", "Real", inteiro, 0); // este construtor chama o construtor completo
    }
 
    public String getSimbolo() { return simbolo; }

    public String getMoeda() { return moeda; }
 
    public int getInteiro() { return inteiro; }
 
    public int getDecimal() { return decimal; }
 
    @Override
    public String toString() {
        return simbolo + " " + inteiro + "," + decimal;
    }
 
}