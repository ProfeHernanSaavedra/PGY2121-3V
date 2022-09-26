
/**
 *
 * @author USRVI-LC2
 */
public class Collar extends Joya{
    
    protected double largoCadena;

    public Collar() {
    }

    public Collar(double largoCadena, int codigo, String nombre, String material) {
        super(codigo, nombre, material);
        this.largoCadena = largoCadena;
    }

    public double getLargoCadena() {
        return largoCadena;
    }

    public void setLargoCadena(double largoCadena) {
        this.largoCadena = largoCadena;
        
    }

    @Override
    public String toString() {
        return "Collar{" + "largoCadena=" + largoCadena + '}';
    }
    
    
    
}
