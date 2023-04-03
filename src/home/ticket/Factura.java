
package home.ticket;

import java.util.ArrayList;

/**
 * 
 * @author Pablo Tomás Morinigo <tomasmorinigo098@gmail.com>
 */
public class Factura implements java.io.Serializable {
    
    private int nro_factura;
    private String mozo;
    private double importe;
    private String fecha_hora;
    private ArrayList<String[]> listado;
    
    public Factura() {}
    
    public Factura (int nro_factura, String mozo, double importe, String fecha_hora) {
        this.nro_factura = nro_factura;
        this.mozo = mozo;
        this.importe = importe;
        this.fecha_hora = fecha_hora;
        this.listado = new ArrayList<>();
    }

    public int getNro_factura() {
        return nro_factura;
    }

    public void setNro_factura(int nro_factura) {
        this.nro_factura = nro_factura;
    }

    public String getMozo() {
        return mozo;
    }

    public void setMozo(String mozo) {
        this.mozo = mozo;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }
    
    public String getFecha_hora() {
        return fecha_hora;
    }

    public void setFecha_hora(String fecha_hora) {
        this.fecha_hora = fecha_hora;
    }
    
    public void setListado(ArrayList<String[]> listado) {
        this.listado = listado;
    }
    
    public ArrayList<String[]> getListado() {
        return this.listado;
    }
    
    public Object getElemento(int j, int k) {
        return this.listado.get(j)[k];
    }

    @Override
    public String toString() {
        return "N° Factura: " + nro_factura + " - mozo: " + mozo + " - importe: $" + importe + " - fecha y hora: "
                + fecha_hora + " - listado: ";
    }
    
}
