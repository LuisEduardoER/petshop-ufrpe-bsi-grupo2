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

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.text.JTextComponent;
import petshop.classes.Servico;

/**
 *
 * @author arthur
 */
public class JanelaCadastroServico extends javax.swing.JDialog {

    Servico servico;

    /** Creates new form JanelaCadastroServico */
    public JanelaCadastroServico() {
        initComponents();

        this.setLocationRelativeTo(this.getContentPane());

        KeyListener k1 = new KeyListener() {
                    public void keyTyped(KeyEvent e) {
                        if (!((e.getKeyChar() >= KeyEvent.VK_0 &&
                               e.getKeyChar() <= KeyEvent.VK_9) ||
                              (e.getKeyChar() == KeyEvent.VK_BACK_SPACE))) {
                            e.consume(); } }
                    public void keyPressed(KeyEvent e) { }
                    public void keyReleased(KeyEvent e) { } };

        KeyListener k2 = new KeyListener() {
                    public void keyTyped(KeyEvent e) {
                        if (!((e.getKeyChar() >= KeyEvent.VK_0 &&
                               e.getKeyChar() <= KeyEvent.VK_9) ||
                               (e.getKeyChar() <= KeyEvent.VK_COMMA) ||
                              (e.getKeyChar() == KeyEvent.VK_BACK_SPACE))) {
                            e.consume(); } }
                    public void keyPressed(KeyEvent e) { }
                    public void keyReleased(KeyEvent e) { } };

        campoDuracao.addKeyListener(k1);
        campoCodigo.addKeyListener(k1);
        campoPreco.addKeyListener(k2);
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
        campoCodigo = new javax.swing.JTextField();

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
        campoNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoTamanhoMaximo(evt);
                campoMaiusculo(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                campoTamanhoMaximo(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 200;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(campoNome, gridBagConstraints);

        campoDuracao.setText("Duração (min)");
        campoDuracao.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tirarEtiqueta(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                colocarEtiqueta(evt);
            }
        });
        campoDuracao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                campoTamanhoMaximo(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
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
        areaInformacoes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoTamanhoMaximo(evt);
                campoMaiusculo(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                campoTamanhoMaximo(evt);
            }
        });
        scrollInformacoes.setViewportView(areaInformacoes);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 100;
        gridBagConstraints.ipady = 12;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
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
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
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
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
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
        campoPreco.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                eventoDigitarPreco(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 80;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(campoPreco, gridBagConstraints);

        campoCodigo.setText("Código");
        campoCodigo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tirarEtiqueta(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                colocarEtiqueta(evt);
            }
        });
        campoCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoTamanhoMaximo(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                campoTamanhoMaximo(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 25;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(campoCodigo, gridBagConstraints);

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
            reiniciar();
}//GEN-LAST:event_cancelar

    private void campoTamanhoMaximo(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoTamanhoMaximo
        JTextComponent campo = (JTextComponent) evt.getComponent();

        if(campo.getText().length() >= getTamanhoMaximo(campo)){
            evt.consume();
        }
    }//GEN-LAST:event_campoTamanhoMaximo

    private void campoMaiusculo(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoMaiusculo
        JTextComponent campo = (JTextComponent) evt.getComponent();

        if(Character.isLowerCase(evt.getKeyChar())){
            campo.setText(campo.getText().toUpperCase());
        }
    }//GEN-LAST:event_campoMaiusculo

    private void eventoDigitarPreco(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_eventoDigitarPreco
        JTextField campo = (JTextField) evt.getComponent();
        String t = campo.getText();

        if(t.length() == 8) evt.consume();

        //nao deixa ter mais de 1 virgula e coloca 0 automaticamente caso campo
        //seja vazio
        if(evt.getKeyChar() == KeyEvent.VK_COMMA){
            if(t.contains(","))
                evt.consume();
            if(t.equals(""))
                campo.setText("0");
        }
        //Nao deixa decimal ser maior que 2
        if(t.length() > 3)
            if(t.substring(t.length()-3, t.length()-2).equals(","))
                evt.consume();
        //se tamanho do preco == 5 e nao for backspace e nao tiver outra virgula
        //coloca virgula automaticamente
        if(t.length() == 5 && evt.getKeyChar() != KeyEvent.VK_BACK_SPACE && !t.contains(","))
            campo.setText(t + ",");
    }//GEN-LAST:event_eventoDigitarPreco

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
    private javax.swing.JTextField campoCodigo;
    private javax.swing.JTextField campoDuracao;
    private javax.swing.JTextField campoNome;
    private javax.swing.JTextField campoPreco;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane scrollInformacoes;
    // End of variables declaration//GEN-END:variables


        //Retorna a etiqueta certa pra cada campo
    private String getEtiqueta(JTextComponent campo){

        if(campo.equals(campoNome)) return "Nome";
        else if(campo.equals(campoCodigo)) return "Código";
        else if(campo.equals(campoPreco)) return "Preço";
        else if(campo.equals(campoDuracao)) return "Duração (min)";
        else if(campo.equals(areaInformacoes)) return "Informações Adicionais";

        return "";
    }

    //Volta todos os campos pras etiquetas padrões.
    private void reiniciar(){

        campoCodigo.setText("Código");
        campoNome.setText("Nome");
        campoPreco.setText("Preço");
        campoDuracao.setText("Duração (min)");
        areaInformacoes.setText("Informações Adicionais");
    }

    private boolean existemDependencias(){
        String msg = "Você esqueceu de preencher os \nseguintes campos obrigatórios:\n\n";

        boolean existeDependencias = false;

        if(campoNome.getText().equals("Nome")){ msg += "- NOME\n"; existeDependencias = true;}
        if(campoDuracao.getText().equals("Duração")){ msg += "- DURAÇÃO\n"; existeDependencias = true;}
        if(campoPreco.getText().equals("Preço")){ msg += "- PREÇO\n"; existeDependencias = true;}

        if(existeDependencias){
            JOptionPane.showMessageDialog(this.getContentPane(), msg);
        }

        return existeDependencias;
    }

    private int getTamanhoMaximo(JTextComponent campo){

        if(campo.equals(campoNome)) return 80;
        else if(campo.equals(campoDuracao)) return 3;
        else if(campo.equals(campoCodigo)) return 11;
        else if(campo.equals(areaInformacoes)) return 400;

        return 0;
    }
}
