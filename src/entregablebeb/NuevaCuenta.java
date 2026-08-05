/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package entregablebeb;

import javax.swing.JOptionPane;

/**
 *
 * @author MC
 */
public class NuevaCuenta extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(NuevaCuenta.class.getName());

    /**
     * Creates new form NuevaCuenta
     */
    public NuevaCuenta() {
        initComponents();
        this.setLocationRelativeTo(null);
        generarNumeroCuentaAutomatico();
    }

    public void recibirDatos(String dni, String cliente) {
    // IMPORTANTE: Asegúrate que estos nombres coincidan con tus JTextField
    // Si tus cuadros se llaman jTextField1 y jTextField2, cámbialos aquí:
    txtDNI.setText(dni);      
    txtCliente.setText(cliente);
    
    

}
   private boolean cuentaExiste(String numero) {
    boolean existe = false;
    try {
        java.sql.Connection con = conexion.Conexion.conectar();
        String sql = "SELECT COUNT(*) FROM cuentas_ahorro WHERE numero_cuenta = ?";
        java.sql.PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, numero);
        java.sql.ResultSet rs = ps.executeQuery();
        
        if (rs.next()) {
            if (rs.getInt(1) > 0) {
                existe = true;
            }
        }
        con.close();
    } catch (Exception e) {
        System.out.println("Error al validar cuenta: " + e.getMessage());
    }
    return existe;
    
} 
   private void generarNumeroCuentaAutomatico() {

    long numero = (long) (Math.random() * 9000000000L) + 1000000000L;

    NumCuenta.setText(String.valueOf(numero));

    NumCuenta.setEditable(false); 
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtDNI = new javax.swing.JTextField();
        txtCliente = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        ComboBoxTipoCuenta = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        NumCuenta = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        MontInicial = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        ComboBoxEstado = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        registros = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Datos del titular");

        jLabel2.setText("DNI");

        jLabel3.setText("Cliente");

        txtDNI.setEditable(false);

        txtCliente.setEditable(false);
        txtCliente.addActionListener(this::txtClienteActionPerformed);

        jLabel4.setText("Típo de producto:");

        ComboBoxTipoCuenta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cuenta de Ahorro Libre", "Ahorro Programado", "Plan de Inversión" }));

        jLabel5.setText("Número de cuenta");

        NumCuenta.setEditable(false);

        jLabel6.setText("Monto inicial");

        jLabel7.setText("Estado:");

        ComboBoxEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activa", "Bloqueada" }));

        jButton1.setText("Aperturar Cuenta");
        jButton1.addActionListener(this::jButton1ActionPerformed);

        jButton2.setText("Limpiar");
        jButton2.addActionListener(this::jButton2ActionPerformed);

        jButton3.setText("Cancelar");
        jButton3.addActionListener(this::jButton3ActionPerformed);

        registros.setText("Registros");
        registros.addActionListener(this::registrosActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ComboBoxTipoCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ComboBoxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(MontInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(NumCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(registros)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(ComboBoxTipoCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(NumCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MontInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(ComboBoxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(registros))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClienteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     if (NumCuenta.getText().trim().isEmpty() || MontInicial.getText().trim().isEmpty()) {
        javax.swing.JOptionPane.showMessageDialog(this, "Debe completar el número de cuenta y el monto inicial.");
        return;
    }

    try {
        java.sql.Connection con = conexion.Conexion.conectar();

        // 1. Buscamos el ID del cliente (Esto ya lo tenías bien)
        String consultaId = "SELECT id_cliente FROM clientes WHERE dni = ?";
        java.sql.PreparedStatement psId = con.prepareStatement(consultaId);
        psId.setString(1, txtDNI.getText());
        java.sql.ResultSet rs = psId.executeQuery();
        
        int idCliente = 0;
        if (rs.next()) {
            idCliente = rs.getInt("id_cliente");
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Cliente no encontrado.");
            return;
        }

        // 2. "TRADUCTOR" de Texto a ID (Para respetar la relación)
        int idProducto = 1; // Por defecto ID 1
        String seleccion = ComboBoxTipoCuenta.getSelectedItem().toString();
        
        if (seleccion.equals("Ahorro Programado")) {
            idProducto = 2;
        } else if (seleccion.equals("Plan de Inversión")) {
            idProducto = 3;
        }
        String sql = "INSERT INTO cuentas_ahorro (numero_cuenta, saldo_actual, estado, Clientes_id_cliente, Productos_Financieros_id_producto) VALUES (?, ?, ?, ?, ?)";
        java.sql.PreparedStatement ps = con.prepareStatement(sql);
        
        ps.setString(1, NumCuenta.getText().trim());
        ps.setDouble(2, Double.parseDouble(MontInicial.getText().trim()));
        ps.setString(3, ComboBoxEstado.getSelectedItem().toString());
        ps.setInt(4, idCliente); 
        ps.setInt(5, idProducto); 

        int res = ps.executeUpdate();
        
        if (res > 0) {
            javax.swing.JOptionPane.showMessageDialog(this, "¡Cuenta aperturada con éxito!");
            MontInicial.setText("");
            generarNumeroCuentaAutomatico(); 
        }
        
        con.close();

    } catch (Exception e) {
        javax.swing.JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
    }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    generarNumeroCuentaAutomatico(); 
    MontInicial.setText(null);
    ComboBoxTipoCuenta.setSelectedIndex(0);
    ComboBoxEstado.setSelectedIndex(0);
    MontInicial.requestFocus();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    int valor = JOptionPane.showConfirmDialog(this, "¿Estás seguro de cancelar?", "Cancelar", JOptionPane.YES_NO_OPTION);
    
     if (valor== JOptionPane.YES_OPTION)
     this.dispose(); 
    }//GEN-LAST:event_jButton3ActionPerformed

    private void registrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrosActionPerformed

String dni = txtDNI.getText().trim();

if (dni.isEmpty()) {
    javax.swing.JOptionPane.showMessageDialog(this, "Debe haber un DNI en el campo para ver sus registros.");
} else {
    try {
        java.sql.Connection con = conexion.Conexion.conectar();
        String sql = "SELECT id_cliente FROM clientes WHERE dni = ?";
        java.sql.PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, dni);
        java.sql.ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            int idCliente = rs.getInt("id_cliente");

            RegistroNewCuenta ventanaRegistros = new RegistroNewCuenta(idCliente);
            ventanaRegistros.setVisible(true);
            
            ventanaRegistros.setLocationRelativeTo(null); 
            
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "El cliente con DNI " + dni + " no tiene registros o no existe.");
        }
        con.close();
    } catch (Exception e) {
        javax.swing.JOptionPane.showMessageDialog(this, "Error al abrir registros: " + e.getMessage());
    }
}
    }//GEN-LAST:event_registrosActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new NuevaCuenta().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBoxEstado;
    private javax.swing.JComboBox<String> ComboBoxTipoCuenta;
    private javax.swing.JTextField MontInicial;
    private javax.swing.JTextField NumCuenta;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton registros;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtDNI;
    // End of variables declaration//GEN-END:variables
}
