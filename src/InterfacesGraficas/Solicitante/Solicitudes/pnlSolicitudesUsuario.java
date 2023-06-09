/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfacesGraficas.Solicitante.Solicitudes;

import Entidades.HistorialSolicitudes;
import Entidades.Solicitud;
import Entidades.Usuario;
import Utilidades.ServiciosUsuario;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author chave
 */
public class pnlSolicitudesUsuario extends javax.swing.JPanel {

    /**
     * Creates new form pnlSolicitudesUsuario
     */
    private final ServiciosUsuario servicio ;    
    private String estado ;
    private String negado;
    private Usuario user;
    private HistorialSolicitudes hSolicitudes;
    public pnlSolicitudesUsuario() throws ClassNotFoundException, SQLException {
        initComponents();
        estado = "";
        negado="";
        servicio =new ServiciosUsuario();
        ocultarLabels();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlSlider = new rojerusan.RSPanelEffect();
        pnlHSolicitud = new javax.swing.JPanel();
        lblestado = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaSolicitudes = new RSMaterialComponent.RSTableMetroCustom();
        txtBuscarsolicitud = new RSMaterialComponent.RSTextFieldMaterialIcon();
        btnEliminarHistorial = new RSMaterialComponent.RSButtonMaterialIconOne();
        btnNuevaSolicitud = new RSMaterialComponent.RSButtonMaterialIconOne();
        btnCancelarSol = new RSMaterialComponent.RSButtonMaterialIconOne();
        btnEditarSolicitud = new RSMaterialComponent.RSButtonMaterialIconOne();
        pnlNuevaSolicitud = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtMotivo = new javax.swing.JTextArea();
        btnAceptarEditar = new RSMaterialComponent.RSButtonMaterialIconOne();
        lblmotivo = new javax.swing.JLabel();
        lblfecha = new rojeru_san.rsdate.RSLabelFecha();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        lblcod = new javax.swing.JLabel();
        lblcodigo = new javax.swing.JLabel();
        btnVolver = new RSMaterialComponent.RSButtonMaterialIconOne();

        setBackground(new java.awt.Color(255, 255, 255));

        pnlSlider.setBackground(new java.awt.Color(255, 255, 255));

        pnlHSolicitud.setBackground(new java.awt.Color(255, 255, 255));

        lblestado.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        lblestado.setText("Historial de Solicitudes");

        jScrollPane1.setBorder(null);

        tablaSolicitudes.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tablaSolicitudes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, "", null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id Solicitud", "Motivo", "Fecha", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
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

        btnEliminarHistorial.setBackground(new java.awt.Color(204, 204, 204));
        btnEliminarHistorial.setText("Eliminar Historial");
        btnEliminarHistorial.setBackgroundHover(new java.awt.Color(225, 25, 25));
        btnEliminarHistorial.setForegroundIcon(new java.awt.Color(0, 0, 0));
        btnEliminarHistorial.setForegroundText(new java.awt.Color(0, 0, 0));
        btnEliminarHistorial.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnEliminarHistorial.setIconTextGap(29);
        btnEliminarHistorial.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.DELETE);
        btnEliminarHistorial.setPaddingLeft(15);
        btnEliminarHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarHistorialActionPerformed(evt);
            }
        });

        btnNuevaSolicitud.setBackground(new java.awt.Color(204, 204, 204));
        btnNuevaSolicitud.setText("Nueva Solicitud");
        btnNuevaSolicitud.setBackgroundHover(new java.awt.Color(0, 108, 255));
        btnNuevaSolicitud.setForegroundIcon(new java.awt.Color(0, 0, 0));
        btnNuevaSolicitud.setForegroundText(new java.awt.Color(0, 0, 0));
        btnNuevaSolicitud.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnNuevaSolicitud.setIconTextGap(29);
        btnNuevaSolicitud.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.CREATE_NEW_FOLDER);
        btnNuevaSolicitud.setPaddingLeft(15);
        btnNuevaSolicitud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaSolicitudActionPerformed(evt);
            }
        });

        btnCancelarSol.setBackground(new java.awt.Color(204, 204, 204));
        btnCancelarSol.setText("Cancelar Solicitud");
        btnCancelarSol.setBackgroundHover(new java.awt.Color(225, 25, 25));
        btnCancelarSol.setForegroundIcon(new java.awt.Color(0, 0, 0));
        btnCancelarSol.setForegroundText(new java.awt.Color(0, 0, 0));
        btnCancelarSol.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnCancelarSol.setIconTextGap(1);
        btnCancelarSol.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.CANCEL);
        btnCancelarSol.setPaddingLeft(15);
        btnCancelarSol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarSolActionPerformed(evt);
            }
        });

        btnEditarSolicitud.setBackground(new java.awt.Color(204, 204, 204));
        btnEditarSolicitud.setText("Editar Solicitud");
        btnEditarSolicitud.setBackgroundHover(new java.awt.Color(0, 108, 255));
        btnEditarSolicitud.setForegroundIcon(new java.awt.Color(0, 0, 0));
        btnEditarSolicitud.setForegroundText(new java.awt.Color(0, 0, 0));
        btnEditarSolicitud.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnEditarSolicitud.setIconTextGap(29);
        btnEditarSolicitud.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.EDIT);
        btnEditarSolicitud.setPaddingLeft(15);
        btnEditarSolicitud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarSolicitudActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlHSolicitudLayout = new javax.swing.GroupLayout(pnlHSolicitud);
        pnlHSolicitud.setLayout(pnlHSolicitudLayout);
        pnlHSolicitudLayout.setHorizontalGroup(
            pnlHSolicitudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHSolicitudLayout.createSequentialGroup()
                .addGroup(pnlHSolicitudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(pnlHSolicitudLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(pnlHSolicitudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlHSolicitudLayout.createSequentialGroup()
                                .addComponent(lblestado, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(209, 209, 209)
                                .addComponent(txtBuscarsolicitud, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlHSolicitudLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(pnlHSolicitudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEditarSolicitud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNuevaSolicitud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnlHSolicitudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEliminarHistorial, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCancelarSol, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        pnlHSolicitudLayout.setVerticalGroup(
            pnlHSolicitudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHSolicitudLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlHSolicitudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblestado, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBuscarsolicitud, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlHSolicitudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlHSolicitudLayout.createSequentialGroup()
                        .addComponent(btnNuevaSolicitud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEditarSolicitud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlHSolicitudLayout.createSequentialGroup()
                        .addComponent(btnEliminarHistorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCancelarSol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pnlSlider.add(pnlHSolicitud, "card2");

        pnlNuevaSolicitud.setBackground(new java.awt.Color(255, 255, 255));

        lblTitulo.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        lblTitulo.setText("Nueva Solicitud");

        txtMotivo.setColumns(20);
        txtMotivo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtMotivo.setLineWrap(true);
        txtMotivo.setRows(5);
        txtMotivo.setWrapStyleWord(true);
        txtMotivo.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1)));
        txtMotivo.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtMotivo.setSelectionColor(new java.awt.Color(0, 0, 0));
        jScrollPane2.setViewportView(txtMotivo);

        btnAceptarEditar.setBackground(new java.awt.Color(204, 204, 204));
        btnAceptarEditar.setText("Aceptar");
        btnAceptarEditar.setBackgroundHover(new java.awt.Color(0, 108, 255));
        btnAceptarEditar.setForegroundIcon(new java.awt.Color(0, 0, 0));
        btnAceptarEditar.setForegroundText(new java.awt.Color(0, 0, 0));
        btnAceptarEditar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAceptarEditar.setIconTextGap(29);
        btnAceptarEditar.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.CHECK_BOX);
        btnAceptarEditar.setPaddingLeft(15);
        btnAceptarEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarEditarActionPerformed(evt);
            }
        });

        lblmotivo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblmotivo.setForeground(new java.awt.Color(0, 108, 255));
        lblmotivo.setText("Ingrese el motivo de la Solicitud");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 108, 255));
        jLabel2.setText("Ubicación");

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1)));
        jTextField1.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextField1.setEnabled(false);

        lblcod.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblcod.setForeground(new java.awt.Color(0, 108, 255));
        lblcod.setText("Codigo de Solicitud :");

        lblcodigo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblcodigo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblcodigo.setText("cod");

        javax.swing.GroupLayout pnlNuevaSolicitudLayout = new javax.swing.GroupLayout(pnlNuevaSolicitud);
        pnlNuevaSolicitud.setLayout(pnlNuevaSolicitudLayout);
        pnlNuevaSolicitudLayout.setHorizontalGroup(
            pnlNuevaSolicitudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlNuevaSolicitudLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnAceptarEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
            .addGroup(pnlNuevaSolicitudLayout.createSequentialGroup()
                .addGroup(pnlNuevaSolicitudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlNuevaSolicitudLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlNuevaSolicitudLayout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addGroup(pnlNuevaSolicitudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblfecha, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1)
                            .addComponent(jScrollPane2)
                            .addComponent(lblmotivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlNuevaSolicitudLayout.createSequentialGroup()
                                .addComponent(lblcod, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(lblcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(306, 306, 306)))))
                .addContainerGap(113, Short.MAX_VALUE))
        );
        pnlNuevaSolicitudLayout.setVerticalGroup(
            pnlNuevaSolicitudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNuevaSolicitudLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(pnlNuevaSolicitudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblcod)
                    .addComponent(lblcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblmotivo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblfecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAceptarEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pnlSlider.add(pnlNuevaSolicitud, "card3");

        btnVolver.setBackground(new java.awt.Color(204, 204, 204));
        btnVolver.setText("Volver");
        btnVolver.setBackgroundHover(new java.awt.Color(0, 108, 255));
        btnVolver.setForegroundIcon(new java.awt.Color(0, 0, 0));
        btnVolver.setForegroundText(new java.awt.Color(0, 0, 0));
        btnVolver.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnVolver.setIconTextGap(29);
        btnVolver.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.KEYBOARD_ARROW_LEFT);
        btnVolver.setPaddingLeft(15);
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlSlider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 14, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscarsolicitudKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarsolicitudKeyReleased
        String buscar = txtBuscarsolicitud.getText();
        try {
            this.servicio.listarSolicitudes(tablaSolicitudes, estado, negado
                    , buscar,user.getDni(),hSolicitudes);
        } catch (SQLException ex) {
            Logger.getLogger(pnlSolicitudesUsuario.class.getName())
                    .log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_txtBuscarsolicitudKeyReleased

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        this.pnlSlider.setPanelNormal(pnlHSolicitud);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnNuevaSolicitudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaSolicitudActionPerformed
        lblTitulo.setText("Nueva Solicitud");
        lblmotivo.setText("Ingrese movito de Solicitud.");
        btnAceptarEditar.setText("Aceptar");
        this.pnlSlider.setPanelNormal(pnlNuevaSolicitud);
        
    }//GEN-LAST:event_btnNuevaSolicitudActionPerformed

    private void btnEditarSolicitudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarSolicitudActionPerformed
        lblTitulo.setText("Editar Solicitud");
        btnAceptarEditar.setText("Editar");
        lblmotivo.setText("Ingrese el nuevo motivo de Solicitud.");        
        int indice = tablaSolicitudes.getSelectedRow();
        Solicitud solicitud;
        if(indice!= -1){
            solicitud = hSolicitudes.getListaDeSolicitudes().get(indice);
           
            if(!"Pendiente".equals(solicitud.getEstado().getNombre()))
            {
                llenarDatos(solicitud);               
                this.pnlSlider.setPanelNormal(pnlNuevaSolicitud);
            }
            else{
                 JOptionPane.showMessageDialog(null,"La solicitud ya ha sido "
                         + "procesada, no es posible modificarla");
            }
        }
        this.pnlSlider.setPanelNormal(pnlNuevaSolicitud);        
    }//GEN-LAST:event_btnEditarSolicitudActionPerformed

    private void btnEliminarHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarHistorialActionPerformed
        int opcion = JOptionPane.showConfirmDialog(null, "¿Estás seguro de continuar?"
                , "Confirmación", JOptionPane.YES_NO_OPTION);
        if (opcion == JOptionPane.YES_OPTION) {
        
        }        
    }//GEN-LAST:event_btnEliminarHistorialActionPerformed

    private void btnCancelarSolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarSolActionPerformed
        int indice = tablaSolicitudes.getSelectedRow();
        Solicitud solicitud;
        
        if(indice!= -1){
            solicitud = hSolicitudes.getListaDeSolicitudes().get(indice);
            if(!"Pendiente".equals(solicitud.getEstado().getNombre()))
            {
                try {
                    servicio.cancelarSolicitud(solicitud.getCodigo());
                    JOptionPane.showMessageDialog(null
                            ,"La solicitud a sido cancelada.");
                } catch (SQLException ex) {
                    Logger.getLogger(pnlSolicitudesUsuario.class.getName())
                            .log(Level.SEVERE, null, ex);
                }                
            }
            else{
                 JOptionPane.showMessageDialog(null,"La solicitud ya ha sido "
                         + "procesada, no es posible cancelarla");
            }
        }
        else{
            JOptionPane.showMessageDialog(null,"Debe seleccionar una solicitud");            
        }
    }//GEN-LAST:event_btnCancelarSolActionPerformed

    private void btnAceptarEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarEditarActionPerformed
        try {
            if(btnAceptarEditar.getText().equals("Aceptar")){           
                if(validarCampo()){
                    servicio.insertarSolicitud(txtMotivo.getText(),user.getDni());
                    JOptionPane.showMessageDialog(null, "La solcitud ha sido enviada"
                        + " correctamente");    
                }
                else
                    JOptionPane.showMessageDialog(null, "Completa el todos los campos");
            }
            else if(btnAceptarEditar.getText().equals("Editar")){
                if(validarCampo()){
                    servicio.editarSolicitud(lblcodigo.getText(),
                            txtMotivo.getText());
                     JOptionPane.showMessageDialog(null, "La solcitud ha sido "
                             + "editada correctamente");    
                    this.pnlSlider.setPanelNormal(pnlHSolicitud);
                    ocultarLabels();
                }else
                    JOptionPane.showMessageDialog(null, "Completa todos los campos");
            }
        } catch (SQLException ex) {
                Logger.getLogger(pnlSolicitudesUsuario.class.getName())
                .log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAceptarEditarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private RSMaterialComponent.RSButtonMaterialIconOne btnAceptarEditar;
    private RSMaterialComponent.RSButtonMaterialIconOne btnCancelarSol;
    private RSMaterialComponent.RSButtonMaterialIconOne btnEditarSolicitud;
    private RSMaterialComponent.RSButtonMaterialIconOne btnEliminarHistorial;
    private RSMaterialComponent.RSButtonMaterialIconOne btnNuevaSolicitud;
    private RSMaterialComponent.RSButtonMaterialIconOne btnVolver;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblcod;
    private javax.swing.JLabel lblcodigo;
    private javax.swing.JLabel lblestado;
    private rojeru_san.rsdate.RSLabelFecha lblfecha;
    private javax.swing.JLabel lblmotivo;
    private javax.swing.JPanel pnlHSolicitud;
    private javax.swing.JPanel pnlNuevaSolicitud;
    private rojerusan.RSPanelEffect pnlSlider;
    private RSMaterialComponent.RSTableMetroCustom tablaSolicitudes;
    private RSMaterialComponent.RSTextFieldMaterialIcon txtBuscarsolicitud;
    private javax.swing.JTextArea txtMotivo;
    // End of variables declaration//GEN-END:variables
    public void cargarUsuario(Usuario user){
        this.user = user;  
        hSolicitudes.setUser(user);
    } 
    public void ocultarLabels(){
        lblcod.setVisible(false);
        lblcodigo.setVisible(false);
    }
    public void mostrarLabels(){
        lblcod.setVisible(true);
        lblcodigo.setVisible(true);
    }
    public void llenarDatos(Solicitud solicitud){
        mostrarLabels();
        lblcodigo.setText(solicitud.getCodigo());
        lblmotivo.setText(solicitud.getDescripcion());        
    }
    public boolean validarCampo(){
        return !"".equals(txtMotivo.getText());
    }
}
