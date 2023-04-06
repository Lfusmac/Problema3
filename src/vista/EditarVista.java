/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

/**
 *
 * @author Pipe_
 */
public class EditarVista extends javax.swing.JFrame {

    /**
     * Creates new form EditarVista
     */
    public EditarVista() {
        initComponents();
        this.setLocationRelativeTo(null);
     
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TxtNombre2E = new javax.swing.JTextField();
        TxtApellido1E = new javax.swing.JTextField();
        TxtApellido2E = new javax.swing.JTextField();
        ListTipoProducto = new javax.swing.JComboBox<>();
        ListPaises = new javax.swing.JComboBox<>();
        ListEnvio1 = new javax.swing.JComboBox<>();
        TxtCuidaddestino = new javax.swing.JTextField();
        TxtCuidadOrigen1 = new javax.swing.JTextField();
        TxtIDF = new javax.swing.JTextField();
        TxtNombre1F = new javax.swing.JTextField();
        TxtNombre2F = new javax.swing.JTextField();
        JblIDimportacion = new javax.swing.JLabel();
        TxtApellido1F = new javax.swing.JTextField();
        TxtIDimportacion = new javax.swing.JTextField();
        TxtApellido2F = new javax.swing.JTextField();
        ListMonedaPago1 = new javax.swing.JComboBox<>();
        BtnGuardar = new javax.swing.JButton();
        JblInfoFuncionario = new javax.swing.JLabel();
        DateEnvio = new com.toedter.calendar.JDateChooser();
        BtnLimpiar = new javax.swing.JButton();
        BtnMenu = new javax.swing.JButton();
        DateEntregra = new com.toedter.calendar.JDateChooser();
        JblInfoEmpleado = new javax.swing.JLabel();
        JblInfoProduc = new javax.swing.JLabel();
        TxtIDimportacionB = new javax.swing.JTextField();
        BtnDimportacionB = new javax.swing.JButton();
        JblIDimportacionB = new javax.swing.JLabel();
        BtnSalir = new javax.swing.JButton();
        TxtIDE = new javax.swing.JTextField();
        TxtNombre1E = new javax.swing.JTextField();
        TxtCantidad = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Editar información");

        TxtNombre2E.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Segundo Nombre", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        TxtNombre2E.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNombre2EActionPerformed(evt);
            }
        });

        TxtApellido1E.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Primer Apellido", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        TxtApellido2E.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Segundo Apellido", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        ListTipoProducto.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ListTipoProducto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Entera", "En polvo" }));
        ListTipoProducto.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tipo de producto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        ListPaises.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ListPaises.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Italia", "Francia", "España", "Estados unidos", "Alemania" }));
        ListPaises.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista Países de destino", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        ListEnvio1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ListEnvio1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Marítimo", "Terrestre", "Aéreo" }));
        ListEnvio1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tipo de envio", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        TxtCuidaddestino.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ciudad de destino", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        TxtCuidadOrigen1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ciudad de origen en Colombia", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        TxtIDF.setToolTipText("");
        TxtIDF.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Identificación", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        TxtIDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtIDFActionPerformed(evt);
            }
        });

        TxtNombre1F.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Primer Nombre", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        TxtNombre1F.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNombre1FActionPerformed(evt);
            }
        });

        TxtNombre2F.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Segundo Nombre", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        TxtNombre2F.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNombre2FActionPerformed(evt);
            }
        });

        JblIDimportacion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        JblIDimportacion.setText("ID importación");

        TxtApellido1F.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Primer Apellido", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        TxtApellido2F.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Segundo Apellido", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        ListMonedaPago1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ListMonedaPago1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Euros", "Dólares", "Pesos" }));
        ListMonedaPago1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tipo de pago", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        ListMonedaPago1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListMonedaPago1ActionPerformed(evt);
            }
        });

        BtnGuardar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BtnGuardar.setText("Guardar");
        BtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGuardarActionPerformed(evt);
            }
        });

        JblInfoFuncionario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        JblInfoFuncionario.setText("Funcionario que recibe la exportación");
        JblInfoFuncionario.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Información del", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        DateEnvio.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Fecha de envío", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        BtnLimpiar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BtnLimpiar.setText("Limpiar");
        BtnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLimpiarActionPerformed(evt);
            }
        });

        BtnMenu.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BtnMenu.setText("Menu");
        BtnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMenuActionPerformed(evt);
            }
        });

        DateEntregra.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Fecha estimada de entrega ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        JblInfoEmpleado.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        JblInfoEmpleado.setText("Empleado que realiza la exportación");
        JblInfoEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Información  del", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        JblInfoProduc.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        JblInfoProduc.setText("Información de producto");

        BtnDimportacionB.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BtnDimportacionB.setText("Buscar");

        JblIDimportacionB.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        JblIDimportacionB.setText("ID importación");

        BtnSalir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BtnSalir.setText("Salir");
        BtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalirActionPerformed(evt);
            }
        });

        TxtIDE.setToolTipText("");
        TxtIDE.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Identificación", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        TxtIDE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtIDEActionPerformed(evt);
            }
        });

        TxtNombre1E.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Primer Nombre", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        TxtNombre1E.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNombre1EActionPerformed(evt);
            }
        });

        TxtCantidad.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cantidad del producto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JblIDimportacionB)
                        .addGap(35, 35, 35)
                        .addComponent(TxtIDimportacionB, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(BtnDimportacionB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BtnMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BtnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtCuidadOrigen1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DateEnvio, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(JblIDimportacion))
                            .addComponent(TxtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(DateEntregra, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(BtnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BtnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(15, 15, 15))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(ListEnvio1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(ListPaises, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(TxtCuidaddestino, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(ListMonedaPago1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(TxtIDimportacion, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(84, 84, 84)
                                        .addComponent(ListTipoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JblInfoProduc)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TxtNombre1E, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxtIDE, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxtNombre2E, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxtApellido1E, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxtApellido2E, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(JblInfoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 126, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtNombre1F, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtIDF, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtNombre2F, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtApellido1F, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtApellido2F, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JblInfoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(99, 99, 99)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(BtnSalir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnMenu))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JblIDimportacionB)
                            .addComponent(TxtIDimportacionB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnDimportacionB))))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JblInfoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JblInfoFuncionario))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TxtIDE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TxtNombre1E, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TxtNombre2E, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TxtApellido1E, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(TxtApellido2E, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TxtIDF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TxtNombre1F, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TxtNombre2F, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TxtApellido1F, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(TxtApellido2F, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32)
                .addComponent(JblInfoProduc)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JblIDimportacion, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtIDimportacion, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ListTipoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ListEnvio1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ListPaises, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtCuidaddestino, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtCuidadOrigen1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(ListMonedaPago1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DateEnvio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DateEntregra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnLimpiar)
                        .addGap(24, 24, 24))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtNombre2EActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNombre2EActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNombre2EActionPerformed

    private void TxtIDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtIDFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtIDFActionPerformed

    private void TxtNombre1FActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNombre1FActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNombre1FActionPerformed

    private void TxtNombre2FActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNombre2FActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNombre2FActionPerformed

    private void ListMonedaPago1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListMonedaPago1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ListMonedaPago1ActionPerformed

    private void BtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnGuardarActionPerformed

    private void BtnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMenuActionPerformed
        // TODO add your handling code here:
        PrincipalVista principalVista=new PrincipalVista();
        principalVista.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnMenuActionPerformed

    private void BtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_BtnSalirActionPerformed

    private void TxtIDEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtIDEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtIDEActionPerformed

    private void TxtNombre1EActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNombre1EActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNombre1EActionPerformed

    private void BtnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLimpiarActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_BtnLimpiarActionPerformed

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
            java.util.logging.Logger.getLogger(EditarVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditarVista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnDimportacionB;
    private javax.swing.JButton BtnGuardar;
    private javax.swing.JButton BtnLimpiar;
    private javax.swing.JButton BtnMenu;
    private javax.swing.JButton BtnSalir;
    private com.toedter.calendar.JDateChooser DateEntregra;
    private com.toedter.calendar.JDateChooser DateEnvio;
    private javax.swing.JLabel JblIDimportacion;
    private javax.swing.JLabel JblIDimportacionB;
    private javax.swing.JLabel JblInfoEmpleado;
    private javax.swing.JLabel JblInfoFuncionario;
    private javax.swing.JLabel JblInfoProduc;
    private javax.swing.JComboBox<String> ListEnvio1;
    private javax.swing.JComboBox<String> ListMonedaPago1;
    private javax.swing.JComboBox<String> ListPaises;
    private javax.swing.JComboBox<String> ListTipoProducto;
    private javax.swing.JTextField TxtApellido1E;
    private javax.swing.JTextField TxtApellido1F;
    private javax.swing.JTextField TxtApellido2E;
    private javax.swing.JTextField TxtApellido2F;
    private javax.swing.JTextField TxtCantidad;
    private javax.swing.JTextField TxtCuidadOrigen1;
    private javax.swing.JTextField TxtCuidaddestino;
    private javax.swing.JTextField TxtIDE;
    private javax.swing.JTextField TxtIDF;
    private javax.swing.JTextField TxtIDimportacion;
    private javax.swing.JTextField TxtIDimportacionB;
    private javax.swing.JTextField TxtNombre1E;
    private javax.swing.JTextField TxtNombre1F;
    private javax.swing.JTextField TxtNombre2E;
    private javax.swing.JTextField TxtNombre2F;
    // End of variables declaration//GEN-END:variables

    
}
