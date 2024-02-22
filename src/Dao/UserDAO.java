package Dao;

import java.util.List;
import projhln.ClasseUsuario;

public interface UserDAO {
    
    public int inserir(ClasseUsuario id);
     public List<ClasseUsuario> listar();
    
}
