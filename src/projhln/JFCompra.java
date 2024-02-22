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

public class JFCompra extends javax.swing.JFrame {

    Connection conexao = null;
    ProdDAO ProdutoDAO = DAOFactory.criarProdDAO();
    private final DefaultComboBoxModel modelo;
    boolean tru = false;
    
    public JFCompra() {
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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CBXProduto = new javax.swing.JComboBox<>();
        init = new javax.swing.JLabel();
        TXTPreco = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        TXTQTD = new javax.swing.JTextField();
        BtnComprar = new javax.swing.JButton();
        BtnCancelar = new javax.swing.JButton();
        TXTPRECO = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

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

        init.setText("Preco:");

        jLabel1.setText("Quantidade:");

        TXTQTD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTQTDActionPerformed(evt);
            }
        });

        BtnComprar.setText("Comprar");
        BtnComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnComprarActionPerformed(evt);
            }
        });

        BtnCancelar.setText("Cancelar");
        BtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelarActionPerformed(evt);
            }
        });

        jLabel2.setText("Produto:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(TXTPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(TXTQTD, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BtnComprar)
                                .addGap(18, 18, 18)
                                .addComponent(BtnCancelar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(init)
                                .addGap(23, 23, 23)
                                .addComponent(TXTPRECO, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(CBXProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TXTPreco, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(CBXProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TXTPRECO, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(init, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(TXTQTD, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnComprar)
                    .addComponent(BtnCancelar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CBXProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBXProdutoActionPerformed
  ClassProd Preco = new ClassProd();
        
      for (ClassProd Produto : ProdutoDAO.listar()) {
         if (Produto.getProduto().equals(CBXProduto.getItemAt(CBXProduto.getSelectedIndex()))) {
             Preco.setPreco(Produto.getPreco());
                    TXTPRECO.setText(String.valueOf(Preco.getPreco()));
         }
           }
    }//GEN-LAST:event_CBXProdutoActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        preencherCBX();
        ClassProd Preco = new ClassProd();
        
      for (ClassProd Produto : ProdutoDAO.listar()) {
         if (Produto.getProduto().equals(CBXProduto.getItemAt(CBXProduto.getSelectedIndex()))) {
             Preco.setPreco(Produto.getPreco());
                    TXTPRECO.setText(String.valueOf(Preco.getPreco()));
         }
           }
    }//GEN-LAST:event_formWindowGainedFocus

    private void BtnComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnComprarActionPerformed
        Object[] opcao = {"Não", "Sim"};
       
        int opcaoSelecionada = JOptionPane.showOptionDialog(this, "Deseja realmente Comprar?\n", "Aviso",
                JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, opcao, opcao[0]);
        
        if (opcaoSelecionada == 1) {
            ClassProd PComprado = new ClassProd();

            for (ClassProd Produto : ProdutoDAO.listar()) {

                if (Produto.getProduto().equals(CBXProduto.getItemAt(CBXProduto.getSelectedIndex()))) {
                  
                    PComprado.setPosicao(Produto.getPosicao());
                    
                    if(TXTQTD.getText().matches("[^0-9]")){
                        PComprado.setQuantidade(Produto.getQuantidade());
                         JOptionPane.showMessageDialog(null,"PorFavor Digite apenas Numeros!"); 
                     }else{
                         PComprado.setQuantidade(Produto.getQuantidade() + Integer.parseInt(TXTQTD.getText()));
                         tru = true;
                }
                    
                    PComprado.setProduto(Produto.getProduto());
                    PComprado.setPreco(Produto.getPreco());
                    PComprado.setPrecoVenda(Produto.getPrecoVenda());

                    int linha = ProdutoDAO.Comprar(PComprado);
                    if (linha > 0 && tru == true) {
                       float t = PComprado.getPreco()* Integer.parseInt(TXTQTD.getText());
        JOptionPane.showMessageDialog(null,"Comprado Por "+t+" R$");
        
                    } else {
                        JOptionPane.showMessageDialog(this, "Erro ao Comprar Produto.");
                    }
                    new JFrameP().setVisible(true);
                    this.dispose();
                }
            }
        }


    }//GEN-LAST:event_BtnComprarActionPerformed

    private void BtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelarActionPerformed
       this.dispose();
       new JFrameP().setVisible(true);
    }//GEN-LAST:event_BtnCancelarActionPerformed

    private void TXTQTDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTQTDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTQTDActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCancelar;
    private javax.swing.JButton BtnComprar;
    private javax.swing.JComboBox<String> CBXProduto;
    private javax.swing.JLabel TXTPRECO;
    private javax.swing.JLabel TXTPreco;
    private javax.swing.JTextField TXTQTD;
    private javax.swing.JLabel init;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
