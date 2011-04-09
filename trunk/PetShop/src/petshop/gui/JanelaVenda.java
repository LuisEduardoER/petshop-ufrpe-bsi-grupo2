/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * JanelaVenda.java
 *
 * Created on Apr 8, 2011, 4:00:32 PM
 */

package petshop.gui;

import javax.swing.text.JTextComponent;

/**
 *
 * @author arthur
 */
public class JanelaVenda extends javax.swing.JDialog {

    JanelaAdicionaProduto adicionaProduto;
    JanelaAdicionaServico adicionaServico;
    JanelaAdicionaCliente adicionaCliente;

    /** Creates new form JanelaVenda */
    public JanelaVenda() {
        initComponents();

        adicionaServico = new JanelaAdicionaServico();
        adicionaProduto = new JanelaAdicionaProduto();
        adicionaCliente = new JanelaAdicionaCliente();

        comboAnimal.setVisible(false);
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
        botaoPesquisarCliente = new javax.swing.JButton();
        labelCliente = new javax.swing.JLabel();
        comboTipoCarrinho = new javax.swing.JComboBox();
        campoCodigo = new javax.swing.JTextField();
        botaoPesquisaItem = new javax.swing.JButton();
        botaoAdd = new javax.swing.JButton();
        scrollItens = new javax.swing.JScrollPane();
        tabelaItens = new javax.swing.JTable();
        botaoRemover = new javax.swing.JButton();
        labelTotal = new javax.swing.JLabel();
        botaoCancelar = new javax.swing.JButton();
        botaoPagar = new javax.swing.JButton();
        comboAnimal = new javax.swing.JComboBox();
        campoQtde = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Nova Venda");
        setResizable(false);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setLayout(new java.awt.GridBagLayout());

        botaoPesquisarCliente.setText("Pesquisar");
        botaoPesquisarCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoPesquisarClienteMouseClicked(evt);
            }
        });
        botaoPesquisarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPesquisarClienteActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(botaoPesquisarCliente, gridBagConstraints);

        labelCliente.setText("CLIENTE");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(labelCliente, gridBagConstraints);

        comboTipoCarrinho.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Produto", "Serviço" }));
        comboTipoCarrinho.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboTipoCarrinhoItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 15;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(comboTipoCarrinho, gridBagConstraints);

        campoCodigo.setText("Código");
        campoCodigo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                campoPerdeEtiqueta(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                campoRetornaEtiqueta(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 15;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 0);
        jPanel1.add(campoCodigo, gridBagConstraints);

        botaoPesquisaItem.setText("P");
        botaoPesquisaItem.setMinimumSize(new java.awt.Dimension(24, 24));
        botaoPesquisaItem.setPreferredSize(new java.awt.Dimension(24, 24));
        botaoPesquisaItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoPesquisaItemMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 5, 5);
        jPanel1.add(botaoPesquisaItem, gridBagConstraints);

        botaoAdd.setText("Adicionar");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.ipadx = 15;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(botaoAdd, gridBagConstraints);

        scrollItens.setPreferredSize(new java.awt.Dimension(480, 200));

        tabelaItens.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabelaItens.setMaximumSize(new java.awt.Dimension(300, 100));
        scrollItens.setViewportView(tabelaItens);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 0, 5);
        jPanel1.add(scrollItens, gridBagConstraints);

        botaoRemover.setText("Remover");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 40;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 5, 5);
        jPanel1.add(botaoRemover, gridBagConstraints);

        labelTotal.setFont(new java.awt.Font("Ubuntu", 0, 18));
        labelTotal.setForeground(new java.awt.Color(225, 1, 1));
        labelTotal.setText("Total 00.00");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 5, 5);
        jPanel1.add(labelTotal, gridBagConstraints);

        botaoCancelar.setText("Cancelar");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 40;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(botaoCancelar, gridBagConstraints);

        botaoPagar.setText("Pagar");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 40;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(botaoPagar, gridBagConstraints);

        comboAnimal.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Animal" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 70;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(comboAnimal, gridBagConstraints);

        campoQtde.setText("Qtde");
        campoQtde.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                campoPerdeEtiqueta(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                campoRetornaEtiqueta(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(campoQtde, gridBagConstraints);

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoPesquisarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPesquisarClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoPesquisarClienteActionPerformed

    private void comboTipoCarrinhoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboTipoCarrinhoItemStateChanged
        if(comboTipoCarrinho.getSelectedIndex() == 0){
            comboAnimal.setVisible(false);
        } else {
            comboAnimal.setVisible(true);
        }
    }//GEN-LAST:event_comboTipoCarrinhoItemStateChanged

    private void botaoPesquisaItemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoPesquisaItemMouseClicked
        JanelaAdiciona adiciona;

        if(comboTipoCarrinho.getSelectedIndex() == 0) adiciona = adicionaProduto;
        else adiciona = adicionaServico;

        adiciona.setModalityType(java.awt.Dialog.DEFAULT_MODALITY_TYPE);
        adiciona.setModal(true);
        adiciona.setVisible(true);
    }//GEN-LAST:event_botaoPesquisaItemMouseClicked

    private void botaoPesquisarClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoPesquisarClienteMouseClicked
        adicionaCliente.setModalityType(java.awt.Dialog.DEFAULT_MODALITY_TYPE);
        adicionaCliente.setModal(true);
        adicionaCliente.setVisible(true);
    }//GEN-LAST:event_botaoPesquisarClienteMouseClicked

    private void campoPerdeEtiqueta(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoPerdeEtiqueta
        JTextComponent campo = (JTextComponent) evt.getComponent();

        if(campo.getText().equals(getEtiqueta(campo))){
            campo.setText("");
        }
    }//GEN-LAST:event_campoPerdeEtiqueta

    private void campoRetornaEtiqueta(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoRetornaEtiqueta
        JTextComponent campo = (JTextComponent) evt.getComponent();

        if(campo.getText().equals("")){
            campo.setText(getEtiqueta(campo));
        }
    }//GEN-LAST:event_campoRetornaEtiqueta

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JanelaVenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoAdd;
    private javax.swing.JButton botaoCancelar;
    private javax.swing.JButton botaoPagar;
    private javax.swing.JButton botaoPesquisaItem;
    private javax.swing.JButton botaoPesquisarCliente;
    private javax.swing.JButton botaoRemover;
    private javax.swing.JTextField campoCodigo;
    private javax.swing.JTextField campoQtde;
    private javax.swing.JComboBox comboAnimal;
    private javax.swing.JComboBox comboTipoCarrinho;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelCliente;
    private javax.swing.JLabel labelTotal;
    private javax.swing.JScrollPane scrollItens;
    private javax.swing.JTable tabelaItens;
    // End of variables declaration//GEN-END:variables
    
    /**
     * Configura o label de total na janela. 
     * @param valor O valor do total de compras
     */
    public void setLabelTotal(double valor){
        
        labelTotal.setText("Total " + valor);        
    }
    
    private String getEtiqueta(JTextComponent campo){

        if(campo.equals(campoCodigo)) return "Código";
        else if(campo.equals(campoQtde)) return "Qtde";

        return "";
    }
}