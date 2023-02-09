/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea09_tatianagarcia;

/**
 *
 * @author tatig
 */
public abstract class Beam {
    protected MissileLauncher misil;
    protected double carga; 
    protected double peso; 
    protected double potencia;

    public Beam(MissileLauncher misil, double carga, double peso, double potencia) {
        this.misil = misil;
        this.carga = carga;
        this.peso = peso;
        this.potencia = potencia;
    }

    public Beam() {
    }

    public MissileLauncher getMisil() {
        return misil;
    }

    public void setMisil(MissileLauncher misil) {
        this.misil = misil;
    }

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        return "\nBeam{" + "\n Missile Launcher: " + misil + "\n Carga: " + carga + "\n Peso: " + peso + "\n Potencia: " + potencia +" watts"+ '}';
    }
    public abstract void ataque(Traje t);
    
}
