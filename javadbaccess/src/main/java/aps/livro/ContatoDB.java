package aps.livro;

public class ContatoDB {

	// este bloco inicializa a classe apenas uma vez, então aqui fica o Driver
    static {
        try {        
            Class.forName("com.mysql.jdbc.Driver");        
        } catch (ClassNotFoundException driverNaoEncontrado) {            
            // caso o Driver não seja encontrado o aplicativo é encerrado
            throw new 
                ExceptionInInitializerError("O driver do banco está indisponível");
         // encerrar o aplicativo é prudente, não há como inserir o Driver do banco
         // com o aplicativo em execução (Runtime) (ver o tópico Fail Fast)
        }        
    }
 
    //  método usado para inserir um Contato    
    public void salva(Contato c) {
         
        // importante, conexão e comando são declarados antes do try
        Connection conexao = null;
        Statement comando = null;
 
        // aqui começa a tentativa, qualquer comando dentro do try pode ou não
        // lançar uma exceção
        try {                        
 
            conexao = DriverManager
              .getConnection("jdbc:mysql://localhost:3306/agenda", "root", "root");

            comando = conexao.createStatement();
            comando.execute("INSERT INTO CONTATOS VALUES ('" + c.getNome() 
                                                + "', '" + c.getSobrenome() 
                                                + "', '" + c.getTelefone() + "')");
 
        // o catch é para o caso de uma exceção acontecer
        } catch (SQLException erroSql) {
 
            // neste caso, deixamos estourar, erros não devem ser omitidos
            throw new RuntimeException("Houve um erro SQL", erroSql);
 
        // o bloco finally é executado sempre, seja ou não lançada uma exceção
        } finally {
 
            // as instruções abaixo são necessárias para fechar o comando
            if (comando != null) {
                try { // tenta fechar o comando, isto é, se já não estiver fechado
                    if (!comando.isClosed()) comando.close();
                } catch (SQLException erroSQL) {                    
                    throw new RuntimeException("Erro SQL", erroSQL);
                }                
            }
 
            // as instruções abaixo são necessárias para fechar a conexão
            if (conexao != null) {
                try { // tenta fechar o comando, isto é, se já não estiver fechado
                    if (!conexao.isClosed()) conexao.close();
                } catch (SQLException erroSQL) {
                    throw new RuntimeException("Erro SQL", erroSQL);
                }                
            }            
        }
    }
}