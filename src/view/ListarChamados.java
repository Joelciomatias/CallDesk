/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.ChamadoController;
import Controller.SituacaoController;
import Model.Chamado;
import Model.Situacao;
import java.awt.TextField;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import model.LinhasDaTBL;

/**
 *
 * @author joelc
 */
public class ListarChamados extends javax.swing.JInternalFrame {
 /*   public int getRowCount(); */
    
    /**
     * Creates new form CadastroDeChamado
     */
    public ListarChamados() {
        initComponents();
        popularTabelaChamado();
        popularTipoBusca();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        tbChamados = new javax.swing.JTable();
        jToggleButton1 = new javax.swing.JToggleButton();
        comboSelect = new javax.swing.JComboBox<>();
        jToggleButton2 = new javax.swing.JToggleButton();
        jButton2 = new javax.swing.JButton();

        tbChamados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Titulo", "Status", "Categoria", "Data de abertura", "Requerente", "Técnico"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tbChamados);

        jToggleButton1.setText("Procurar");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        comboSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboSelectActionPerformed(evt);
            }
        });

        jToggleButton2.setText("Atribuir chamado");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setText("Fechar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(comboSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(jToggleButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jToggleButton2)
                .addGap(105, 105, 105))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 708, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton1)
                    .addComponent(jToggleButton2))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        setBounds(0, 0, 794, 555);
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
   int indiceLinha = tbChamados.getSelectedRow();
        int chamado_id = (int) this.tbChamados.getValueAt(indiceLinha, 0);
        String titulo = this.tbChamados.getValueAt(indiceLinha, 1).toString();
        String status = this.tbChamados.getValueAt(indiceLinha, 2).toString();
        String categoria  = this.tbChamados.getValueAt(indiceLinha, 3).toString();
//        String dataAb  = this.tbChamados.getValueAt(indiceLinha, 4).toString();
        String requerente = this.tbChamados.getValueAt(indiceLinha, 5).toString();
        
        
        System.out.println(titulo.toString());
        System.out.println(categoria.toString());
        int tec_id = 1;
        ChamadoController ch = new ChamadoController();
        ch.inserirTecnico(tec_id, chamado_id);
        JOptionPane.showMessageDialog(null, "Chamado atribuido!");
       
                
        
        
        
        
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void comboSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboSelectActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboSelectActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
          
          Situacao sit = (Situacao) comboSelect.getSelectedItem();
        int situacao = sit.getIdSituacao();
        
        ChamadoController ch = new ChamadoController();
        
         DefaultTableModel modelo = (DefaultTableModel) tbChamados.getModel();
         modelo.setNumRows(0);
       
       
         
        
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    public void popularTabelaChamado(){
           DefaultTableModel modelo = (DefaultTableModel) tbChamados.getModel();
           ChamadoController ch =  new ChamadoController();
             modelo.setNumRows(0);
           
             
             for(LinhasDaTBL dado : ch.listarChamados()){
                    modelo.addRow(new Object[]{
              dado.getChamadoID(),
              dado.getChamadoTitulo(),
              dado.getSituacaoChamado(),
              dado.getCategoriaChamado(),
              dado.getDataAbertura(),
              dado.getRequerente()
            });
                
             }
         
    }
       void popularTipoBusca(){
              try{
                  SituacaoController situacao = new SituacaoController();
                  List<Situacao> list = situacao.selecionarSituacao();
                  comboSelect.removeAllItems();
                  for(Situacao situ : list){
                      
                  comboSelect.addItem(situ);
              }
              }catch(Exception e){
                  
              }        
              
}
      
      public void buscarChamado(){
         
     }  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Object> comboSelect;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JTable tbChamados;
    // End of variables declaration//GEN-END:variables
}
