/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package entregablebeb;

/**
 *
 * @author MC
 */
public class PlanesInversiones extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(PlanesInversiones.class.getName());

    /**
     * Creates new form PlanesInversiones
     */
    public PlanesInversiones() {
        initComponents();
    }

    int idClienteEncontrado = 0;
    
    private void registrarAuditoria(String accion, String tabla) {
    try {
        java.sql.Connection con = conexion.Conexion.conectar();

        String sql = "INSERT INTO historial_auditoria (tabla_afectada, accion_realizada, fecha_cambio, Asesores_Financieros_id_asesor) VALUES (?, ?, NOW(), ?)";
        java.sql.PreparedStatement ps = con.prepareStatement(sql);
        
        ps.setString(1, tabla);
        ps.setString(2, accion);
        ps.setInt(3, 1); 
        
        ps.executeUpdate();
        con.close();
    } catch (Exception e) {
        System.out.println("Error en auditoría: " + e.getMessage());
    }
}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MontoInvertir = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        AperturarInversion = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Limpiar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        Cancelar = new javax.swing.JButton();
        txtDNI = new javax.swing.JTextField();
        txtCliente = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        ComboBoxTipoProduct = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        Plazo = new javax.swing.JComboBox<>();
        Finicio = new javax.swing.JTextField();
        Fvencimiento = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        buscarCuentaPlan = new javax.swing.JTextField();
        busCuenta = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtInteres = new javax.swing.JTextField();
        txtMontoFinal = new javax.swing.JTextField();
        CalcularSimulacion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel6.setText("Plazo (Meses):");

        jLabel7.setText("Fecha de inicio");

        jLabel1.setText("Datos del titular");

        AperturarInversion.setText("Aperturar Inversión");
        AperturarInversion.addActionListener(this::AperturarInversionActionPerformed);

        jLabel2.setText("DNI");

        Limpiar.setText("Limpiar");
        Limpiar.addActionListener(this::LimpiarActionPerformed);

        jLabel3.setText("Cliente");

        Cancelar.setText("Cancelar / volver");
        Cancelar.addActionListener(this::CancelarActionPerformed);

        txtDNI.setEditable(false);

        txtCliente.setEditable(false);
        txtCliente.addActionListener(this::txtClienteActionPerformed);

        jLabel4.setText("Típo de producto:");

        ComboBoxTipoProduct.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Depósito a Plazo Fijo", "Fondo Mutuo", "Certificado de Deposito ", "Ahorro Programado" }));
        ComboBoxTipoProduct.setToolTipText("");

        jLabel5.setText("Monto a invertir (S/.)");

        Plazo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3", "6", "12", "24" }));

        Fvencimiento.setEditable(false);

        jLabel8.setText("Fecha de vencimiento");

        jLabel9.setText("Número de Cuenta");

        busCuenta.setText("Buscar Cuenta");
        busCuenta.addActionListener(this::busCuentaActionPerformed);

        jLabel10.setText("Interés Estimado (S/.)");

        jLabel11.setText("Monto final al vencer");

        txtInteres.setEditable(false);

        txtMontoFinal.setEditable(false);

        CalcularSimulacion.setText("Calcular Simulación");
        CalcularSimulacion.addActionListener(this::CalcularSimulacionActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(buscarCuentaPlan, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Plazo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ComboBoxTipoProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel2))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(busCuenta))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(0, 0, Short.MAX_VALUE)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(MontoInvertir, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel7)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(Finicio))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jLabel8)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(Fvencimiento)))
                                    .addGap(2, 2, 2)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel11)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtMontoFinal))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel10)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtInteres, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(Cancelar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Limpiar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CalcularSimulacion, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(AperturarInversion, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buscarCuentaPlan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(busCuenta)
                .addGap(18, 18, 18)
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
                    .addComponent(ComboBoxTipoProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(MontoInvertir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(Plazo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(Finicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Fvencimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtInteres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtMontoFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(CalcularSimulacion, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cancelar)
                    .addComponent(Limpiar)
                    .addComponent(AperturarInversion))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClienteActionPerformed

    private void busCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_busCuentaActionPerformed
                                        
    try {
        java.sql.Connection con = conexion.Conexion.conectar();
        String sql = "SELECT c.id_cliente, c.dni, c.nombres, c.apellidos FROM clientes c " +
                     "JOIN cuentas_ahorro ca ON c.id_cliente = ca.Clientes_id_cliente " +
                     "WHERE ca.numero_cuenta = ?";
        java.sql.PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, buscarCuentaPlan.getText());
        java.sql.ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            idClienteEncontrado = rs.getInt("id_cliente"); 
            txtDNI.setText(rs.getString("dni"));
            txtCliente.setText(rs.getString("nombres") + " " + rs.getString("apellidos"));
            
            Finicio.setText(new java.text.SimpleDateFormat("yyyy-MM-dd").format(new java.util.Date()));
        } else {
            idClienteEncontrado = 0;
            javax.swing.JOptionPane.showMessageDialog(this, "Cuenta no encontrada.");
        }
        con.close();
    } catch (Exception e) {
        javax.swing.JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
    }

    }//GEN-LAST:event_busCuentaActionPerformed

    private void CalcularSimulacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcularSimulacionActionPerformed
                                               
    try {
        if (MontoInvertir.getText().trim().isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Debe ingresar un monto para simular.");
            return;
        }

        double monto = Double.parseDouble(MontoInvertir.getText());
        int meses = Integer.parseInt(Plazo.getSelectedItem().toString().trim());
        double tasaAnual = (meses <= 3) ? 0.03 : (meses <= 6) ? 0.05 : 0.07;

        double interesGanado = monto * tasaAnual * (meses / 12.0);
        double montoTotal = monto + interesGanado;

        // Llenado de campos con formato de 2 decimales
        txtInteres.setText(String.format("%.2f", interesGanado));
        txtMontoFinal.setText(String.format("%.2f", montoTotal));
        
        // Cálculo de fecha de vencimiento
        java.util.Calendar cal = java.util.Calendar.getInstance();
        cal.add(java.util.Calendar.MONTH, meses);
        Fvencimiento.setText(new java.sql.Date(cal.getTimeInMillis()).toString());

    } catch (NumberFormatException e) {
        javax.swing.JOptionPane.showMessageDialog(this, "Error: El monto debe ser un número válido.");
    } catch (Exception e) {
        System.out.println("Error en simulación: " + e.getMessage());
        javax.swing.JOptionPane.showMessageDialog(this, "Error inesperado: " + e.getMessage());
    }

    }//GEN-LAST:event_CalcularSimulacionActionPerformed

    private void AperturarInversionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AperturarInversionActionPerformed
    try {
        if (txtMontoFinal.getText().isEmpty() || Fvencimiento.getText().isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Primero debe presionar 'Calcular Simulación'.");
            return;
        }
        java.sql.Connection con = conexion.Conexion.conectar();
        con.setAutoCommit(false); 

        double montoInv = Double.parseDouble(MontoInvertir.getText());
        int meses = Integer.parseInt(Plazo.getSelectedItem().toString());
        String nCuenta = buscarCuentaPlan.getText();

        double saldoDisponible = 0;
        int idCuenta = 0;
        java.sql.PreparedStatement psS = con.prepareStatement("SELECT id_cuenta, saldo_actual FROM cuentas_ahorro WHERE numero_cuenta = ?");
        psS.setString(1, nCuenta);
        java.sql.ResultSet rsS = psS.executeQuery();

        if (rsS.next()) {
            idCuenta = rsS.getInt("id_cuenta");
            saldoDisponible = rsS.getDouble("saldo_actual");
        }

        if (montoInv > saldoDisponible) {
            javax.swing.JOptionPane.showMessageDialog(this, "Saldo insuficiente. El cliente solo tiene S/." + saldoDisponible);
            con.close();
            return;
        }

        double nuevoSaldoAhorros = saldoDisponible - montoInv;
        java.sql.PreparedStatement psUp = con.prepareStatement("UPDATE cuentas_ahorro SET saldo_actual = ? WHERE id_cuenta = ?");
        psUp.setDouble(1, nuevoSaldoAhorros);
        psUp.setInt(2, idCuenta);
        psUp.executeUpdate();

        String sqlInv = "INSERT INTO planes_inversion (monto_invertido, plazo_meses, fecha_inicio, fecha_vencimiento, estado, Clientes_id_cliente, Productos_Financieros_id_producto) VALUES (?, ?, ?, ?, ?, ?, ?)";
        java.sql.PreparedStatement psInv = con.prepareStatement(sqlInv);
        
        psInv.setDouble(1, montoInv);
        psInv.setInt(2, meses);
        psInv.setString(3, Finicio.getText());    
        psInv.setString(4, Fvencimiento.getText());
        psInv.setString(5, "Activo");
        psInv.setInt(6, idClienteEncontrado); 
        psInv.setInt(7, 3); 
        psInv.executeUpdate();

        registrarAuditoria("INSERT", "planes_inversion");

        con.commit();
        javax.swing.JOptionPane.showMessageDialog(this, "¡Inversión Procesada con éxito!\nEl saldo ha sido descontado y el movimiento registrado.");

        Limpiar.doClick(); 
        con.close();

    } catch (Exception e) {
        javax.swing.JOptionPane.showMessageDialog(this, "Error crítico: " + e.getMessage());
    }

    }//GEN-LAST:event_AperturarInversionActionPerformed

    private void LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarActionPerformed
    buscarCuentaPlan.setText("");
    txtDNI.setText("");
    txtCliente.setText("");
    MontoInvertir.setText("");
    Finicio.setText("");
    Fvencimiento.setText("");
    txtInteres.setText("");
    txtMontoFinal.setText("");
    ComboBoxTipoProduct.setSelectedIndex(0);
    Plazo.setSelectedIndex(0);
    idClienteEncontrado = 0;
    buscarCuentaPlan.requestFocus();
    }//GEN-LAST:event_LimpiarActionPerformed

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
    this.dispose();
    }//GEN-LAST:event_CancelarActionPerformed

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
        java.awt.EventQueue.invokeLater(() -> new PlanesInversiones().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AperturarInversion;
    private javax.swing.JButton CalcularSimulacion;
    private javax.swing.JButton Cancelar;
    private javax.swing.JComboBox<String> ComboBoxTipoProduct;
    private javax.swing.JTextField Finicio;
    private javax.swing.JTextField Fvencimiento;
    private javax.swing.JButton Limpiar;
    private javax.swing.JTextField MontoInvertir;
    private javax.swing.JComboBox<String> Plazo;
    private javax.swing.JButton busCuenta;
    private javax.swing.JTextField buscarCuentaPlan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtDNI;
    private javax.swing.JTextField txtInteres;
    private javax.swing.JTextField txtMontoFinal;
    // End of variables declaration//GEN-END:variables
}
