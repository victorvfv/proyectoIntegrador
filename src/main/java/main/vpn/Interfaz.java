/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main.vpn;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import main.componentestpv.producto;

/**
 *
 * @author victo
 */
public class Interfaz extends javax.swing.JFrame {

    DefaultTableModel model,modelSK;
    private int ventanaAdmin=2;
    private int  lastSelectedIndex=0;
    private boolean admin=true;
    public  producto db;
    
    public Interfaz() {
        db= new producto();
        initComponents();
        model=(DefaultTableModel) jTabla.getModel();
        modelSK=(DefaultTableModel) jTablaStock.getModel();
        model.setRowCount(0);
        jTotal.setText("0.00€");
        setTabla();
        
    }
    
    public void setTabla(){
        modelSK.setRowCount(0);
        for(Object obj:db.getProductos()){
            modelSK.addRow((Object[]) obj);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTPestañas = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jBacceso = new javax.swing.JButton();
        inicioSesion = new main.componentestpv.InicioSesion();
        jPanel1 = new javax.swing.JPanel();
        jTNombre = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabla = new javax.swing.JTable();
        jBAñadir = new javax.swing.JButton();
        jBNuevo = new javax.swing.JButton();
        jBLimpiar = new javax.swing.JButton();
        jBCompra = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextprod = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTotal = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTablaStock = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                cierre(evt);
            }
        });

        jTPestañas.setEnabled(false);
        jTPestañas.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jTPestañasStateChanged(evt);
            }
        });

        jBacceso.setText("Acceder");
        jBacceso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBaccesoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(jBacceso))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(inicioSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(178, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(inicioSesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBacceso)
                .addContainerGap(250, Short.MAX_VALUE))
        );

        jTPestañas.addTab("Login", jPanel2);

        jTNombre.setEnabled(false);

        jTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Producto", "Cantidad", "Precio"
            }
        ));
        jScrollPane1.setViewportView(jTabla);

        jBAñadir.setText("+");
        jBAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAñadirActionPerformed(evt);
            }
        });

        jBNuevo.setText("Nuevo");
        jBNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNuevoActionPerformed(evt);
            }
        });

        jBLimpiar.setText("Limpiar");
        jBLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpiarActionPerformed(evt);
            }
        });

        jBCompra.setText("Comprar");
        jBCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCompraActionPerformed(evt);
            }
        });

        jLabel1.setText("Nº Prods");

        jTextprod.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTextprod.setText("0");
        jTextprod.setEnabled(false);

        jLabel2.setText("total");

        jTotal.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTotal.setText("1");
        jTotal.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBAñadir, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jBCompra, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBLimpiar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBNuevo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextprod, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jBNuevo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBLimpiar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBCompra)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextprod, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 196, Short.MAX_VALUE)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBAñadir)
                    .addComponent(jTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        jTPestañas.addTab("Caja", jPanel1);

        jTablaStock.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID Prod", "nombre", "precio", "stock","iva"
            }
        ));
        jTablaStock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablaStockMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTablaStock);

        jButton1.setText("Añadir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 475, Short.MAX_VALUE)
            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1))
        );

        jTPestañas.addTab("Stock", jPanel3);

        jMenu.setText("Opciones");

        jMenuItem3.setText("Nuevo cliente");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu.add(jMenuItem3);

        jMenuItem2.setText("Cargar");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu.add(jMenuItem2);

        jMenuItem1.setText("Guardar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu.add(jMenuItem1);

        jMenuItem4.setText("Ayuda");
        jMenu.add(jMenuItem4);

        jMenuItem5.setText("Salir");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu.add(jMenuItem5);

        jMenuBar1.add(jMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTPestañas, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jTPestañas)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        try {
            BufferedWriter fichero = new BufferedWriter(new FileWriter("data.csv"));
        for(int i=0;i<jTabla.getRowCount();i++){
           String linea=jTabla.getValueAt(i,0)+","+jTabla.getValueAt(i,1)+","+jTabla.getValueAt(i,2);
        fichero.write(linea);
	fichero.newLine();
       }
       fichero.close();
       } catch (IOException ex) {
           Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
       }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
       JDSelector slect= new JDSelector(this,true);
       slect.setVisible(true);
       File file= slect.getFile();
       if(file!=null){
           try {
               cargarBD(file);
           } catch (IOException ex) {
               Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
       slect.dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void cargarBD(File file) throws IOException {
        model.setRowCount(0);
        try {
            BufferedReader linea = new BufferedReader(new FileReader(file));
            String lectura;
            while ((lectura = linea.readLine()) != null) {
                String[] datos= lectura.split(",");
                if(datos.length==3){
                model.addRow(new Object[]{datos[0],datos[1],datos[2]});
                setTotal();
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
       nuevoCLiente();
    }//GEN-LAST:event_jMenuItem3ActionPerformed


    private void cierre(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_cierre
        db.close();
    }//GEN-LAST:event_cierre

    private void jTPestañasStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jTPestañasStateChanged
        if (jTPestañas.getSelectedIndex() == ventanaAdmin && !admin) {
            jTPestañas.setSelectedIndex(lastSelectedIndex);
            JOptionPane.showMessageDialog(null,
                "Necesitas ser administrador para acceser a esta pestaña",
                "Acceso Denegado",
                JOptionPane.WARNING_MESSAGE);
        } else {
            // Actualizar la pestaña seleccionada
            lastSelectedIndex = jTPestañas.getSelectedIndex();
        }
    }//GEN-LAST:event_jTPestañasStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JDAñadirProd jda= new JDAñadirProd(this,true);
        jda.setVisible(true);
        setTabla();
        jda.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTablaStockMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablaStockMouseClicked
        int index= jTablaStock.getSelectedRow();
        JDUpdate jdu=new JDUpdate(this,true);
        jdu.setValores(jTablaStock.getValueAt(index, 0).toString(), jTablaStock.getValueAt(index, 1).toString(), jTablaStock.getValueAt(index, 2).toString(), jTablaStock.getValueAt(index, 3).toString(),jTablaStock.getValueAt(index, 4).toString());
        jdu.setVisible(true);
        jdu.dispose();
        setTabla();
    }//GEN-LAST:event_jTablaStockMouseClicked

    private void jBCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCompraActionPerformed
        for(int i=0;i<jTabla.getRowCount();i++){
            int id = Integer.parseInt(jTabla.getValueAt(i,0).toString().split(". ")[0]);
            int cantidad = Integer.parseInt(jTabla.getValueAt(i,1).toString());
            db.setStock(id);
            if(cantidad<=db.getStock()){
                db.comprarProducto(id, cantidad);}
            else{
                JOptionPane.showMessageDialog(null,
                "El producto "+jTabla.getValueAt(i,0).toString() + " no se pudo comprar debido a que el stock actual es de: " + db.getStock() + " y has intentado comprar "+jTabla.getValueAt(i,1).toString(),
                "Lo sentimos la compra no ha podido realizarse",
                JOptionPane.ERROR_MESSAGE);
            }
        }
        limpiar();
        setTabla();
    }//GEN-LAST:event_jBCompraActionPerformed

    private void jBLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_jBLimpiarActionPerformed

    private void jBNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNuevoActionPerformed
        nuevoCLiente();
    }//GEN-LAST:event_jBNuevoActionPerformed

    //
    private void jBAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAñadirActionPerformed
        JDproducto jdprod = new JDproducto(this,true);
        jdprod.setProductos();
        jdprod.setVisible(true);
        if(jdprod.aceptado()){
            model.addRow(new Object[]{jdprod.getProducto(),jdprod.getCantidad(),jdprod.getPrecio()});
            setTotal();
        }
        jdprod.dispose();
    }//GEN-LAST:event_jBAñadirActionPerformed

    private void jBaccesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBaccesoActionPerformed
        if(inicioSesion.esValida(inicioSesion.getContraseña())){
            jTPestañas.setEnabled(true);
            admin=inicioSesion.getAdmin(inicioSesion.getContraseña());
        }
        else{
            JOptionPane.showMessageDialog(null,
                "Contraseña incorrecta",
                "Acceso Denegado",
                JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jBaccesoActionPerformed
    
    private void setTotal() {
        float total=0;
        for(int i=0; i<jTabla.getRowCount();i++){
            float cantidad = Float.parseFloat(jTabla.getValueAt(i, 1).toString());
            float precio = Float.parseFloat(jTabla.getValueAt(i, 2).toString().replace("€", ""));
            total=total+(cantidad*precio); 
        }
        String stotal = String.format("%.2f", total);
        jTotal.setText(""+stotal+"€");
        jTextprod.setText(""+jTabla.getRowCount());
    }
    
    private void nuevoCLiente() {
       JDNuevo jdnuevo = new JDNuevo(this,true);
       jdnuevo.setVisible(true);
       jTNombre.setText(jdnuevo.getNombre() + " " + jdnuevo.getApellido());
       jdnuevo.dispose();
    }
    
    private void limpiar() {
        jTNombre.setText("");
        jTextprod.setText("0");
        model.setRowCount(0);
        jTotal.setText("0.00€");
    }
    
    /**
     * @param args the command line arguments 
     */

    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private main.componentestpv.InicioSesion inicioSesion;
    private javax.swing.JButton jBAñadir;
    private javax.swing.JButton jBCompra;
    private javax.swing.JButton jBLimpiar;
    private javax.swing.JButton jBNuevo;
    private javax.swing.JButton jBacceso;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTNombre;
    private javax.swing.JTabbedPane jTPestañas;
    private javax.swing.JTable jTabla;
    private javax.swing.JTable jTablaStock;
    private javax.swing.JTextField jTextprod;
    private javax.swing.JTextField jTotal;
    // End of variables declaration//GEN-END:variables

    

    
  
}
