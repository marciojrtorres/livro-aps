// Usuario.java
package aps.livro;

public class Usuario {

    public enum Cargo {
        Gerente, Funcionario;
    }

    private String nome;

    private Cargo cargo;

    private boolean bloqueado;

    private String senha;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getSenha() {
        return senha;
    }

    public void bloquear() {
        this.bloqueado = true;
    }

    public void desbloquear() {
        this.bloqueado = false;
    }

    public boolean isBloqueado() {
        return bloqueado;
    }

}