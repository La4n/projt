
package Dao;

import java.util.List;
import projhln.ClassProd;

public interface ProdDAO {
    
    public int inserir(ClassProd Produto);
    public int Comprar(ClassProd Produto);
    public int apagar(int id);
    public int VerificarEsq(int i);
    public List<ClassProd> listar();
    public ClassProd listar(int id);
}
