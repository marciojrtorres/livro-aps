package aps.livro;

public class Main {

    public static void main (String[] args) {

        Usuario usuario = new Usuario();

        System.out.println(Seguranca.privilegio1(usuario));
        System.out.println(Seguranca.privilegio2(usuario));

        usuario.setCargo(Usuario.Cargo.Gerente);

        System.out.println(Seguranca.privilegio1(usuario));
        System.out.println(Seguranca.privilegio2(usuario));

        usuario.bloquear();

        System.out.println(Seguranca.privilegio1(usuario));
        System.out.println(Seguranca.privilegio2(usuario));

        Seguranca.geraSenha1(usuario);

        System.out.println(usuario.getSenha());

        usuario.desbloquear();

        Seguranca.geraSenha1(usuario);
        System.out.println(usuario.getSenha());     
        Seguranca.geraSenha2(usuario);
        System.out.println(usuario.getSenha());             

    }

}
