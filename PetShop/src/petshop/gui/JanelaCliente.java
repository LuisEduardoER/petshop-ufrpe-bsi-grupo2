package petshop.gui;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
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
public class JanelaCliente extends javax.swing.JDialog {

    private Cliente cliente;
    private ArrayList<Animal> animais;
    private TipoJanela tipo;

    /** Creates new form JanelaCliente */
    public JanelaCliente(TipoJanela tipo) {
        this.tipo = tipo;
        initComponents();

        this.setLocationRelativeTo(this.getContentPane());

        KeyListener k = new KeyListener() {
                    public void keyTyped(KeyEvent e) {
                        if (!((e.getKeyChar() >= KeyEvent.VK_0 &&
                               e.getKeyChar() <= KeyEvent.VK_9) ||
                              (e.getKeyChar() == KeyEvent.VK_BACK_SPACE))) {
                            e.consume(); } }
                    public void keyPressed(KeyEvent e) { }
                    public void keyReleased(KeyEvent e) { } };
        
        campoTelefone.addKeyListener(k);
        campoCelular.addKeyListener(k);
        campoCEP.addKeyListener(k);
        campoCPF.addKeyListener(k);
        campoRG.addKeyListener(k);
        campoNumero.addKeyListener(k);
        
        animais = new ArrayList();


        reiniciar();

        if(this.tipo == TipoJanela.ALTERACAO){
            botaoCadastrar.setText("Alterar");
        }
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
        comboSexo = new javax.swing.JComboBox();
        campoTelefone = new javax.swing.JTextField();
        campoCelular = new javax.swing.JTextField();
        campoRua = new javax.swing.JTextField();
        campoNumero = new javax.swing.JTextField();
        campoComplemento = new javax.swing.JTextField();
        campoBairro = new javax.swing.JTextField();
        campoCidade = new javax.swing.JTextField();
        comboUF = new javax.swing.JComboBox();
        campoCEP = new javax.swing.JTextField();
        campoRG = new javax.swing.JTextField();
        campoCPF = new javax.swing.JTextField();
        campoEMail = new javax.swing.JTextField();
        scrollInformacoes = new javax.swing.JScrollPane();
        areaInformacoes = new javax.swing.JTextArea();
        botaoCancelar = new javax.swing.JButton();
        botaoCadastrar = new javax.swing.JButton();
        comboAnimais = new javax.swing.JComboBox();
        botaoAdicionarAnimal = new javax.swing.JButton();
        botaoRemoverAnimal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
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
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                campoTamanhoMaximo(evt);
                campoMaiusculas(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 250;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(campoNome, gridBagConstraints);

        comboSexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Sexo", "Masculino", "Feminino" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(comboSexo, gridBagConstraints);

        campoTelefone.setText("Telefone");
        campoTelefone.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tirarEtiqueta(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                colocarEtiqueta(evt);
            }
        });
        campoTelefone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                eventoDigitarFone(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 80;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(campoTelefone, gridBagConstraints);

        campoCelular.setText("Celular");
        campoCelular.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tirarEtiqueta(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                colocarEtiqueta(evt);
            }
        });
        campoCelular.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                eventoDigitarFone(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 80;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(campoCelular, gridBagConstraints);

        campoRua.setText("Rua");
        campoRua.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tirarEtiqueta(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                colocarEtiqueta(evt);
            }
        });
        campoRua.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoTamanhoMaximo(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                campoTamanhoMaximo(evt);
                campoMaiusculas(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(campoRua, gridBagConstraints);

        campoNumero.setText("Número");
        campoNumero.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tirarEtiqueta(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                colocarEtiqueta(evt);
            }
        });
        campoNumero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoTamanhoMaximo(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                campoTamanhoMaximo(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(campoNumero, gridBagConstraints);

        campoComplemento.setText("Complemento");
        campoComplemento.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tirarEtiqueta(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                colocarEtiqueta(evt);
            }
        });
        campoComplemento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoTamanhoMaximo(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                campoTamanhoMaximo(evt);
                campoMaiusculas(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(campoComplemento, gridBagConstraints);

        campoBairro.setText("Bairro");
        campoBairro.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tirarEtiqueta(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                colocarEtiqueta(evt);
            }
        });
        campoBairro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoTamanhoMaximo(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                campoTamanhoMaximo(evt);
                campoMaiusculas(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(campoBairro, gridBagConstraints);

        campoCidade.setText("Cidade");
        campoCidade.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tirarEtiqueta(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                colocarEtiqueta(evt);
            }
        });
        campoCidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoTamanhoMaximo(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                campoTamanhoMaximo(evt);
                campoMaiusculas(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 170;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(campoCidade, gridBagConstraints);

        comboUF.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "UF", "AC", "AL", "AP", "AM", "BA", "CE", "DF", "GO", "ES", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SP", "SC", "SE", "TO" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(comboUF, gridBagConstraints);

        campoCEP.setText("CEP");
        campoCEP.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tirarEtiqueta(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                colocarEtiqueta(evt);
            }
        });
        campoCEP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                eventoDigitarCEP(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(campoCEP, gridBagConstraints);

        campoRG.setText("RG");
        campoRG.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tirarEtiqueta(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                colocarEtiqueta(evt);
            }
        });
        campoRG.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoTamanhoMaximo(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 120;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(campoRG, gridBagConstraints);

        campoCPF.setText("CPF");
        campoCPF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tirarEtiqueta(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                colocarEtiqueta(evt);
            }
        });
        campoCPF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                eventoDigitarCPF(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 170;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(campoCPF, gridBagConstraints);

        campoEMail.setText("e-Mail");
        campoEMail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tirarEtiqueta(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                colocarEtiqueta(evt);
            }
        });
        campoEMail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoTamanhoMaximo(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                campoTamanhoMaximo(evt);
                campoMaiusculas(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(campoEMail, gridBagConstraints);

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
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                campoTamanhoMaximo(evt);
                campoMaiusculas(evt);
            }
        });
        scrollInformacoes.setViewportView(areaInformacoes);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipady = 30;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(scrollInformacoes, gridBagConstraints);

        botaoCancelar.setText("Cancelar");
        botaoCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelar(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.ipadx = 50;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(botaoCancelar, gridBagConstraints);

        botaoCadastrar.setText("Cadastrar");
        botaoCadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cadastrar(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 50;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(botaoCadastrar, gridBagConstraints);

        comboAnimais.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Animais" }));
        comboAnimais.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                mudarComboAnimais(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(comboAnimais, gridBagConstraints);

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
        gridBagConstraints.gridy = 6;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 1);
        jPanel1.add(botaoAdicionarAnimal, gridBagConstraints);

        botaoRemoverAnimal.setText("Remover");
        botaoRemoverAnimal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                removerAnimal(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.insets = new java.awt.Insets(5, 1, 5, 5);
        jPanel1.add(botaoRemoverAnimal, gridBagConstraints);

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

    private void cancelar(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelar
        int resp = JOptionPane.showConfirmDialog(this, "Tem certeza que deseja cancelar?", "Sair", JOptionPane.YES_NO_OPTION);

        if(resp == JOptionPane.YES_OPTION){
            this.dispose();
            reiniciar();
        }
}//GEN-LAST:event_cancelar

    private void adicionarAnimal(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adicionarAnimal
        JanelaAnimal animal = new JanelaAnimal(this);

        animal.setModalityType(java.awt.Dialog.DEFAULT_MODALITY_TYPE);
        animal.setVisible(true);
}//GEN-LAST:event_adicionarAnimal

    private void cadastrar(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cadastrar
        if(!existemDependencias()){
            cliente = gerarCliente();

            if(tipo == TipoJanela.CADASTRO){
                if(BancoDeDados.cadastrar(cliente)){
                    JOptionPane.showMessageDialog(this.getContentPane(), "Cliente cadastrado com sucesso!");
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(this.getContentPane(), "Falha ao cadastrar cliente!");
                }
            } else {
                if(BancoDeDados.alterar(cliente)){
                    JOptionPane.showMessageDialog(this.getContentPane(), "Cliente alterado com sucesso!");
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(this.getContentPane(), "Falha ao alterar cliente!");
                }
            }
            
        }
    }//GEN-LAST:event_cadastrar

    private void eventoDigitarFone(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_eventoDigitarFone
        JTextField campo = (JTextField) evt.getComponent();

        if(campo.getText().length() == 13) evt.consume();
        
        if(evt.getKeyChar() != KeyEvent.VK_BACK_SPACE){
            if(campo.getText().length() == 0) campo.setText("(");
            else if(campo.getText().length() == 3) campo.setText(campo.getText() + ")");
            else if(campo.getText().length() == 8) campo.setText(campo.getText() + "-");
        }
    }//GEN-LAST:event_eventoDigitarFone

    private void eventoDigitarCPF(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_eventoDigitarCPF
        JTextField campo = (JTextField) evt.getComponent();

        if(campo.getText().length() == 14) evt.consume();

        if(evt.getKeyChar() != KeyEvent.VK_BACK_SPACE){
            if(campo.getText().length() == 3) campo.setText(campo.getText() + ".");
            else if(campo.getText().length() == 7) campo.setText(campo.getText() + ".");
            else if(campo.getText().length() == 11) campo.setText(campo.getText() + "-");
        }
    }//GEN-LAST:event_eventoDigitarCPF

    private void eventoDigitarCEP(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_eventoDigitarCEP
        JTextField campo = (JTextField) evt.getComponent();

        if(campo.getText().length() == 9) evt.consume();

        if(evt.getKeyChar() != KeyEvent.VK_BACK_SPACE){
            if(campo.getText().length() == 5) campo.setText(campo.getText() + "-");
        }
    }//GEN-LAST:event_eventoDigitarCEP

    private void campoTamanhoMaximo(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoTamanhoMaximo
        JTextComponent campo = (JTextComponent) evt.getComponent();

        if(campo.getText().length() >= getTamanhoMaximo(campo)){
            evt.consume();
        }        
    }//GEN-LAST:event_campoTamanhoMaximo

    private void campoMaiusculas(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoMaiusculas
        JTextComponent campo = (JTextComponent) evt.getComponent();

        if(Character.isLowerCase(evt.getKeyChar())){
            campo.setText(campo.getText().toUpperCase());
        }
    }//GEN-LAST:event_campoMaiusculas

    private void mudarComboAnimais(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_mudarComboAnimais
        if(comboAnimais.getSelectedIndex() > 0)
            botaoRemoverAnimal.setVisible(true);
        else
            botaoRemoverAnimal.setVisible(false);
    }//GEN-LAST:event_mudarComboAnimais

    private void removerAnimal(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removerAnimal
        animais.remove(comboAnimais.getSelectedIndex()-1);
        comboAnimais.removeItemAt(comboAnimais.getSelectedIndex());

        if(tipo == TipoJanela.ALTERACAO){
            Animal[] a = BancoDeDados.consultar(new Animal((String) comboAnimais.getSelectedItem()));
            BancoDeDados.remover(a[0]);
        }
    }//GEN-LAST:event_removerAnimal

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JanelaCliente(TipoJanela.CADASTRO).setVisible(true);
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
    private javax.swing.JTextField campoCEP;
    private javax.swing.JTextField campoCPF;
    private javax.swing.JTextField campoCelular;
    private javax.swing.JTextField campoCidade;
    private javax.swing.JTextField campoComplemento;
    private javax.swing.JTextField campoEMail;
    private javax.swing.JTextField campoNome;
    private javax.swing.JTextField campoNumero;
    private javax.swing.JTextField campoRG;
    private javax.swing.JTextField campoRua;
    private javax.swing.JTextField campoTelefone;
    private javax.swing.JComboBox comboAnimais;
    private javax.swing.JComboBox comboSexo;
    private javax.swing.JComboBox comboUF;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane scrollInformacoes;
    // End of variables declaration//GEN-END:variables



    private String getEtiqueta(JTextComponent campo){

        if(campo.equals(campoNome)) return "Nome";
        else if(campo.equals(campoRua)) return "Rua";
        else if(campo.equals(campoNumero)) return "Número";
        else if(campo.equals(campoComplemento)) return "Complemento";
        else if(campo.equals(campoBairro)) return "Bairro";
        else if(campo.equals(campoCidade)) return "Cidade";
        else if(campo.equals(campoCEP)) return "CEP";
        else if(campo.equals(campoRG)) return "RG";
        else if(campo.equals(campoCPF)) return "CPF";
        else if(campo.equals(campoEMail)) return "e-Mail";
        else if(campo.equals(campoTelefone)) return "Telefone";
        else if(campo.equals(campoCelular)) return "Celular";
        else if(campo.equals(areaInformacoes)) return "Informações Adicionais";

        return "";
    }


    private void reiniciar(){

        campoNome.setText("Nome");
        comboSexo.setSelectedIndex(0);
        campoRua.setText("Rua");
        campoNumero.setText("Número");
        campoComplemento.setText("Complemento");
        campoBairro.setText("Bairro");
        campoCidade.setText("Cidade");
        comboUF.setSelectedIndex(0);
        campoCEP.setText("CEP");
        campoRG.setText("RG");
        campoCPF.setText("CPF");
        campoEMail.setText("e-Mail");
        campoTelefone.setText("Telefone");
        campoCelular.setText("Celular");
        comboAnimais.setModel(new javax.swing.DefaultComboBoxModel(new String[] {"Animais"}));
        areaInformacoes.setText("Informações Adicionais");

        botaoRemoverAnimal.setVisible(false);
    }

    public void adicionarAnimal(Animal a){
        animais.add(a);

        comboAnimais.addItem(a.getNome());
    }


    private int getTamanhoMaximo(JTextComponent campo){

        if(campo.equals(campoNome)) return 80;
        else if(campo.equals(campoRua)) return 70;
        else if(campo.equals(campoNumero)) return 4;
        else if(campo.equals(campoComplemento)) return 30;
        else if(campo.equals(campoBairro)) return 30;
        else if(campo.equals(campoCidade)) return 30;
        else if(campo.equals(campoRG)) return 15;
        else if(campo.equals(campoEMail)) return 70;
        else if(campo.equals(areaInformacoes)) return 400;

        return 0;
    }


    private boolean existemDependencias(){
        String msg = "Você esqueceu de preencher os \nseguintes campos obrigatórios:\n\n";

        boolean existeDependencias = false;

        if(campoNome.getText().equals("Nome")){ msg += "- NOME\n"; existeDependencias = true;}
        if(comboSexo.getSelectedIndex() == 0){ msg += "- SEXO\n"; existeDependencias = true;}
        if(campoRua.getText().equals("Rua")){ msg += "- RUA\n"; existeDependencias = true;}
        if(campoNumero.getText().equals("Número")){ msg += "- NÚMERO\n"; existeDependencias = true;}
        if(campoBairro.getText().equals("Bairro")){ msg += "- BAIRRO\n"; existeDependencias = true;}
        if(campoCidade.getText().equals("Cidade")){ msg += "- CIDADE\n"; existeDependencias = true;}
        if(comboUF.getSelectedIndex() == 0){ msg += "- UF\n"; existeDependencias = true;}
        if(campoRG.getText().equals("RG")){ msg += "- RG\n"; existeDependencias = true;}
        if(campoCPF.getText().equals("CPF")){ msg += "- CPF\n"; existeDependencias = true;}
        if(campoTelefone.getText().equals("Telefone") && campoCelular.getText().equals("Celular")){
            msg += "- TELEFONE OU CELULAR"; existeDependencias = true;
        }

        if(existeDependencias){
            JOptionPane.showMessageDialog(this.getContentPane(), msg);
        }

        return existeDependencias;
    }

    public Cliente gerarCliente(){
        String complemento = "";
        String cep = "";
        String email = "";
        String telefone = "";
        String celular = "";
        String informacoes = "";

        if(!campoComplemento.getText().equals(getEtiqueta(campoComplemento)))
            complemento = campoComplemento.getText();
        if(!campoCEP.getText().equals(getEtiqueta(campoCEP)))
            cep = campoCEP.getText();
        if(!campoEMail.getText().equals(getEtiqueta(campoEMail)))
            email = campoEMail.getText();
        if(!campoTelefone.getText().equals(getEtiqueta(campoTelefone)))
            telefone = campoTelefone.getText();
        if(!campoCelular.getText().equals(getEtiqueta(campoCelular)))
            celular = campoCelular.getText();
        if(!areaInformacoes.getText().equals(getEtiqueta(areaInformacoes)))
            informacoes = areaInformacoes.getText();
        
        //ENDEREÇO
        String rua = campoRua.getText();
        int numero = Integer.valueOf(campoNumero.getText());
        String bairro = campoBairro.getText();
        String cidade = campoCidade.getText();
        String uf = (String) comboUF.getSelectedItem();

        //CLIENTE
        String nome = campoNome.getText();
        String sexo;
        if(comboSexo.getSelectedIndex() == 1) sexo = "M";
        else sexo = "F";
        Endereco endereco = new Endereco(rua, numero, complemento, bairro, cidade, uf, cep);
        long rg = Long.valueOf(campoRG.getText());
        CPF cpf = new CPF(campoCPF.getText());
        Animal[] listaAnimais;
        try{
            listaAnimais = (Animal[]) animais.toArray();
        } catch (ClassCastException e){
            listaAnimais = new Animal[0];
        }
        
        return new Cliente(nome, sexo, endereco, rg, cpf, email,
                telefone, celular, listaAnimais, informacoes);
    }

    public JTextArea getAreaInformacoes() {
        return areaInformacoes;
    }

    public JButton getBotaoAdicionarAnimal() {
        return botaoAdicionarAnimal;
    }

    public JButton getBotaoCadastrar() {
        return botaoCadastrar;
    }

    public JButton getBotaoCancelar() {
        return botaoCancelar;
    }

    public JButton getBotaoRemoverAnimal() {
        return botaoRemoverAnimal;
    }

    public JTextField getCampoBairro() {
        return campoBairro;
    }

    public JTextField getCampoCEP() {
        return campoCEP;
    }

    public JTextField getCampoCPF() {
        return campoCPF;
    }

    public JTextField getCampoCelular() {
        return campoCelular;
    }

    public JTextField getCampoCidade() {
        return campoCidade;
    }

    public JTextField getCampoComplemento() {
        return campoComplemento;
    }

    public JTextField getCampoEMail() {
        return campoEMail;
    }

    public JTextField getCampoNome() {
        return campoNome;
    }

    public JTextField getCampoNumero() {
        return campoNumero;
    }

    public JTextField getCampoRG() {
        return campoRG;
    }

    public JTextField getCampoRua() {
        return campoRua;
    }

    public JTextField getCampoTelefone() {
        return campoTelefone;
    }

    public JComboBox getComboAnimais() {
        return comboAnimais;
    }

    public JComboBox getComboSexo() {
        return comboSexo;
    }

    public JComboBox getComboUF() {
        return comboUF;
    }

    public JScrollPane getScrollInformacoes() {
        return scrollInformacoes;
    }


}