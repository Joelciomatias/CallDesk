/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Usuario;

/**
 *
 * @author joelc
 */
public class PrincipalADM extends javax.swing.JFrame {
    private Model.Usuario usuarioLogado;
    /**
     * Creates new form Principal
     */
    public PrincipalADM() {
        initComponents();
    }

    public PrincipalADM(Usuario usuarioLogado) {
        this.usuarioLogado = usuarioLogado;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jdpPricipal = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        ListarChamados = new javax.swing.JMenuItem();
        listarChamdos = new javax.swing.JMenuItem();
        chamadosAtribuidos = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CallDesk - Central de Chamados ");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        setSize(new java.awt.Dimension(966, 568));
        setType(java.awt.Window.Type.UTILITY);

        jdpPricipal.setDesktopManager(null);
        jdpPricipal.setMaximumSize(new java.awt.Dimension(1368, 768));
        jdpPricipal.setPreferredSize(new java.awt.Dimension(1366, 768));

        javax.swing.GroupLayout jdpPricipalLayout = new javax.swing.GroupLayout(jdpPricipal);
        jdpPricipal.setLayout(jdpPricipalLayout);
        jdpPricipalLayout.setHorizontalGroup(
            jdpPricipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1366, Short.MAX_VALUE)
        );
        jdpPricipalLayout.setVerticalGroup(
            jdpPricipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 547, Short.MAX_VALUE)
        );

        jLabel1.setText("jLabel1");

        jLabel2.setText("jLabel2");

        jMenu2.setText("Inicio");

        jMenuItem4.setText("Alternar usuario");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuItem5.setText("Sair");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuBar1.add(jMenu2);

        jMenu1.setText("Chamados");

        ListarChamados.setText("Abrir Chamado");
        ListarChamados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListarChamadosActionPerformed(evt);
            }
        });
        jMenu1.add(ListarChamados);

        listarChamdos.setText("Listar Chamados");
        listarChamdos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarChamdosActionPerformed(evt);
            }
        });
        jMenu1.add(listarChamdos);

        chamadosAtribuidos.setText("Configurações");
        chamadosAtribuidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chamadosAtribuidosActionPerformed(evt);
            }
        });
        jMenu1.add(chamadosAtribuidos);

        jMenuItem2.setText("Chamados Atribuidos");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu4.setText("Usuarios");

        jMenuItem1.setText("Novo Usuario");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem1);

        jMenuBar1.add(jMenu4);

        jMenu3.setText("Ajuda");

        jMenuItem9.setText("Sobre CallDesk");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem9);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jdpPricipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpPricipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 547, Short.MAX_VALUE)
        );

        setBounds(284, 81, 800, 607);
    }// </editor-fold>//GEN-END:initComponents

    private void ListarChamadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListarChamadosActionPerformed
        AbrirChamado cad = new AbrirChamado();
        jdpPricipal.add(cad);
        cad.carregarComboCategaria();
        cad.setVisible(true);  
    }//GEN-LAST:event_ListarChamadosActionPerformed

    private void chamadosAtribuidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chamadosAtribuidosActionPerformed
        ConfiguracoesChamado cad = new ConfiguracoesChamado();
        jdpPricipal.add(cad); 
        cad.setVisible(true);
    }//GEN-LAST:event_chamadosAtribuidosActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        this.setVisible(false);
        
        new Login().setVisible(true);        
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void listarChamdosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarChamdosActionPerformed
        ListarChamados listar = new ListarChamados();
        jdpPricipal.add(listar);
        listar.setVisible(true);
    }//GEN-LAST:event_listarChamdosActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        CadUsuario user = new CadUsuario();
        jdpPricipal.add(user);
        user.setVisible(true); 
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        chamadosTecnico ch = new chamadosTecnico();
        jdpPricipal.add(ch);
       
        ch.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
       SobreCallDesk sobre = new SobreCallDesk();
       jdpPricipal.add(sobre);
       sobre.setVisible(true);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

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
            java.util.logging.Logger.getLogger(PrincipalADM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalADM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalADM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalADM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalADM().setVisible(true);
                
            }
            
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ListarChamados;
    private javax.swing.JMenuItem chamadosAtribuidos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JDesktopPane jdpPricipal;
    private javax.swing.JMenuItem listarChamdos;
    // End of variables declaration//GEN-END:variables
}
