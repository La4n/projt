
package Conexao;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexaoSql {
       private static final String USUARIO = "root";
    private static final String SENHA = "Hirl@n6341";
    private static final String URL_BANCO = "jdbc:mysql://localhost:3306/Estoque";
    
    public static Connection getConexao() throws Exception {
        //Faz com que a classe seja carregada pela JVM
        Class.forName("com.mysql.cj.jdbc.Driver");
//cj?
        //Cria a conexao com o banco de dados
        return DriverManager.getConnection(URL_BANCO, USUARIO, SENHA);

}
}
