
package tarea09_tatianagarcia;

public class LightBeam extends Beam{
    private int fotones; 
    private double velocidad; 
    private int municion;

    public LightBeam() {
        super();
    }

    public LightBeam(int fotones, double velocidad, int municion, MissileLauncher misil, double carga, double peso, double potencia) {
        super(misil, carga, peso, potencia);
        this.fotones = fotones;
        this.velocidad = velocidad;
        this.municion = municion;
    }

    public int getFotones() {
        return fotones;
    }

    public void setFotones(int fotones) {
        this.fotones = fotones;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public int getMunicion() {
        return municion;
    }

    public void setMunicion(int municion) {
        this.municion = municion;
    }

    @Override
    public String toString() {
        return "LightBeam{" + "\n Indice de fotones: " + fotones + "\n Velocidad de disparo: " + velocidad + "\n Municion disponible: " + municion + '}'+super.toString();
    }

    @Override
    public void ataque(Traje t) {
        double daño = t.getDamage()+0.01;
        t.setDamage(daño);
    }
    
}
