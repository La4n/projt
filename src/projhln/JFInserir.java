
package projhln;

import Dao.DAOFactory;
import Dao.ProdDAO;
import Dao.UserDAO;
import com.sun.glass.events.WindowEvent;
import java.sql.Connection;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import projhln.JFrameP;
import projhln.ClassProd;
import javax.swing.table.DefaultTableModel;

public class JFInserir extends javax.swing.JFrame {

  ProdDAO ProdutoDAO = DAOFactory.criarProdDAO();
       int  posi,p = 0;
       
        Connection conect = null;
    UserDAO UsuarioDAO = DAOFactory.criarUserDAO();
    
    public JFInserir() {
        initComponents();
   
      
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        TxtProduto = new javax.swing.JTextField();
        TxtQuantidade = new javax.swing.JTextField();
        TxtPreco = new javax.swing.JTextField();
        TxtCodigo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        BtnSalvar = new javax.swing.JButton();
        BtnCancelar = new javax.swing.JButton();

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusCycleRoot(false);

        TxtProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtProdutoActionPerformed(evt);
            }
        });

        TxtQuantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtQuantidadeActionPerformed(evt);
            }
        });

        TxtPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtPrecoActionPerformed(evt);
            }
        });

        TxtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtCodigoActionPerformed(evt);
            }
        });

        jLabel1.setText("Produto:");

        jLabel2.setText("Quantidade:");

        jLabel3.setText("Preço:");

        jLabel4.setText("Preço Venda:");

        BtnSalvar.setText("Salvar");
        BtnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalvarActionPerformed(evt);
            }
        });

        BtnCancelar.setText("Cancelar");
        BtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TxtPreco)
                                    .addComponent(TxtCodigo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(TxtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(TxtProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(BtnSalvar)
                        .addGap(18, 18, 18)
                        .addComponent(BtnCancelar)))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {BtnCancelar, BtnSalvar});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TxtProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(TxtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(TxtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnSalvar)
                    .addComponent(BtnCancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtProdutoActionPerformed

    private void TxtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtCodigoActionPerformed

    private void TxtPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtPrecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtPrecoActionPerformed

    private void TxtQuantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtQuantidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtQuantidadeActionPerformed

    private void BtnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalvarActionPerformed

 
 for( ClassProd Produto : ProdutoDAO.listar()){
posi = 1 + Produto.getPosicao();
Produto.setEstq(p);
 for(ClasseUsuario User : UsuarioDAO.listar()){
          p =  User.getEstq();
           
if(p==0){
    p=p+1;
}

 }
 }
        ClassProd Produto = new ClassProd();
        
          
       if(p==0){
    p=p+1;
}
        
        Produto.setPosicao(posi);
        Produto.setProduto(TxtProduto.getText());
        Produto.setQuantidade(Integer.parseInt(TxtQuantidade.getText()));
        Produto.setPreco(Float.parseFloat(TxtPreco.getText()));
        Produto.setPrecoVenda(Float.parseFloat(TxtCodigo.getText()));
        Produto.setEstq(p);
        System.out.println("aaaaaa = " + p);
       
         
        
  //      JFrameP.AddRowToControleEstq(new Object[]{TxtProduto.getText(),TxtQuantidade.getText(),TxtPreco.getText(),TxtCodigo.getText()});
     
   int linha = ProdutoDAO.inserir(Produto);
        if (linha > 0) {
            JOptionPane.showMessageDialog(this, "Produto inserido com sucesso!");
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao inserir Produto.");
        }
        
        this.dispose();
       new JFrameP().setVisible(true);
    }//GEN-LAST:event_BtnSalvarActionPerformed

    private void BtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelarActionPerformed

   this.dispose();
   new JFrameP().setVisible(true);
        
    }//GEN-LAST:event_BtnCancelarActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCancelar;
    private javax.swing.JButton BtnSalvar;
    private javax.swing.JTextField TxtCodigo;
    private javax.swing.JTextField TxtPreco;
    private javax.swing.JTextField TxtProduto;
    private javax.swing.JTextField TxtQuantidade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
