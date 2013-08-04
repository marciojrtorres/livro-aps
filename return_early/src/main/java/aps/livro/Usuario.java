// Usuario.java
package aps.livro;

public class Usuario {

	public enum Cargo {
		Gerente, Funcionario;
	}

	
	private String nome;

	private Cargo cargo;

	private boolean bloqueado;


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