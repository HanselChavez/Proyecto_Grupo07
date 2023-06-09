/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfacesGraficas.Admin.Usuarios;

import InterfacesGraficas.Trabajador.Usuarios.*;
import Entidades.Usuario;
import Utilidades.ServiciosUsuario;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author chave
 */
public class pnlUsuarios extends javax.swing.JPanel {

    /**
     * Creates new form principal
     */
    private int cantidad;
    private final ServiciosUsuario servicio ;
    private String rol ;
    private List<Usuario> listaUsuario ;
    public pnlUsuarios() throws ClassNotFoundException, SQLException {
        initComponents();
        this.listaUsuario = new ArrayList<>();
        this.rol = "1";
        this.servicio =new ServiciosUsuario();        
        llenarTrabajadores();
    }

   
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelSlider = new newscomponents.RSPanelEffect();
        jPanel1 = new javax.swing.JPanel();
        txtBuscarusu = new RSMaterialComponent.RSTextFieldMaterialIcon();
        lblUsuarios = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaUsuarios = new RSMaterialComponent.RSTableMetroCustom();
        btnTrabajadores = new RSMaterialComponent.RSButtonMaterialIconOne();
        btnSolicitantes = new RSMaterialComponent.RSButtonMaterialIconOne();

        setBackground(new java.awt.Color(255, 255, 255));

        panelSlider.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        txtBuscarusu.setForeground(new java.awt.Color(0, 108, 255));
        txtBuscarusu.setColorIcon(new java.awt.Color(0, 108, 255));
        txtBuscarusu.setColorMaterial(new java.awt.Color(0, 108, 255));
        txtBuscarusu.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SEARCH);
        txtBuscarusu.setPhColor(new java.awt.Color(0, 69, 255));
        txtBuscarusu.setPlaceholder("Buscar");
        txtBuscarusu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarusuKeyReleased(evt);
            }
        });

        lblUsuarios.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        lblUsuarios.setText("Trabajadores");

        jScrollPane1.setBorder(null);

        tablaUsuarios.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tablaUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Dni", "Nombres", "Apellidos", "Telefono"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaUsuarios.setBackgoundHead(new java.awt.Color(0, 108, 255));
        tablaUsuarios.setBackgoundHover(new java.awt.Color(10, 94, 208));
        tablaUsuarios.setColorSecondary(new java.awt.Color(255, 255, 255));
        tablaUsuarios.setRowHeight(40);
        tablaUsuarios.setSelectionBackground(new java.awt.Color(78, 85, 230));
        tablaUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaUsuariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaUsuarios);
        if (tablaUsuarios.getColumnModel().getColumnCount() > 0) {
            tablaUsuarios.getColumnModel().getColumn(0).setPreferredWidth(50);
            tablaUsuarios.getColumnModel().getColumn(1).setPreferredWidth(100);
            tablaUsuarios.getColumnModel().getColumn(2).setPreferredWidth(100);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lblUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 220, Short.MAX_VALUE)
                        .addComponent(txtBuscarusu, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscarusu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        panelSlider.add(jPanel1, "card2");

        btnTrabajadores.setBackground(new java.awt.Color(204, 204, 204));
        btnTrabajadores.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnTrabajadores.setForeground(new java.awt.Color(0, 0, 0));
        btnTrabajadores.setText("Trabajadores");
        btnTrabajadores.setBackgroundHover(new java.awt.Color(0, 108, 255));
        btnTrabajadores.setFont(new java.awt.Font("Roboto Bold", 1, 16)); // NOI18N
        btnTrabajadores.setForegroundText(new java.awt.Color(51, 51, 51));
        btnTrabajadores.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnTrabajadores.setIconTextGap(29);
        btnTrabajadores.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.PERSON);
        btnTrabajadores.setPaddingLeft(10);
        btnTrabajadores.setSelected(true);
        btnTrabajadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrabajadoresActionPerformed(evt);
            }
        });

        btnSolicitantes.setBackground(new java.awt.Color(204, 204, 204));
        btnSolicitantes.setForeground(new java.awt.Color(0, 0, 0));
        btnSolicitantes.setText("Solicitantes");
        btnSolicitantes.setBackgroundHover(new java.awt.Color(0, 108, 255));
        btnSolicitantes.setFont(new java.awt.Font("Roboto Bold", 1, 16)); // NOI18N
        btnSolicitantes.setForegroundText(new java.awt.Color(0, 0, 0));
        btnSolicitantes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnSolicitantes.setIconTextGap(2);
        btnSolicitantes.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.PERSON_OUTLINE);
        btnSolicitantes.setPaddingLeft(14);
        btnSolicitantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSolicitantesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelSlider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(btnTrabajadores, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSolicitantes, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTrabajadores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSolicitantes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelSlider, javax.swing.GroupLayout.DEFAULT_SIZE, 491, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnTrabajadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrabajadoresActionPerformed
        btnSolicitantes.setSelected(false);
        btnTrabajadores.setSelected(true); 
        try {
            llenarTrabajadores();
        } catch (SQLException ex) {
            Logger.getLogger(pnlUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_btnTrabajadoresActionPerformed

    private void btnSolicitantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSolicitantesActionPerformed
        btnSolicitantes.setSelected(true);
        btnTrabajadores.setSelected(false);
         try {
            cantidad= this.servicio.listarUsuarios(tablaUsuarios,"2","",listaUsuario);
            lblUsuarios.setText("Solicitantes ("+cantidad+")");
            rol = "2";
        } catch (SQLException ex) {
            Logger.getLogger(pnlUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnSolicitantesActionPerformed

    private void txtBuscarusuKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarusuKeyReleased
        String buscar = txtBuscarusu.getText();        
        try {
            this.servicio.listarUsuarios(tablaUsuarios, rol, buscar,listaUsuario);
        } catch (SQLException ex) {
            Logger.getLogger(pnlUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txtBuscarusuKeyReleased

    private void tablaUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaUsuariosMouseClicked
       int i =tablaUsuarios.getSelectedRow();
       
       String valor = listaUsuario.get(i).getDni();
        JOptionPane.showMessageDialog(null,"Editar "+valor);
        
    }//GEN-LAST:event_tablaUsuariosMouseClicked
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private RSMaterialComponent.RSButtonMaterialIconOne btnSolicitantes;
    private RSMaterialComponent.RSButtonMaterialIconOne btnTrabajadores;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblUsuarios;
    private newscomponents.RSPanelEffect panelSlider;
    private RSMaterialComponent.RSTableMetroCustom tablaUsuarios;
    private RSMaterialComponent.RSTextFieldMaterialIcon txtBuscarusu;
    // End of variables declaration//GEN-END:variables
     public void llenarTrabajadores() throws SQLException {
        cantidad=this.servicio.listarUsuarios(tablaUsuarios,"1","",listaUsuario);
        lblUsuarios.setText("Trabajadores ("+cantidad+")");
        rol = "1";
    }


}