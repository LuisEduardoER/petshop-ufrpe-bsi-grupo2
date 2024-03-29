package petshop.gui;

import java.util.ArrayList;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.text.JTextComponent;
import petshop.classes.Animal;
import petshop.classes.BancoDeDados;
import petshop.classes.CPF;
import petshop.classes.Cliente;
import petshop.classes.Endereco;

/**
 *
 * @author arthur
 */
public class JanelaCliente extends Janela {

    private Cliente cliente;
    private ArrayList<Animal> animais;
    private ArrayList<Integer> cadastrado;
    private ArrayList<Integer> alterado;
    private TipoJanela tipo;

    /** Creates new form JanelaCliente */
    public JanelaCliente(TipoJanela tipo, Cliente c) {
        this.tipo = tipo;
        initComponents();
        campoCep.setFocusLostBehavior(JFormattedTextField.PERSIST);

        if(c == null) {
            cliente = new Cliente();
        } else {
            cliente = c;
        }

        this.setLocationRelativeTo(this.getContentPane());

        if(this.tipo == TipoJanela.ALTERACAO){
            botaoCadastrar.setText("Alterar");
            botaoRemoverAnimal.setText("Alterar");
            preencher();
        } else if(this.tipo == TipoJanela.INFORMACAO){
            botaoCadastrar.setVisible(false);
            botaoCancelar.setVisible(false);
            botaoAdicionarAnimal.setText("Informação");
            desabilitarCampos();
            preencher();
        }

        campoNome.setDocument(new petshop.classes.DocumentoMascara(80));
        campoRua.setDocument(new petshop.classes.DocumentoMascara(70));
        campoNumero.setDocument(new petshop.classes.DocumentoMascara(5));
        campoComplemento.setDocument(new petshop.classes.DocumentoMascara(30));
        campoBairro.setDocument(new petshop.classes.DocumentoMascara(30));
        campoCidade.setDocument(new petshop.classes.DocumentoMascara(30));
        campoRg.setDocument(new petshop.classes.DocumentoMascara(15));
        campoEmail.setDocument(new petshop.classes.DocumentoMascara(70));
        areaInformacoes.setDocument(new petshop.classes.DocumentoMascara(400));

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

        campoNome = new javax.swing.JTextField();
        comboSexo = new javax.swing.JComboBox();
        campoRua = new javax.swing.JTextField();
        campoComplemento = new javax.swing.JTextField();
        campoBairro = new javax.swing.JTextField();
        campoCidade = new javax.swing.JTextField();
        comboUF = new javax.swing.JComboBox();
        campoEmail = new javax.swing.JTextField();
        scrollInformacoes = new javax.swing.JScrollPane();
        areaInformacoes = new javax.swing.JTextArea();
        botaoCancelar = new javax.swing.JButton();
        botaoCadastrar = new javax.swing.JButton();
        comboAnimais = new javax.swing.JComboBox();
        botaoAdicionarAnimal = new javax.swing.JButton();
        botaoRemoverAnimal = new javax.swing.JButton();
        labelNome = new javax.swing.JLabel();
        labelSexo = new javax.swing.JLabel();
        labelRua = new javax.swing.JLabel();
        labelNumero = new javax.swing.JLabel();
        labelComplemento = new javax.swing.JLabel();
        labelBairro = new javax.swing.JLabel();
        labelCidade = new javax.swing.JLabel();
        labelUf = new javax.swing.JLabel();
        labelCep = new javax.swing.JLabel();
        labelRg = new javax.swing.JLabel();
        labelCpf = new javax.swing.JLabel();
        labelEmail = new javax.swing.JLabel();
        labelTelefone = new javax.swing.JLabel();
        labelCelular = new javax.swing.JLabel();
        labelAnimais = new javax.swing.JLabel();
        labelInformacoes = new javax.swing.JLabel();
        campoCep = new javax.swing.JFormattedTextField();
        campoCpf = new javax.swing.JFormattedTextField();
        campoTelefone = new javax.swing.JFormattedTextField();
        campoCelular = new javax.swing.JFormattedTextField();
        campoNumero = new javax.swing.JFormattedTextField();
        campoRg = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 250;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 5, 5);
        getContentPane().add(campoNome, gridBagConstraints);

        comboSexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "MASCULINO", "FEMININO" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 5, 5);
        getContentPane().add(comboSexo, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 5, 5);
        getContentPane().add(campoRua, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 5, 5);
        getContentPane().add(campoComplemento, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 5, 5);
        getContentPane().add(campoBairro, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 170;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 5, 5);
        getContentPane().add(campoCidade, gridBagConstraints);

        comboUF.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "GO", "ES", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SP", "SC", "SE", "TO" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 5, 5);
        getContentPane().add(comboUF, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 5, 5);
        getContentPane().add(campoEmail, gridBagConstraints);

        areaInformacoes.setColumns(20);
        areaInformacoes.setLineWrap(true);
        areaInformacoes.setRows(5);
        scrollInformacoes.setViewportView(areaInformacoes);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 15;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipady = 30;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 5, 5);
        getContentPane().add(scrollInformacoes, gridBagConstraints);

        botaoCancelar.setText("Cancelar");
        botaoCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clicarBotaoCancelar(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.ipadx = 50;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(botaoCancelar, gridBagConstraints);

        botaoCadastrar.setText("Cadastrar");
        botaoCadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cadastrar(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 50;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(botaoCadastrar, gridBagConstraints);

        comboAnimais.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                mudarComboAnimais(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 5, 5);
        getContentPane().add(comboAnimais, gridBagConstraints);

        botaoAdicionarAnimal.setText("Adicionar");
        botaoAdicionarAnimal.setMinimumSize(null);
        botaoAdicionarAnimal.setPreferredSize(null);
        botaoAdicionarAnimal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adicionarAnimal(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 5, 1);
        getContentPane().add(botaoAdicionarAnimal, gridBagConstraints);

        botaoRemoverAnimal.setText("Remover");
        botaoRemoverAnimal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                removerAnimal(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.insets = new java.awt.Insets(0, 1, 5, 5);
        getContentPane().add(botaoRemoverAnimal, gridBagConstraints);

        labelNome.setFont(new java.awt.Font("Ubuntu", 1, 12));
        labelNome.setText("Nome");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        getContentPane().add(labelNome, gridBagConstraints);

        labelSexo.setFont(new java.awt.Font("Ubuntu", 1, 12));
        labelSexo.setText("Sexo");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        getContentPane().add(labelSexo, gridBagConstraints);

        labelRua.setFont(new java.awt.Font("Ubuntu", 1, 12));
        labelRua.setText("Rua");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        getContentPane().add(labelRua, gridBagConstraints);

        labelNumero.setFont(new java.awt.Font("Ubuntu", 0, 12));
        labelNumero.setText("Número");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        getContentPane().add(labelNumero, gridBagConstraints);

        labelComplemento.setFont(new java.awt.Font("Ubuntu", 0, 12));
        labelComplemento.setText("Complemento");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        getContentPane().add(labelComplemento, gridBagConstraints);

        labelBairro.setFont(new java.awt.Font("Ubuntu", 0, 12));
        labelBairro.setText("Bairro");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        getContentPane().add(labelBairro, gridBagConstraints);

        labelCidade.setFont(new java.awt.Font("Ubuntu", 1, 12));
        labelCidade.setText("Cidade");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        getContentPane().add(labelCidade, gridBagConstraints);

        labelUf.setFont(new java.awt.Font("Ubuntu", 1, 12));
        labelUf.setText("UF");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        getContentPane().add(labelUf, gridBagConstraints);

        labelCep.setFont(new java.awt.Font("Ubuntu", 0, 12));
        labelCep.setText("CEP");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        getContentPane().add(labelCep, gridBagConstraints);

        labelRg.setFont(new java.awt.Font("Ubuntu", 1, 12));
        labelRg.setText("RG");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        getContentPane().add(labelRg, gridBagConstraints);

        labelCpf.setFont(new java.awt.Font("Ubuntu", 1, 12));
        labelCpf.setText("CPF");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        getContentPane().add(labelCpf, gridBagConstraints);

        labelEmail.setFont(new java.awt.Font("Ubuntu", 0, 12));
        labelEmail.setText("e-mail");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        getContentPane().add(labelEmail, gridBagConstraints);

        labelTelefone.setFont(new java.awt.Font("Ubuntu", 1, 12));
        labelTelefone.setText("Telefone");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        getContentPane().add(labelTelefone, gridBagConstraints);

        labelCelular.setFont(new java.awt.Font("Ubuntu", 1, 12));
        labelCelular.setText("Celular");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        getContentPane().add(labelCelular, gridBagConstraints);

        labelAnimais.setFont(new java.awt.Font("Ubuntu", 0, 12));
        labelAnimais.setText("Animais");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        getContentPane().add(labelAnimais, gridBagConstraints);

        labelInformacoes.setFont(new java.awt.Font("Ubuntu", 0, 12));
        labelInformacoes.setText("Informações Adicionais");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        getContentPane().add(labelInformacoes, gridBagConstraints);

        try {
            campoCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        campoCep.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        campoCep.setFocusLostBehavior(javax.swing.JFormattedTextField.PERSIST);
        campoCep.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ganharFoco(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 5, 5);
        getContentPane().add(campoCep, gridBagConstraints);

        try {
            campoCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        campoCpf.setFocusLostBehavior(javax.swing.JFormattedTextField.PERSIST);
        campoCpf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ganharFoco(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 5, 5);
        getContentPane().add(campoCpf, gridBagConstraints);

        try {
            campoTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        campoTelefone.setFocusLostBehavior(javax.swing.JFormattedTextField.PERSIST);
        campoTelefone.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ganharFoco(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 5, 5);
        getContentPane().add(campoTelefone, gridBagConstraints);

        try {
            campoCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        campoCelular.setFocusLostBehavior(javax.swing.JFormattedTextField.PERSIST);
        campoCelular.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ganharFoco(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 5, 5);
        getContentPane().add(campoCelular, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 5, 5);
        getContentPane().add(campoNumero, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 5, 5);
        getContentPane().add(campoRg, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clicarBotaoCancelar(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clicarBotaoCancelar
        cancelar();
}//GEN-LAST:event_clicarBotaoCancelar

    private void adicionarAnimal(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adicionarAnimal
        JanelaAnimal janelaAnimal;

        if(tipo == TipoJanela.INFORMACAO){
            janelaAnimal = new JanelaAnimal(this, TipoJanela.INFORMACAO,
                    animais.get(comboAnimais.getSelectedIndex()));
        } else {
            janelaAnimal = new JanelaAnimal(this, TipoJanela.CADASTRO, null);
        }

        janelaAnimal.setModalityType(java.awt.Dialog.DEFAULT_MODALITY_TYPE);
        janelaAnimal.setVisible(true);
}//GEN-LAST:event_adicionarAnimal

    private void cadastrar(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cadastrar
        if(!existemDependencias()){
            cliente = gerarCliente();
            if(!cliente.getCpf().isValido()){
                JOptionPane.showMessageDialog(this.getContentPane(), "CPF Inválido!");
                return;
            }
            if(BancoDeDados.existeCPF(cliente.getCpf())){
                JOptionPane.showMessageDialog(this.getContentPane(), "Este CPF já está cadastrado no banco de dados!");
                return;
            }

            if(tipo == TipoJanela.CADASTRO){
                cadastrar();
            } else if(tipo == TipoJanela.ALTERACAO){
                alterar();
            }

        }
    }//GEN-LAST:event_cadastrar

    private void mudarComboAnimais(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_mudarComboAnimais
        if(this.tipo == TipoJanela.INFORMACAO){
            botaoAdicionarAnimal.setVisible(true);
        } else {
            botaoRemoverAnimal.setVisible(true);
        }
    }//GEN-LAST:event_mudarComboAnimais

    private void removerAnimal(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removerAnimal
        if(tipo == TipoJanela.ALTERACAO){
            JanelaAnimal janela = new JanelaAnimal(this, TipoJanela.ALTERACAO,
                    animais.get(comboAnimais.getSelectedIndex()));

            janela.setModalityType(java.awt.Dialog.DEFAULT_MODALITY_TYPE);
            janela.setVisible(true);
        } else {
            animais.remove(comboAnimais.getSelectedIndex());
            comboAnimais.removeItemAt(comboAnimais.getSelectedIndex());
        }
    }//GEN-LAST:event_removerAnimal

    private void ganharFoco(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ganharFoco
        JTextComponent t = (JTextComponent) evt.getComponent();
        int posicao = 0;

        for(int i = 0; i < t.getText().length(); i++){
            if(!t.getText().substring(posicao, posicao + 1).equals(" ")) {
                posicao++;
            } else {
                break;
            }
        }

        t.setCaretPosition(posicao);
    }//GEN-LAST:event_ganharFoco

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new JanelaCliente(TipoJanela.CADASTRO, null).setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaInformacoes;
    private javax.swing.JButton botaoAdicionarAnimal;
    private javax.swing.JButton botaoCadastrar;
    private javax.swing.JButton botaoCancelar;
    private javax.swing.JButton botaoRemoverAnimal;
    private javax.swing.JTextField campoBairro;
    private javax.swing.JFormattedTextField campoCelular;
    private javax.swing.JFormattedTextField campoCep;
    private javax.swing.JTextField campoCidade;
    private javax.swing.JTextField campoComplemento;
    private javax.swing.JFormattedTextField campoCpf;
    private javax.swing.JTextField campoEmail;
    private javax.swing.JTextField campoNome;
    private javax.swing.JFormattedTextField campoNumero;
    private javax.swing.JFormattedTextField campoRg;
    private javax.swing.JTextField campoRua;
    private javax.swing.JFormattedTextField campoTelefone;
    private javax.swing.JComboBox comboAnimais;
    private javax.swing.JComboBox comboSexo;
    private javax.swing.JComboBox comboUF;
    private javax.swing.JLabel labelAnimais;
    private javax.swing.JLabel labelBairro;
    private javax.swing.JLabel labelCelular;
    private javax.swing.JLabel labelCep;
    private javax.swing.JLabel labelCidade;
    private javax.swing.JLabel labelComplemento;
    private javax.swing.JLabel labelCpf;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelInformacoes;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelNumero;
    private javax.swing.JLabel labelRg;
    private javax.swing.JLabel labelRua;
    private javax.swing.JLabel labelSexo;
    private javax.swing.JLabel labelTelefone;
    private javax.swing.JLabel labelUf;
    private javax.swing.JScrollPane scrollInformacoes;
    // End of variables declaration//GEN-END:variables

    protected void cadastrar() {
        if(BancoDeDados.cadastrar(cliente) && cadastrarAnimais()){
            int resp = JOptionPane.showConfirmDialog(this, "Cliente cadastrado com sucesso. Deseja realizar novo cadastro?", "Concluído", JOptionPane.YES_NO_OPTION);
            this.reiniciar();
            if(resp != JOptionPane.YES_OPTION) {
                this.dispose();
            }
        } else {
            JOptionPane.showMessageDialog(this.getContentPane(), "Falha ao cadastrar cliente!");
        }
    }

    protected void alterar() {
        if(BancoDeDados.alterar(cliente) && alterarAnimais() && cadastrarAnimais()){
            JOptionPane.showMessageDialog(this.getContentPane(), "Cliente alterado com sucesso!");
            this.reiniciar();
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this.getContentPane(), "Falha ao alterar cliente!");
        }
    }

    protected final void reiniciar() {

        campoNome.setText("");
        campoRua.setText("");
        campoNumero.setText("");
        campoComplemento.setText("");
        campoBairro.setText("");
        campoCidade.setText("");
        campoCep.setText("");
        campoCpf.setText("");
        campoRg.setText("");
        campoTelefone.setText("");
        campoCelular.setText("");
        campoEmail.setText("");
        areaInformacoes.setText("");

        comboSexo.setSelectedIndex(-1);
        comboUF.setSelectedIndex(-1);
        comboAnimais.setModel(new javax.swing.DefaultComboBoxModel(new String[0]));

        botaoRemoverAnimal.setVisible(false);
        animais = new ArrayList();
        cadastrado = new ArrayList();
        alterado = new ArrayList();
    }

    void adicionarAnimal(Animal a) {
        animais.add(a);
        cadastrado.add(1);
        alterado.add(0);

        comboAnimais.addItem(a.getNome());
    }

    void alterarAnimal(Animal a) {
        animais.remove(comboAnimais.getSelectedIndex());
        animais.add(a);
        alterado.remove(comboAnimais.getSelectedIndex());
        alterado.add(1);
        cadastrado.remove(comboAnimais.getSelectedIndex());
        cadastrado.add(0);

        comboAnimais.removeItemAt(comboAnimais.getSelectedIndex() + 1);
        comboAnimais.addItem(a.getNome());
        comboAnimais.updateUI();
    }

    protected final void preencher() {

        campoNome.setText(cliente.getNome());
        if(cliente.getSexo().equals("M")) {
            comboSexo.setSelectedIndex(0);
        } else {
            comboSexo.setSelectedIndex(1);
        }
        campoRua.setText(cliente.getEndereco().getRua());
        campoNumero.setText(String.valueOf(cliente.getEndereco().getNum()));
        campoComplemento.setText(cliente.getEndereco().getComplemento());
        campoBairro.setText(cliente.getEndereco().getBairro());
        campoCidade.setText(cliente.getEndereco().getCidade());
        comboUF.setSelectedItem(cliente.getEndereco().getUf());
        campoCep.setText(cliente.getEndereco().getCep());
        campoRg.setText(String.valueOf(cliente.getRg()));
        campoCpf.setText(cliente.getCpf().toString());
        campoEmail.setText(cliente.getEmail());
        campoTelefone.setText(cliente.getTelefone());
        campoCelular.setText(cliente.getCelular());

        for(int i = 0; i < animais.size(); i++){
            comboAnimais.addItem(cliente.getAnimais()[i].getNome());
            animais.add(cliente.getAnimais()[i]);
            cadastrado.add(0);
            alterado.add(0);
        }

        areaInformacoes.setText(cliente.getInformacoes());
    }

    protected boolean existemDependencias() {
        String msg = "Você esqueceu de preencher os \nseguintes campos obrigatórios:\n\n";

        boolean existeDependencias = false;

        if(campoNome.getText().equals("")){
            msg += "- NOME\n";
            existeDependencias = true;
        }
        if(comboSexo.getSelectedIndex() == -1){
            msg += "- SEXO\n";
            existeDependencias = true;
        }
        if(campoRua.getText().equals("")){
            msg += "- RUA\n";
            existeDependencias = true;
        }
        if(campoCidade.getText().equals("")){
            msg += "- CIDADE\n";
            existeDependencias = true;
        }
        if(comboUF.getSelectedIndex() == -1){
            msg += "- UF\n";
            existeDependencias = true;
        }
        if(campoRg.getText().equals("")){
            msg += "- RG\n";
            existeDependencias = true;
        }
        if(campoCpf.getText().substring(0, 1).equals(" ")){
            msg += "- CPF\n";
            existeDependencias = true;
        }
        if(campoTelefone.getText().substring(1, 2).equals(" ")
                && campoCelular.getText().substring(1, 2).equals(" ")){
            msg += "- TELEFONE OU CELULAR";
            existeDependencias = true;
        }

        if(existeDependencias){
            JOptionPane.showMessageDialog(this.getContentPane(), msg);
            return true;
        }

        boolean celularValido = campoCelular.getText().substring(0, 1).equals("(")
                && campoCelular.getText().substring(3, 4).equals(")")
                && campoCelular.getText().substring(8, 9).equals("-");
        boolean telefoneValido = campoTelefone.getText().substring(0, 1).equals("(")
                && campoTelefone.getText().substring(3, 4).equals(")")
                && campoTelefone.getText().substring(8, 9).equals("-");

        if(campoCelular.getText().length() < 13 || !celularValido){
            if(!campoCelular.getText().equals("")){
                JOptionPane.showMessageDialog(this.getContentPane(), "Celular Inválido!");
                return true;
            }
        } else if(campoTelefone.getText().length() < 13 || !telefoneValido){
            if(!campoTelefone.getText().equals("")){
                JOptionPane.showMessageDialog(this.getContentPane(), "Telefone Inválido!");
                return true;
            }
        } else if((campoCep.getText().length() < 9 && !campoCep.getText().equals(""))
                || !campoCep.getText().substring(5, 6).equals("-")){
            JOptionPane.showMessageDialog(this.getContentPane(), "CEP Inválido!");
            return true;

        }

        return existeDependencias;
    }

    public Cliente gerarCliente() {
        String email = campoEmail.getText();
        String telefone = campoTelefone.getText();
        String celular = campoCelular.getText();
        String informacoes = areaInformacoes.getText();

        //ENDEREÇO
        String rua = campoRua.getText();
        int numero = Integer.valueOf(campoNumero.getText());
        String bairro = campoBairro.getText();
        String cidade = campoCidade.getText();
        String uf = (String) comboUF.getSelectedItem();
        String complemento = campoComplemento.getText();
        String cep = campoCep.getText();

        //CLIENTE
        String nome = campoNome.getText();
        String sexo;
        if(comboSexo.getSelectedItem().equals("MASCULINO")) {
            sexo = "M";
        } else {
            sexo = "F";
        }

        Endereco endereco = new Endereco(rua, numero, complemento, bairro, cidade, uf, cep);
        String CPF = campoCpf.getText().substring(0, 3) + campoCpf.getText().substring(4, 7)
                + campoCpf.getText().substring(8, 11) + campoCpf.getText().substring(12, 14);
        CPF cpf = new CPF(CPF);
        long rg = Long.valueOf(campoRg.getText());
        Animal[] listaAnimais;
        try {
            listaAnimais = (Animal[]) animais.toArray();
        } catch(ClassCastException e){
            listaAnimais = new Animal[0];
        }

        Cliente c = new Cliente(nome, sexo, endereco, rg, cpf, email,
                telefone, celular, listaAnimais, informacoes);

        if(tipo == TipoJanela.ALTERACAO){
            c.setCodigo(cliente.getCodigo());
        }

        return c;
    }

    protected final void desabilitarCampos() {
        campoNome.setEditable(false);
        comboSexo.setEnabled(false);
        campoRua.setEditable(false);
        campoNumero.setEditable(false);
        campoComplemento.setEditable(false);
        campoBairro.setEditable(false);
        campoCidade.setEditable(false);
        comboUF.setEnabled(false);
        campoCep.setEditable(false);
        campoRg.setEditable(false);
        campoCpf.setEditable(false);
        campoEmail.setEditable(false);
        campoTelefone.setEditable(false);
        campoCelular.setEditable(false);
        areaInformacoes.setEditable(false);
    }

    private boolean cadastrarAnimais() {
        boolean cadastrouAnimais = true;

        for(int i = 0; i < animais.size(); i++){
            animais.get(i).setCodigoDono(BancoDeDados.getClienteCod(cliente));
            if(cadastrado.get(i) == 1) {
                cadastrouAnimais = cadastrouAnimais && BancoDeDados.cadastrar(animais.get(i));
            }
        }

        return cadastrouAnimais;
    }

    private boolean alterarAnimais() {
        boolean alterouAnimais = true;

        for(int i = 0; i < animais.size(); i++){
            animais.get(i).setCodigoDono(BancoDeDados.getClienteCod(cliente));
            if(alterado.get(i) == 1) {
                alterouAnimais = alterouAnimais && BancoDeDados.alterar(animais.get(i));
            }
        }

        return alterouAnimais;
    }
}
