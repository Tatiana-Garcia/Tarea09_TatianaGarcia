
package tarea09_tatianagarcia;
public class RegularMissile extends Missile{
    private double tam; 

    public RegularMissile() {
        super();
    }

    public RegularMissile(double tam, double desplazamiento, double poder) {
        super(desplazamiento, poder);
        this.tam = tam;
    }

    public double getTam() {
        return tam;
    }

    public void setTam(double tam) {
        this.tam = tam;
    }

    @Override
    public String toString() {
        return "\nRegularMissile{" + "\n Tamaño: " + tam + '}'+super.toString();
    }

    @Override
    public void ataque(Traje t) {
        double force = t.getFuerza()-0.001;
        t.setFuerza(force);
    }
    
}
