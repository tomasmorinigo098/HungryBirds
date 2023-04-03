
package home.recaudacion;

import home.ticket.Factura;
import java.util.ArrayList;
import util.FlujoEntradaSalida;

/**
 *
 * @author Pablo Tomás Morinigo <tomasmorinigo098@gmail.com>
 */
public class Ticket extends javax.swing.JFrame {
    
    private String linea = "\n  - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -";  
    private ArrayList<Factura> facturas = new FlujoEntradaSalida("factura.tm").getDeserializacion();

    public Ticket() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Hungry Birds - Ticket");
        this.setIconImage(java.awt.Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/birds.png")));
        this.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE); //cierra la vtn actual
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(619, 448));
        setMinimumSize(new java.awt.Dimension(619, 448));
        setPreferredSize(new java.awt.Dimension(619, 448));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        //this.addTexto();
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextArea1.setEditable(false);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void addListado(int filaSeleccionada, int nro_art, String fecha_hora, String mozo, double total) {
        
        this.jTextArea1.append("\n  N° FACTURA: " + nro_art);
        this.jTextArea1.append("\n\t\t\t\tH U N G R Y  B I R D S" + this.linea);
        this.jTextArea1.append("\n  ART.  DESCRIPCIÓN\t\t\tCANTIDAD\tPRECIO($)\tIMPORTE($)" + this.linea);
        
        int i = filaSeleccionada;
        
        for (int j = 0; j < this.facturas.get(i).getListado().size(); j++) {
            if (this.facturas.get(i).getListado() != null) {
                this.jTextArea1.append("\n  " + this.facturas.get(i).getElemento(j, 0) +
                                       "\t" +  this.facturas.get(i).getElemento(j, 1) +
                                       "\t\t" + this.facturas.get(i).getElemento(j, 2) + 
                                       "\t\t" + this.facturas.get(i).getElemento(j, 3) + 
                                       "\t\t" + this.facturas.get(i).getElemento(j, 4));
            }
            
        }

        this.jTextArea1.append("\n\n\t\t\tFECHA y HORA: " + fecha_hora);
        this.jTextArea1.append("\n\n\t\t\tATENDIDO POR: " + mozo);
        this.jTextArea1.append("\n\n\t\t\tTOTAL: $" + total);
        
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

        new Ticket().setVisible(true);
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
