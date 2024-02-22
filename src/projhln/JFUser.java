
package projhln;

import Dao.DAOFactory;
import Dao.UserDAO;
import java.sql.Connection;
import javax.swing.JOptionPane;
import projhln.ClasseUsuario;

public class JFUser extends javax.swing.JFrame {

    Connection conect = null;
    UserDAO UsuarioDAO = DAOFactory.criarUserDAO();
    
    public JFUser() {
        initComponents();
    }
private void verif(){
    ClasseUsuario usuario = new ClasseUsuario();
    
    int erro=0;
    for(ClasseUsuario user : UsuarioDAO.listar()){
 
     if(TFUsuario.getText().equals(user.getUser()) && PFSenha.getText().equals(user.getSenha())){
       erro=1; 
         this.dispose();
         JOptionPane.showMessageDialog(null, "Bem Vindo!");
    
         new JFrameP().setVisible(true);    
     }
    }
    if(erro == 0){
          JOptionPane.showMessageDialog(null, "Usuario ou Senha incorretos!");
    }
}

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TFUsuario = new javax.swing.JTextField();
        PFSenha = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TBEntrar = new javax.swing.JToggleButton();
        TBCadastra = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Usuario:");

        jLabel2.setText("Senha:");

        TBEntrar.setText("Entrar");
        TBEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TBEntrarActionPerformed(evt);
            }
        });

        TBCadastra.setText("Cadastrar");
        TBCadastra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TBCadastraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TBEntrar)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(TFUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                        .addComponent(PFSenha)))
                .addGap(156, 156, 156))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TBCadastra)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TFUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PFSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(29, 29, 29)
                .addComponent(TBEntrar)
                .addGap(35, 35, 35)
                .addComponent(TBCadastra)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TBEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TBEntrarActionPerformed
       verif();
        
    }//GEN-LAST:event_TBEntrarActionPerformed

    private void TBCadastraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TBCadastraActionPerformed
this.dispose();
            new JFCadastro().setVisible(true);       
    }//GEN-LAST:event_TBCadastraActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField PFSenha;
    private javax.swing.JToggleButton TBCadastra;
    private javax.swing.JToggleButton TBEntrar;
    private javax.swing.JTextField TFUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
