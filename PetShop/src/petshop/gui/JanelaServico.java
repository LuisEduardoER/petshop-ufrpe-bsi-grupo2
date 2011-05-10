package petshop.gui;

import javax.swing.JOptionPane;
import petshop.classes.BancoDeDados;
import petshop.classes.DocumentoMascara;
import petshop.classes.Servico;

/**
 *
 * @author arthur
 */
public class JanelaServico extends Janela {

    private Servico servico;
    private TipoJanela tipo;

    /** Creates new form JanelaCliente */
    public JanelaServico(TipoJanela tipo, Servico s) {
        this.tipo = tipo;
        initComponents();

        if(s == null){
            servico = new Servico();
        } else {
            servico = s;
        }

        this.setLocationRelativeTo(this.getContentPane());

        if(this.tipo == TipoJanela.ALTERACAO){
            campoCodigo.setEnabled(false);
            botaoCadastrar.setText("Alterar");
            preencher();
        } else if(this.tipo == TipoJanela.INFORMACAO){
            botaoCadastrar.setVisible(false);
            botaoCancelar.setVisible(false);
            desabilitarCampos();
            preencher();
        }

        campoNome.setDocument(new DocumentoMascara(80));
        areaInformacoes.setDocument(new DocumentoMascara(400));

        reiniciar();
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
        scrollInformacoes = new javax.swing.JScrollPane();
        areaInformacoes = new javax.swing.JTextArea();
        botaoCadastrar = new javax.swing.JButton();
        botaoCancelar = new javax.swing.JButton();
        campoPreco = new javax.swing.JFormattedTextField();
        campoCodigo = new javax.swing.JFormattedTextField();
        campoDuracao = new javax.swing.JFormattedTextField();
        labelCodigo = new javax.swing.JLabel();
        labelNome = new javax.swing.JLabel();
        labelDuracao = new javax.swing.JLabel();
        labelPreco = new javax.swing.JLabel();
        labelInformacoes = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastrar Serviço");
        setMinimumSize(new java.awt.Dimension(380, 270));
        setResizable(false);

        jPanel1.setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 5, 5);
        jPanel1.add(campoNome, gridBagConstraints);

