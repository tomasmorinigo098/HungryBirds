
package home.ticket;

import home.carta.Carta;
import home.empleado.Empleado;
import java.awt.*;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import util.FlujoEntradaSalida;

/**
 *
 * @author Pablo Tomás Morinigo <tomasmorinigo098@gmail.com>
 */
public class FrmTicket extends javax.swing.JFrame {
    
    private ArrayList<Carta> cargarCarta = new FlujoEntradaSalida("carta.ddr").getDeserializacion();
    private ArrayList<Empleado> cargarEmpleados = new FlujoEntradaSalida("empleados.ddr").getDeserializacion();
    private String linea = "\n  - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -";
    private String desc;
    private double total, precio, importe;
    private int cant, nro_art;
    private ArrayList<String[]> listado = new ArrayList<>();
    private int cont = new FlujoEntradaSalida("factura.tm").getDeserializacion().size() + 1;

    public FrmTicket() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Hungry Birds - Factura");
        this.getContentPane().setBackground(new java.awt.Color(255, 253, 177));
        this.setIconImage(java.awt.Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/birds.png")));
        this.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE); //cierra la vtn actual
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        etqSubtitulo = new javax.swing.JLabel();
        etqTitulo = new javax.swing.JLabel();
        cmbCarta = new javax.swing.JComboBox<>();
        etqMozo = new javax.swing.JLabel();
        etqCant = new javax.swing.JLabel();
        boxCant = new javax.swing.JTextField();
        btnFacturaNueva = new javax.swing.JButton();
        btnAddArticulo = new javax.swing.JButton();
        btnTotal = new javax.swing.JButton();
        etqCarta = new javax.swing.JLabel();
        cmbMozo = new javax.swing.JComboBox<>();
        btnImprimir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1035, 712));
        setMinimumSize(new java.awt.Dimension(1035, 712));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        this.addFactura();
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 610, 410));

        etqSubtitulo.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        etqSubtitulo.setForeground(new java.awt.Color(0, 0, 0));
        etqSubtitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqSubtitulo.setText("Factura");
        getContentPane().add(etqSubtitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 110, 30));

        etqTitulo.setFont(new java.awt.Font("Corbel Light", 1, 18)); // NOI18N
        etqTitulo.setForeground(new java.awt.Color(0, 0, 0));
        etqTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqTitulo.setText("H U N G R Y  B I R D S®");
        getContentPane().add(etqTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 20, 240, 30));

        this.addCarta();
        getContentPane().add(cmbCarta, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 610, 30));

        etqMozo.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etqMozo.setForeground(new java.awt.Color(0, 0, 0));
        etqMozo.setText("* Seleccione el mozo que efectuó esta factura:");
        getContentPane().add(etqMozo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 220, -1));

        etqCant.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etqCant.setForeground(new java.awt.Color(0, 0, 0));
        etqCant.setText("* Ingrese una cantidad:");
        getContentPane().add(etqCant, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 110, -1));

        boxCant.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        getContentPane().add(boxCant, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 110, 30));

        btnFacturaNueva.setText("Nueva Factura");
        btnFacturaNueva.setEnabled(false);
        btnFacturaNueva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFacturaNuevaActionPerformed(evt);
            }
        });
        getContentPane().add(btnFacturaNueva, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 430, 150, 40));

        btnAddArticulo.setText("Agregar Artículo");
        btnAddArticulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddArticuloActionPerformed(evt);
            }
        });
        getContentPane().add(btnAddArticulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 290, 150, 40));

        btnTotal.setText("Total ($)");
        btnTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTotalActionPerformed(evt);
            }
        });
        getContentPane().add(btnTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 360, 150, 40));

        etqCarta.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etqCarta.setForeground(new java.awt.Color(0, 0, 0));
        etqCarta.setText("* Seleccione un artículo de la carta: ");
        getContentPane().add(etqCarta, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 180, -1));

        this.addMozos();
        getContentPane().add(cmbMozo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 610, 30));

        btnImprimir.setText("Imprimir");
        btnImprimir.setEnabled(false);
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });
        getContentPane().add(btnImprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 500, 150, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void setCont(int cont) {
        this.cont = cont;
    }
    
    private void btnAddArticuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddArticuloActionPerformed
        // TODO add your handling code here:
        try {
            this.nro_art = this.cargarCarta.get(this.cmbCarta.getSelectedIndex()).getNro_art();
            this.desc = this.cargarCarta.get(this.cmbCarta.getSelectedIndex()).getDesc();
            this.cant = Integer.parseInt(this.boxCant.getText());
            this.precio = this.cargarCarta.get(this.cmbCarta.getSelectedIndex()).getPrecio();
            this.importe = this.cant * this.precio;
            this.jTextArea1.append("\n  " + this.nro_art +
                               "\t" + this.desc +
                               "\t\t" + this.cant + "\t\t" + this.precio + "\t\t" + this.importe);
            this.total += this.importe;
            
            this.listado.add(new String[] {String.valueOf(this.nro_art), 
                                           this.desc, 
                                           String.valueOf(this.cant),
                                           String.valueOf(this.precio), 
                                           String.valueOf(this.importe)});
            
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Debe ingresar un número entero en la cantidad.", "Atención", JOptionPane.WARNING_MESSAGE);
        }    
        
    }//GEN-LAST:event_btnAddArticuloActionPerformed

    private void btnTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTotalActionPerformed
        // TODO add your handling code here:
        this.jTextArea1.append(this.linea);
        
        String fecha_hora = DateTimeFormatter.ofPattern("MMM dd yyyy, hh:mm:ss a").format(java.time.LocalDateTime.now());
        this.jTextArea1.append("\n\n\t\t\tFECHA y HORA: " + fecha_hora);
        
        String m = (String) this.cmbMozo.getSelectedItem();
        String mozo[] = m.split(" - ");
        this.jTextArea1.append("\n\n\t\t\tATENDIDO POR: " + mozo[1]);
        
        this.jTextArea1.append("\n\n\t\t\tTOTAL: $" + this.total);
        this.btnAddArticulo.setEnabled(false);
        this.btnTotal.setEnabled(false);
        this.btnFacturaNueva.setEnabled(true);
        this.btnImprimir.setEnabled(true);
        
        //acumular el total de cada factura para calcular la recaudación
        Factura f = new Factura();
        ArrayList<Factura> lista = new FlujoEntradaSalida("factura.tm").getDeserializacion();
        if (lista.isEmpty()) {
            f.setNro_factura(1);
            this.setCont(2); //siguiente id
        } else {
            int ultimo = lista.size() + 1;
            f.setNro_factura(ultimo);
            this.setCont(ultimo + 1); //id siguiente
        }
        f.setMozo(mozo[1]);
        f.setImporte(this.total);
        f.setFecha_hora(fecha_hora);
        f.setListado(this.listado);
        
        FlujoEntradaSalida es = new FlujoEntradaSalida("factura.tm");
        es.abrirOutputStrem();
        es.setSerializarObjeto(f);
        es.cerrarOutputStream();
       
    }//GEN-LAST:event_btnTotalActionPerformed

    private void btnFacturaNuevaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFacturaNuevaActionPerformed

        this.nro_art = 0;
        this.desc = null;
        this.cant = 0;
        this.precio = 0;
        this.importe = 0;
        this.total = 0;
        this.listado.clear();
        
        this.boxCant.setText(null);
        this.jTextArea1.setText(null);
        this.cmbCarta.setSelectedIndex(0);
        this.jTextArea1.append("\n  N° FACTURA: " + cont);
        this.jTextArea1.append("\n\t\t\t\tH U N G R Y  B I R D S" + this.linea);
        this.jTextArea1.append("\n  ART.  DESCRIPCIÓN\t\t\tCANTIDAD\tPRECIO($)\tIMPORTE($)" + this.linea);
        this.boxCant.requestFocus();
        this.btnAddArticulo.setEnabled(true);
        this.btnTotal.setEnabled(true);
        this.btnFacturaNueva.setEnabled(false);
        this.btnImprimir.setEnabled(false);
        
    }//GEN-LAST:event_btnFacturaNuevaActionPerformed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed

        PrintJob print = Toolkit.getDefaultToolkit().getPrintJob(this, "Imprimir", null);
        Graphics g = print.getGraphics();
        
        if (g != null) {
            this.jTextArea1.printAll(g);
        }
      
        g.dispose();
        print.end();
        
    }//GEN-LAST:event_btnImprimirActionPerformed

    private void addFactura() {
        this.jTextArea1.setEditable(false);
        this.jTextArea1.setFocusable(false);
        this.jTextArea1.append("\n  N° FACTURA: " + cont);
        this.jTextArea1.append("\n\t\t\t\tH U N G R Y  B I R D S" + this.linea);
        this.jTextArea1.append("\n  ART.  DESCRIPCIÓN\t\t\tCANTIDAD\tPRECIO($)\tIMPORTE($)" + this.linea);
        
    }
    
    private void addCarta() {
        for (int i = 0; i < this.cargarCarta.size(); i++) {
            if (this.cargarCarta.get(i) != null) {
                this.cmbCarta.addItem(this.cargarCarta.get(i).toString());
            }
        }
    }
    
    private void addMozos() {
        for (int i = 0; i < this.cargarEmpleados.size(); i++) {
            if (this.cargarEmpleados.get(i).getCargo().equalsIgnoreCase("Mozo")) {
                this.cmbMozo.addItem("DNI: " + this.cargarEmpleados.get(i).getDni() + " - " + this.cargarEmpleados.get(i).getApeNom());
            }
        }
    }
    
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            System.out.println(ex.getMessage());
        }
        
        new FrmTicket().setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField boxCant;
    private javax.swing.JButton btnAddArticulo;
    private javax.swing.JButton btnFacturaNueva;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnTotal;
    private javax.swing.JComboBox<String> cmbCarta;
    private javax.swing.JComboBox<String> cmbMozo;
    private javax.swing.JLabel etqCant;
    private javax.swing.JLabel etqCarta;
    private javax.swing.JLabel etqMozo;
    private javax.swing.JLabel etqSubtitulo;
    private javax.swing.JLabel etqTitulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
