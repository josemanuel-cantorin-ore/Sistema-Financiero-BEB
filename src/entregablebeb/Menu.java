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
public class Menu extends javax.swing.JFrame {
    public void cargarCuentasGlobales() {
    javax.swing.table.DefaultTableModel modelo = (javax.swing.table.DefaultTableModel) tablaPrincipalCuentas.getModel();
    modelo.setRowCount(0); 

    String sql = "SELECT c.numero_cuenta, p.nombre_producto, c.saldo_actual, c.estado, cl.nombres " +
                 "FROM cuentas_ahorro c " +
                 "INNER JOIN productos_financieros p ON c.Productos_Financieros_id_producto = p.id_producto " +
                 "INNER JOIN clientes cl ON c.Clientes_id_cliente = cl.id_cliente";

    try {
        java.sql.Connection con = conexion.Conexion.conectar();
        java.sql.PreparedStatement ps = con.prepareStatement(sql);
        java.sql.ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            Object[] fila = new Object[5];
            fila[0] = rs.getString("numero_cuenta");
            fila[1] = rs.getString("nombre_producto");
            fila[2] = rs.getDouble("saldo_actual");
            fila[3] = rs.getString("estado");
            fila[4] = rs.getString("nombres"); // El nombre del cliente
            modelo.addRow(fila);
        }
        con.close();
    } catch (Exception e) {
        System.out.println("Error al cargar menú principal: " + e.getMessage());
    }
}
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Menu.class.getName());

    /**
     * Creates new form Menu
     */
    public Menu() {
    initComponents();
    this.setLocationRelativeTo(null);
    cargarCuentasGlobales();
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPrincipalCuentas = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("REGISTROS DE CUENTAS");

        tablaPrincipalCuentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "N° Cuenta", "Típo de Producto", "Saldo Actual", "Estado", "Titular"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaPrincipalCuentas);

        jMenu1.setText("Archivo");

        jMenuItem1.setText("Cerrar sesion");
        jMenuItem1.addActionListener(this::jMenuItem1ActionPerformed);
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Salir del sistema");
        jMenuItem2.addActionListener(this::jMenuItem2ActionPerformed);
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Clientes");

        jMenuItem3.setText("Registrar Cliente");
        jMenuItem3.addActionListener(this::jMenuItem3ActionPerformed);
        jMenu2.add(jMenuItem3);

        jMenuItem4.setText("Buscar Cliente");
        jMenuItem4.addActionListener(this::jMenuItem4ActionPerformed);
        jMenu2.add(jMenuItem4);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Cuentas");

        jMenuItem5.setText("Apertura Cuenta de Ahorro");
        jMenuItem5.addActionListener(this::jMenuItem5ActionPerformed);
        jMenu3.add(jMenuItem5);

        jMenuItem6.setText("Apertura Plan de inversión (CDT)");
        jMenuItem6.addActionListener(this::jMenuItem6ActionPerformed);
        jMenu3.add(jMenuItem6);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Operaciones");

        jMenuItem7.setText("Realizar Transacción");
        jMenuItem7.addActionListener(this::jMenuItem7ActionPerformed);
        jMenu4.add(jMenuItem7);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Reportes");

        jMenuItem9.setText("Ver Historial de Auditoría");
        jMenuItem9.addActionListener(this::jMenuItem9ActionPerformed);
        jMenu5.add(jMenuItem9);

        jMenuItem10.setText("Consultar Movimientos");
        jMenuItem10.addActionListener(this::jMenuItem10ActionPerformed);
        jMenu5.add(jMenuItem10);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 577, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(229, 229, 229)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
    int confirmacion = javax.swing.JOptionPane.showConfirmDialog(this, "¿Está segura/o que desea cerrar sesión?", "Cerrar Sesión", 
            javax.swing.JOptionPane.YES_NO_OPTION);
    
     if (confirmacion== javax.swing.JOptionPane.YES_OPTION)
     {Login ventanaLogin = new Login();
     ventanaLogin.setVisible(true);
     this.dispose();
     
    } 
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
    int valor = JOptionPane.showConfirmDialog(this, "¿Estás segura/o de salir del sistema?", "Terminar", JOptionPane.YES_NO_OPTION);
    
     if (valor== JOptionPane.YES_OPTION)
     {
         JOptionPane.showMessageDialog(null, "Adios, que tenga un buen día.", "Salida", JOptionPane.INFORMATION_MESSAGE);
          System.exit(0);
          
            
    } 
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
    JframeCliente jf = new JframeCliente();
    jf .setVisible(true);
    jf .setLocationRelativeTo(null);
    jf .setTitle("Registrar Clientes"); 
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
    JframeBuscar jb = new JframeBuscar();
    jb .setVisible(true);
    jb .setLocationRelativeTo(null);
    jb .setTitle("Buscar Clientes"); 
      
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
    JframeBuscar buscar = new JframeBuscar();
    buscar.setVisible(true);
    buscar.setLocationRelativeTo(null);
    buscar.setTitle("Seleccione un cliente para apertura");
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
    PlanesInversiones pi = new PlanesInversiones();
    pi .setVisible(true);
    pi .setLocationRelativeTo(null);
    pi .setTitle("Planes de Inversión"); 
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
    Transacciones t = new Transacciones();
    t .setVisible(true);
    t .setLocationRelativeTo(null);
    t .setTitle("Transacciones"); 
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
    HistorialAuditoria ha = new HistorialAuditoria();
    ha .setVisible(true);
    ha .setLocationRelativeTo(null);
    ha .setTitle("Historial de Auditoría"); 
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
    ConsultarMovimientos cm = new ConsultarMovimientos ();
    cm .setVisible(true);
    cm .setLocationRelativeTo(null);
    cm .setTitle("Consultar Movimientos"); 
    
    }//GEN-LAST:event_jMenuItem10ActionPerformed

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
        java.awt.EventQueue.invokeLater(() -> new Menu().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaPrincipalCuentas;
    // End of variables declaration//GEN-END:variables
}
