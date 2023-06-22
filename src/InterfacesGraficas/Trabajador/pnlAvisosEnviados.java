package InterfacesGraficas.Trabajador;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Entidades.*;
import static Main.ServicioDeAgua.mensaje;
import Utilidades.ServiciosUsuario;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import rojeru_san.efectos.ValoresEnum;

/**
 *
 * @author Hansel Chavez
 */
public class pnlAvisosEnviados extends javax.swing.JPanel {

    private List<Mensaje> listaAviso ;
    private ServiciosUsuario servicio;
    private Usuario user;
    public pnlAvisosEnviados() {
        initComponents();          
    }
    /**
     * Creates new form pnlAvisos
     */
        /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlSliderAviso = new rojerusan.RSPanelEffect();
        pnlListaAvisos = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaAvisos = new RSMaterialComponent.RSTableMetroCustom();
        btnVisualizar = new RSMaterialComponent.RSButtonMaterialIconOne();
        lblestado = new javax.swing.JLabel();
        txtBuscarAviso = new RSMaterialComponent.RSTextFieldMaterialIcon();
        btnNuevoAviso = new RSMaterialComponent.RSButtonMaterialIconOne();
        btnEditarAviso = new RSMaterialComponent.RSButtonMaterialIconOne();
        btnEliminarAviso = new RSMaterialComponent.RSButtonMaterialIconOne();
        pnlEditarVisualizarNuevo = new javax.swing.JPanel();
        txtnombreT = new necesario.TextField();
        txtfecha = new necesario.TextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbltitulocod = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        lblCodigo = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtcontenidoAviso = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        lblFecha = new rojeru_san.rsdate.RSLabelFecha();
        btnGuardar = new RSMaterialComponent.RSButtonMaterialIconOne();
        btnVolver = new RSMaterialComponent.RSButtonMaterialIconOne();

        setBackground(new java.awt.Color(255, 255, 255));

        pnlSliderAviso.setBackground(new java.awt.Color(255, 255, 255));

        pnlListaAvisos.setBackground(new java.awt.Color(255, 255, 255));
        pnlListaAvisos.setName("pnlListaAvisos"); // NOI18N

        jScrollPane1.setBorder(null);

        tablaAvisos.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tablaAvisos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, "", null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id Aviso", "Trabajador", "Contenido", "Fecha"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaAvisos.setBackgoundHead(new java.awt.Color(0, 108, 255));
        tablaAvisos.setBackgoundHover(new java.awt.Color(10, 94, 208));
        tablaAvisos.setColorPrimaryText(new java.awt.Color(0, 0, 0));
        tablaAvisos.setColorSecondary(new java.awt.Color(255, 255, 255));
        tablaAvisos.setColorSecundaryText(new java.awt.Color(0, 0, 0));
        tablaAvisos.setRowHeight(40);
        tablaAvisos.setSelectionBackground(new java.awt.Color(78, 85, 230));
        jScrollPane1.setViewportView(tablaAvisos);
        if (tablaAvisos.getColumnModel().getColumnCount() > 0) {
            tablaAvisos.getColumnModel().getColumn(0).setPreferredWidth(70);
            tablaAvisos.getColumnModel().getColumn(1).setPreferredWidth(200);
            tablaAvisos.getColumnModel().getColumn(2).setPreferredWidth(400);
            tablaAvisos.getColumnModel().getColumn(3).setMinWidth(100);
            tablaAvisos.getColumnModel().getColumn(3).setPreferredWidth(120);
        }

