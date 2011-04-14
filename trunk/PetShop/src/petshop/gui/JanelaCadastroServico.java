/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * JanelaCadastroServico.java
 *
 * Created on Apr 8, 2011, 3:40:20 PM
 */

package petshop.gui;

import javax.swing.JOptionPane;
import javax.swing.text.JTextComponent;

/**
 *
 * @author arthur
 */
public class JanelaCadastroServico extends javax.swing.JDialog {

    /** Creates new form JanelaCadastroServico */
    public JanelaCadastroServico() {
        initComponents();

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
        campoNome = new javax.swing.JTextField();
        campoDuracao = new javax.swing.JTextField();
        scrollInformacoes = new javax.swing.JScrollPane();
        areaInformacoes = new javax.swing.JTextArea();
        botaoCadastrar = new javax.swing.JButton();
        botaoCancelar = new javax.swing.JButton();
        campoPreco = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastrar Serviço");
        setResizable(false);

        jPanel1.setLayout(new java.awt.GridBagLayout());

        campoNome.setText("Nome");
        campoNome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tirarEtiqueta(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                colocarEtiqueta(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 150;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 0, 10);
        jPanel1.add(campoNome, gridBagConstraints);

        campoDuracao.setText("Duração");
        campoDuracao.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tirarEtiqueta(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                colocarEtiqueta(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 0, 10);
        jPanel1.add(campoDuracao, gridBagConstraints);

        areaInformacoes.setColumns(20);
        areaInformacoes.setLineWrap(true);
        areaInformacoes.setRows(5);
        areaInformacoes.setText("Informações Adicionais");
        areaInformacoes.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tirarEtiqueta(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                colocarEtiqueta(evt);
            }
        });
        scrollInformacoes.setViewportView(areaInformacoes);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 100;
        gridBagConstraints.ipady = 12;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 0, 10);
        jPanel1.add(scrollInformacoes, gridBagConstraints);

        botaoCadastrar.setText("Cadastrar");
        botaoCadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cadastrar(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.ipadx = 30;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 10);
        jPanel1.add(botaoCadastrar, gridBagConstraints);

        botaoCancelar.setText("Cancelar");
        botaoCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelar(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.ipadx = 30;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel1.add(botaoCancelar, gridBagConstraints);

        campoPreco.setText("Preço");
        campoPreco.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tirarEtiqueta(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                colocarEtiqueta(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 50;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 10);
        jPanel1.add(campoPreco, gridBagConstraints);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tirarEtiqueta(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tirarEtiqueta
        JTextComponent campo = (JTextComponent) evt.getComponent();

        if(campo.getText().equals(getEtiqueta(campo))){
            campo.setText("");
        }
}//GEN-LAST:event_tirarEtiqueta

    private void colocarEtiqueta(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_colocarEtiqueta
        JTextComponent campo = (JTextComponent) evt.getComponent();

        if(campo.getText().equals("")){
            campo.setText(getEtiqueta(campo));
        }
}//GEN-LAST:event_colocarEtiqueta

    private void cadastrar(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cadastrar
        // TODO add your handling code here:
}//GEN-LAST:event_cadastrar

    private void cancelar(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelar
        int resp = JOptionPane.showConfirmDialog(this, "Tem certeza que deseja cancelar?", "Sair", JOptionPane.YES_NO_OPTION);

        if(resp == JOptionPane.YES_OPTION)
            this.dispose();
            limparCampos();
}//GEN-LAST:event_cancelar

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JanelaCadastroServico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaInformacoes;
    private javax.swing.JButton botaoCadastrar;
    private javax.swing.JButton botaoCancelar;
    private javax.swing.JTextField campoDuracao;
    private javax.swing.JTextField campoNome;
    private javax.swing.JTextField campoPreco;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane scrollInformacoes;
    // End of variables declaration//GEN-END:variables


        //Retorna a etiqueta certa pra cada campo
    private String getEtiqueta(JTextComponent campo){

        if(campo.equals(campoNome)) return "Nome";
        else if(campo.equals(campoPreco)) return "Preço";
        else if(campo.equals(campoDuracao)) return "Duração";
        else if(campo.equals(areaInformacoes)) return "Informações Adicionais";

        return "";
    }

    //Volta todos os campos pras etiquetas padrões.
    private void limparCampos(){

        campoNome.setText("Nome");
        campoPreco.setText("Preço de Venda");
        campoDuracao.setText("Qtde");
        areaInformacoes.setText("Informações Adicionais");
    }
}
