
package home.carta;

/**
 * Se debe implementar java.io.Serializable ya que sin ella no podremos Serializar (convertir de forma binaria) los
 * objetos de esta Clase.
 * @author Pablo Tomás Morinigo <tomasmorinigo098@gmail.com>
 */
public class Carta implements java.io.Serializable {
    
    private int nro_art;
    private String desc;
    private String cat;
    private double precio;

    public Carta(int nro_art, String desc, String cat, double precio) {
        this.nro_art = nro_art;
        this.desc = desc;
        this.cat = cat;
        this.precio = precio;
    }
    
    public Carta() {}

    public int getNro_art() {
        return nro_art;
    }

    public void setNro_art(int nro_art) {
        this.nro_art = nro_art;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getCat() {
        return cat;
    }

    public void setCat(String cat) {
        this.cat = cat;
    }

    @Override
    public String toString() {
        return "ID: " + nro_art + " - DESCRIPCIÓN: " + desc + " - CATEGORÍA: " + cat + " - PRECIO: $" + precio;
    }
    
    
    
}
