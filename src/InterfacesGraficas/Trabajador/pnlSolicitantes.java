/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfacesGraficas.Trabajador;

import Entidades.Usuario;
import static Main.ServicioDeAgua.mensaje;
import Utilidades.Foto;
import Utilidades.ServiciosUsuario;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Hansel Chavez
 */
public class pnlSolicitantes extends javax.swing.JPanel {

    /**
     * Creates new form principal
     */
    private ServiciosUsuario servicio ;
    private List<Usuario> listaSolicitantes ;
    public pnlSolicitantes(){
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

        pnlSlider = new newscomponents.RSPanelEffect();
        pnlTablaUsuarios = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaUSolicitantes = new RSMaterialComponent.RSTableMetroCustom();
        btnVerInfo = new RSMaterialComponent.RSButtonMaterialIconOne();
        txtBuscarDni = new RSMaterialComponent.RSTextFieldMaterialIcon();
        Solcitantes = new javax.swing.JLabel();
        pnlInfoUsuario = new javax.swing.JPanel();
        txtFechaNac = new necesario.TextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDireccion = new javax.swing.JTextArea();
        txtIdUsuario = new necesario.TextField();
        txtNombres = new necesario.TextField();
        lblFotoS = new javax.swing.JLabel();
        txtCorreo = new necesario.TextField();
        txtTelefono = new necesario.TextField();
        txtApellidos = new necesario.TextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnVolver = new RSMaterialComponent.RSButtonMaterialIconOne();

        setBackground(new java.awt.Color(255, 255, 255));

        pnlSlider.setBackground(new java.awt.Color(255, 255, 255));

        pnlTablaUsuarios.setBackground(new java.awt.Color(255, 255, 255));
        pnlTablaUsuarios.setName("pnlTablaUsuarios"); // NOI18N

        jScrollPane1.setBorder(null);

        tablaUSolicitantes.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tablaUSolicitantes.setModel(new javax.swing.table.DefaultTableModel(
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
        tablaUSolicitantes.setBackgoundHead(new java.awt.Color(0, 108, 255));
        tablaUSolicitantes.setBackgoundHover(new java.awt.Color(10, 94, 208));
        tablaUSolicitantes.setColorSecondary(new java.awt.Color(255, 255, 255));
        tablaUSolicitantes.setRowHeight(40);
        tablaUSolicitantes.setSelectionBackground(new java.awt.Color(78, 85, 230));
        jScrollPane1.setViewportView(tablaUSolicitantes);
        if (tablaUSolicitantes.getColumnModel().getColumnCount() > 0) {
            tablaUSolicitantes.getColumnModel().getColumn(0).setPreferredWidth(50);
            tablaUSolicitantes.getColumnModel().getColumn(1).setPreferredWidth(150);
            tablaUSolicitantes.getColumnModel().getColumn(2).setPreferredWidth(150);
        }

        btnVerInfo.setBackground(new java.awt.Color(204, 204, 204));
        btnVerInfo.setText("Ver Información");
        btnVerInfo.setBackgroundHover(new java.awt.Color(0, 153, 0));
        btnVerInfo.setFont(new java.awt.Font("Roboto Bold", 1, 16)); // NOI18N
        btnVerInfo.setForegroundIcon(new java.awt.Color(0, 0, 0));
        btnVerInfo.setForegroundText(new java.awt.Color(0, 0, 0));
        btnVerInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnVerInfo.setIconTextGap(2);
        btnVerInfo.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.PERM_IDENTITY);
        btnVerInfo.setPaddingLeft(14);
        btnVerInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerInfoActionPerformed(evt);
            }
        });

        txtBuscarDni.setForeground(new java.awt.Color(0, 108, 255));
        txtBuscarDni.setColorIcon(new java.awt.Color(0, 108, 255));
        txtBuscarDni.setColorMaterial(new java.awt.Color(0, 108, 255));
        txtBuscarDni.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SEARCH);
        txtBuscarDni.setPhColor(new java.awt.Color(0, 69, 255));
        txtBuscarDni.setPlaceholder("Buscar por Nombre");
        txtBuscarDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarDniKeyReleased(evt);
            }
        });

        Solcitantes.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        Solcitantes.setText("Solicitantes");

        javax.swing.GroupLayout pnlTablaUsuariosLayout = new javax.swing.GroupLayout(pnlTablaUsuarios);
        pnlTablaUsuarios.setLayout(pnlTablaUsuariosLayout);
        pnlTablaUsuariosLayout.setHorizontalGroup(
            pnlTablaUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTablaUsuariosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTablaUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 729, Short.MAX_VALUE)
                    .addGroup(pnlTablaUsuariosLayout.createSequentialGroup()
                        .addGroup(pnlTablaUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlTablaUsuariosLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(Solcitantes, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnVerInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTablaUsuariosLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txtBuscarDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pnlTablaUsuariosLayout.setVerticalGroup(
            pnlTablaUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTablaUsuariosLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(pnlTablaUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtBuscarDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Solcitantes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(btnVerInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnlSlider.add(pnlTablaUsuarios, "card2");

        pnlInfoUsuario.setBackground(new java.awt.Color(255, 255, 255));
        pnlInfoUsuario.setName("pnlInfoUsuario"); // NOI18N

        txtFechaNac.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1)));
        txtFechaNac.setForeground(new java.awt.Color(0, 0, 0));
        txtFechaNac.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtFechaNac.setEnabled(false);
        txtFechaNac.setMargin(new java.awt.Insets(3, 10, 3, 6));
        txtFechaNac.setName("txtFechaNac"); // NOI18N
        txtFechaNac.setPlaceholder("Fecha de Nacimiento");
        txtFechaNac.setSelectionStart(10);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(37, 45, 223));
        jLabel2.setText("Apellidos");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(37, 45, 223));
        jLabel9.setText("Fecha de Nacimiento");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(37, 45, 223));
        jLabel3.setText("Nombres");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(37, 45, 223));
        jLabel4.setText("Correo");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(37, 45, 223));
        jLabel5.setText("Direccion");

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 108, 255));
        jLabel6.setText("Datos del Solicitante");

        txtDireccion.setColumns(20);
        txtDireccion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtDireccion.setLineWrap(true);
        txtDireccion.setRows(5);
        txtDireccion.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1)));
        txtDireccion.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtDireccion.setEnabled(false);
        txtDireccion.setSelectionColor(new java.awt.Color(0, 0, 0));
        jScrollPane2.setViewportView(txtDireccion);

        txtIdUsuario.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1)));
        txtIdUsuario.setForeground(new java.awt.Color(0, 0, 0));
        txtIdUsuario.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtIdUsuario.setEnabled(false);
        txtIdUsuario.setMargin(new java.awt.Insets(3, 10, 3, 6));
        txtIdUsuario.setName("txtidUsuario"); // NOI18N
        txtIdUsuario.setPlaceholder("IdUsuario");

        txtNombres.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1)));
        txtNombres.setForeground(new java.awt.Color(0, 0, 0));
        txtNombres.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtNombres.setEnabled(false);
        txtNombres.setMargin(new java.awt.Insets(3, 10, 3, 6));
        txtNombres.setName("txtNombres"); // NOI18N
        txtNombres.setPlaceholder("Nombres");

        lblFotoS.setBackground(new java.awt.Color(255, 255, 255));
        lblFotoS.setForeground(new java.awt.Color(255, 255, 255));
        lblFotoS.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        lblFotoS.setName("lblfoto"); // NOI18N
        lblFotoS.setOpaque(true);

        txtCorreo.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1)));
        txtCorreo.setForeground(new java.awt.Color(0, 0, 0));
        txtCorreo.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtCorreo.setEnabled(false);
        txtCorreo.setMargin(new java.awt.Insets(3, 10, 3, 6));
        txtCorreo.setName("txtCorreo"); // NOI18N
        txtCorreo.setPlaceholder("Correo");

        txtTelefono.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1)));
        txtTelefono.setForeground(new java.awt.Color(0, 0, 0));
        txtTelefono.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtTelefono.setEnabled(false);
        txtTelefono.setMargin(new java.awt.Insets(3, 10, 3, 6));
        txtTelefono.setName("txtTelefono"); // NOI18N
        txtTelefono.setPlaceholder("Telefono");

        txtApellidos.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1)));
        txtApellidos.setForeground(new java.awt.Color(0, 0, 0));
        txtApellidos.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtApellidos.setEnabled(false);
        txtApellidos.setMargin(new java.awt.Insets(3, 10, 3, 6));
        txtApellidos.setName("txtApellidos"); // NOI18N
        txtApellidos.setPlaceholder("Apellidos");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(37, 45, 223));
        jLabel8.setText("Telefono");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(37, 45, 223));
        jLabel1.setText("Dni Usuario");

        javax.swing.GroupLayout pnlInfoUsuarioLayout = new javax.swing.GroupLayout(pnlInfoUsuario);
        pnlInfoUsuario.setLayout(pnlInfoUsuarioLayout);
        pnlInfoUsuarioLayout.setHorizontalGroup(
            pnlInfoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInfoUsuarioLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel6)
                .addContainerGap(542, Short.MAX_VALUE))
            .addGroup(pnlInfoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlInfoUsuarioLayout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addGroup(pnlInfoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlInfoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtApellidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtNombres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtIdUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING))
                        .addComponent(jLabel8))
                    .addGap(36, 36, 36)
                    .addGroup(pnlInfoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtFechaNac, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblFotoS, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(21, 21, 21)))
        );
        pnlInfoUsuarioLayout.setVerticalGroup(
            pnlInfoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInfoUsuarioLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel6)
                .addContainerGap(414, Short.MAX_VALUE))
            .addGroup(pnlInfoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlInfoUsuarioLayout.createSequentialGroup()
                    .addGroup(pnlInfoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlInfoUsuarioLayout.createSequentialGroup()
                            .addGap(110, 110, 110)
                            .addGroup(pnlInfoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(jLabel1))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(pnlInfoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(pnlInfoUsuarioLayout.createSequentialGroup()
                                    .addGroup(pnlInfoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtIdUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(pnlInfoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel3))
                                    .addGap(4, 4, 4)
                                    .addGroup(pnlInfoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(lblFotoS, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(pnlInfoUsuarioLayout.createSequentialGroup()
                            .addGap(255, 255, 255)
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(10, 10, 10)
                    .addGroup(pnlInfoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(pnlInfoUsuarioLayout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnlInfoUsuarioLayout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtFechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(73, Short.MAX_VALUE)))
        );

        pnlSlider.add(pnlInfoUsuario, "card3");

        btnVolver.setBackground(new java.awt.Color(204, 204, 204));
        btnVolver.setText("Volver");
        btnVolver.setBackgroundHover(new java.awt.Color(0, 153, 0));
        btnVolver.setFont(new java.awt.Font("Roboto Bold", 1, 16)); // NOI18N
        btnVolver.setForegroundIcon(new java.awt.Color(0, 0, 0));
        btnVolver.setForegroundText(new java.awt.Color(0, 0, 0));
        btnVolver.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnVolver.setIconTextGap(2);
        btnVolver.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.KEYBOARD_ARROW_LEFT);
        btnVolver.setPaddingLeft(14);
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlSlider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    
    private void txtBuscarDniKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarDniKeyReleased
        llenarSolicitantes(txtBuscarDni.getText());
    }//GEN-LAST:event_txtBuscarDniKeyReleased

    private void btnVerInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerInfoActionPerformed
        int i =tablaUSolicitantes.getSelectedRow();
       
        if(i !=-1){    
            Usuario user = listaSolicitantes.get(i);
            cargarDatos(user);
            this.pnlSlider.setPanelNormal(pnlInfoUsuario);
            btnVolver.setVisible(true);
        }else{
            mensaje.cargarDatos("Visualizar Información"
               ,"Seleccione un usuario de la lista", 1);                 
        }
                     
    }//GEN-LAST:event_btnVerInfoActionPerformed
    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        this.pnlSlider.setPanelNormal(pnlTablaUsuarios);
        limpiarInputs();
        btnVolver.setVisible(false);
    }//GEN-LAST:event_btnVolverActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Solcitantes;
    private RSMaterialComponent.RSButtonMaterialIconOne btnVerInfo;
    private RSMaterialComponent.RSButtonMaterialIconOne btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblFotoS;
    private javax.swing.JPanel pnlInfoUsuario;
    private newscomponents.RSPanelEffect pnlSlider;
    private javax.swing.JPanel pnlTablaUsuarios;
    private RSMaterialComponent.RSTableMetroCustom tablaUSolicitantes;
    private necesario.TextField txtApellidos;
    private RSMaterialComponent.RSTextFieldMaterialIcon txtBuscarDni;
    private necesario.TextField txtCorreo;
    private javax.swing.JTextArea txtDireccion;
    private necesario.TextField txtFechaNac;
    private necesario.TextField txtIdUsuario;
    private necesario.TextField txtNombres;
    private necesario.TextField txtTelefono;
    // End of variables declaration//GEN-END:variables
    public void cargarServicio(ServiciosUsuario servicio){
        this.servicio = servicio;
        this.listaSolicitantes = new ArrayList<>();     
        llenarSolicitantes("");
        btnVolver.setVisible(false);
    }
    private void llenarSolicitantes(String buscar){
        listaSolicitantes = new ArrayList<>();
        try {
            this.servicio.listarUsuarios(tablaUSolicitantes,"2"
                    ,buscar,listaSolicitantes,2);           
        } catch (SQLException ex) {
            mensaje.cargarDatos("Error al actualizar lista de Usuarios"
                   ,"No es posible cargar los registros.", 1); 
        }
    
    }
    private void cargarDatos(Usuario user){    
        txtNombres.setText(user.getNombres());
        txtApellidos.setText(user.getApellidos());
        txtCorreo.setText(user.getCorreo());
        txtIdUsuario.setText(user.getDni());
        txtTelefono.setText(user.getCelular());
        txtFechaNac.setText(user.getFechaString());
        txtDireccion.setText(user.getDireccion());
       
        try{ 
            if(user.getFoto()!=null)
                Foto.cargarFotoLabel(lblFotoS,user.getFoto());
        } catch (IOException ex) {
            mensaje.cargarDatos("Cargar foto"
                   ,"No es posible guarda la foto ingresada.", 1);  
        }
    }
    private void limpiarInputs() {
        txtNombres.setText("");
        txtApellidos.setText("");
        txtCorreo.setText("");
        txtIdUsuario.setText("");
        txtFechaNac.setText("");
        txtDireccion.setText("");
        lblFotoS.setIcon(null);
    }
}
