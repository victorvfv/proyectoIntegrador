/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package main.vpn;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Formatter;
import main.componentestpv.producto;





public class JDproducto extends javax.swing.JDialog {

    private String[] productos;
    public Boolean aceptado;
    private static producto db;
    private int stock=3;
    private int iva=0;
    
    public JDproducto(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        aceptado=false;
        db=new producto();
        productos=db.getDescripcionProductos();
        initComponents();
        jScantidad.setValue(1);
        stockIva(1);
        
    }
    
    public void stockIva(int id){
        db.setStock(id);
        db.setIva(id);
        stock=db.getStock();
        iva=db.getIva();
        jTiva.setText(iva+"%");
        jTstock.setText(stock+"");
        MaxMin(); 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScantidad = new javax.swing.JSpinner();
        jBaceptar = new javax.swing.JButton();
        jBcancelar = new javax.swing.JButton();
        jCBproductos = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jTstock = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTiva = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTprecioIva = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Nº Productos");

        jScantidad.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jScantidadStateChanged(evt);
            }
        });

        jBaceptar.setText("Aceptar");
        jBaceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBaceptarActionPerformed(evt);
            }
        });

        jBcancelar.setText("Cancelar");
        jBcancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBcancelarActionPerformed(evt);
            }
        });

        jCBproductos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {  }));
        jCBproductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBproductosActionPerformed(evt);
            }
        });

        jLabel2.setText("Stock");

        jTstock.setEnabled(false);

        jLabel3.setText("IVA");

        jTiva.setEnabled(false);

        jLabel4.setText("precio unitario + iva");

        jTprecioIva.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jCBproductos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 22, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(166, 166, 166))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBaceptar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBcancelar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(jTstock, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTiva, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTprecioIva, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTstock, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTprecioIva, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jCBproductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBcancelar)
                    .addComponent(jBaceptar)
                    .addComponent(jScantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTiva, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jScantidadStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jScantidadStateChanged
        MaxMin();
    }//GEN-LAST:event_jScantidadStateChanged

    private void jBaceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBaceptarActionPerformed
    aceptado=true;
    db.close();
    this.setVisible(false);
    }//GEN-LAST:event_jBaceptarActionPerformed

    private void jBcancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBcancelarActionPerformed
        db.close();
        this.setVisible(false);
    }//GEN-LAST:event_jBcancelarActionPerformed

    private void jCBproductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBproductosActionPerformed
        int id =Integer.parseInt(jCBproductos.getItemAt(jCBproductos.getSelectedIndex()).split(":")[0].split(". ")[0]);
        
        stockIva(id);
        setPrecioIva();
    }//GEN-LAST:event_jCBproductosActionPerformed
    
    private void MaxMin(){
        if(((int)jScantidad.getValue())<1){
            jScantidad.setValue(1);
        }
        else if(((int)jScantidad.getValue())>stock){
            jScantidad.setValue(db.getStock());
        }
    }
    
    private void setPrecioIva(){
        float precioUnitario=Float.parseFloat(jCBproductos.getItemAt(jCBproductos.getSelectedIndex()).split(":")[1].replace("€","").trim());
        float importe=precioUnitario*((float)iva/100);
        float masIva= precioUnitario+(importe);
        BigDecimal bd = new BigDecimal(Float.toString(masIva));
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        jTprecioIva.setText(bd+"€");
    }
    
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
            java.util.logging.Logger.getLogger(JDproducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDproducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDproducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDproducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDproducto dialog = new JDproducto(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        db.close();
                        System.exit(0);
                        
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    
    public void setProductos(){
        
        for (String key : productos){
            jCBproductos.addItem(key);
        }  
    }
    
    public String getProducto(){
        String salida=jCBproductos.getItemAt(jCBproductos.getSelectedIndex()).split(":")[0];
        return salida;
    }
    
    public String getPrecio(){
        String salida=jTprecioIva.getText().toString();
        return salida.trim();
    }
    
    public String getCantidad(){
        return jScantidad.getValue().toString();
    }
    
    
    public boolean aceptado(){
        return aceptado;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBaceptar;
    private javax.swing.JButton jBcancelar;
    private javax.swing.JComboBox<String> jCBproductos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSpinner jScantidad;
    private javax.swing.JTextField jTiva;
    private javax.swing.JTextField jTprecioIva;
    private javax.swing.JTextField jTstock;
    // End of variables declaration//GEN-END:variables
}
