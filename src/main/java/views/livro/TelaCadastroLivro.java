package views.livro;

import javax.swing.JOptionPane;

import controllers.AvaliacaoController;
import controllers.LivroController;
import controllers.UserController;
import models.User;

/**
 *
 * @author 823133821
 */
public class TelaCadastroLivro extends javax.swing.JFrame {
    
    private User usuarioLogado = UserController.usuarioLogado;

    /**
     * Creates new form TelaCadastroLivro
     */
    public TelaCadastroLivro() {
        super("Cadastrar livro");
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label_nomeLivro = new javax.swing.JLabel();
        txt_nomeLivro = new javax.swing.JTextField();
        label_sinopse = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtA_sinopse = new javax.swing.JTextArea();
        label_genero = new javax.swing.JLabel();
        btn_voltar = new javax.swing.JButton();
        btn_confirmar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txt_autor = new javax.swing.JTextField();
        comboBox_genero = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        comboBox_nota = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        label_nomeLivro.setText("Nome: ");

        label_sinopse.setText("Sinopse:");

        txtA_sinopse.setColumns(20);
        txtA_sinopse.setRows(5);
        jScrollPane3.setViewportView(txtA_sinopse);

        label_genero.setText("Gênero: ");

        btn_voltar.setText("VOLTAR");
        btn_voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_voltarActionPerformed(evt);
            }
        });

        btn_confirmar.setText("CONFIRMAR");
        btn_confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_confirmarActionPerformed(evt);
            }
        });

        jLabel1.setText("Autor: ");

        comboBox_genero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tecnico", "Ficção Cientifica", "Romance", " " }));

        jLabel2.setText("Nota:");

        comboBox_nota.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_nomeLivro)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_autor, javax.swing.GroupLayout.DEFAULT_SIZE, 558, Short.MAX_VALUE)
                            .addComponent(txt_nomeLivro)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_voltar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_confirmar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(label_sinopse)
                                .addGap(26, 26, 26)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_genero)
                            .addComponent(jLabel2))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(comboBox_genero, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(comboBox_nota, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_nomeLivro)
                    .addComponent(txt_nomeLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_autor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_sinopse)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(comboBox_nota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_genero)
                    .addComponent(comboBox_genero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_voltar)
                    .addComponent(btn_confirmar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private int verificaGenero(String genero) {

        if (genero.equals("Técnico")) {
            return 1;
        } else if (genero.equals("Ação")) {
            return 2;
        } else if (genero.equals("Romance")) {
            return 3;
        } else if (genero.equals("Infantil")) {
            return 4;
        } else if (genero.equals("Ficção Cientifica")) {
            return 5;
        }
        return 0;
    }

    private int passarNota(String genero) {

        if (genero.equals("Técnico")) {
            return 1;
        } else if (genero.equals("Ação")) {
            return 2;
        } else if (genero.equals("Romance")) {
            return 3;
        } else if (genero.equals("Infantil")) {
            return 4;
        } else if (genero.equals("Ficção Cientifica")) {
            return 5;
        }
        return 0;
    }

    private void btn_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_voltarActionPerformed
        dispose();
    }//GEN-LAST:event_btn_voltarActionPerformed

    private void btn_confirmarActionPerformed(java.awt.event.ActionEvent evt) {                                              
        String nome = txt_nomeLivro.getText();
        String autor = txt_autor.getText();
        String sinopse = txtA_sinopse.getText();
        int indiceSelecionado = verificaGenero(comboBox_genero.getSelectedItem().toString());

        // Use Integer.parseInt() for converting the selected item to an integer
        int nota = Integer.parseInt(comboBox_nota.getSelectedItem().toString());

        if (nome != null && nome.length() != 0 &&
            sinopse != null && sinopse.length() != 0 &&
            autor != null && autor.length() != 0) {
            if (LivroController.insertNewLivro(nome, sinopse, indiceSelecionado, autor) == 1) {
                AvaliacaoController.insertAvaliacao(usuarioLogado.getId(), LivroController.getLastLivroId(), nota);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Dados Incompletos");
        }
    }
                                           
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroLivro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_confirmar;
    private javax.swing.JButton btn_voltar;
    private javax.swing.JComboBox<String> comboBox_genero;
    private javax.swing.JComboBox<String> comboBox_nota;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel label_genero;
    private javax.swing.JLabel label_nomeLivro;
    private javax.swing.JLabel label_sinopse;
    private javax.swing.JTextArea txtA_sinopse;
    private javax.swing.JTextField txt_autor;
    private javax.swing.JTextField txt_nomeLivro;
    // End of variables declaration//GEN-END:variables
}