        btnVisualizar.setBackground(new java.awt.Color(204, 204, 204));
        btnVisualizar.setText("Visualizar Aviso");
        btnVisualizar.setBackgroundHover(new java.awt.Color(0, 108, 255));
        btnVisualizar.setForegroundIcon(new java.awt.Color(0, 0, 0));
        btnVisualizar.setForegroundText(new java.awt.Color(0, 0, 0));
        btnVisualizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnVisualizar.setIconTextGap(29);
        btnVisualizar.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.VISIBILITY);
        btnVisualizar.setPaddingLeft(15);
        btnVisualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisualizarActionPerformed(evt);
            }
        });

        lblestado.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        lblestado.setText("Avisos");

        txtBuscarAviso.setForeground(new java.awt.Color(0, 108, 255));
        txtBuscarAviso.setColorIcon(new java.awt.Color(0, 108, 255));
        txtBuscarAviso.setColorMaterial(new java.awt.Color(0, 108, 255));
        txtBuscarAviso.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SEARCH);
        txtBuscarAviso.setPhColor(new java.awt.Color(0, 69, 255));
        txtBuscarAviso.setPlaceholder("Buscar");
        txtBuscarAviso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarAvisoKeyReleased(evt);
            }
        });

        btnNuevoAviso.setBackground(new java.awt.Color(204, 204, 204));
        btnNuevoAviso.setText("Nuevo Aviso");
        btnNuevoAviso.setBackgroundHover(new java.awt.Color(0, 108, 255));
        btnNuevoAviso.setForegroundIcon(new java.awt.Color(0, 0, 0));
        btnNuevoAviso.setForegroundText(new java.awt.Color(0, 0, 0));
        btnNuevoAviso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnNuevoAviso.setIconTextGap(29);
        btnNuevoAviso.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.NEW_RELEASES);
        btnNuevoAviso.setPaddingLeft(15);
        btnNuevoAviso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoAvisoActionPerformed(evt);
            }
        });

        btnEditarAviso.setBackground(new java.awt.Color(204, 204, 204));
        btnEditarAviso.setText("Editar Aviso");
        btnEditarAviso.setBackgroundHover(new java.awt.Color(0, 108, 255));
        btnEditarAviso.setForegroundIcon(new java.awt.Color(0, 0, 0));
        btnEditarAviso.setForegroundText(new java.awt.Color(0, 0, 0));
        btnEditarAviso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnEditarAviso.setIconTextGap(29);
        btnEditarAviso.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.EDIT);
        btnEditarAviso.setPaddingLeft(15);
        btnEditarAviso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarAvisoActionPerformed(evt);
            }
        });

        btnEliminarAviso.setBackground(new java.awt.Color(204, 204, 204));
        btnEliminarAviso.setText("Eliminar Aviso");
        btnEliminarAviso.setBackgroundHover(new java.awt.Color(0, 108, 255));
        btnEliminarAviso.setForegroundIcon(new java.awt.Color(0, 0, 0));
        btnEliminarAviso.setForegroundText(new java.awt.Color(0, 0, 0));
        btnEliminarAviso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnEliminarAviso.setIconTextGap(29);
        btnEliminarAviso.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.DELETE);
        btnEliminarAviso.setPaddingLeft(15);
        btnEliminarAviso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarAvisoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlListaAvisosLayout = new javax.swing.GroupLayout(pnlListaAvisos);
        pnlListaAvisos.setLayout(pnlListaAvisosLayout);
        pnlListaAvisosLayout.setHorizontalGroup(
            pnlListaAvisosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlListaAvisosLayout.createSequentialGroup()
                .addGroup(pnlListaAvisosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlListaAvisosLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(pnlListaAvisosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlListaAvisosLayout.createSequentialGroup()
                                .addComponent(lblestado, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(pnlListaAvisosLayout.createSequentialGroup()
                                .addGroup(pnlListaAvisosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnNuevoAviso, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnEditarAviso, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(pnlListaAvisosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(pnlListaAvisosLayout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(btnEliminarAviso, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btnVisualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(pnlListaAvisosLayout.createSequentialGroup()
                        .addContainerGap(15, Short.MAX_VALUE)
                        .addGroup(pnlListaAvisosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 731, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBuscarAviso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        pnlListaAvisosLayout.setVerticalGroup(
            pnlListaAvisosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlListaAvisosLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(pnlListaAvisosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscarAviso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblestado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlListaAvisosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevoAviso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminarAviso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(pnlListaAvisosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditarAviso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVisualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pnlSliderAviso.add(pnlListaAvisos, "card2");

        pnlEditarVisualizarNuevo.setBackground(new java.awt.Color(255, 255, 255));
        pnlEditarVisualizarNuevo.setName("pnlEditarVisualizarNuevo"); // NOI18N
        pnlEditarVisualizarNuevo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtnombreT.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1)));
        txtnombreT.setForeground(new java.awt.Color(0, 0, 0));
        txtnombreT.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtnombreT.setEnabled(false);
        txtnombreT.setMargin(new java.awt.Insets(3, 10, 3, 6));
        txtnombreT.setName("txtidUsuario"); // NOI18N
        txtnombreT.setPlaceholder("");
        pnlEditarVisualizarNuevo.add(txtnombreT, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 332, -1));

        txtfecha.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1)));
        txtfecha.setForeground(new java.awt.Color(0, 0, 0));
        txtfecha.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtfecha.setEnabled(false);
        txtfecha.setMargin(new java.awt.Insets(3, 10, 3, 6));
        txtfecha.setName("txtfecha"); // NOI18N
        txtfecha.setPlaceholder("");
        pnlEditarVisualizarNuevo.add(txtfecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 150, 250, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(37, 45, 223));
        jLabel1.setText("Nombre Trabajador");
        pnlEditarVisualizarNuevo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 121, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(37, 45, 223));
        jLabel2.setText("Fecha");
        pnlEditarVisualizarNuevo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 121, -1, -1));

        lbltitulocod.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        lbltitulocod.setForeground(new java.awt.Color(37, 45, 223));
        lbltitulocod.setText("Codigo Aviso: ");
        pnlEditarVisualizarNuevo.add(lbltitulocod, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 83, -1, -1));

        lblTitulo.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        lblTitulo.setText("Visualizar Aviso");
        pnlEditarVisualizarNuevo.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 39, 231, -1));

        lblCodigo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCodigo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCodigo.setText("cod");
        pnlEditarVisualizarNuevo.add(lblCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(171, 81, 46, 22));

        txtcontenidoAviso.setColumns(20);
        txtcontenidoAviso.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtcontenidoAviso.setLineWrap(true);
        txtcontenidoAviso.setRows(5);
        txtcontenidoAviso.setWrapStyleWord(true);
        txtcontenidoAviso.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1)));
        txtcontenidoAviso.setCaretColor(new java.awt.Color(153, 153, 153));
        txtcontenidoAviso.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtcontenidoAviso.setEnabled(false);
        txtcontenidoAviso.setSelectionColor(new java.awt.Color(204, 204, 204));
        jScrollPane2.setViewportView(txtcontenidoAviso);

        pnlEditarVisualizarNuevo.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 233, 600, 114));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(37, 45, 223));
        jLabel4.setText("Contenido del Aviso");
        pnlEditarVisualizarNuevo.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 203, -1, -1));

        lblFecha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        lblFecha.setForeground(new java.awt.Color(0, 0, 0));
        pnlEditarVisualizarNuevo.add(lblFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 150, -1, 40));

        btnGuardar.setBackground(new java.awt.Color(204, 204, 204));
        btnGuardar.setText("Guardar");
        btnGuardar.setBackgroundHover(new java.awt.Color(0, 108, 255));
        btnGuardar.setForegroundIcon(new java.awt.Color(0, 0, 0));
        btnGuardar.setForegroundText(new java.awt.Color(0, 0, 0));
        btnGuardar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnGuardar.setIconTextGap(29);
        btnGuardar.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.CREATE);
        btnGuardar.setPaddingLeft(15);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        pnlEditarVisualizarNuevo.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 410, 180, -1));

        pnlSliderAviso.add(pnlEditarVisualizarNuevo, "card3");

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
            .addComponent(pnlSliderAviso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlSliderAviso, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVolver, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                .addGap(23, 23, 23))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        limpiarCampos();
        this.pnlSliderAviso.setPanelNormal(pnlListaAvisos);
        btnVolver.setVisible(false);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnVisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisualizarActionPerformed
        int indice = tablaAvisos.getSelectedRow();        
        if(indice!=-1){
            Mensaje aviso = listaAviso.get(indice);            
            modificarPantallaVisualizar(aviso);
            this.pnlSliderAviso.setPanelNormal(pnlEditarVisualizarNuevo); 
            btnVolver.setVisible(true);
        }
        else
        {
            mensaje.cargarDatos("Visualizar Aviso"
               ,"Seleccione un aviso de la lista", 1);
        }
    }//GEN-LAST:event_btnVisualizarActionPerformed

    private void txtBuscarAvisoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarAvisoKeyReleased
        String buscar = txtBuscarAviso.getText();            
        actualizarLista(buscar);      
    }//GEN-LAST:event_txtBuscarAvisoKeyReleased

    private void btnNuevoAvisoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoAvisoActionPerformed
        modificarPantallaNuevo();          
        this.pnlSliderAviso.setPanelNormal(this.pnlEditarVisualizarNuevo);
        btnVolver.setVisible(true);        
    }//GEN-LAST:event_btnNuevoAvisoActionPerformed

    private void btnEditarAvisoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarAvisoActionPerformed
        int indice  = tablaAvisos.getSelectedRow();
        if(indice!=-1){
            Mensaje aviso = listaAviso.get(indice);        
            modificarPantallaEditar(aviso);
            this.pnlSliderAviso.setPanelNormal(this.pnlEditarVisualizarNuevo);
        }else{
            mensaje.cargarDatos("Editar Aviso"
               ,"Seleccione un aviso de la lista", 1);
        }
    }//GEN-LAST:event_btnEditarAvisoActionPerformed

    private void btnEliminarAvisoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarAvisoActionPerformed
        Thread t1 = new Thread(()->{
            if(listaAviso.size()>0){ 
            int indice = tablaAvisos.getSelectedRow();
                if(indice!=-1){
                    Mensaje aviso = listaAviso.get(indice);
                    mensaje.cargarDatos("Eliminar Aviso"
                            ,"¿Estás seguro de continuar?",2);
                    boolean opcion = mensaje.getRespuesta();
                    if (opcion) {
                        try {
                            servicio.eliminarAviso(aviso.getCod());
                            actualizarLista("");
                        } catch (SQLException ex) {
                            mensaje.cargarDatos("Error al Eliminar Aviso"
                                    ,"No ha sido posible eliminar el aviso", 1); 
                        }
                    } 
                }
                else
                    mensaje.cargarDatos("Eliminar Aviso","Seleccione un registro"
                        + " de la lista.", 1);      
            }     
            else
                mensaje.cargarDatos("Eliminar Aviso","La lista se encuentra vacia."
                    , 1);        
        });
        t1.start();     
    }//GEN-LAST:event_btnEliminarAvisoActionPerformed
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        String boton = btnGuardar.getText();
        try {   
            if(!txtcontenidoAviso.getText().equals("")){
                if(boton.equals("Crear Aviso")){
                    servicio.insertarAviso(user.getDni()
                            , txtcontenidoAviso.getText());
                    mensaje.cargarDatos("Crear Aviso","Aviso creado correctamente"
                            , 1);
                }else if(boton.equals("Guardar cambios")){
                    servicio.actualizarAviso(lblCodigo.getText()
                            ,txtcontenidoAviso.getText());
                    mensaje.cargarDatos("Editar Aviso","Aviso editado correctamente."
                            , 1);                 
                }
                actualizarLista("");
                btnVolver.doClick();
            }else
                mensaje.cargarDatos("Crear Aviso","Completa el campo vacio.", 1);
        } catch (SQLException ex) {
                mensaje.cargarDatos("Error al crear Aviso"
                    ,"No es posible guardar el registro.", 1);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private RSMaterialComponent.RSButtonMaterialIconOne btnEditarAviso;
    private RSMaterialComponent.RSButtonMaterialIconOne btnEliminarAviso;
    private RSMaterialComponent.RSButtonMaterialIconOne btnGuardar;
    private RSMaterialComponent.RSButtonMaterialIconOne btnNuevoAviso;
    private RSMaterialComponent.RSButtonMaterialIconOne btnVisualizar;
    private RSMaterialComponent.RSButtonMaterialIconOne btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCodigo;
    private rojeru_san.rsdate.RSLabelFecha lblFecha;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblestado;
    private javax.swing.JLabel lbltitulocod;
    private javax.swing.JPanel pnlEditarVisualizarNuevo;
    private javax.swing.JPanel pnlListaAvisos;
    private rojerusan.RSPanelEffect pnlSliderAviso;
    private RSMaterialComponent.RSTableMetroCustom tablaAvisos;
    private RSMaterialComponent.RSTextFieldMaterialIcon txtBuscarAviso;
    private javax.swing.JTextArea txtcontenidoAviso;
    private necesario.TextField txtfecha;
    private necesario.TextField txtnombreT;
    // End of variables declaration//GEN-END:variables
    public void cargarUsuario(Usuario user, ServiciosUsuario servicio){
        this.user = user;
        this.servicio = servicio;
        actualizarLista("");
        this.pnlSliderAviso.setPanelNormal(pnlListaAvisos);
        btnVolver.setVisible(false);
    }
    private void modificarPantallaNuevo(){
        btnVolver.setVisible(true);
        lblCodigo.setVisible(false);
        lbltitulocod.setVisible(false);
        lblFecha.setVisible(true);
        txtfecha.setVisible(false);
        btnGuardar.setIcons(ValoresEnum.ICONS.CREATE);
        btnGuardar.setText("Crear Aviso");
        btnGuardar.setVisible(true);       
        lblTitulo.setText("Crear Nuevo Aviso");
        txtnombreT.setText(user.getNombres());       
        txtfecha.setVisible(false);
        txtcontenidoAviso.setText("");
        txtcontenidoAviso.setEnabled(true);       
               
    }
    private void modificarPantallaEditar(Mensaje aviso){
        btnVolver.setVisible(true);
        lblCodigo.setVisible(true);
        lbltitulocod.setVisible(true);
        lblFecha.setVisible(false);
        txtfecha.setVisible(true);        
        txtcontenidoAviso.setEnabled(true);
        btnGuardar.setIcons(ValoresEnum.ICONS.SAVE);
        btnGuardar.setVisible(true);
        lblTitulo.setText("Editar Aviso");     
        llenarCampos(aviso);
        btnGuardar.setText("Guardar cambios");  
    }
    private void modificarPantallaVisualizar(Mensaje aviso){
        btnVolver.setVisible(true);
        btnGuardar.setVisible(false);
        lblCodigo.setVisible(true);
        lbltitulocod.setVisible(true);
        lblFecha.setVisible(false);
        txtfecha.setVisible(true);        
        btnGuardar.setVisible(false);
        txtcontenidoAviso.setEnabled(false);   
        lblTitulo.setText("Visualizar Aviso");
        llenarCampos(aviso);
    }

    private void llenarCampos(Mensaje aviso) {
        lblCodigo.setText(aviso.getCod());
        txtfecha.setText(aviso.getFecha().toString());
        txtnombreT.setText(aviso.getNombreUsuario());
        txtcontenidoAviso.setText(aviso.getContenido());        
    }
    
    public void actualizarLista(String buscar){
        try {
            this.listaAviso = new ArrayList<>();
            servicio.listarAvisos(tablaAvisos,buscar,listaAviso);
        } catch (SQLException ex) {
            mensaje.cargarDatos("Error al Actualizar lista de Avisos"
               ,"No es posible cargar los registros.", 1);
        }
    }
    private void limpiarCampos(){
        txtcontenidoAviso.setText("");
        lblCodigo.setText("");
        txtnombreT.setText("");
        txtfecha.setText("");
    }
}
