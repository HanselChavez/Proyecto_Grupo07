/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfacesGraficas.Login;
import InterfacesGraficas.Solicitante.PrincipalSolicitante;
import java.awt.Color;
import InterfacesGraficas.Trabajador.*;
import InterfacesGraficas.Admin.*;
import Entidades.Usuario;
import static Main.ServicioDeAgua.mensaje;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import Utilidades.ServiciosUsuario;
import javax.swing.JOptionPane;
import rojeru_san.complementos.RSEffectFade;




/**
 *
 * @authors Hansel Chavez
 */
public class IniciarSesion extends javax.swing.JFrame {

    private ServiciosUsuario userService;
    
    public IniciarSesion() throws ClassNotFoundException, SQLException {
        initComponents();
        inicializarVariables();
        initControlls();
        RSEffectFade.setFadeWindowIn(this, 30,0.1f);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnMinimize = new javax.swing.JLabel();
        btnClose = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblUser = new javax.swing.JLabel();
        lblContraseña = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtContraseña = new javax.swing.JPasswordField();
        btnCrearCuenta = new javax.swing.JLabel();
        btnRecuperarContraseña = new javax.swing.JLabel();
        lblestado = new javax.swing.JLabel();
        btnVer = new javax.swing.JLabel();
        btnOcultar = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblfaltauser = new javax.swing.JLabel();
        lblfaltacontra = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnIniciar = new RSMaterialComponent.RSButtonMaterialOne();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(12, 140, 233));

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

        jPanel2.setBackground(new java.awt.Color(30, 30, 30));
        jPanel2.setMinimumSize(new java.awt.Dimension(355, 536));

        lblUser.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblUser.setForeground(new java.awt.Color(255, 255, 255));
        lblUser.setText("USUARIO");

        lblContraseña.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblContraseña.setForeground(new java.awt.Color(255, 255, 255));
        lblContraseña.setText("CONTRASEÑA");

