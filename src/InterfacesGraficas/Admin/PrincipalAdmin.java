/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfacesGraficas.Admin;
import Entidades.*;
import InterfacesGraficas.Login.IniciarSesion;
import rojeru_san.complementos.RSEffectFade;
/**
 *
 * @author Hansel Chavez
 */
public class PrincipalAdmin extends javax.swing.JFrame {

    /**
     * Creates new form PrincipalAdmin
     */
    static Usuario user = new Usuario();
    IniciarSesion login;
   
    public PrincipalAdmin(Usuario user,IniciarSesion login){       
        initComponents();       
        iniciarValores(user,login);      
    }   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rSPanelGradiente1 = new rspanelgradiente.RSPanelGradiente();
        jSeparator1 = new javax.swing.JSeparator();
        btnSalir = new newscomponents.RSButtonGradientIcon_new();
        btnUsuarios = new newscomponents.RSButtonGradientIcon_new();
        btnSolicitudes = new newscomponents.RSButtonGradientIcon_new();
        btnPerfil = new newscomponents.RSButtonGradientIcon_new();
        lblnombres = new javax.swing.JLabel();
        lblapellidos = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnMinimize = new javax.swing.JLabel();
        btnClose = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        panslid = new newscomponents.RSPanelEffect();
        pnlEstadoSolicitud = new InterfacesGraficas.Admin.pnlEstadoSolicitud();
        pnlPerfil = new InterfacesGraficas.Perfil.pnlPerfiles();
        pnlUsuarios = new InterfacesGraficas.Admin.pnlUsuarios();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        rSPanelGradiente1.setColorPrimario(new java.awt.Color(0, 87, 151));
        rSPanelGradiente1.setColorSecundario(new java.awt.Color(12, 140, 233));
        rSPanelGradiente1.setGradiente(rspanelgradiente.RSPanelGradiente.Gradiente.VERTICAL);

