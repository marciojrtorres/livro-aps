package aps.livro;

public class SimpleContatoDB {
	
	public void salva(String nome, String telefone) {

		// sabendo que o SGBD é MySQL registramos o Driver:
		Class.forName("com.mysql.jdbc.Driver");

		// com as credenciais e considerando um banco de dados agenda estabelecmos a conexão
		Connection conexao = DriverManager
				.getConnection("jdbc:mysql://localhost:3306/agenda", "root", "asenha");

		// usando a conexão estabelecida criamos um comando
		Statement comando = conexao.createStatement();

		// com o comando executamos uma instrução que retorna o número de registros afetados
		int linhasInseridas = comando.execute("INSERT INTO contatos VALUES ('"
			+ nome + "', '" + telefone + "')");

		// tudo feito, fechamos a conexão
		conexao.close();

	}

}