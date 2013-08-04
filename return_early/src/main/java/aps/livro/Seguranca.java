package aps.livro;

public class Seguranca {
	
	public enum NivelAcesso {
		Nenhum, Visitante, Operador, Administrador;
	}

	public static NivelAcesso privilegio1(Usuario usuario) {
		NivelAcesso nivel = null;

		if (!usuario.isBloqueado()) {
			if (usuario.getCargo() != null) {
				if (usuario.getCargo() == Usuario.Cargo.Gerente) {
					nivel = NivelAcesso.Administrador;
				} else if (usuario.getCargo() == Usuario.Cargo.Funcionario) {
					nivel = NivelAcesso.Operador;
				}
			} else {
				nivel = NivelAcesso.Visitante;
			}
		} else {
			nivel = NivelAcesso.Nenhum;
		}

		return nivel;		
	}

	public static NivelAcesso privilegio2(Usuario usuario) {

		if (usuario.isBloqueado()) {
			return NivelAcesso.Nenhum;
		}

		if (usuario.getCargo() == null) {
			return NivelAcesso.Visitante;
		}

		if (usuario.getCargo() == Usuario.Cargo.Gerente) {
			return NivelAcesso.Administrador;
		}

		if (usuario.getCargo() == Usuario.Cargo.Funcionario) {
			return NivelAcesso.Operador;
		}

		return NivelAcesso.Visitante;
	}
}