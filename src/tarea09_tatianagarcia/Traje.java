
package tarea09_tatianagarcia;

import java.util.ArrayList;

public class Traje {
    Beam beam;
    private double damage; 
    private double oxido; 
    private double fuerza;
    private ArrayList<Addons>addons = new ArrayList();

    public Traje() {
        
    }

    public Traje(Beam beam, double damage, double oxido, double fuerza) {
        this.beam = beam;
        this.damage = damage;
        this.oxido = oxido;
        this.fuerza = fuerza;
    }

    public Beam getBeam() {
        return beam;
    }

    public void setBeam(Beam beam) {
        this.beam = beam;
    }

    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    public double getOxido() {
        return oxido;
    }

    public void setOxido(double oxido) {
        this.oxido = oxido;
    }

    public double getFuerza() {
        return fuerza;
    }

    public void setFuerza(double fuerza) {
        this.fuerza = fuerza;
    }

    public ArrayList<Addons> getAddons() {
        return addons;
    }

    public void setAddons(ArrayList<Addons> addons) {
        this.addons = addons;
    }
    

    @Override
    public String toString() {
        String add = "No Add-ons";
        if(!addons.isEmpty()){
            add= addons.toString();
        }
        return "Traje{" + "\n Beam: " + beam + "\n\n Medidor de Daño: " + damage + "\n Medidor de Oxido: " + oxido + "\n Medidor de fuerza: " + fuerza + "\n\n Add-ons: " + add + '}';
    }
    
    
}
