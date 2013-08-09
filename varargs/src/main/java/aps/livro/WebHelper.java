package aps.livro;

public class WebHelper {
     
    public static String caminhoPao(String nivel1) {
        return nivel1;
    }
     
    public static String caminhoPao(char separador, String nivel1, String nivel2) {
        StringBuilder caminho = new StringBuilder(nivel1);
        return caminho.append(" ")
                      .append(separador)
                      .append(" ")
                      .append(nivel2)
                      .toString();
    }
     
    public static String caminhoPao(char separador, String nivel1, String nivel2,
                                    String nivel3) {

        StringBuilder caminho = new StringBuilder(nivel1);
        return caminho.append(" ")
                      .append(separador)
                      .append(" ")
                      .append(nivel2)
                      .append(" ")
                      .append(separador)
                      .append(" ")
                      .append(nivel3)
                      .toString();
    }

    // Em vez de sobrecarregar os métodos experimente criar um método
    // variádico:
    
    public static String caminhoPaoVar(char separador,
                                       String nivel1, String... demaisNiveis) {
 
        StringBuilder caminho = new StringBuilder(nivel1);
                 
        for (String nivel : demaisNiveis) {
            caminho.append(" ")
                    .append(separador)
                    .append(" ")
                    .append(nivel);
        }
         
        return caminho.toString();
    }
     
}
 
