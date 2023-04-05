
package home.empleado;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import util.FlujoEntradaSalida;

/**
 *
 * @author Pablo Tomás Morinigo <tomasmorinigo098@gmail.com>
 */
public class FrmEmpleado extends javax.swing.JFrame {
    
    private DefaultTableModel model;
    private ArrayList<Empleado> empleados = new FlujoEntradaSalida("empleados.ddr").getDeserializacion();
    private boolean celdasActivadas = false;

    public FrmEmpleado() {
        initComponents();
        this.setTitle("Hungry Birds - Menú Empleados");
        this.getContentPane().setBackground(new java.awt.Color(255, 253, 177));
        this.setIconImage(java.awt.Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/birds.png")));
        this.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE); //cierra la vtn actual
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        bgGenero = new javax.swing.ButtonGroup();
        bgTurno = new javax.swing.ButtonGroup();
        etqSubtitulo = new javax.swing.JLabel();
        etqTitulo = new javax.swing.JLabel();
        etqApe = new javax.swing.JLabel();
        boxApe = new javax.swing.JTextField();
        etqNom = new javax.swing.JLabel();
        boxNom = new javax.swing.JTextField();
        boxDNI = new javax.swing.JTextField();
        etqDNI = new javax.swing.JLabel();
        etqEdad = new javax.swing.JLabel();
        etqCar = new javax.swing.JLabel();
        boxSue = new javax.swing.JTextField();
        etqLoc = new javax.swing.JLabel();
        etqGen = new javax.swing.JLabel();
        boxDom = new javax.swing.JTextField();
        cmbEdad = new javax.swing.JComboBox<>();
        cmbCar = new javax.swing.JComboBox<>();
        etqDom1 = new javax.swing.JLabel();
        rbMas = new javax.swing.JRadioButton();
        rbFem = new javax.swing.JRadioButton();
        etqTel1 = new javax.swing.JLabel();
        rbTar = new javax.swing.JRadioButton();
        rbMan = new javax.swing.JRadioButton();
        etqSue = new javax.swing.JLabel();
        cmbLoc = new javax.swing.JComboBox<>();
        etqTur2 = new javax.swing.JLabel();
        boxTel = new javax.swing.JTextField();
        etqAnt1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex) {
                if (colIndex == 0) {
                    return false;
                }
                return celdasActivadas;
            };
        };
        cmbAnt = new javax.swing.JComboBox<>();
        btnLimpiar = new javax.swing.JButton();
        btnEnviar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();

        this.addRBGenero();

        this.addRBTurno();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1035, 712));
        setMinimumSize(new java.awt.Dimension(1035, 712));
        setPreferredSize(new java.awt.Dimension(1035, 712));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        etqSubtitulo.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        etqSubtitulo.setForeground(new java.awt.Color(0, 0, 0));
        etqSubtitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqSubtitulo.setText("Menú Empleados");
        getContentPane().add(etqSubtitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 110, 30));

        etqTitulo.setFont(new java.awt.Font("Corbel Light", 1, 18)); // NOI18N
        etqTitulo.setForeground(new java.awt.Color(0, 0, 0));
        etqTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqTitulo.setText("H U N G R Y  B I R D S®");
        getContentPane().add(etqTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 20, 240, 30));

        etqApe.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etqApe.setForeground(new java.awt.Color(0, 0, 0));
        etqApe.setText("* Apelllido:");
        getContentPane().add(etqApe, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 70, -1));

        boxApe.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        boxApe.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                boxApeKeyPressed(evt);
            }
        });
        getContentPane().add(boxApe, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 230, 30));

        etqNom.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etqNom.setForeground(new java.awt.Color(0, 0, 0));
        etqNom.setText("* Nombre:");
        getContentPane().add(etqNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 70, -1));

        boxNom.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        boxNom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                boxNomKeyPressed(evt);
            }
        });
        getContentPane().add(boxNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 230, 30));

        boxDNI.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        boxDNI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                boxDNIKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                boxDNIKeyTyped(evt);
            }
        });
        getContentPane().add(boxDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, 140, 30));

        etqDNI.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etqDNI.setForeground(new java.awt.Color(0, 0, 0));
        etqDNI.setText("* DNI:");
        getContentPane().add(etqDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, 70, -1));

        etqEdad.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etqEdad.setForeground(new java.awt.Color(0, 0, 0));
        etqEdad.setText("* Edad:");
        getContentPane().add(etqEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, 70, -1));

        etqCar.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etqCar.setForeground(new java.awt.Color(0, 0, 0));
        etqCar.setText("* Cargo:");
        getContentPane().add(etqCar, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 130, 70, -1));

        boxSue.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        boxSue.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                boxSueKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                boxSueKeyTyped(evt);
            }
        });
        getContentPane().add(boxSue, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 150, 160, 30));

        etqLoc.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etqLoc.setForeground(new java.awt.Color(0, 0, 0));
        etqLoc.setText("* Localidad:");
        getContentPane().add(etqLoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, 70, -1));

        etqGen.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etqGen.setForeground(new java.awt.Color(0, 0, 0));
        etqGen.setText("* Sexo:");
        getContentPane().add(etqGen, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, 70, -1));

        boxDom.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        boxDom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                boxDomKeyPressed(evt);
            }
        });
        getContentPane().add(boxDom, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 150, 190, 30));

        cmbEdad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {}));
        this.addEdades(this.cmbEdad);
        cmbEdad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmbEdadKeyPressed(evt);
            }
        });
        getContentPane().add(cmbEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 60, 30));

        cmbCar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {}));
        this.addCargos(this.cmbCar);
        cmbCar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmbCarKeyPressed(evt);
            }
        });
        getContentPane().add(cmbCar, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 150, 150, 30));

        etqDom1.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etqDom1.setForeground(new java.awt.Color(0, 0, 0));
        etqDom1.setText("* Dirección:");
        getContentPane().add(etqDom1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 130, 70, -1));

        rbMas.setBackground(new java.awt.Color(255, 253, 177));
        rbMas.setText("Masculino");
        getContentPane().add(rbMas, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 150, -1, -1));

        rbFem.setBackground(new java.awt.Color(255, 253, 177));
        rbFem.setText("Femenino");
        getContentPane().add(rbFem, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 150, -1, -1));

        etqTel1.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etqTel1.setForeground(new java.awt.Color(0, 0, 0));
        etqTel1.setText("* Teléfono:");
        getContentPane().add(etqTel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 70, 70, -1));

        rbTar.setBackground(new java.awt.Color(255, 253, 177));
        rbTar.setText("tarde");
        getContentPane().add(rbTar, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 90, -1, -1));

        rbMan.setBackground(new java.awt.Color(255, 253, 177));
        rbMan.setText("mañana");
        getContentPane().add(rbMan, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 90, -1, -1));

        etqSue.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etqSue.setForeground(new java.awt.Color(0, 0, 0));
        etqSue.setText("* Sueldo:");
        getContentPane().add(etqSue, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 130, 70, -1));

        cmbLoc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {}));
        this.addLocalidad(this.cmbLoc);
        cmbLoc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmbLocKeyPressed(evt);
            }
        });
        getContentPane().add(cmbLoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, 140, 30));

        etqTur2.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etqTur2.setForeground(new java.awt.Color(0, 0, 0));
        etqTur2.setText("* Turno:");
        getContentPane().add(etqTur2, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 70, 70, -1));

        boxTel.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        boxTel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                boxTelKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                boxTelKeyTyped(evt);
            }
        });
        getContentPane().add(boxTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 90, 140, 30));

        etqAnt1.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        etqAnt1.setForeground(new java.awt.Color(0, 0, 0));
        etqAnt1.setText("* Antiguedad:");
        getContentPane().add(etqAnt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 70, 70, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel());
        this.crearTableModel();
        this.volcarDatos(this.empleados);
        jTable1.setGridColor(new java.awt.Color(204, 204, 204));
        jTable1.setRowHeight(45);
        jTable1.setSelectionBackground(new java.awt.Color(255, 253, 177));
        jTable1.setSelectionForeground(new java.awt.Color(51, 51, 51));
        jTable1.setShowHorizontalLines(false);
        jTable1.setShowVerticalLines(false);
        //tamaño columnas
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(30);
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(190);
        jTable1.getColumnModel().getColumn(2).setPreferredWidth(60);
        jTable1.getColumnModel().getColumn(3).setPreferredWidth(30);
        jTable1.getColumnModel().getColumn(4).setPreferredWidth(40);
        jTable1.getColumnModel().getColumn(5).setPreferredWidth(100);
        jTable1.getColumnModel().getColumn(6).setPreferredWidth(160);

        jTable1.setIntercellSpacing(new java.awt.Dimension(0, 0));
        jTable1.setFocusable(false);
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 1020, 420));

        cmbAnt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {}));
        this.addAnt(this.cmbAnt);
        cmbAnt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmbAntKeyPressed(evt);
            }
        });
        getContentPane().add(cmbAnt, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 90, 90, 30));

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 200, 130, 40));

        btnEnviar.setText("Enviar");
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEnviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 200, 130, 40));

        this.disenioBotones("/img/editWhite.png", "/img/editWhite.png", this.btnModificar, "Edite la tabla");
        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/editBlack.png"))); // NOI18N
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
    }// </editor-fold>                        

    /*a) creamos nuevos propio Table Model*/
    private void crearTableModel() {
        Object[][] datos = new Object[][] {};
        String[] nombreColumnas = new String[]{"ID", "Apellido y Nombre", "DNI", "Edad", "Género", "Localidad", "Dirección",
                                               "Teléfono", "Turno", "Cargo", "Antiguedad", "Sueldo"};
        this.model =  new DefaultTableModel(datos, nombreColumnas);
        this.jTable1.setModel(model);
    }
    
    private void volcarDatos(ArrayList<Empleado> lista) {
        Object[] fila = new Object[model.getColumnCount()];
        for (int i = 0; i < lista.size(); i++) {
            fila[0] = lista.get(i).getId();
            fila[1] = lista.get(i).getApeNom();
            fila[2] = lista.get(i).getDni();
            fila[3] = lista.get(i).getEdad();
            fila[4] = lista.get(i).getGenero();
            fila[5] = lista.get(i).getLocalidad();
            fila[6] = lista.get(i).getDomicilio();
            fila[7] = lista.get(i).getTelefono();
            fila[8] = lista.get(i).getTurno();
            fila[9] = lista.get(i).getCargo();
            fila[10] = lista.get(i).getAntiguedad();
            fila[11] = lista.get(i).getSueldo();
            model.addRow(fila);
        }
    }
    
    private void boxApeKeyPressed(java.awt.event.KeyEvent evt) {                                  
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) { this.boxNom.requestFocus(); }
    }                                 

    private void boxNomKeyPressed(java.awt.event.KeyEvent evt) {                                  
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) { this.boxDNI.requestFocus(); }
    }                                 

    private void boxDNIKeyPressed(java.awt.event.KeyEvent evt) {                                  
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) { this.cmbEdad.requestFocus(); }
    }                                 

    private void boxSueKeyPressed(java.awt.event.KeyEvent evt) {                                  
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) { this.btnEnviar.requestFocus(); }
    }                                 

    private void boxDomKeyPressed(java.awt.event.KeyEvent evt) {                                  
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) { this.boxTel.requestFocus(); }
    }                                 

    private void boxTelKeyPressed(java.awt.event.KeyEvent evt) {                                  
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) { this.cmbCar.requestFocus(); }
    }                                 

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {                                           
        this.limpiarDatos();
    }                                          

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {                                          
        if (this.boxApe.getText().length() == 0 || this.boxNom.getText().length() == 0 || this.boxDNI.getText().length() == 0 ||
            (!this.rbMas.isSelected() && !this.rbFem.isSelected()) || this.boxTel.getText().length() == 0 || this.boxDom.getText().length() == 0 || 
            (!this.rbMan.isSelected() && !this.rbTar.isSelected()) || this.boxSue.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Debe completar todos los campos!!!", "Atención", JOptionPane.WARNING_MESSAGE);
        } else if (this.boxDNI.getText().startsWith("0") || this.boxDNI.getText().length() < 8) {
            JOptionPane.showMessageDialog(null, "El DNI ingresado no es válido", "Atención", JOptionPane.WARNING_MESSAGE);
        } else if (!this.boxTel.getText().startsWith("11") || this.boxTel.getText().length() < 10) {
            JOptionPane.showMessageDialog(null, "El teléfono ingresado no es válido", "Atención", JOptionPane.WARNING_MESSAGE);
        } else if (this.dniRepetido(this.boxDNI.getText())) {
            JOptionPane.showMessageDialog(null, "El DNI ingresado ya ha sido registrado, intente con otro.", "Atención", JOptionPane.WARNING_MESSAGE);
        } else if (this.telRepetido(this.boxTel.getText())) {
            JOptionPane.showMessageDialog(null, "El teléfono ingresado ya ha sido registrado, intente con otro.", "Atención", JOptionPane.WARNING_MESSAGE);
        } else {
   
            ArrayList<Empleado> lista = new FlujoEntradaSalida("empleados.ddr").getDeserializacion();
            Empleado emp = new Empleado();
            
            if (lista.isEmpty()) {
                emp.setId(1);
            } else {
                int n = lista.get(lista.size() - 1).getId();
                int ult = n + 1;
                emp.setId(ult);
            }         
            
            emp.setApellido(this.boxApe.getText());
            emp.setNombre(this.boxNom.getText());
            emp.setDni(this.boxDNI.getText());
            emp.setEdad(Integer.parseInt(this.cmbEdad.getSelectedItem().toString()));
            if (this.rbMas.isSelected()) {
                emp.setGenero('M');
            } else if (this.rbFem.isSelected()) {
                emp.setGenero('F');
            }
            emp.setLocalidad(this.cmbLoc.getSelectedItem().toString());
            emp.setDomicilio(this.boxDom.getText());
            emp.setTelefono(this.boxTel.getText());
            if (this.rbMan.isSelected()) {
                emp.setTurno("mañana");
            } else if (this.rbTar.isSelected()) {
                emp.setTurno("tarde");
            }
            emp.setCargo(this.cmbCar.getSelectedItem().toString());
            emp.setAntiguedad(this.cmbAnt.getSelectedItem().toString());
            emp.setSueldo(Double.parseDouble(this.boxSue.getText()));
            
            FlujoEntradaSalida es = new FlujoEntradaSalida("empleados.ddr");
            es.abrirOutputStrem();
            es.setSerializarObjeto(emp);
            es.cerrarOutputStream();
            
            this.model.setRowCount(0);
            
            ArrayList<Empleado> actualizarEmpleados = new FlujoEntradaSalida("empleados.ddr").getDeserializacion();
            this.volcarDatos(actualizarEmpleados);
                     
            JOptionPane.showMessageDialog(null, "El empleado " + this.boxApe.getText().toUpperCase() + " " + this.boxNom.getText().toUpperCase()
                + " con DNI: " + this.boxDNI.getText() + "\nha sido dado de alta con éxito!!!", "Guardado", JOptionPane.PLAIN_MESSAGE);
            this.limpiarDatos();
            
            System.out.println("GUARDADO!");
        }
    }                                         

    private void cmbEdadKeyPressed(java.awt.event.KeyEvent evt) {                                   
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) { this.cmbLoc.requestFocus(); }
    }                                  

    private void cmbLocKeyPressed(java.awt.event.KeyEvent evt) {                                  
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) { this.boxDom.requestFocus(); }
    }                                 

    private void cmbCarKeyPressed(java.awt.event.KeyEvent evt) {                                  
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) { this.cmbAnt.requestFocus(); }
    }                                 

    private void cmbAntKeyPressed(java.awt.event.KeyEvent evt) {                                  
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) { this.boxSue.requestFocus(); }
    }                                 

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {                                             
        
        this.celdasActivadas = true;
        this.btnModificar.setEnabled(false);
        this.btnGuardar.setEnabled(true);
        this.btnEliminar.setEnabled(false);
        this.jTable1.setShowHorizontalLines(true);
        this.jTable1.setShowVerticalLines(true);
        this.jTable1.setRowSelectionAllowed(false);
        
        this.setCeldaEdades(this.jTable1.getColumnModel().getColumn(3));
        this.setCeldaGeneroTurno(this.jTable1.getColumnModel().getColumn(4), "M", "F");
        this.setCeldaLocalidad(this.jTable1.getColumnModel().getColumn(5));
        this.setCeldaGeneroTurno(this.jTable1.getColumnModel().getColumn(8), "mañana", "tarde");
        this.setCeldaCargos(this.jTable1.getColumnModel().getColumn(9));
        this.setCeldaAnt(this.jTable1.getColumnModel().getColumn(10));
        
    }                                            

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {                                           
        
        this.celdasActivadas = false;
        this.btnModificar.setEnabled(true);
        this.btnGuardar.setEnabled(false);
        this.btnEliminar.setEnabled(true);
        this.jTable1.setShowHorizontalLines(false);
        this.jTable1.setShowVerticalLines(false);
        this.jTable1.setRowSelectionAllowed(true);
        
        FlujoEntradaSalida es = new FlujoEntradaSalida("empleados.ddr");
        ArrayList<Empleado> copia = new ArrayList<>();
        
        for (int i = 0; i < this.model.getRowCount(); i++) {
            String apenom[] = String.valueOf(this.model.getValueAt(i, 1)).split(", "); //corregir el char M/F
            Empleado e = new Empleado((int) this.model.getValueAt(i, 0), apenom[0], apenom[1], (String) this.model.getValueAt(i, 2), 
                                      Integer.parseInt(String.valueOf(this.model.getValueAt(i, 3))), String.valueOf(this.model.getValueAt(i, 4)).charAt(0),
                                      (String) this.model.getValueAt(i, 7), (String) this.model.getValueAt(i, 5), (String) this.model.getValueAt(i, 6),
                                      (String) this.model.getValueAt(i, 8), (String) this.model.getValueAt(i, 9), (String) this.model.getValueAt(i, 10),
                                      Double.parseDouble(String.valueOf(this.model.getValueAt(i, 11))));
            copia.add(e);
        }
        
        for (int i = 0; i < copia.size(); i++) {
            System.out.println(copia.get(i).toString());
        }
        
        es.eliminarFichero();
        
        es.abrirOutputStrem();
        for (int i = 0; i < copia.size(); i++) {
            if (copia.get(i) != null) {
                es.setSerializarObjeto(copia.get(i));
            }
        }
        es.cerrarOutputStream();
        
        this.model.setRowCount(0);
        
        ArrayList<Empleado> actualizarRegistros = new FlujoEntradaSalida("empleados.ddr").getDeserializacion();
        this.volcarDatos(actualizarRegistros);      
    }                                          

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {                                            
        if (this.jTable1.getSelectedRow() == -1) { //si no seleccionamos ninguna fila de la tabla (-1) lanzamos el siguiente JOptionPane
            javax.swing.JOptionPane.showMessageDialog(null, "Debe seleccionar una fila de la tabla para eliminarla!!!", "Atención", JOptionPane.WARNING_MESSAGE);
        } else {
            int id = Integer.parseInt(String.valueOf(this.model.getValueAt(this.jTable1.getSelectedRow(), 0)));
            String apeNom = (String) this.model.getValueAt(this.jTable1.getSelectedRow(), 1);
            String dni = (String) this.model.getValueAt(this.jTable1.getSelectedRow(), 2);
            int edad = Integer.parseInt(String.valueOf(this.model.getValueAt(this.jTable1.getSelectedRow(), 3)));
            char genero = String.valueOf(this.model.getValueAt(this.jTable1.getSelectedRow(), 4)).charAt(0);
            String loc = (String) this.model.getValueAt(this.jTable1.getSelectedRow(), 5);
            String dire = (String) this.model.getValueAt(this.jTable1.getSelectedRow(), 6);
            String tel = (String) this.model.getValueAt(this.jTable1.getSelectedRow(), 7);
            String turno = (String) this.model.getValueAt(this.jTable1.getSelectedRow(), 8);
            String cargo = (String) this.model.getValueAt(this.jTable1.getSelectedRow(), 9);
            String ant = (String) this.model.getValueAt(this.jTable1.getSelectedRow(), 10);
            double sueldo = Double.parseDouble(String.valueOf(this.model.getValueAt(this.jTable1.getSelectedRow(), 11)));
            
            System.out.println("id: " + id + " - nombre: " + apeNom + " - edad: " + edad + " - sexo: " + genero);
            
            int resultado = javax.swing.JOptionPane.showConfirmDialog(null, "Está seguro de eliminar el empleado N°" + id + "?", "Por favor confirma", JOptionPane.YES_NO_OPTION);
            
            if (resultado ==  JOptionPane.YES_OPTION) {
                
                FlujoEntradaSalida es = new FlujoEntradaSalida("empleados.ddr");
                ArrayList<Empleado> lista = es.getDeserializacion();
                ArrayList<Empleado> copia = new ArrayList<>();
                
                for (int i = 0; i < lista.size(); i++) {
                    if (lista.get(i).getId() != id) {
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
                
                ArrayList<Empleado> actualizar = new FlujoEntradaSalida("empleados.ddr").getDeserializacion();
                this.volcarDatos(actualizar);
                
                javax.swing.JOptionPane.showMessageDialog(null, "El empleado N°" + id + "\nha sido eliminado con exito!", "Eliminado", JOptionPane.WARNING_MESSAGE);
                
            } else {
                System.out.println("NO eliminaste el articulo " + id);
            }
        }
    }                                           

    private void boxDNIKeyTyped(java.awt.event.KeyEvent evt) {                                
        this.permitirUnicamenteNros(evt, this.boxDNI);
        this.limiteDeCaracteres(evt, this.boxDNI, 8);
    }                               

    private void boxSueKeyTyped(java.awt.event.KeyEvent evt) {                                
        this.permitirUnicamenteNros(evt, this.boxSue);
    }                               

    private void boxTelKeyTyped(java.awt.event.KeyEvent evt) {                                
        this.permitirUnicamenteNros(evt, this.boxTel);
        this.limiteDeCaracteres(evt, this.boxTel, 10);
    }                               

    private void permitirUnicamenteNros(java.awt.event.KeyEvent evt, javax.swing.JTextField box) {
        char c = evt.getKeyChar();
        if ((c < '0') || (c > '9')) {
            evt.consume();
        }
    }
    
    private void limiteDeCaracteres(java.awt.event.KeyEvent evt, javax.swing.JTextField box, int limite) {
        if (box.getText().length() == limite) {
            evt.consume();
        }
    }
    
    private boolean dniRepetido(String dni) {
        for (int i = 0; i < this.empleados.size(); i++) {
            if (this.empleados.get(i) != null && this.empleados.get(i).getDni().equals(dni)) {
                return true;
            }
        }
        return false;
    }
    
    private boolean telRepetido(String tel) {
        for (int i = 0; i < this.empleados.size(); i++) {
            if (this.empleados.get(i) != null && this.empleados.get(i).getTelefono().equals(tel)) {
                return true;
            }
        }
        return false;
    }
    
    private void addEdades(javax.swing.JComboBox cmb) {
        for (int i = 18; i <= 65; i++) {
            cmb.addItem(String.valueOf(i));
        }
    }
    
    private void addLocalidad(javax.swing.JComboBox cmb) {
        cmb.addItem("San Miguel");
        cmb.addItem("José C. Paz");
        cmb.addItem("Bella Vista");
        cmb.addItem("Múñiz");
        cmb.addItem("Malvinas Argentinas");
        cmb.addItem("Tortuguitas");
        cmb.addItem("Moreno");
    }
    
    private void addCargos(javax.swing.JComboBox cmb) {
        cmb.addItem("Mozo");
        cmb.addItem("Bachero");
        cmb.addItem("Cocinero");
        cmb.addItem("Caja");
    }
    
    private void addAnt(javax.swing.JComboBox cmb) {
        for (int i = 1; i <= 20; i++) {
            if (i == 1) {
                cmb.addItem(String.valueOf(i) + " año");
                i++;
            }
            if (i >= 2 && i <= 9) {
                cmb.addItem(String.valueOf(i) + " años");
            }
            if (i == 10) {
                 cmb.addItem("+ " + String.valueOf(i) + " años");
                 i = 20;
            }
            if (i == 20) {
                cmb.addItem("+ " + String.valueOf(i) + " años");
            }
            
        }
    }
    
    private void setCeldaEdades(javax.swing.table.TableColumn columna) {
        javax.swing.JComboBox combo = new javax.swing.JComboBox();
        this.addEdades(combo);
        columna.setCellEditor(new javax.swing.DefaultCellEditor(combo));
    }
    
    private void setCeldaGeneroTurno(javax.swing.table.TableColumn columna, String a, String b) {
        javax.swing.JComboBox combo = new javax.swing.JComboBox();
        combo.addItem(a);
        combo.addItem(b);
        columna.setCellEditor(new javax.swing.DefaultCellEditor(combo));
    }
    
    private void setCeldaLocalidad(javax.swing.table.TableColumn columna) {
        javax.swing.JComboBox combo = new javax.swing.JComboBox();
        this.addLocalidad(combo);
        columna.setCellEditor(new javax.swing.DefaultCellEditor(combo));
    }
    
    private void setCeldaCargos(javax.swing.table.TableColumn columna) {
        javax.swing.JComboBox combo = new javax.swing.JComboBox();
        this.addCargos(combo);
        columna.setCellEditor(new javax.swing.DefaultCellEditor(combo));
    }
    
    private void setCeldaAnt(javax.swing.table.TableColumn columna) {
        javax.swing.JComboBox combo = new javax.swing.JComboBox();
        this.addAnt(combo);
        columna.setCellEditor(new javax.swing.DefaultCellEditor(combo));
    }
    
    private void addRBGenero() {
        this.bgGenero.add(this.rbMas);
        this.bgGenero.add(this.rbFem);
    }
    
    private void addRBTurno() {
        this.bgTurno.add(this.rbMan);
        this.bgTurno.add(this.rbTar);
    }
    
    private void limpiarDatos() {
        this.boxApe.setText(null);
        this.boxNom.setText(null);
        this.boxDNI.setText(null);
        this.cmbEdad.setSelectedItem(0);
        this.bgGenero.clearSelection();
        this.cmbLoc.setSelectedItem(0);
        this.boxDom.setText(null);
        this.boxTel.setText(null);
        this.bgTurno.clearSelection();
        this.cmbCar.setSelectedItem(0);
        this.cmbAnt.setSelectedItem(0);
        this.boxSue.setText(null);
        this.boxApe.requestFocus();
    }
    
    private void disenioBotones(String urlA, String urlB, javax.swing.JButton btn, String info){
        btn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource(urlA))); //lo que se ve al pasar el mouse (hover)
        btn.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource(urlB))); //lo que se ve al presionar el boton
        btn.setContentAreaFilled(false); //boton invisible
        btn.setBorderPainted(false);
        btn.setFocusPainted(false);
        btn.setToolTipText(info);
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

        new FrmEmpleado().setVisible(true);
        
    }
    
    // Variables declaration - do not modify                     
    private javax.swing.ButtonGroup bgGenero;
    private javax.swing.ButtonGroup bgTurno;
    private javax.swing.JTextField boxApe;
    private javax.swing.JTextField boxDNI;
    private javax.swing.JTextField boxDom;
    private javax.swing.JTextField boxNom;
    private javax.swing.JTextField boxSue;
    private javax.swing.JTextField boxTel;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnEnviar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JComboBox<String> cmbAnt;
    private javax.swing.JComboBox<String> cmbCar;
    private javax.swing.JComboBox<String> cmbEdad;
    private javax.swing.JComboBox<String> cmbLoc;
    private javax.swing.JLabel etqAnt1;
    private javax.swing.JLabel etqApe;
    private javax.swing.JLabel etqCar;
    private javax.swing.JLabel etqDNI;
    private javax.swing.JLabel etqDom1;
    private javax.swing.JLabel etqEdad;
    private javax.swing.JLabel etqGen;
    private javax.swing.JLabel etqLoc;
    private javax.swing.JLabel etqNom;
    private javax.swing.JLabel etqSubtitulo;
    private javax.swing.JLabel etqSue;
    private javax.swing.JLabel etqTel1;
    private javax.swing.JLabel etqTitulo;
    private javax.swing.JLabel etqTur2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JRadioButton rbFem;
    private javax.swing.JRadioButton rbMan;
    private javax.swing.JRadioButton rbMas;
    private javax.swing.JRadioButton rbTar;
    // End of variables declaration                   

    
}
