/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfacesGraficas.Trabajador.Solicitudes;


import Utilidades.ServiciosUsuario;
import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author chave
 */
public class pnlSolicitudes extends javax.swing.JPanel {
    private final ServiciosUsuario servicio ;
    private int cantidad;
    private String estado ;
    private String negado;
    /**
     * Creates new form principal
     * @throws java.lang.ClassNotFoundException
     * @throws java.sql.SQLException
     */
    public pnlSolicitudes() throws ClassNotFoundException, SQLException {
        initComponents();
        estado = "1";
        negado="";
        servicio =new ServiciosUsuario();
     
        listarPendientes("");
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnEnProceso = new RSMaterialComponent.RSButtonMaterialIconOne();
        btnSoliRechazadas = new RSMaterialComponent.RSButtonMaterialIconOne();
        btnSoliTodas = new RSMaterialComponent.RSButtonMaterialIconOne();
        rSPanelEffect1 = new newscomponents.RSPanelEffect();
        jPanel1 = new javax.swing.JPanel();
        lblestado = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaSolicitudes = new RSMaterialComponent.RSTableMetroCustom();
        txtBuscarsolicitud = new RSMaterialComponent.RSTextFieldMaterialIcon();
        btnAprobadas = new RSMaterialComponent.RSButtonMaterialIconOne();
        btnPendiente = new RSMaterialComponent.RSButtonMaterialIconOne();

        setBackground(new java.awt.Color(255, 255, 255));

        btnEnProceso.setBackground(new java.awt.Color(204, 204, 204));
        btnEnProceso.setText("En Proceso");
        btnEnProceso.setBackgroundHover(new java.awt.Color(0, 108, 255));
        btnEnProceso.setForegroundIcon(new java.awt.Color(255, 102, 51));
        btnEnProceso.setForegroundIconHover(new java.awt.Color(255, 102, 51));
        btnEnProceso.setForegroundText(new java.awt.Color(255, 102, 51));
        btnEnProceso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnEnProceso.setIconTextGap(29);
        btnEnProceso.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.CHECK_BOX);
        btnEnProceso.setPaddingLeft(15);
        btnEnProceso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnProcesoActionPerformed(evt);
            }
        });

        btnSoliRechazadas.setBackground(new java.awt.Color(204, 204, 204));
        btnSoliRechazadas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnSoliRechazadas.setForeground(new java.awt.Color(0, 0, 0));
        btnSoliRechazadas.setText("Rechazadas");
        btnSoliRechazadas.setBackgroundHover(new java.awt.Color(0, 108, 255));
        btnSoliRechazadas.setForegroundText(new java.awt.Color(204, 0, 0));
        btnSoliRechazadas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnSoliRechazadas.setIconTextGap(29);
        btnSoliRechazadas.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.CANCEL);
        btnSoliRechazadas.setPaddingLeft(15);
        btnSoliRechazadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSoliRechazadasActionPerformed(evt);
            }
        });

        btnSoliTodas.setBackground(new java.awt.Color(204, 204, 204));
        btnSoliTodas.setText("Todas");
        btnSoliTodas.setBackgroundHover(new java.awt.Color(0, 108, 255));
        btnSoliTodas.setForegroundText(new java.awt.Color(0, 102, 255));
        btnSoliTodas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnSoliTodas.setIconTextGap(2);
        btnSoliTodas.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.ASSIGNMENT);
        btnSoliTodas.setPaddingLeft(25);
        btnSoliTodas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSoliTodasActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lblestado.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        lblestado.setText("Pendiente");

        jScrollPane1.setBorder(null);

        tablaSolicitudes.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tablaSolicitudes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, "", null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id Solicitud", "Id Usuario", "Descripcion", "Fecha", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaSolicitudes.setBackgoundHead(new java.awt.Color(0, 108, 255));
        tablaSolicitudes.setBackgoundHover(new java.awt.Color(10, 94, 208));
        tablaSolicitudes.setColorSecondary(new java.awt.Color(255, 255, 255));
        tablaSolicitudes.setRowHeight(40);
        tablaSolicitudes.setSelectionBackground(new java.awt.Color(78, 85, 230));
        jScrollPane1.setViewportView(tablaSolicitudes);
        if (tablaSolicitudes.getColumnModel().getColumnCount() > 0) {
            tablaSolicitudes.getColumnModel().getColumn(0).setPreferredWidth(30);
            tablaSolicitudes.getColumnModel().getColumn(2).setPreferredWidth(250);
            tablaSolicitudes.getColumnModel().getColumn(3).setPreferredWidth(50);
            tablaSolicitudes.getColumnModel().getColumn(4).setPreferredWidth(60);
        }

        txtBuscarsolicitud.setForeground(new java.awt.Color(0, 108, 255));
        txtBuscarsolicitud.setColorIcon(new java.awt.Color(0, 108, 255));
        txtBuscarsolicitud.setColorMaterial(new java.awt.Color(0, 108, 255));
        txtBuscarsolicitud.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SEARCH);
        txtBuscarsolicitud.setPhColor(new java.awt.Color(0, 69, 255));
        txtBuscarsolicitud.setPlaceholder("Buscar");
        txtBuscarsolicitud.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarsolicitudKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblestado, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(570, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addComponent(txtBuscarsolicitud, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblestado, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(443, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(txtBuscarsolicitud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        rSPanelEffect1.add(jPanel1, "card2");

        btnAprobadas.setBackground(new java.awt.Color(204, 204, 204));
        btnAprobadas.setText("Aprobadas");
        btnAprobadas.setBackgroundHover(new java.awt.Color(0, 108, 255));
        btnAprobadas.setForegroundText(new java.awt.Color(0, 153, 0));
        btnAprobadas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAprobadas.setIconTextGap(2);
        btnAprobadas.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.CHECK_BOX);
        btnAprobadas.setName(""); // NOI18N
        btnAprobadas.setPaddingLeft(15);
        btnAprobadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAprobadasActionPerformed(evt);
            }
        });

        btnPendiente.setBackground(new java.awt.Color(204, 204, 204));
        btnPendiente.setText("Pendiente");
        btnPendiente.setBackgroundHover(new java.awt.Color(0, 108, 255));
        btnPendiente.setForegroundIcon(new java.awt.Color(0, 0, 0));
        btnPendiente.setForegroundIconHover(new java.awt.Color(0, 0, 0));
        btnPendiente.setForegroundText(new java.awt.Color(0, 0, 0));
        btnPendiente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnPendiente.setIconTextGap(29);
        btnPendiente.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.CHECK_BOX);
        btnPendiente.setPaddingLeft(15);
        btnPendiente.setSelected(true);
        btnPendiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPendienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rSPanelEffect1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnPendiente, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEnProceso, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAprobadas, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSoliRechazadas, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSoliTodas, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSoliTodas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAprobadas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSoliRechazadas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEnProceso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPendiente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rSPanelEffect1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnEnProcesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnProcesoActionPerformed
        try {
            cantidad = this.servicio.listarSolicitudes(tablaSolicitudes,"2", "","");
            estado = "2";
            labelColorTexto("En Proceso ("+cantidad+")",Color.ORANGE);
        } catch (SQLException ex) {
            Logger.getLogger(pnlSolicitudes.class.getName()).log(Level.SEVERE, null, ex);
        }
        todosSelectFalse();
        btnEnProceso.setSelected(true);
    }//GEN-LAST:event_btnEnProcesoActionPerformed

    private void btnSoliRechazadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSoliRechazadasActionPerformed
        try {
            cantidad = this.servicio.listarSolicitudes(tablaSolicitudes,"5", "","");
            labelColorTexto("Canceladas ("+cantidad+")",Color.red);
            estado ="5";
        } catch (SQLException ex) {
            Logger.getLogger(pnlSolicitudes.class.getName()).log(Level.SEVERE, null, ex);
        }
        todosSelectFalse();
        btnSoliRechazadas.setSelected(true);
    }//GEN-LAST:event_btnSoliRechazadasActionPerformed

    private void btnSoliTodasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSoliTodasActionPerformed
        try {
            cantidad =  this.servicio.listarSolicitudes(tablaSolicitudes,"0","!","");
            estado ="0";
            negado="!";
         labelColorTexto("Todas ("+cantidad+")",Color.blue);
        } catch (SQLException ex) {
            Logger.getLogger(pnlSolicitudes.class.getName()).log(Level.SEVERE, null, ex);
        }
        todosSelectFalse();
        btnSoliTodas.setSelected(true);
    }//GEN-LAST:event_btnSoliTodasActionPerformed

    private void btnAprobadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAprobadasActionPerformed
      
        try {
            cantidad =  this.servicio.listarSolicitudes(tablaSolicitudes,"3","","");
            labelColorTexto("Aprobadas ("+cantidad+")",Color.green);
            estado ="3";
        } catch (SQLException ex) {
            Logger.getLogger(pnlSolicitudes.class.getName()).log(Level.SEVERE, null, ex);
        }
        todosSelectFalse();
        btnAprobadas.setSelected(true);
    }//GEN-LAST:event_btnAprobadasActionPerformed

    private void btnPendienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPendienteActionPerformed
        
        try {
            listarPendientes("");
        } catch (SQLException ex) {
            Logger.getLogger(pnlSolicitudes.class.getName()).log(Level.SEVERE, null, ex);
        }
        todosSelectFalse();
        btnPendiente.setSelected(true);
    }//GEN-LAST:event_btnPendienteActionPerformed

    private void txtBuscarsolicitudKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarsolicitudKeyReleased
        String buscar = txtBuscarsolicitud.getText();
        try {
            this.servicio.listarSolicitudes(tablaSolicitudes, estado, negado, buscar);
        } catch (SQLException ex) {
            Logger.getLogger(pnlSolicitudes.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_txtBuscarsolicitudKeyReleased
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private RSMaterialComponent.RSButtonMaterialIconOne btnAprobadas;
    private RSMaterialComponent.RSButtonMaterialIconOne btnEnProceso;
    private RSMaterialComponent.RSButtonMaterialIconOne btnPendiente;
    private RSMaterialComponent.RSButtonMaterialIconOne btnSoliRechazadas;
    private RSMaterialComponent.RSButtonMaterialIconOne btnSoliTodas;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblestado;
    private newscomponents.RSPanelEffect rSPanelEffect1;
    private RSMaterialComponent.RSTableMetroCustom tablaSolicitudes;
    private RSMaterialComponent.RSTextFieldMaterialIcon txtBuscarsolicitud;
    // End of variables declaration//GEN-END:variables
  
  
    public void todosSelectFalse(){
        btnEnProceso.setSelected(false);
        btnPendiente.setSelected(false);
        btnSoliRechazadas.setSelected(false);
        btnAprobadas.setSelected(false);
        btnSoliTodas.setSelected(false);   
    }
    public void labelColorTexto(String texto,Color color){
        lblestado.setText(texto);
        lblestado.setForeground(color);
    }
    
    public void listarPendientes(String buscar) throws SQLException {
        cantidad = this.servicio.listarSolicitudes(tablaSolicitudes,"1","",buscar);
        labelColorTexto("Pendientes ("+cantidad+")",Color.black);
    }

}