        txtUsuario.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtUsuario.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 10, 2, 2));
        txtUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUsuarioKeyTyped(evt);
            }
        });

        txtContraseña.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtContraseña.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 10, 2, 2));
        txtContraseña.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtContraseña.setEchoChar('●');
        txtContraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtContraseñaKeyTyped(evt);
            }
        });

        btnCrearCuenta.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnCrearCuenta.setForeground(new java.awt.Color(255, 255, 255));
        btnCrearCuenta.setText("Crear Cuenta");
        btnCrearCuenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCrearCuenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCrearCuentaMouseClicked(evt);
            }
        });

        btnRecuperarContraseña.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnRecuperarContraseña.setForeground(new java.awt.Color(255, 255, 255));
        btnRecuperarContraseña.setText("Olvidaste tu Contraseña?");
        btnRecuperarContraseña.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRecuperarContraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRecuperarContraseñaMouseClicked(evt);
            }
        });

        lblestado.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblestado.setForeground(new java.awt.Color(255, 0, 0));
        lblestado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        btnVer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/32wtshow.png"))); // NOI18N
        btnVer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVerMouseClicked(evt);
            }
        });

        btnOcultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/32wthide.png"))); // NOI18N
        btnOcultar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOcultar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnOcultarMouseClicked(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/128wtuser.png"))); // NOI18N

        lblfaltauser.setBackground(new java.awt.Color(255, 0, 0));
        lblfaltauser.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblfaltauser.setForeground(new java.awt.Color(255, 0, 0));

        lblfaltacontra.setBackground(new java.awt.Color(255, 0, 0));
        lblfaltacontra.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblfaltacontra.setForeground(new java.awt.Color(255, 0, 0));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        btnIniciar.setBackground(new java.awt.Color(30, 30, 30));
        btnIniciar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 5));
        btnIniciar.setText("Iniciar Sesion");
        btnIniciar.setBackgroundHover(new java.awt.Color(72, 72, 72));
        btnIniciar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnIniciar.setRequestFocusEnabled(false);
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(btnIniciar, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                .addGap(3, 3, 3))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(btnIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUser)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtContraseña, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                                    .addComponent(lblfaltacontra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnOcultar)
                                    .addComponent(btnVer)))
                            .addComponent(lblContraseña)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(lblfaltauser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtUsuario))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblestado, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRecuperarContraseña)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(btnCrearCuenta)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(113, 113, 113))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtContraseña, txtUsuario});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addGap(27, 27, 27)
                .addComponent(lblUser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblfaltauser, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(lblContraseña)
                .addGap(7, 7, 7)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnOcultar)
                        .addComponent(btnVer))
                    .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblfaltacontra, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblestado, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCrearCuenta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRecuperarContraseña)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtContraseña, txtUsuario});

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnMinimize)
                .addGap(8, 8, 8)
                .addComponent(btnClose)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnMinimize)
                    .addComponent(btnClose))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVerMouseClicked
        // TODO add your handling code here:
        btnVer.setVisible(false);
        btnOcultar.setVisible(true);
        txtContraseña.setEchoChar((char)0);
    }//GEN-LAST:event_btnVerMouseClicked

    private void btnOcultarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOcultarMouseClicked
        // TODO add your handling code here:
        btnVer.setVisible(true);
        btnOcultar.setVisible(false);
        txtContraseña.setEchoChar('●');
    }//GEN-LAST:event_btnOcultarMouseClicked

    private void btnCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseClicked
        cerrarForm();       
    }//GEN-LAST:event_btnCloseMouseClicked

    private void btnMinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizeMouseClicked
        
    }//GEN-LAST:event_btnMinimizeMouseClicked

    private void txtUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyTyped
        this.lblfaltauser.setText("");
        lblestado.setText("");
    }//GEN-LAST:event_txtUsuarioKeyTyped

    private void txtContraseñaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContraseñaKeyTyped
        this.lblfaltacontra.setText("");
        lblestado.setText("");
    }//GEN-LAST:event_txtContraseñaKeyTyped

    private void btnCrearCuentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCrearCuentaMouseClicked
        CrearCuenta crearcuenta = new CrearCuenta(this);
        crearcuenta.setLocationRelativeTo(null);
        crearcuenta.setVisible(true);
        ocultarForm();
    }//GEN-LAST:event_btnCrearCuentaMouseClicked

    private void btnRecuperarContraseñaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRecuperarContraseñaMouseClicked
        RestablecerContraseña restablecer = new RestablecerContraseña(this);
        restablecer.setLocationRelativeTo(null);
        restablecer.setVisible(true);
        ocultarForm();
    }//GEN-LAST:event_btnRecuperarContraseñaMouseClicked

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        Usuario user ;
        String username = txtUsuario.getText();
        String password = txtContraseña.getText();
        if(username.equals(""))
        {
        this.lblfaltauser.setText("Este campo es requerido.");
        }
        if(password.equals("")){
          this.lblfaltacontra.setText("Este campo es requerido.");
        }
        if(!username.equals("")&&!password.equals(""))
        {   try {  
                if(userService.validarUsuario(username, password)){
                    user = userService.cargarDatosSesion( username);
                    lblestado.setForeground(Color.GREEN);                
                    lblestado.setText("Usuario autenticado"); 
                    abrirForms(user);  
                    ocultarForm();                    
                }
                else{
                    lblestado.setForeground(Color.RED);
                    lblestado.setText("Las credenciales no son correctas.");
                } 
            } catch (SQLException ex) {
                   // mensaje.cargarDatos("Iniciar Sesion", "La conexion a "
                            //+ "la base de datos se encuentra cerrada",1);
            } 
            
        }      
    }//GEN-LAST:event_btnIniciarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel btnClose;
    private javax.swing.JLabel btnCrearCuenta;
    private RSMaterialComponent.RSButtonMaterialOne btnIniciar;
    private javax.swing.JLabel btnMinimize;
    private javax.swing.JLabel btnOcultar;
    private javax.swing.JLabel btnRecuperarContraseña;
    private javax.swing.JLabel btnVer;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblContraseña;
    private javax.swing.JLabel lblUser;
    private javax.swing.JLabel lblestado;
    private javax.swing.JLabel lblfaltacontra;
    private javax.swing.JLabel lblfaltauser;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
   
    //Funciones 
   
    public void abrirForms(Usuario user) {
                
        switch (user.getRol()) {
            case 1:
                PrincipalTrabajador pantallaTrabajador =
                        new PrincipalTrabajador(user,this);
                pantallaTrabajador.setVisible(true);
                break;
            case 2:
                PrincipalSolicitante pantallaUsuario = 
                        new PrincipalSolicitante(user,this);
                pantallaUsuario.setVisible(true);
                break;
            default:
                PrincipalAdmin pantallAdmin = 
                        new PrincipalAdmin(user,this);
                pantallAdmin.setVisible(true);
                break;
        }
    }
    
    public ServiciosUsuario getServicioUsuario(){
        return this.userService;
    }
    public void ocultarForm() {
        this.setVisible(false); 
        initControlls();
    }
    public void mostrarForm(){
        initControlls();
        this.setVisible(true);
    }
    public void cerrarForm(){      
        System.exit(0);
    }     
    public void inicializarVariables() throws ClassNotFoundException, SQLException {            
   
        this.userService = new ServiciosUsuario();        
    } 
    private void initControlls() {
        this.setLocationRelativeTo(null);
        btnOcultar.setVisible(false);
        lblfaltacontra.setText(null);
        lblfaltauser.setText(null);
        txtContraseña.setText(null);
        txtUsuario.setText(null);
        lblestado.setText(null);
    } 
}
