/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Painel.java
 *
 * Created on Apr 7, 2011, 1:51:08 PM
 */

package petshop.gui;

import java.awt.Dimension;

/**
 *
 * @author arthur
 */
public class Painel extends javax.swing.JPanel {

    /** Creates new form panel */
    public Painel() {
        initComponents();
    }

    /** This metodo nuinnhj is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        labelPesquisa = new javax.swing.JLabel();
        comboPesquisa = new javax.swing.JComboBox();
        campoPesquisa = new javax.swing.JTextField();
        scrollTabela = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        botaoPesquisar = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(450, 290));
        setLayout(new java.awt.GridBagLayout());

        labelPesquisa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelPesquisa.setText("Pesquisar por:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(labelPesquisa, gridBagConstraints);

        comboPesquisa.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboPesquisa.setMaximumSize(new java.awt.Dimension(66, 24));
        comboPesquisa.setMinimumSize(new Dimension(66,24));
        comboPesquisa.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboPesquisaItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.ipadx = 30;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(comboPesquisa, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 200;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(campoPesquisa, gridBagConstraints);

        scrollTabela.setPreferredSize(new java.awt.Dimension(155, 40));

        tabela.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tabela.setModel(new javax.swing.table.DefaultTableModel(
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
        tabela.setPreferredSize(new java.awt.Dimension(300, 200));
        scrollTabela.setViewportView(tabela);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 569;
        gridBagConstraints.ipady = 250;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(scrollTabela, gridBagConstraints);

        botaoPesquisar.setText("Pesquisar");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(botaoPesquisar, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void comboPesquisaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboPesquisaItemStateChanged
        // TODO add your handling code here:
}//GEN-LAST:event_comboPesquisaItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JButton botaoPesquisar;
    javax.swing.JTextField campoPesquisa;
    javax.swing.JComboBox comboPesquisa;
    javax.swing.JLabel labelPesquisa;
    javax.swing.JScrollPane scrollTabela;
    javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables

}
