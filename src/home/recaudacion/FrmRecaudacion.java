
package home.recaudacion;

import home.ticket.Factura;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import util.FlujoEntradaSalida;

/**
 *
 * @author Pablo Tomás Morinigo <tomasmorinigo098@gmail.com>
 */
public class FrmRecaudacion extends javax.swing.JFrame {
    
    private DefaultTableModel model;
    private ArrayList<Factura> facturas = new FlujoEntradaSalida("factura.tm").getDeserializacion();

    public FrmRecaudacion() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Hungry Birds - Recaudación");
        this.getContentPane().setBackground(new java.awt.Color(255, 253, 177));
        this.setIconImage(java.awt.Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/birds.png")));
        this.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE); //cierra la vtn actual
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        etqSubtitulo = new javax.swing.JLabel();
        etqTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable() {
            public boolean isCellEditable(int rowIndex, int colIndex) {
                return false;
            }
        };
        etqRecaudacion = new javax.swing.JLabel();
        etqVerRegistro = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1035, 712));
        setMinimumSize(new java.awt.Dimension(1035, 712));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        etqSubtitulo.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        etqSubtitulo.setForeground(new java.awt.Color(0, 0, 0));
        etqSubtitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqSubtitulo.setText("Recaudación");
        getContentPane().add(etqSubtitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 110, 30));

        etqTitulo.setFont(new java.awt.Font("Corbel Light", 1, 18)); // NOI18N
        etqTitulo.setForeground(new java.awt.Color(0, 0, 0));
        etqTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqTitulo.setText("H U N G R Y  B I R D S®");
        getContentPane().add(etqTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 20, 240, 30));

        jTable1.setModel(new javax.swing.table.DefaultTableModel());
        jTable1.setFocusable(false);
        jTable1.setGridColor(new java.awt.Color(204, 204, 204));
        jTable1.setRowHeight(45);
        jTable1.setSelectionBackground(new java.awt.Color(255, 253, 177));
        jTable1.setSelectionForeground(new java.awt.Color(51, 51, 51));
        jTable1.setShowHorizontalLines(false);
        jTable1.setShowVerticalLines(false);
        this.crearTableModel();
        this.addFacturas(facturas);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        jTable1.setIntercellSpacing(new java.awt.Dimension(0, 0));

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 102, 730, 440));

        this.addTotalRecaudado(this.facturas);
        etqRecaudacion.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        etqRecaudacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(etqRecaudacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 570, 720, 40));

        etqVerRegistro.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etqVerRegistro.setForeground(new java.awt.Color(0, 0, 0));
        etqVerRegistro.setText("* Haga click en un registro para reconocer la factura emitida en ese día ");
        getContentPane().add(etqVerRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 460, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        
        if (evt.getClickCount() == 2) { //dandole doble click en cualquier columna
            
            int nro_art = (int) this.model.getValueAt(this.jTable1.getSelectedRow(), 0);
            int pos = nro_art - 1;
            String mozo = String.valueOf(this.model.getValueAt(this.jTable1.getSelectedRow(), 1));
            double total = (double) this.model.getValueAt(this.jTable1.getSelectedRow(), 2);
            String fecha_hora = String.valueOf(this.model.getValueAt(this.jTable1.getSelectedRow(), 3));
            
            Ticket t = new Ticket();          
            t.addListado(pos, nro_art, fecha_hora, mozo, total);                        
            t.setVisible(true); //se abre la ventana ticket
            
        }
    }//GEN-LAST:event_jTable1MouseClicked
    
    private void crearTableModel() {
        Object[][] datos = new Object[][] {};
        String[] nombreColumnas = new String[]{"N° Factura", "Atendido Por", "Importe de la factura ($)", "Fecha y Hora"};
        this.model =  new DefaultTableModel(datos, nombreColumnas);
        this.jTable1.setModel(model);
    }
    
    private void addFacturas(ArrayList<Factura> facturas) {
        Object[] fila = new Object[model.getColumnCount()]; //getColumnCount = cantidad de columnas
        for (int i = 0; i < facturas.size(); i++) {
            fila[0] = facturas.get(i).getNro_factura();
            fila[1] = facturas.get(i).getMozo();
            fila[2] = facturas.get(i).getImporte();
            fila[3] = facturas.get(i).getFecha_hora();
            model.addRow(fila); //lo añade en la ultima fila de la tabla
        }
    }
    
    private void addTotalRecaudado(ArrayList<Factura> facturas) {      
        double total = 0;
        for (int i = 0; i < facturas.size(); i++) {
            if (facturas.get(i) != null) {
                total += this.facturas.get(i).getImporte();
            }
        }
        this.etqRecaudacion.setText("Monto total recaudado: $" + total);
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
        
        new FrmRecaudacion().setVisible(true);
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel etqRecaudacion;
    private javax.swing.JLabel etqSubtitulo;
    private javax.swing.JLabel etqTitulo;
    private javax.swing.JLabel etqVerRegistro;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
