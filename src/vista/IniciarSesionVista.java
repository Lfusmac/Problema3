/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

/**
 *
 * @author Pipe_
 */
public class IniciarSesionVista extends javax.swing.JFrame {

    /**
     * Creates new form IniciarSesionVista
     */

    public static RegistroUsuarioVista rg;
    public IniciarSesionVista() {
       
        
        initComponents();
        this.setLocationRelativeTo(null); //para cuando inici aparesca la pantalla centrada
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
        BtnIniciar = new javax.swing.JButton();
        BtnSalir = new javax.swing.JButton();
        TxtUsuario = new javax.swing.JTextField();
        TxtContraena = new javax.swing.JPasswordField();
        LblUsuario = new java.awt.Label();
        LblContrasena = new java.awt.Label();
        BtnRegistrar = new javax.swing.JButton();
        jblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inicio Sesión");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnIniciar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BtnIniciar.setText("Iniciar sesión");
        BtnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnIniciarActionPerformed(evt);
            }
        });
        jPanel1.add(BtnIniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, 120, 30));

        BtnSalir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BtnSalir.setText("Salir");
        BtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(BtnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 320, 120, 30));
        jPanel1.add(TxtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 150, 170, 20));
        jPanel1.add(TxtContraena, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 220, 170, 20));

        LblUsuario.setAlignment(java.awt.Label.CENTER);
        LblUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        LblUsuario.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        LblUsuario.setName(""); // NOI18N
        LblUsuario.setText("Usuario");
        jPanel1.add(LblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 150, 20));

        LblContrasena.setAlignment(java.awt.Label.CENTER);
        LblContrasena.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        LblContrasena.setText("Contraseña");
        jPanel1.add(LblContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 150, 20));

        BtnRegistrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BtnRegistrar.setText("Registrar Usuario");
        BtnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegistrarActionPerformed(evt);
            }
        });
        jPanel1.add(BtnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 410, -1, -1));

        jblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Img1 (Pequeño).jpg"))); // NOI18N
        jPanel1.add(jblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -30, 620, 490));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_BtnSalirActionPerformed

    private void BtnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnIniciarActionPerformed
        // TODO add your handling code here:
         PrincipalVista principalVista=new PrincipalVista();
        principalVista.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnIniciarActionPerformed

    private void BtnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegistrarActionPerformed
        // TODO add your handling code here:
        rg=new RegistroUsuarioVista();
        rg.setVisible(true);
        
        
    }//GEN-LAST:event_BtnRegistrarActionPerformed

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
            java.util.logging.Logger.getLogger(IniciarSesionVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IniciarSesionVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IniciarSesionVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IniciarSesionVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IniciarSesionVista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnIniciar;
    private javax.swing.JButton BtnRegistrar;
    private javax.swing.JButton BtnSalir;
    private java.awt.Label LblContrasena;
    private java.awt.Label LblUsuario;
    private javax.swing.JPasswordField TxtContraena;
    private javax.swing.JTextField TxtUsuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jblFondo;
    // End of variables declaration//GEN-END:variables

    // para insertar imagen
    
  
    
}