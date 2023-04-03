
package home;

import home.ticket.Factura;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.ArrayList;
import util.FlujoEntradaSalida;

/**
 *
 * @author Pablo Tomás Morinigo <tomasmorinigo098@gmail.com>
 */
public class FrmEstadistica extends javax.swing.JFrame {
    
    /*inicializamos un arraylist de tipo <Factura> obteniendo los objetos previamente almacenados en el fichero serializado*/
    private ArrayList<Factura> facturas = new FlujoEntradaSalida("factura.tm").getDeserializacion();
    private int cerveza, gaseosa, aguaMin, aguaSab; 

    public FrmEstadistica() {
        initComponents();
        this.addGrafico();
        this.setLocationRelativeTo(null);
        this.setTitle("Hungry Birds - Gráfico del consumo de bebidas");
        this.getContentPane().setBackground(new java.awt.Color(255, 253, 177));
        this.setIconImage(java.awt.Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/birds.png")));
        this.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1035, 712));
        setMinimumSize(new java.awt.Dimension(1035, 712));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Consumo de bebidas");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, 390, 50));

        jLabel2.setFont(new java.awt.Font("Corbel Light", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("H U N G R Y  B I R D S®");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 20, 240, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * creamos un método retorna el total de bebidas
     * @param facturas
     * @param tipo
     * @return 
     */
    private int cantidadBebidas(ArrayList<Factura> facturas, String tipo) {
        int acum = 0;
        for (int i = 0; i < facturas.size(); i++) { //recorremos el array de objetos <Factura>
            if (facturas.get(i) != null) {
                //recorremos el arraylist de strings[] (en donde se almacena la lista con los articulos de la carta)
                for (int j = 0; j < facturas.get(i).getListado().size(); j++) {
                    if (facturas.get(i).getListado() != null) {
                        /*si un elemento en la posicion 1 (en donde se guardan la descripcion del articulo de la carta)
                        contiene en su string un tipo de bebida entonces...*/
                        if (String.valueOf(facturas.get(i).getElemento(j, 1)).contains(tipo)) {
                            //...acumulamos su cantidad (posicion 2)
                            acum += Integer.parseInt(String.valueOf(facturas.get(i).getElemento(j, 2)));
                        }
                    }
                }
            }
        }
        return acum;
    }
    
    private void addGrafico() {       
        this.cerveza = this.cantidadBebidas(this.facturas, "Cerv."); //cantidad de cervezas
        this.gaseosa = this.cantidadBebidas(this.facturas, "Gaseosa"); //cantidad de gaseosas
        this.aguaMin = this.cantidadBebidas(this.facturas, "Agua"); //cantidad de aguas minerales
        this.aguaSab = this.cantidadBebidas(this.facturas, "Levité"); //cantidad de aguas saborizadas
        
        this.repaint(); //iniciamos el metodo para graficar
    }
    
    private double porcentaje(int cantBeb, int totalBeb) {
        double porcentaje = (cantBeb * 100) / totalBeb;
        return porcentaje;
    }
    
    @Override
    public void paint(Graphics g) {
        
        super.paint(g);
        
        //calculamos el total de bebidas
        int totalBebidas = this.cerveza + this.gaseosa + this.aguaMin + this.aguaSab;
        
        //calculamos los grados a dibujar en el grafico torta
        int gradosCerv = (this.cerveza * 360) / totalBebidas;
        int gradosGas = (this.gaseosa * 360) / totalBebidas;
        int gradosAguaMin = (this.aguaMin * 360) / totalBebidas;
        int gradosAguaSab = (this.aguaSab * 360) / totalBebidas;
        
        //calculamos el porcentaje de cada bebida
        double porCerv = this.porcentaje(this.cerveza, totalBebidas);
        double porGas = this.porcentaje(this.gaseosa, totalBebidas);
        double porAguaMin = this.porcentaje(this.aguaMin, totalBebidas);
        double porAguaSab = this.porcentaje(this.aguaSab, totalBebidas);
        
        g.setFont(new Font("Dialog", Font.PLAIN, 13));
        
        //dibujamos la porcion en el grafico para cada bebida
        g.setColor(new Color(50, 35, 0)); //color cerveza
        g.fillArc(150, 225, 400, 400, 0, gradosCerv); //dibuja un circulo
        g.fillRect(650, 355, 20, 20); //dibuja un rectangulo
        g.drawString("Cervezas: " + porCerv + "% / " + this.cerveza + " uds.", 675, 370);
        
        g.setColor(new Color(0, 135, 82)); //color gaseosa 
        g.fillArc(150, 225, 400, 400, gradosCerv, gradosGas);
        g.fillRect(650, 385, 20, 20);
        g.drawString("Gaseosas: " + porGas + "% / " + this.gaseosa + " uds.", 675, 400);
        
        g.setColor(new Color(0, 128, 255)); //color agua min.
        g.fillArc(150, 225, 400, 400, gradosCerv + gradosGas, gradosAguaMin);
        g.fillRect(650, 415, 20, 20);
        g.drawString("Aguas Minerales: " + porAguaMin + "% / " + this.aguaMin + " uds.", 675, 430);
        
        g.setColor(new Color(252, 12, 114)); //color agua sab.
        g.fillArc(150, 225, 400, 400, gradosCerv + gradosGas + gradosAguaMin, gradosAguaSab);
        g.fillRect(650, 445, 20, 20);
        g.drawString("Aguas Saborizadas: " + porAguaSab + "% / " + this.aguaSab + " uds.", 675, 460);
              
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

        new FrmEstadistica().setVisible(true);
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