        areaInformacoes.setColumns(20);
        areaInformacoes.setLineWrap(true);
        areaInformacoes.setRows(5);
        scrollInformacoes.setViewportView(areaInformacoes);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 100;
        gridBagConstraints.ipady = 12;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 5, 5);
        jPanel1.add(scrollInformacoes, gridBagConstraints);

        botaoCadastrar.setText("Cadastrar");
        botaoCadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cadastrar(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
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
        gridBagConstraints.gridy = 6;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(botaoCancelar, gridBagConstraints);

        campoPreco.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#.##"))));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 120;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 5, 5);
        jPanel1.add(campoPreco, gridBagConstraints);

        try {
            campoCodigo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 5, 5);
        jPanel1.add(campoCodigo, gridBagConstraints);

        try {
            campoDuracao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 5, 5);
        jPanel1.add(campoDuracao, gridBagConstraints);

        labelCodigo.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        labelCodigo.setText("Código");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        jPanel1.add(labelCodigo, gridBagConstraints);

        labelNome.setFont(new java.awt.Font("Ubuntu", 1, 12)); // NOI18N
        labelNome.setText("Nome");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        jPanel1.add(labelNome, gridBagConstraints);

        labelDuracao.setFont(new java.awt.Font("Ubuntu", 1, 12)); // NOI18N
        labelDuracao.setText("Duração (min)");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        jPanel1.add(labelDuracao, gridBagConstraints);

        labelPreco.setFont(new java.awt.Font("Ubuntu", 1, 12)); // NOI18N
        labelPreco.setText("Preço");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        jPanel1.add(labelPreco, gridBagConstraints);

        labelInformacoes.setText("Informações Adicionais");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        jPanel1.add(labelInformacoes, gridBagConstraints);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cadastrar(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cadastrar
        servico = gerarServico();

        if(!existemDependencias()){
            if(tipo == TipoJanela.CADASTRO){
                cadastrar();
            } else {
                alterar();
            }
        }
}//GEN-LAST:event_cadastrar

    private void cancelar(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelar
        cancelar();
}//GEN-LAST:event_cancelar

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JanelaServico(TipoJanela.CADASTRO, null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaInformacoes;
    private javax.swing.JButton botaoCadastrar;
    private javax.swing.JButton botaoCancelar;
    private javax.swing.JFormattedTextField campoCodigo;
    private javax.swing.JFormattedTextField campoDuracao;
    private javax.swing.JTextField campoNome;
    private javax.swing.JFormattedTextField campoPreco;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelCodigo;
    private javax.swing.JLabel labelDuracao;
    private javax.swing.JLabel labelInformacoes;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelPreco;
    private javax.swing.JScrollPane scrollInformacoes;
    // End of variables declaration//GEN-END:variables

    protected final void reiniciar(){

        campoCodigo.setText("");
        campoNome.setText("");
        campoPreco.setText("");
        campoDuracao.setText("");
        areaInformacoes.setText("");
    }

    protected final boolean existemDependencias() {
        String msg = "Você esqueceu de preencher os \nseguintes campos obrigatórios:\n\n";

        boolean existeDependencias = false;

        if(campoNome.getText().equals("")){
            msg += "- NOME\n";
            existeDependencias = true;
        }
        if(campoDuracao.getText().equals("")){
            msg += "- DURAÇÃO\n";
            existeDependencias = true;
        }
        if(campoPreco.getText().equals("")){
            msg += "- PREÇO\n";
            existeDependencias = true;
        }

        if(existeDependencias){
            JOptionPane.showMessageDialog(this.getContentPane(), msg);
        }

        return existeDependencias;
    }

    protected final void desabilitarCampos() {
        campoCodigo.setEditable(false);
        campoNome.setEditable(false);
        campoDuracao.setEditable(false);
        campoPreco.setEditable(false);
        areaInformacoes.setEditable(false);
    }

    private Servico gerarServico(){
        Servico s = new Servico();
        //Carregando dados do s
        if(!campoCodigo.getText().equals(""))
            s.setCodigo(Integer.valueOf(campoCodigo.getText()));
        s.setNome(campoNome.getText());
        s.setDuracao(Integer.valueOf(campoDuracao.getText()));
        s.setPrecoVenda(Double.valueOf(campoPreco.getText()));
        s.setInfo(areaInformacoes.getText());

        return s;
    }

    protected final void preencher() {
        if(servico.getCodigo() != 0) {
            campoCodigo.setDocument(new DocumentoMascara(10));
            campoCodigo.setText(servico.getCodigo() + "");
        }
        campoNome.setText(servico.getNome());
        campoDuracao.setText(String.valueOf(servico.getDuracao()));
        campoPreco.setText(String.valueOf(servico.getPrecoVenda()));
        areaInformacoes.setText(servico.getInfo());
    }

    protected void cadastrar() {
        if(BancoDeDados.cadastrar(servico)){
            int resp = JOptionPane.showConfirmDialog(this, "Cliente cadastrado com sucesso. Deseja realizar novo cadastro?", "Concluído", JOptionPane.YES_NO_OPTION);

            this.reiniciar();
            if(resp != JOptionPane.YES_OPTION){
                this.dispose();
            }
        } else {
            JOptionPane.showMessageDialog(this.getContentPane(), "Falha ao cadastrar servico!");
        }
    }

    protected void alterar() {
        if(BancoDeDados.alterar(servico)){
            JOptionPane.showMessageDialog(this.getContentPane(), "Servico alterado com sucesso!");
            reiniciar();
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this.getContentPane(), "Falha ao alterar servico!");
        }
    }
}