        btnSalir.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 25, 1, 1));
        btnSalir.setForeground(new java.awt.Color(0, 0, 0));
        btnSalir.setText("SALIR");
        btnSalir.setColorPrimario(new java.awt.Color(0, 87, 151));
        btnSalir.setColorPrimarioHover(new java.awt.Color(255, 51, 51));
        btnSalir.setColorSecundario(new java.awt.Color(12, 140, 233));
        btnSalir.setColorSecundarioHover(new java.awt.Color(255, 51, 51));
        btnSalir.setFocusPainted(false);
        btnSalir.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnSalir.setIconTextGap(10);
        btnSalir.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SETTINGS_POWER);
        btnSalir.setSizeIcon(40.0F);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnUsuarios.setBackground(new java.awt.Color(255, 255, 255));
        btnUsuarios.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 25, 1, 1));
        btnUsuarios.setText("USUARIOS");
        btnUsuarios.setBorderPainted(false);
        btnUsuarios.setColorPrimario(new java.awt.Color(0, 87, 151));
        btnUsuarios.setColorPrimarioHover(new java.awt.Color(255, 51, 51));
        btnUsuarios.setColorSecundario(new java.awt.Color(12, 140, 233));
        btnUsuarios.setColorSecundarioHover(new java.awt.Color(255, 51, 51));
        btnUsuarios.setFocusPainted(false);
        btnUsuarios.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnUsuarios.setIconTextGap(10);
        btnUsuarios.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.PEOPLE);
        btnUsuarios.setSelected(true);
        btnUsuarios.setSizeIcon(40.0F);
        btnUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuariosActionPerformed(evt);
            }
        });

        btnSolicitudes.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 25, 1, 1));
        btnSolicitudes.setForeground(new java.awt.Color(0, 0, 0));
        btnSolicitudes.setText("SOLICITUDES");
        btnSolicitudes.setColorPrimario(new java.awt.Color(0, 87, 151));
        btnSolicitudes.setColorPrimarioHover(new java.awt.Color(255, 51, 51));
        btnSolicitudes.setColorSecundario(new java.awt.Color(12, 140, 233));
        btnSolicitudes.setColorSecundarioHover(new java.awt.Color(255, 51, 51));
        btnSolicitudes.setFocusPainted(false);
        btnSolicitudes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnSolicitudes.setIconTextGap(10);
        btnSolicitudes.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.LIBRARY_BOOKS);
        btnSolicitudes.setSizeIcon(40.0F);
        btnSolicitudes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSolicitudesActionPerformed(evt);
            }
        });

        btnPerfil.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 25, 1, 1));
        btnPerfil.setForeground(new java.awt.Color(0, 0, 0));
        btnPerfil.setText("PERFIL");
        btnPerfil.setColorPrimario(new java.awt.Color(0, 87, 151));
        btnPerfil.setColorPrimarioHover(new java.awt.Color(255, 51, 51));
        btnPerfil.setColorSecundario(new java.awt.Color(12, 140, 233));
        btnPerfil.setColorSecundarioHover(new java.awt.Color(255, 51, 51));
        btnPerfil.setFocusPainted(false);
        btnPerfil.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnPerfil.setIconTextGap(10);
        btnPerfil.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.ACCOUNT_BOX);
        btnPerfil.setInheritsPopupMenu(true);
        btnPerfil.setSizeIcon(40.0F);
        btnPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPerfilActionPerformed(evt);
            }
        });

        lblnombres.setBackground(new java.awt.Color(255, 255, 255));
        lblnombres.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lblnombres.setForeground(new java.awt.Color(255, 255, 255));
        lblnombres.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblapellidos.setBackground(new java.awt.Color(255, 255, 255));
        lblapellidos.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lblapellidos.setForeground(new java.awt.Color(255, 255, 255));
        lblapellidos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout rSPanelGradiente1Layout = new javax.swing.GroupLayout(rSPanelGradiente1);
        rSPanelGradiente1.setLayout(rSPanelGradiente1Layout);
        rSPanelGradiente1Layout.setHorizontalGroup(
            rSPanelGradiente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rSPanelGradiente1Layout.createSequentialGroup()
                .addGroup(rSPanelGradiente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lblapellidos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblnombres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                    .addComponent(btnUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                    .addComponent(btnSolicitudes, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                    .addComponent(btnPerfil, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        rSPanelGradiente1Layout.setVerticalGroup(
            rSPanelGradiente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rSPanelGradiente1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblnombres, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblapellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnSolicitudes, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(130, 130, 130))
        );

        jPanel2.setBackground(new java.awt.Color(12, 140, 233));

        btnMinimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/32wtminimize-sign.png"))); // NOI18N
        btnMinimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMinimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMinimizeMouseClicked(evt);
            }
        });

        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/32wtclose.png"))); // NOI18N
        btnClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCloseMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnMinimize)
                .addGap(8, 8, 8)
                .addComponent(btnClose)
                .addGap(5, 5, 5))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnMinimize)
                    .addComponent(btnClose))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(0, 153, 255));

        panslid.setBackground(new java.awt.Color(255, 255, 255));

        pnlEstadoSolicitud.setName("pnlEstadoSolicitud"); // NOI18N
        panslid.add(pnlEstadoSolicitud, "card4");

        pnlPerfil.setName("pnlPerfil"); // NOI18N
        pnlPerfil.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                pnlPerfilMouseMoved(evt);
            }
        });
        panslid.add(pnlPerfil, "card4");

        pnlUsuarios.setName("pnlUsuarios"); // NOI18N
        panslid.add(pnlUsuarios, "card4");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panslid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panslid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(rSPanelGradiente1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rSPanelGradiente1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizeMouseClicked
        this.setState(ICONIFIED);
    }//GEN-LAST:event_btnMinimizeMouseClicked

    private void btnCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseClicked
        cerrarForm();
    }//GEN-LAST:event_btnCloseMouseClicked

    private void btnUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuariosActionPerformed
        if(!btnUsuarios.isSelected()){
            btnUsuarios.setSelected(true);
            btnSolicitudes.setSelected(false);
            btnPerfil.setSelected(false);           
            this.panslid.setPanelNormal(this.pnlUsuarios);             
        }
    }//GEN-LAST:event_btnUsuariosActionPerformed

    private void btnSolicitudesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSolicitudesActionPerformed
        if(!btnSolicitudes.isSelected()){
            btnUsuarios.setSelected(false);
            btnSolicitudes.setSelected(true);
            btnPerfil.setSelected(false);
            pnlEstadoSolicitud.cargarServicio(login.getServicioUsuario());
            this.panslid.setPanelNormal(this.pnlEstadoSolicitud);            
        }
    }//GEN-LAST:event_btnSolicitudesActionPerformed

    private void btnPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPerfilActionPerformed
        if(!btnPerfil.isSelected()){
            btnUsuarios.setSelected(false);
            btnSolicitudes.setSelected(false);
            btnPerfil.setSelected(true); 
            pnlPerfil.cargarDatos(user,this,login);
            this.panslid.setPanelNormal(pnlPerfil);
        }      
    }//GEN-LAST:event_btnPerfilActionPerformed
   
    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        cerrarForm();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void pnlPerfilMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlPerfilMouseMoved
        cargarUsuario();
    }//GEN-LAST:event_pnlPerfilMouseMoved

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnClose;
    private javax.swing.JLabel btnMinimize;
    private newscomponents.RSButtonGradientIcon_new btnPerfil;
    private newscomponents.RSButtonGradientIcon_new btnSalir;
    private newscomponents.RSButtonGradientIcon_new btnSolicitudes;
    private newscomponents.RSButtonGradientIcon_new btnUsuarios;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblapellidos;
    private javax.swing.JLabel lblnombres;
    private newscomponents.RSPanelEffect panslid;
    private InterfacesGraficas.Admin.pnlEstadoSolicitud pnlEstadoSolicitud;
    private InterfacesGraficas.Perfil.pnlPerfiles pnlPerfil;
    private InterfacesGraficas.Admin.pnlUsuarios pnlUsuarios;
    private rspanelgradiente.RSPanelGradiente rSPanelGradiente1;
    // End of variables declaration//GEN-END:variables
    public static Usuario getUsuario(){
        return PrincipalAdmin.user;
    }
    
    private void cerrarForm() {
        System.exit(0);
    }   
    public void iniciarValores(Usuario user ,IniciarSesion login ) {
        this.setLocationRelativeTo(null);
        this.login = login;
        PrincipalAdmin.user = user;
        cargarUsuario();
        RSEffectFade.setFadeWindowIn(this, 30,0.1f);
        pnlUsuarios.cargarServicio(login.getServicioUsuario());
        this.panslid.setPanelNormal(this.pnlUsuarios);       
    }
    public  void cargarUsuario() {  
        lblnombres.setText(user.getNombres());
        lblapellidos.setText(user.getApellidos());         
         
    }
}
