/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import javax.swing.table.DefaultTableModel;

import controllers.LivroController;
import controllers.UserController;
import models.User;

/**   
 *
 * @author USER
 */
public class TelaEditClient extends javax.swing.JFrame {

    /**
     * Creates new form TelaEditClient
     */
    public TelaEditClient() {
        super("Tela do Cliente");
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

        label_pesqCliente = new javax.swing.JLabel();
        label_buscaNome = new javax.swing.JLabel();
        txt_buscarNome = new javax.swing.JTextField();
        btn_pesquisarID = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tab_info = new javax.swing.JTable();
        menu = new javax.swing.JMenuBar();
        itemBiblioteca = new javax.swing.JMenu();
        menuLivro_ver = new javax.swing.JMenuItem();
        menuLivro_Pesquisar = new javax.swing.JMenuItem();
        menuLivro_Cadastro = new javax.swing.JMenuItem();
        itemClientes = new javax.swing.JMenu();
        menuCliente_Pesquisar = new javax.swing.JMenuItem();
        menuCliente_Cadastro = new javax.swing.JMenuItem();
        itemAvaliacao = new javax.swing.JMenu();
        menuAvalia_Fazer = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        label_pesqCliente.setText("Pesquisar nome do Cliente:");

        label_buscaNome.setText("Nome: ");

        btn_pesquisarID.setText("Pesquisar");
        btn_pesquisarID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pesquisarIDActionPerformed(evt);
            }
        });

        tab_info = new javax.swing.JTable() {
            public boolean isCellEditable (int rowIndex, int colIndex){
                return false;
            }
        };
        tab_info.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Sobrenome", "Usuario", "Senha", "Idade", "Sexo", "Livro Preferido"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Double.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tab_info.setColumnSelectionAllowed(true);
        tab_info.setFocusable(false);
        tab_info.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tab_info);
        tab_info.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        itemBiblioteca.setText("Biblioteca");
        itemBiblioteca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemBibliotecaActionPerformed(evt);
            }
        });

        menuLivro_ver.setText("Ver Livros");
        menuLivro_ver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuLivro_verActionPerformed(evt);
            }
        });
        itemBiblioteca.add(menuLivro_ver);

        menuLivro_Pesquisar.setText("Pesquisar Livros");
        menuLivro_Pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuLivro_PesquisarActionPerformed(evt);
            }
        });
        itemBiblioteca.add(menuLivro_Pesquisar);

        menuLivro_Cadastro.setText("Cadastrar Livros");
        menuLivro_Cadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuLivro_CadastroActionPerformed(evt);
            }
        });
        itemBiblioteca.add(menuLivro_Cadastro);

        menu.add(itemBiblioteca);

        itemClientes.setText("Clientes");

        menuCliente_Pesquisar.setText("Pesquisar Cliente");
        menuCliente_Pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCliente_PesquisarActionPerformed(evt);
            }
        });
        itemClientes.add(menuCliente_Pesquisar);

        if (UserController.verificacaoUsuarioAdmin(views.TelaLogin.passarUser())) {
            menuCliente_Cadastro.setText("Cadastrar Cliente");
            menuCliente_Cadastro.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    menuCliente_CadastroActionPerformed(evt);
                }
            });
            itemClientes.add(menuCliente_Cadastro);
        }
        
        menu.add(itemClientes);

        itemAvaliacao.setText("Avaliações");

        menuAvalia_Fazer.setText("Fazer Avaliação");
        menuAvalia_Fazer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAvalia_FazerActionPerformed(evt);
            }
        });
        itemAvaliacao.add(menuAvalia_Fazer);

        menu.add(itemAvaliacao);

        setJMenuBar(menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(label_pesqCliente)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label_buscaNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_buscarNome, javax.swing.GroupLayout.DEFAULT_SIZE, 471, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_pesquisarID, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(label_pesqCliente)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_buscaNome, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_buscarNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_pesquisarID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_pesquisarIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pesquisarIDActionPerformed
        String pegarNome = txt_buscarNome.getText();
                 
        DefaultTableModel tb = (DefaultTableModel)tab_info.getModel();
        tb.addRow(
            new Object[]{
                78, "null", "null", "null", null, 48, "null", "null",
        });

        tab_info.validate();
        
    }//GEN-LAST:event_btn_pesquisarIDActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        ((DefaultTableModel) tab_info.getModel()).setRowCount(0);
    }//GEN-LAST:event_formWindowOpened

    private void menuLivro_verActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLivro_verActionPerformed
        // TODO add your handling code here:
        var TelaBiblioteca = new TelaBiblioteca();
        TelaBiblioteca.setVisible(true);
        dispose();
    }//GEN-LAST:event_menuLivro_verActionPerformed

    private void menuLivro_PesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLivro_PesquisarActionPerformed
        var TelaEditLivros = new TelaEditLivros();
        TelaEditLivros.setVisible(true);
        dispose();
    }//GEN-LAST:event_menuLivro_PesquisarActionPerformed

    private void menuLivro_CadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLivro_CadastroActionPerformed
        var TelaCadastroLivro = new TelaCadastroLivro();
        TelaCadastroLivro.setVisible(true);
    }//GEN-LAST:event_menuLivro_CadastroActionPerformed

    private void itemBibliotecaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemBibliotecaActionPerformed

    }//GEN-LAST:event_itemBibliotecaActionPerformed

    private void menuCliente_PesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCliente_PesquisarActionPerformed
        var TelaEditClient = new TelaEditClient();
        TelaEditClient.setVisible(true);
        dispose();
    }//GEN-LAST:event_menuCliente_PesquisarActionPerformed

    private void menuCliente_CadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCliente_CadastroActionPerformed
        var TelaCadastroClient = new TelaCadastroClient();
        TelaCadastroClient.setVisible(true);
    }//GEN-LAST:event_menuCliente_CadastroActionPerformed

    private void menuAvalia_FazerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAvalia_FazerActionPerformed
        var TelaAvaliacao = new TelaAvaliacao();
        TelaAvaliacao.setVisible(true);
        dispose();
    }//GEN-LAST:event_menuAvalia_FazerActionPerformed

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
            java.util.logging.Logger.getLogger(TelaEditClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaEditClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaEditClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaEditClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaEditClient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_pesquisarID;
    private javax.swing.JMenu itemAvaliacao;
    private javax.swing.JMenu itemBiblioteca;
    private javax.swing.JMenu itemClientes;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label_buscaNome;
    private javax.swing.JLabel label_pesqCliente;
    private javax.swing.JMenuBar menu;
    private javax.swing.JMenuItem menuAvalia_Fazer;
    private javax.swing.JMenuItem menuCliente_Cadastro;
    private javax.swing.JMenuItem menuCliente_Pesquisar;
    private javax.swing.JMenuItem menuLivro_Cadastro;
    private javax.swing.JMenuItem menuLivro_Pesquisar;
    private javax.swing.JMenuItem menuLivro_ver;
    private javax.swing.JTable tab_info;
    private javax.swing.JTextField txt_buscarNome;
    // End of variables declaration//GEN-END:variables
}
