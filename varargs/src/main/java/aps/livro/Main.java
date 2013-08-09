package aps.livro;

public class Main {

    public static void main (String[] args) {
    	
        // situação de uso:
        // Home > Eletrônicos
        System.out.println(WebHelper.caminhoPao('>', "Home","Eletrônicos"));
        // Home > Eletrônicos > TV's
        System.out.println(WebHelper.caminhoPao('>', "Home","Eletrônicos","TV's"));
        
        // não é possível (não há quarto nível na sobrecarga)
        // System.out.println(WebHelper.caminhoPao('>', "Home","Eletrônicos","TV's","LED")); 

        // mas é possível com varargs usar um número "infinito" de argumentos
        System.out.println(WebHelper.caminhoPaoVar('>', "Home","Eletrônicos","TV's","LED")); 
        
    }

}
