
package home.carta;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import util.FlujoEntradaSalida;

/**
 * /bin contiene los archivos binarios
 * /util contiene las Clases Genéricas (con métodos reutilizables)
 * @author Pablo Tomás Morinigo <tomasmorinigo098@gmail.com>
 */
public class FrmCarta extends javax.swing.JFrame {
    
    private DefaultTableModel model;
    
    // c)  3er paso:         recuperamos (deserializamos) los objetos binarios que estan contenidos en el archivo ...
    private ArrayList<Carta> cartaDeserializada = new FlujoEntradaSalida("carta.ddr").getDeserializacion();
    // ... instanciandola en el objeto del ArrayList<Carta> de esta clase
    private boolean celdasActivadas = false;
    
    public FrmCarta() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Hungry Birds - Menú Carta");
        this.getContentPane().setBackground(new java.awt.Color(255, 253, 177));
        this.setIconImage(java.awt.Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/birds.png")));
        this.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE); //cierra la vtn actual
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        etqDesc = new javax.swing.JLabel();
        etqCat = new javax.swing.JLabel();
        etqPrecio = new javax.swing.JLabel();
        boxPrecio = new javax.swing.JTextField();
        boxDesc = new javax.swing.JTextField();
        cmbCat = new javax.swing.JComboBox<>();
        btnLimpiar = new javax.swing.JButton();
        btnEnviar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable() {
            public boolean isCellEditable(int rowIndex, int colIndex) {
                if (colIndex == 0) {
                    return false;
                }
                return celdasActivadas;
            };
        };
        btnModificar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1035, 712));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Corbel Light", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("H U N G R Y  B I R D S®");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 20, 240, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Menú Carta");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 90, 30));

        etqDesc.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etqDesc.setForeground(new java.awt.Color(0, 0, 0));
        etqDesc.setText("* Descripción:");
        getContentPane().add(etqDesc, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 110, -1));

        etqCat.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etqCat.setForeground(new java.awt.Color(0, 0, 0));
        etqCat.setText("* Categoría:");
        getContentPane().add(etqCat, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 90, 130, -1));

        etqPrecio.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etqPrecio.setForeground(new java.awt.Color(0, 0, 0));
        etqPrecio.setText("* Precio ($):");
        getContentPane().add(etqPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 90, 110, -1));

        boxPrecio.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        boxPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                boxPrecioKeyPressed(evt);
            }
        });
        getContentPane().add(boxPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 110, 110, 40));

        boxDesc.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        boxDesc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                boxDescKeyPressed(evt);
            }
        });
        getContentPane().add(boxDesc, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 280, 40));

        cmbCat.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        cmbCat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Almuerzo / Cena", "Bebida", "Postre", "Desayuno / Merienda" }));
        cmbCat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmbCatKeyPressed(evt);
            }
        });
        getContentPane().add(cmbCat, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 110, 310, 40));

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 190, 130, 40));

        btnEnviar.setText("Enviar");
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEnviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 190, 130, 40));

        // b) segundo vaciamos el setModel predeterminado y llamamos a nuestro método que crea nuestro propio modelo de tabla
    jTable1.setModel(new javax.swing.table.DefaultTableModel());
    this.crearTableModel();

    // e) llamamos al metodo que vuelca los datos en la tabla y le asignamos como parametro el ArrayList cargarCarta
    this.volcarDatos(this.cartaDeserializada);
    jTable1.setAlignmentX(0.0F);
    jTable1.setAlignmentY(0.0F);
    jTable1.setFocusable(false);
    jTable1.setGridColor(new java.awt.Color(204, 204, 204));
    jTable1.setRowHeight(45);
    jTable1.setSelectionBackground(new java.awt.Color(255, 253, 177));
    jTable1.setSelectionForeground(new java.awt.Color(51, 51, 51));
    jTable1.setShowHorizontalLines(false);
    jTable1.setShowVerticalLines(false);
    jTable1.setIntercellSpacing(new java.awt.Dimension(0, 0));
    jScrollPane1.setViewportView(jTable1);

    getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 1020, 420));

    btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/editBlack.png"))); // NOI18N
    this.disenioBotones("/img/editWhite.png", "/img/editWhite.png", this.btnModificar, "Edite la tabla");
    btnModificar.setMaximumSize(new java.awt.Dimension(16, 16));
    btnModificar.setMinimumSize(new java.awt.Dimension(16, 16));
    btnModificar.setPreferredSize(new java.awt.Dimension(16, 16));
    btnModificar.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnModificarActionPerformed(evt);
        }
    });
    getContentPane().add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 220, 20, 20));

    this.disenioBotones("/img/saveWhite.png", "/img/saveWhite.png", this.btnGuardar, "Guarde los cambios de la tabla");
    btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/saveBlack.png"))); // NOI18N
    btnGuardar.setMaximumSize(new java.awt.Dimension(16, 16));
    btnGuardar.setMinimumSize(new java.awt.Dimension(16, 16));
    btnGuardar.setPreferredSize(new java.awt.Dimension(16, 16));
    btnGuardar.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnGuardarActionPerformed(evt);
        }
    });
    this.btnGuardar.setEnabled(false);
    getContentPane().add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 220, 20, 20));

    this.disenioBotones("/img/borrarBlanco.png", "/img/borrarBlanco.png", this.btnEliminar, "Elimine un registro");
    btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/borrarBlack.png"))); // NOI18N
    btnEliminar.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnEliminarActionPerformed(evt);
        }
    });
    getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 220, 20, 20));

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        if (this.boxDesc.getText().length() == 0 || this.boxPrecio.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Debe completar todos los campos!!!", "Atención", JOptionPane.WARNING_MESSAGE);
        } else if (!this.isPrecio(this.boxPrecio.getText())) {
            JOptionPane.showMessageDialog(null, "El precio no es válido!!!", "Atención", JOptionPane.WARNING_MESSAGE);
        } else if (this.existeArt(this.boxDesc.getText())) {
            JOptionPane.showMessageDialog(null, "Ese artículo ya fue cargado!", "Atención", JOptionPane.WARNING_MESSAGE);
        } else {
            System.out.println("GUARDANDO...");
           
            /* f) Incrementamos el contador. 
                  Creamos un objeto de tipo Carta y le pasamos como parametro el contador y los strings
                  recuperados del formulario (caja de texto, combos, etc). */
            ArrayList<Carta> lista = new FlujoEntradaSalida("carta.ddr").getDeserializacion();
            Carta car = new Carta();
            
            if (lista.isEmpty()) {
                car.setNro_art(1);
            } else {
                int n = lista.get(lista.size() - 1).getNro_art();
                int ult = n + 1;
                car.setNro_art(ult);
            }
            
            car.setDesc(this.boxDesc.getText());
            car.setCat(this.cmbCat.getSelectedItem().toString());
            car.setPrecio(Double.parseDouble(this.boxPrecio.getText()));
            
            
            /* g) Creamos un objeto de la clase FlujoEntradaSalida para llamar al metodo que escribe (serializa) objetos dentro
                  dentro del archivo "carta.ddr". Se debe abrir y cerrar el objeto ObjectOutputStream cada vez que escribimos el objeto*/
            FlujoEntradaSalida es = new FlujoEntradaSalida("carta.ddr");
            es.abrirOutputStrem();
            es.setSerializarObjeto(car);
            es.cerrarOutputStream();
            
            this.model.setRowCount(0); //vaciamos la tabla para que no se dupliquen los datos a la hora de visualizarlo
            
            /* h) Para ACUALIZAR la tabla volvemos a deserealizar el archivo y obtenemos los objetos de tipo Carta nuevamente. 
                  Le mandamos por parametro el arraylist al metodo que vuelca los datos en la tabla*/
            ArrayList<Carta> actualizarRegistros = new FlujoEntradaSalida("carta.ddr").getDeserializacion();
            this.volcarDatos(actualizarRegistros);
            
            javax.swing.JOptionPane.showMessageDialog(null, "Artículo dado de alta con éxito!", "Guardado", JOptionPane.PLAIN_MESSAGE);
            this.limpiarDatos(); //limpiamos el formulario una vez dado de alta un registro.
        }
    }//GEN-LAST:event_btnEnviarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        this.limpiarDatos();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void boxDescKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_boxDescKeyPressed
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) { this.cmbCat.requestFocus(); }
    }//GEN-LAST:event_boxDescKeyPressed

    private void cmbCatKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmbCatKeyPressed
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) { this.boxPrecio.requestFocus(); }
    }//GEN-LAST:event_cmbCatKeyPressed

    private void boxPrecioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_boxPrecioKeyPressed
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) { this.btnEnviar.requestFocus(); }
    }//GEN-LAST:event_boxPrecioKeyPressed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        this.celdasActivadas = true;
        this.btnModificar.setEnabled(false);
        this.btnGuardar.setEnabled(true);
        this.btnEliminar.setEnabled(false);
        this.jTable1.setShowHorizontalLines(true);
        this.jTable1.setShowVerticalLines(true);
        this.jTable1.setRowSelectionAllowed(false);
        
        this.setCeldaCategoria(this.jTable1.getColumnModel().getColumn(2)); //le pasamos la posicion de la columna a editar
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        this.celdasActivadas = false;
        this.btnModificar.setEnabled(true);
        this.btnGuardar.setEnabled(false);
        this.btnEliminar.setEnabled(true);
        this.jTable1.setShowHorizontalLines(false);
        this.jTable1.setShowVerticalLines(false);
        this.jTable1.setRowSelectionAllowed(true);
        
        //Modificaciones
        FlujoEntradaSalida es = new FlujoEntradaSalida("carta.ddr");
        ArrayList<Carta> copia = new ArrayList<>();
        
        //obtenemos todos los datos de la y lo guardamos en un Arraylist auxiliar
        for (int i = 0; i < this.model.getRowCount(); i++) {
            Carta c = new Carta((int) this.model.getValueAt(i, 0),
                                (String) this.model.getValueAt(i, 1),
                                (String) this.model.getValueAt(i, 2),
                                Double.parseDouble(String.valueOf(this.model.getValueAt(i, 3))));
            copia.add(c);
        }
        
        for (int i = 0; i < copia.size(); i++) {
            System.out.println(copia.get(i).toString());
        }
        
        es.eliminarFichero(); //eliminamos el archivo
        
        //al Arraylist auxiliar lo volcamos en el archivo
        es.abrirOutputStrem();
        for (int i = 0; i < copia.size(); i++) {
            if (copia.get(i) != null) {
                es.setSerializarObjeto(copia.get(i));
            }
        }
        es.cerrarOutputStream();
        
        this.model.setRowCount(0); //vaciamos la tabla
        
        //obtenemos todos los objetos guardados del archivo y lo volcamos en la tabla
        ArrayList<Carta> actualizarRegistros = new FlujoEntradaSalida("carta.ddr").getDeserializacion();
        this.volcarDatos(actualizarRegistros);        
        
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if (this.jTable1.getSelectedRow() == -1) { //si no seleccionamos ninguna fila de la tabla (-1) lanzamos el siguiente JOptionPane
            javax.swing.JOptionPane.showMessageDialog(null, "Debe seleccionar una fila de la tabla para eliminarla!!!", "Atención", JOptionPane.WARNING_MESSAGE);
        } else {        
            int id = Integer.parseInt(String.valueOf(this.model.getValueAt(this.jTable1.getSelectedRow(), 0)));
            String desc = (String) this.model.getValueAt(this.jTable1.getSelectedRow(), 1);
            String cat = (String) this.model.getValueAt(this.jTable1.getSelectedRow(), 2);
            double precio = Double.parseDouble(String.valueOf(this.model.getValueAt(this.jTable1.getSelectedRow(), 3)));

            System.out.println("id: " + id + " - descripcion: " + desc + " - categoria: " + cat + " - precio: $" + precio);

            int resultado = javax.swing.JOptionPane.showConfirmDialog(null, "Está seguro de eliminar el Artículo " + id + "?", "Por favor confirma", JOptionPane.YES_NO_OPTION);
            
            if (resultado ==  JOptionPane.YES_OPTION) {   
                
                FlujoEntradaSalida es = new FlujoEntradaSalida("carta.ddr");
                ArrayList<Carta> lista = es.getDeserializacion();
                ArrayList<Carta> copia = new ArrayList<>();
                
                for (int i = 0; i < lista.size(); i++) {
                    if (lista.get(i).getNro_art() != id) {
                        copia.add(lista.get(i));
                    }
                }
                
                es.eliminarFichero();
                
                es.abrirOutputStrem();
                for (int i = 0; i < copia.size(); i++) {
                    if (copia.get(i) != null) {
                        es.setSerializarObjeto(copia.get(i));
                    }
                }
                es.cerrarOutputStream();
                
                this.model.setRowCount(0); //vaciamos la tabla
        
                //obtenemos todos los objetos guardados del archivo y lo volcamos en la tabla
                ArrayList<Carta> actualizarRegistros = new FlujoEntradaSalida("carta.ddr").getDeserializacion();
                this.volcarDatos(actualizarRegistros);   
                
                javax.swing.JOptionPane.showMessageDialog(null, "El Artículo " + id + " (" + desc + ")\nha sido eliminado con exito!", "Eliminado", JOptionPane.WARNING_MESSAGE);
            } else {
                System.out.println("NO eliminaste el articulo " + id);
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void setCeldaCategoria(javax.swing.table.TableColumn columna) {
        
        //creamos el combo
        javax.swing.JComboBox combo = new javax.swing.JComboBox();
        combo.addItem("Almuerzo / Cena");
        combo.addItem("Bebida");
        combo.addItem("Postre");
        combo.addItem("Desayuno / Merienda"); 
        
        //llamamos al metodo que nos permite editar la columna en la que queremos agregar los combos
        columna.setCellEditor(new javax.swing.DefaultCellEditor(combo));
     
    }
    
    private void disenioBotones(String urlA, String urlB, javax.swing.JButton btn, String info){
        btn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource(urlA))); //lo que se ve al pasar el mouse (hover)
        btn.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource(urlB))); //lo que se ve al presionar el boton
        btn.setContentAreaFilled(false); //boton invisible
        btn.setBorderPainted(false);
        btn.setFocusPainted(false);
        btn.setToolTipText(info);
    }
    
    /**
     * a) Primero creamos nuestro propio modelo de tabla (DefaultTableModel). 
     * En ella le pasamos dos parametros: una matriz de objetos vacía y un array
     * de strings con los nombres de las columnas que contendra nuestra tabla
     */
    private void crearTableModel() {
        Object[][] datos = new Object[][] {};
        String[] nombreColumnas = new String[]{"Artículo", "Descripción", "Categoría", "Precio ($)"};
        this.model =  new DefaultTableModel(datos, nombreColumnas);
        this.jTable1.setModel(model);
    }
    
    /**
     * d) Creamos un método que manda los datos del ArrayList<Carta> a nuestra JTable
     * @param lista 
     */
    private void volcarDatos(ArrayList<Carta> lista) {
        Object[] fila = new Object[model.getColumnCount()]; // getColumnCount() obtiene el nro de columnas dentro de una fila
        for (int i = 0; i < lista.size(); i++) {
            // para cada posicion del Array Object >>fila<< obtenemos lo atributos que queremos recuperar 
            fila[0] = lista.get(i).getNro_art();
            fila[1] = lista.get(i).getDesc();
            fila[2] = lista.get(i).getCat();
            fila[3] = lista.get(i).getPrecio();
            model.addRow(fila); //lo añade en la ultima fila de la tabla
        }
    }
    
    private void limpiarDatos() {
        this.boxDesc.setText(null);
        this.cmbCat.setSelectedIndex(0);
        this.boxPrecio.setText(null);
        this.boxDesc.requestFocus();
    }
    
    private boolean isPrecio(String valor) { //comprobamos si el string es un número
        try {
            Double.parseDouble(valor);
            return true;
        } catch (java.util.InputMismatchException | java.lang.NumberFormatException ex) {
            return false;
        }       
    }
    
    /**
     * Comprobamos si un articulo ya fue cargado anteriormente
     * @param desc
     * @return 
     */
    private boolean existeArt(String desc) {
       
        ArrayList<Carta> lista = new FlujoEntradaSalida("carta.ddr").getDeserializacion(); // leemos los registros serializados en el fichero binario
        
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getDesc().equalsIgnoreCase(desc)) { // si uno de los objetos <descripcion> es igual al string ingresado
                return true; //retornamos true
            }
        }
        
        return false; //si retorna false es porque ese articulo nunca se cargo
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
        
        new FrmCarta().setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField boxDesc;
    private javax.swing.JTextField boxPrecio;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnEnviar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JComboBox<String> cmbCat;
    private javax.swing.JLabel etqCat;
    private javax.swing.JLabel etqDesc;
    private javax.swing.JLabel etqPrecio;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
