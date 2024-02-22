
package projhln;

import java.io.File;
import java.io.IOException;

public class ProjHLN {

    public static void main(String[] args) throws IOException {
      
        File arquivo = new File("Estoque.csv");
         try {
	arquivo.createNewFile();
	System.out.print("Arquivo criado com sucesso!");
			
    } catch (IOException e) {
        
    }
      
        
        new JFUser().setVisible(true);
    }
    
}
