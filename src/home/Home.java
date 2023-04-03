
package home;

import java.awt.Color;

/**
 *
 * @author Pablo Tomás Morinigo <tomasmorinigo098@gmail.com>
 */
public class Home extends javax.swing.JFrame {

    public Home() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Hungry Birds - Home");
        this.getContentPane().setBackground(new java.awt.Color(255, 253, 177));
        this.setIconImage(java.awt.Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/birds.png")));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        enlaceEmpleado = new javax.swing.JLabel();
        enlaceCarta = new javax.swing.JLabel();
        enlaceRecaudacion = new javax.swing.JLabel();
        enlaceFactura = new javax.swing.JLabel();
        enlaceEstadistica = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1035, 712));
        setMinimumSize(new java.awt.Dimension(1035, 712));
        setPreferredSize(new java.awt.Dimension(1035, 712));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/birds.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 30, 128, 128));

        jLabel2.setFont(new java.awt.Font("Corbel Light", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("H U N G R Y  B I R D S®");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, 410, 50));

        enlaceEmpleado.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        enlaceEmpleado.setForeground(new java.awt.Color(0, 0, 0));
        enlaceEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mozo.png"))); // NOI18N
        enlaceEmpleado.setText("  agregue, borre o modifique un empleado");
        enlaceEmpleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                enlaceEmpleadoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                enlaceEmpleadoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                enlaceEmpleadoMouseExited(evt);
            }
        });
        getContentPane().add(enlaceEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 310, 330, 64));

        enlaceCarta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        enlaceCarta.setForeground(new java.awt.Color(0, 0, 0));
        enlaceCarta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/carta.png"))); // NOI18N
        enlaceCarta.setText(" agregue, borre o modifique la carta");
        enlaceCarta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                enlaceCartaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                enlaceCartaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                enlaceCartaMouseExited(evt);
            }
        });
        getContentPane().add(enlaceCarta, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 390, 300, 64));

        enlaceRecaudacion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        enlaceRecaudacion.setForeground(new java.awt.Color(0, 0, 0));
        enlaceRecaudacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/recaudacion.png"))); // NOI18N
        enlaceRecaudacion.setText(" reconozca la recaudación");
        enlaceRecaudacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                enlaceRecaudacionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                enlaceRecaudacionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                enlaceRecaudacionMouseExited(evt);
            }
        });
        getContentPane().add(enlaceRecaudacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 380, 230, 64));

        enlaceFactura.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        enlaceFactura.setForeground(new java.awt.Color(0, 0, 0));
        enlaceFactura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ticket.png"))); // NOI18N
        enlaceFactura.setText("genere la factura");
        enlaceFactura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                enlaceFacturaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                enlaceFacturaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                enlaceFacturaMouseExited(evt);
            }
        });
        getContentPane().add(enlaceFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 480, 190, -1));

        enlaceEstadistica.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        enlaceEstadistica.setForeground(new java.awt.Color(0, 0, 0));
        enlaceEstadistica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/grafico.png"))); // NOI18N
        enlaceEstadistica.setText("    estadística del consumo de bebidas");
        enlaceEstadistica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                enlaceEstadisticaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                enlaceEstadisticaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                enlaceEstadisticaMouseExited(evt);
            }
        });
        getContentPane().add(enlaceEstadistica, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 480, 330, 64));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void enlaceEmpleadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enlaceEmpleadoMouseClicked
        if (evt.getClickCount() == 1) { new home.empleado.FrmEmpleado().setVisible(true); }
    }//GEN-LAST:event_enlaceEmpleadoMouseClicked

    private void enlaceCartaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enlaceCartaMouseClicked
        if (evt.getClickCount() == 1) { new home.carta.FrmCarta().setVisible(true); }
    }//GEN-LAST:event_enlaceCartaMouseClicked

    private void enlaceFacturaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enlaceFacturaMouseClicked
        if (evt.getClickCount() == 1) { new home.ticket.FrmTicket().setVisible(true); }
    }//GEN-LAST:event_enlaceFacturaMouseClicked

    private void enlaceRecaudacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enlaceRecaudacionMouseClicked
        if (evt.getClickCount() == 1) { new home.recaudacion.FrmRecaudacion().setVisible(true); }
    }//GEN-LAST:event_enlaceRecaudacionMouseClicked

    private void enlaceEmpleadoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enlaceEmpleadoMouseEntered
        this.enlaceEmpleado.setOpaque(true);
        this.enlaceEmpleado.setBackground(Color.white);
    }//GEN-LAST:event_enlaceEmpleadoMouseEntered

    private void enlaceEmpleadoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enlaceEmpleadoMouseExited
        this.enlaceEmpleado.setOpaque(true);
        this.enlaceEmpleado.setBackground(new java.awt.Color(255, 253, 177));
    }//GEN-LAST:event_enlaceEmpleadoMouseExited

    private void enlaceCartaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enlaceCartaMouseEntered
        this.enlaceCarta.setOpaque(true);
        this.enlaceCarta.setBackground(Color.white);
    }//GEN-LAST:event_enlaceCartaMouseEntered

    private void enlaceCartaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enlaceCartaMouseExited
        this.enlaceCarta.setOpaque(true);
        this.enlaceCarta.setBackground(new java.awt.Color(255, 253, 177));
    }//GEN-LAST:event_enlaceCartaMouseExited

    private void enlaceRecaudacionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enlaceRecaudacionMouseEntered
        this.enlaceRecaudacion.setOpaque(true);
        this.enlaceRecaudacion.setBackground(Color.white);
    }//GEN-LAST:event_enlaceRecaudacionMouseEntered

    private void enlaceRecaudacionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enlaceRecaudacionMouseExited
        this.enlaceRecaudacion.setOpaque(true);
        this.enlaceRecaudacion.setBackground(new java.awt.Color(255, 253, 177));
    }//GEN-LAST:event_enlaceRecaudacionMouseExited

    private void enlaceFacturaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enlaceFacturaMouseEntered
        this.enlaceFactura.setOpaque(true);
        this.enlaceFactura.setBackground(Color.white);
    }//GEN-LAST:event_enlaceFacturaMouseEntered

    private void enlaceFacturaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enlaceFacturaMouseExited
        this.enlaceFactura.setOpaque(true);
        this.enlaceFactura.setBackground(new java.awt.Color(255, 253, 177));
    }//GEN-LAST:event_enlaceFacturaMouseExited

    private void enlaceEstadisticaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enlaceEstadisticaMouseClicked
        if (evt.getClickCount() == 1) { new FrmEstadistica().setVisible(true); }
    }//GEN-LAST:event_enlaceEstadisticaMouseClicked

    private void enlaceEstadisticaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enlaceEstadisticaMouseEntered
        this.enlaceEstadistica.setOpaque(true);
        this.enlaceEstadistica.setBackground(Color.white);
    }//GEN-LAST:event_enlaceEstadisticaMouseEntered

    private void enlaceEstadisticaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enlaceEstadisticaMouseExited
        this.enlaceEstadistica.setOpaque(true);
        this.enlaceEstadistica.setBackground(new java.awt.Color(255, 253, 177));
    }//GEN-LAST:event_enlaceEstadisticaMouseExited

    /**
     * @param args the command line arguments
     */
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

        new Home().setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel enlaceCarta;
    private javax.swing.JLabel enlaceEmpleado;
    private javax.swing.JLabel enlaceEstadistica;
    private javax.swing.JLabel enlaceFactura;
    private javax.swing.JLabel enlaceRecaudacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
