
package Dao;

import Dao.ProdDAO;
import java.util.List;
import projhln.ClassProd;
import Conexao.ConexaoSql;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import projhln.ClasseUsuario;



public class ProdutoDAOJDBC implements ProdDAO{
    
     Connection conexao = null;
    PreparedStatement sql = null;
    ResultSet rset = null;
 
     @Override
    public int inserir(ClassProd Produto) {
    
         StringBuilder sqlBuilder = new StringBuilder();
        sqlBuilder.append("insert into produtoo(Posicao, Produto, Quantidade, Preco, precoV, estoq)").append("values(?, ?, ?, ?, ?, ?)");
        
    ClasseUsuario user = new ClasseUsuario();
     
        String insert = sqlBuilder.toString();
        int linha = 0;
        try {
            conexao = ConexaoSql.getConexao();

            sql = (PreparedStatement) conexao.prepareStatement(insert);
            
            sql.setInt(1, Produto.getPosicao());
            sql.setString(2, Produto.getProduto());
            sql.setInt(3, Produto.getQuantidade());
            sql.setFloat(4,Produto.getPreco());
            sql.setFloat(5, Produto.getPrecoVenda());
            sql.setInt(6, Produto.getEstq());
            
            System.out.println("stqc = " + user.getEstq());
            
            
            linha = sql.executeUpdate();
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            fecharConexao();
        }
        
        return linha;
    }
        //
     @Override
    public int Comprar(ClassProd Produto) {
        
        String update = "UPDATE produtoo SET Produto = ?, Quantidade = ?,  Preco = ?, precoV = ? WHERE Posicao = ?";
        int linha = 0;
        try {
            conexao = ConexaoSql.getConexao();
             //System.out.println("TT: " + update);
            sql = (PreparedStatement) conexao.prepareStatement(update);
            
            sql.setString(1, Produto.getProduto());
            sql.setInt(2, Produto.getQuantidade());
            sql.setFloat(3, Produto.getPreco());
            sql.setFloat(4, Produto.getPrecoVenda());
            sql.setInt(5, Produto.getPosicao());
            
          //  System.out.println(sql);
            linha = sql.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            fecharConexao();
        }

        return linha;
    }

     @Override
    public int apagar(int id) {
       StringBuilder sqlBuilder = new StringBuilder();
        sqlBuilder.append("DELETE FROM produtoo ").append("WHERE Posicao = ?");
        
        String delete = sqlBuilder.toString();
        int linha = 0;
        
        try {
            conexao = ConexaoSql.getConexao();

            sql = (PreparedStatement) conexao.prepareStatement(delete);
            sql.setInt(1, id);
            linha = sql.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            fecharConexao();
        }

        return linha;

    }

    @Override
    public int VerificarEsq(int i){
   int qtde = 0;
         String select = "SELECT Quantidade FROM produtoo WHERE Posicao = ?";
        
           try {
            conexao = ConexaoSql.getConexao();

            sql = (PreparedStatement) conexao.prepareStatement(select);
            sql.setInt(1, i);

            rset = sql.executeQuery();

            while (rset.next()) {
                
                qtde = rset.getInt("Quantidade");


            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            fecharConexao();
        }

        return qtde;
    }
        

    
    
     @Override
    public List<ClassProd> listar() {
     
           
        String select = "SELECT * FROM Produtoo";

        List<ClassProd> produtos = new ArrayList<ClassProd>();

        try {
            conexao = ConexaoSql.getConexao();
            
            ClasseUsuario user = new ClasseUsuario();
            
            sql = (PreparedStatement) conexao.prepareStatement(select);

            rset = sql.executeQuery();

            while (rset.next()) {

                ClassProd Produto = new ClassProd();
                
                Produto.setPosicao(rset.getInt("Posicao"));
                Produto.setProduto(rset.getString("Produto"));
                Produto.setQuantidade(rset.getInt("Quantidade"));
                Produto.setPreco(rset.getFloat("Preco"));
                Produto.setPrecoVenda(rset.getFloat("precoV"));
                Produto.setEstq(rset.getInt("estoq"));
             //   Produto.setUr(rset.getInt("Quantidade"));

                 
                produtos.add(Produto);

            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            fecharConexao();
        }

        return produtos;
    }

   
     @Override
    public ClassProd listar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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

