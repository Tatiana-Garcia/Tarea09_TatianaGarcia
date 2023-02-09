/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea09_tatianagarcia;

/**
 *
 * @author tatig
 */
public abstract class Missile {
    protected double desplazamiento; 
    protected double poder;

    public Missile() {
    }

    public Missile(double desplazamiento, double poder) {
        this.desplazamiento = desplazamiento;
        this.poder = poder;
    }

    public double getDesplazamiento() {
        return desplazamiento;
    }

    public void setDesplazamiento(double desplazamiento) {
        this.desplazamiento = desplazamiento;
    }

    public double getPoder() {
        return poder;
    }

    public void setPoder(double poder) {
        this.poder = poder;
    }

    @Override
    public String toString() {
        return "Missile{" + "\n Velocidad de desplazamiento: " + desplazamiento + "\n Poder explosivo: " + poder + '}';
    }
    public abstract void ataque(Traje t);
    
}
