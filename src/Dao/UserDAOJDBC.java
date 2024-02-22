
package Dao;

import Conexao.Conect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import projhln.ClassProd;
import projhln.ClasseUsuario;

public class UserDAOJDBC implements UserDAO {

     
     Connection conexao = null;
    PreparedStatement sql = null;
    ResultSet rset = null;
    
    @Override
    public int inserir(ClasseUsuario id) {
          StringBuilder sqlBuilder = new StringBuilder();
        sqlBuilder.append("insert into usuario(num, usuari, senha)").append("values(?, ?, ?)");
     
        String insert = sqlBuilder.toString();
        int linha = 0;
        try {
            conexao = Conect.getConexao();

            sql = (PreparedStatement) conexao.prepareStatement(insert);
            
            sql.setInt(1, id.getEstq());
            sql.setString(2, id.getUser());
            sql.setString(3, id.getSenha());
         
             
               
             
            linha = sql.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            fecharConexao();
        }
        
        return linha;
    }
    

    @Override
    public List<ClasseUsuario> listar() {
            
        String select = "SELECT * FROM usuario";

        List<ClasseUsuario> Usuarios = new ArrayList<ClasseUsuario>();

        try {
            conexao = Conect.getConexao();

            sql = (PreparedStatement) conexao.prepareStatement(select);

            rset = sql.executeQuery();

            while (rset.next()) {

                ClasseUsuario user = new ClasseUsuario();
                
                
                user.setUser(rset.getString("Usuari"));
                user.setSenha(rset.getString("Senha"));
                user.setEstq(rset.getInt("num"));
              //  System.out.println(" = " + user.getEstq());
                Usuarios.add(user);

            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            fecharConexao();
        }

        return Usuarios;
    }

private void fecharConexao() {
        try {
            if (rset != null) {
                rset.close();
            }
            if (sql != null) {
                sql.close();
            }

            if (conexao != null) {
                conexao.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
