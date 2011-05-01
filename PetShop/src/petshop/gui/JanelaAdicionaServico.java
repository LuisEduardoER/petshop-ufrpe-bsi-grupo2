/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * JanelaAdicionaServico.java
 *
 * Created on Apr 8, 2011, 7:39:11 PM
 */

package petshop.gui;

/**
 *
 * @author arthur
 */
public class JanelaAdicionaServico extends JanelaAdiciona {

    JanelaVenda pai;

    /** Creates new form JanelaAdicionaCliente */
    public JanelaAdicionaServico(JanelaVenda janelaVenda) {
        pai = janelaVenda;

        setTitle("Adicionar Serviço");
        
        String[] modelo = new String[] {"Código", "Nome"};
        double[] tamanhosColunas = new double[] {30, 70};

        painel.setModelo(modelo, tamanhosColunas);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JanelaAdicionaServico(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

}