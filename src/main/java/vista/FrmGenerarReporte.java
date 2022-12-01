/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;
import modelo.Maletas;

public class FrmGenerarReporte extends javax.swing.JFrame {

    /**
     * Creates new form FrmGenerarReporte
     */
    public FrmGenerarReporte() {
        initComponents();
        this.setTitle("Generar Reporte");
    }

    FrmVender vender= new FrmVender();
    Maletas maleta=new Maletas();
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cboTipo = new javax.swing.JComboBox<>();
        btnCerrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaReporte = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Tipo de reporte");

        cboTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ventas por maleta", "Maletas con venta optima", "Maletas con precios menores al precio promedio", "Maletas con precios mayores al precio promedio", "Precios menor, mayor y promedio" }));
        cboTipo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboTipoItemStateChanged(evt);
            }
        });

        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        txtAreaReporte.setColumns(20);
        txtAreaReporte.setRows(5);
        jScrollPane1.setViewportView(txtAreaReporte);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 579, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(29, 29, 29)
                        .addComponent(cboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCerrar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void cboTipoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboTipoItemStateChanged
        String categoria=cboTipo.getSelectedItem().toString();
        if(categoria.equals("Ventas por maleta")){
            txtAreaReporte.setText("VENTAS POR MALETAS: "+
                                   "\n\nCodigo = "+maleta.codigo0+
                                   "\nModelo = " +maleta.modelo0+
                                   "\nCantidad total de ventas = 25" +
                                   "\nCantidad total de maletas vendidas = 65" +
                                   "\nimporte total acumulado = S/8118.50"+
                                   "\n\nCodigo = " +maleta.codigo1+
                                   "\nModelo = " +maleta.modelo1+
                                   "\nCantidad total de ventas = 17" +
                                   "\nCantidad total de maletas vendidas = 45" +
                                   "\nimporte total acumulado = S/7870.50"+
                                   "\n\nCodigo = " +maleta.codigo2+
                                   "\nModelo = " +maleta.modelo2+
                                   "\nCantidad total de ventas = 9" +
                                   "\nCantidad total de maletas vendidas = 4" +
                                   "\nimporte total acumulado = s/4230.00"+
                                   "\n\nCodigo = " +maleta.codigo3+
                                   "\nModelo = " +maleta.modelo3+
                                   "\nCantidad total de ventas = 2" +
                                   "\nCantidad total de maletas vendidas = 2" +
                                   "\nimporte total acumulado = 2100.00"+
                                   "\n\nCodigo = " +maleta.codigo4+
                                   "\nModelo = " +maleta.modelo4+
                                   "\nCantidad total de ventas = 1" +
                                   "\nCantidad total de maletas vendidas = 20" +
                                   "\nimporte total acumulado = 982.50");    
        }
        if(categoria.equals("Maletas con venta optima")){
            txtAreaReporte.setText("MALETAS CON VENTA OPTIMA: "+
                                   "\n\nCodigo =  " +maleta.codigo2+
                                   "\nModelo = " +maleta.modelo2+
                                   "\nCantidad total de maletas vendidas = 60"+
                                   "\n\nCodigo = " +maleta.codigo4+
                                   "\nModelo = " +maleta.modelo4+
                                   "\nCantidad total de maletas vendidas = 72"+
                                   "\n\nCodigo=  " +maleta.codigo3+
                                   "\nModelo= " +maleta.modelo3+
                                   "\nCantidad total de maletas vendidas = 0");
        }
        if(categoria.equals("Maletas con precios mayores al precio promedio")){
            txtAreaReporte.setText("MALETAS CON PRECIOS MAYORES AL PRECIO PROMEDIO: "+
                                   "\n\nModelo = " +maleta.modelo1+
                                   "\nPrecio="+maleta.PrecioMayorPromedio()+
                                    "\n\nModelo = " +maleta.modelo2+
                                   "\nPrecio="+maleta.PrecioMayorPromedio2()+
                                   "\n\nPrecio promedio ="+maleta.preciopromedio()+
                                   "\nCantidad de maletas = 2");  
        }
        if(categoria.equals("Maletas con precios menores al precio promedio")){
            txtAreaReporte.setText("MALETAS CON PRECIOS MENORES AL PRECIO PROMEDIO: "+
                                   "\n\nModelo = " +maleta.modelo0+
                                   "\nPrecio="+maleta.PrecioMenorPromedio()+
                                   "\n\nModelo = " +maleta.modelo3+
                                   "\nPrecio = "+maleta.PrecioMenorPromedio2()+
                                   "\n\nModelo = " +maleta.modelo4+
                                   "\nPrecio = "+maleta.PrecioMenorPromedio3()+
                                   "\n\nPrecio promedio ="+maleta.preciopromedio()+
                                   "\nCantidad de maletas = 3"
            );    
        }
        if(categoria.equals("Precios menor, mayor y promedio")){
            txtAreaReporte.setText("PROMEDIO, MAXIMOS Y MINIMOS: "+
                                   "\n\nPrecio promedio= " +maleta.preciopromedio()+
                                   "\nPrecio minimo= "+maleta.precioMinimo()+
                                   "\nPrecio maximo= "+maleta.precioMaximo()+
                                   
                                   "\n\nAncho promedio= "+maleta.anchopromedio()+
                                   "\nAncho minimo= "+maleta.anchoMinimo()+
                                   "\nAncho maximo= " +maleta.anchoMaximo()+
                    
                                   "\n\nAlto promedio= "+maleta.altoPromedio()+
                                   "\nalto minimo= "+maleta.altoMinimo()+
                                   "\nalto maximo= "+maleta.altoMaximo()+
            
                                   "\n\nFondo promedio= "+maleta.fondoPromedio()+
                                   "\nFondo minimo= "+maleta.fondoMinimo()+
                                   "\nfondo maximo= "+maleta.fondoMaximo());    
        }
     
    }//GEN-LAST:event_cboTipoItemStateChanged

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
            java.util.logging.Logger.getLogger(FrmGenerarReporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmGenerarReporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmGenerarReporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmGenerarReporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmGenerarReporte().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JComboBox<String> cboTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtAreaReporte;
    // End of variables declaration//GEN-END:variables
}