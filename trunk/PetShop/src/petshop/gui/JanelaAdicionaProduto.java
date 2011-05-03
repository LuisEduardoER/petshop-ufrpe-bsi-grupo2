/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * JanelaAdicionaProduto.java
 *
 * Created on Apr 8, 2011, 7:41:36 PM
 */

package petshop.gui;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import petshop.classes.BancoDeDados;
import petshop.classes.Produto;

/**
 *
 * @author arthur
 */
public class JanelaAdicionaProduto extends JanelaAdiciona {

    JanelaVenda pai;

    /** Creates new form JanelaAdicionaProduto */
    public JanelaAdicionaProduto(JanelaVenda janelaVenda) {
        pai = janelaVenda;

        setTitle("Adicionar Produto");

        String[] modelo = new String[] {"Código", "Nome"};
        double[] tamanhosColunas = new double[] {30, 70};

        painel.setModelo(modelo, tamanhosColunas);
        
        this.painel.botaoPesquisar.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pesquisar();
            } 
        });
            
        this.botaoOK.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if(botaoOK.isEnabled()){
                    Number valor = (Number) painel.tabela.getValueAt(painel.tabela.getSelectedRow(), 0);
                    ok(valor.intValue());
                }
            } 
        });
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JanelaAdicionaProduto(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

    private void pesquisar() {
        Produto p = new Produto();

        if(!painel.campoPesquisa.getText().equals("")){
            if(painel.comboPesquisa.getSelectedIndex() == 0){
                p.setCodigo(Integer.valueOf(painel.campoPesquisa.getText()));
            } else if(painel.comboPesquisa.getSelectedIndex() == 1){
                p.setNome(painel.campoPesquisa.getText());
            }
        }

        Produto[] produtos = BancoDeDados.consultar(p);
        Object[][] dados = new Object[produtos.length][4];

        for(int i = 0; i < produtos.length; i++){
            dados[i][0] = produtos[i].getCodigo();
            dados[i][1] = produtos[i].getNome();
        }

        DefaultTableModel model = (DefaultTableModel) this.painel.tabela.getModel();

        model.setDataVector(dados, painel.modelo);
        painel.redimensionarColunas();

        if(produtos.length == 0){
            JOptionPane.showMessageDialog(this, "A busca não retornou nenhum resultado!");
        }
    }
    
    private void ok(int cod) {
        pai.getCampoCodigo().setText(cod + "");
        reiniciar();

        this.dispose();
    }
}
