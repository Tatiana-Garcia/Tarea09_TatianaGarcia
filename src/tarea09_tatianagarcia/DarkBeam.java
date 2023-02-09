/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea09_tatianagarcia;

/**
 *
 * @author tatig
 */
public class DarkBeam extends Beam {
    private double velocidad;
    private int municion;

    public DarkBeam() {
        super();
    }

    public DarkBeam(double velocidad, int municion, MissileLauncher misil, double carga, double peso, double potencia) {
        super(misil, carga, peso, potencia);
        this.velocidad = velocidad;
        this.municion = municion;
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
        return "\nDarkBeam{" + "\n Velocidad de disparo: " + velocidad + "\n Municion disponible: " + municion + '}'+super.toString();
    }
    public void ataque(){
        
    }

    @Override
    public void ataque(Traje t) {
        double potenciat = t.getBeam().getPotencia()-0.02;
        t.getBeam().setPotencia(potenciat);
    }
    
}
