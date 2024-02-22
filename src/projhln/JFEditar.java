package projhln;

import Dao.DAOFactory;
import Dao.ProdDAO;
import com.sun.glass.events.WindowEvent;
import java.sql.Connection;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import projhln.JFrameP;
import projhln.ClassProd;
import javax.swing.table.DefaultTableModel;


public class JFEditar extends javax.swing.JFrame {

    Connection conexao = null;
    ProdDAO ProdutoDAO = DAOFactory.criarProdDAO();
    private final DefaultComboBoxModel modelo;
    
    boolean verif = false ;
    
    public JFEditar() {
        initComponents();
        modelo = (DefaultComboBoxModel) CBXProduto.getModel();

        this.setLocationRelativeTo(null);
    }

    private void preencherCBX() {

        try {
            for (ClassProd Produto : ProdutoDAO.listar()) {
               CBXProduto.addItem(Produto.getProduto());
            }
        } catch (Exception e) {
            throw e;
        }
    }
private void preencherCBX2() {

               CBXITEM.addItem("Produto");
               CBXITEM.addItem("Quantidade");
               CBXITEM.addItem("Preco");
               CBXITEM.addItem("PrecoVenda");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CBXProduto = new javax.swing.JComboBox<>();
        CBXITEM = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        TXTEDT = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        CBXProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBXProdutoActionPerformed(evt);
            }
        });

        jButton1.setText("Editar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        TXTEDT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTEDTActionPerformed(evt);
            }
        });

        jLabel1.setText("Produto:");

        jLabel2.setText("Editar:");

        jLabel3.setText("Alterar:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(CBXProduto, 0, 69, Short.MAX_VALUE)
                            .addComponent(CBXITEM, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TXTEDT))
                        .addContainerGap(57, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(34, 34, 34))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton1, jButton2});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(CBXProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CBXITEM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TXTEDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TXTEDTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTEDTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTEDTActionPerformed

    private void CBXProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBXProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CBXProdutoActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
    preencherCBX();
    preencherCBX2();
    }//GEN-LAST:event_formWindowGainedFocus

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     Object[] opcao = {"Não", "Sim"};  
        int opcaoSelecionada = JOptionPane.showOptionDialog(this, "Deseja realmente Editar?\n", "Aviso",
                JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, opcao, opcao[0]);
        if (opcaoSelecionada == 1) {
            ClassProd PComprado = new ClassProd();

            for (ClassProd Produto : ProdutoDAO.listar()) {

                if (Produto.getProduto().equals(CBXProduto.getItemAt(CBXProduto.getSelectedIndex()))) {
                    
                    if("Produto" == CBXITEM.getItemAt(CBXITEM.getSelectedIndex()) ){
                    PComprado.setPosicao(Produto.getPosicao());
                    
                    PComprado.setProduto(TXTEDT.getText());
                    
                    PComprado.setQuantidade(Produto.getQuantidade());
                    PComprado.setPreco(Produto.getPreco());
                    PComprado.setPrecoVenda(Produto.getPrecoVenda());
                      
                  }else if("Quantidade" == CBXITEM.getItemAt(CBXITEM.getSelectedIndex()) ){          
                    PComprado.setPosicao(Produto.getPosicao());
                    PComprado.setProduto(Produto.getProduto());
                    
                      if(TXTEDT.getText().matches("[^0-9]")){
                          PComprado.setQuantidade(Produto.getQuantidade());
                          JOptionPane.showMessageDialog(null,"PorFavor Digite apenas Numeros!");                 
                   }else{
                          PComprado.setQuantidade(Integer.parseInt(TXTEDT.getText()));
                       verif = true;
                   }
                      
                    PComprado.setPreco(Produto.getPreco());
                    PComprado.setPrecoVenda(Produto.getPrecoVenda());
                  }else if("Preco"  == CBXITEM.getItemAt(CBXITEM.getSelectedIndex())){
                    PComprado.setPosicao(Produto.getPosicao());
                    PComprado.setProduto(Produto.getProduto());
                    PComprado.setQuantidade(Produto.getQuantidade());
                    
                     if(TXTEDT.getText().matches("[^0-9]")){
                         PComprado.setPreco(Produto.getPreco());
                         JOptionPane.showMessageDialog(null,"PorFavor Digite apenas Numeros!");                 
                   }else{
                         PComprado.setPreco(Float.parseFloat(TXTEDT.getText()));
                      verif = true;
                   }
                     
                    PComprado.setPrecoVenda(Produto.getPrecoVenda());
                  }else if("PrecoVenda" == (CBXITEM.getItemAt(CBXITEM.getSelectedIndex()))){
                    PComprado.setPosicao(Produto.getPosicao());
                    PComprado.setProduto(Produto.getProduto());
                    PComprado.setQuantidade(Produto.getQuantidade());
                    PComprado.setPreco(Produto.getPreco());
                 
                   if(TXTEDT.getText().matches("[^0-9]")){
                         PComprado.setPrecoVenda(Produto.getPrecoVenda());
                         JOptionPane.showMessageDialog(null,"PorFavor Digite apenas Numeros!");                 
                            
                   }else{
                    PComprado.setPrecoVenda(Float.parseFloat(TXTEDT.getText()));
                    verif = true;
                   }

                  
                  }
                  
                    int linha = ProdutoDAO.Comprar(PComprado);
                    if (linha > 0 && verif == true) {
                   JOptionPane.showMessageDialog(null,"Editado Com Sucesso");
        
                    } else {
                        JOptionPane.showMessageDialog(this, "Erro ao Editar");
                    }
                    new JFrameP().setVisible(true);
                    this.dispose();
                }
            }
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       this.dispose();
       new JFrameP().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CBXITEM;
    private javax.swing.JComboBox<String> CBXProduto;
    private javax.swing.JTextField TXTEDT;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
