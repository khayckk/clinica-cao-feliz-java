package factory;

// TODO 1: importe as 3 classes do pacote java.sql que você vai usar:
// Connection, DriverManager e SQLException
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * ConnectionFactory: a "fábrica" de conexões.
 * Só ela sabe o endereço, o usuário e a senha do banco.
 * O resto do sistema (DAO) apenas PEDE uma conexão.
 */
public class ConnectionFactory {

    // Formato da URL:  jdbc:mysql://HOST:PORTA/NOME_DO_BANCO
    // Exemplo:         jdbc:mysql://localhost:3306/meu_banco
    // TODO 2: troque pelo nome do banco que está no seu schema.sql
    private static final String URL = "jdbc:mysql://localhost:3306/NOME_DO_BANCO";

    // TODO 3: usuário e senha do MySQL da SUA máquina
    private static final String USER = "SEU_USUARIO";
    private static final String PASSWORD = "SUA_SENHA";

    /**
     * Abre e devolve uma conexão com o banco.
     * "throws SQLException" = quem chamar este método é obrigado a tratar o erro
     * (banco desligado, senha errada, banco inexistente...).
     */
    public static Connection getConnection() throws SQLException {
        // TODO 4: retorne a conexão usando
        //         DriverManager.getConnection(url, usuario, senha)
        return null; // <- apague esta linha e escreva o return correto
    }
}
