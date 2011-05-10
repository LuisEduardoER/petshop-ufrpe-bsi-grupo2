/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * JanelaPagamento.java
 *
 * Created on Apr 11, 2011, 8:05:14 PM
 */

package petshop.gui;

import javax.swing.JOptionPane;
import petshop.classes.BancoDeDados;
import petshop.classes.TipoPagamento;

/**
 *
 * @author arthur
 */
public class JanelaPagamento extends javax.swing.JDialog {

    JanelaVenda venda;

    /** Creates new form JanelaPagamento */
    public JanelaPagamento(JanelaVenda venda) {
        this.venda = venda;
        initComponents();
        
        checkParcelado.setEnabled(false);
        this.setLocationRelativeTo(this.getContentPane());
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        comboTipoPag = new javax.swing.JComboBox();
        checkParcelado = new javax.swing.JCheckBox();
        botaoConcluir = new javax.swing.JButton();
        botaoCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pagamento");
        setResizable(false);

        jPanel1.setLayout(new java.awt.GridBagLayout());

        comboTipoPag.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "TIPO DE PAGAMENTO", "DINHEIRO", "CARTÃO", "CHEQUE" }));
        comboTipoPag.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboTipoPagItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 0, 5);
        jPanel1.add(comboTipoPag, gridBagConstraints);

        checkParcelado.setText("Parcelar");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 10, 5);
        jPanel1.add(checkParcelado, gridBagConstraints);

        botaoConcluir.setText("Cancelar");
        botaoConcluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelar(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 15;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(botaoConcluir, gridBagConstraints);

        botaoCancelar.setText("Concluir");
        botaoCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                concluir(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 15;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTHEAST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(botaoCancelar, gridBagConstraints);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboTipoPagItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboTipoPagItemStateChanged
        if(comboTipoPag.getSelectedIndex() == 2){
            checkParcelado.setEnabled(true);
        } else {
            checkParcelado.setSelected(false);
            checkParcelado.setEnabled(false);
        }
    }//GEN-LAST:event_comboTipoPagItemStateChanged

    private void cancelar(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelar
        this.dispose();
    }//GEN-LAST:event_cancelar

    private void concluir(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_concluir
        if(comboTipoPag.getSelectedIndex() != 0){
            if(BancoDeDados.cadastrar(venda.gerarVenda(getTipoPagamento(), checkParcelado.isSelected()))){
                int resp = JOptionPane.showConfirmDialog(this, "Venda efetuada com sucesso. Deseja realizar nova venda?", "Concluído", JOptionPane.YES_NO_OPTION);

                this.reiniciar();
                venda.reiniciar();
                if(resp == JOptionPane.NO_OPTION){
                    this.dispose();
                }

                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Falha ao efetuar venda");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Selecione um tipo de pagamento!");
        }
    }//GEN-LAST:event_concluir

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JanelaPagamento(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCancelar;
    private javax.swing.JButton botaoConcluir;
    private javax.swing.JCheckBox checkParcelado;
    private javax.swing.JComboBox comboTipoPag;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    private TipoPagamento getTipoPagamento(){
        if(this.comboTipoPag.getSelectedIndex() == 1){
            return TipoPagamento.DINHEIRO;
        } else if(this.comboTipoPag.getSelectedIndex() == 2){
            return TipoPagamento.CARTAO;
        }
        return TipoPagamento.CHEQUE;
    }

    private void reiniciar(){
        comboTipoPag.setSelectedIndex(0);
        checkParcelado.setSelected(false);
    }
}
