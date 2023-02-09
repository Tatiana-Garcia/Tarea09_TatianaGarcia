
package tarea09_tatianagarcia;

import java.util.ArrayList;

public class MissileLauncher {
    private int misiles; 
    private ArrayList<Missile>misil = new ArrayList();
    private boolean soporte1;
    private boolean soporte2;

    public MissileLauncher() {
    }

    public MissileLauncher(int misiles, boolean soporte1, boolean soporte2) {
        this.misiles = misiles;
        this.soporte1 = soporte1;
        this.soporte2 = soporte2;
    }

    public int getMisiles() {
        return misiles;
    }

    public void setMisiles(int misiles) {
        this.misiles = misiles;
    }

    public ArrayList<Missile> getMisil() {
        return misil;
    }

    public void setMisil(ArrayList<Missile> misil) {
        this.misil = misil;
    }

    public boolean isSoporte1() {
        return soporte1;
    }

    public void setSoporte1(boolean soporte1) {
        this.soporte1 = soporte1;
    }

    public boolean isSoporte2() {
        return soporte2;
    }

    public void setSoporte2(boolean soporte2) {
        this.soporte2 = soporte2;
    }
    
    public void addMisil(Missile m){
        
        boolean validacion;
        if(m instanceof RegularMissile && soporte1==true){
            validacion = true;
        }else if (m instanceof SuperMissile && soporte2 == true){
            validacion = true;
        }else{
            validacion = false;
        }
        if (misil.size()<misiles &&validacion == true){
            misil.add(m);
        }
        
    }

    @Override
    public String toString() {
        String mi = "No hay misiles";
        if(!misil.isEmpty()){
            mi= misil.toString();
        }
        String val1, val2;
        if(soporte1 ==true){
            val1 = "Si";
        }else{
            val1="No";
        }
        if(soporte2 ==true){
            val2 = "Si";
        }else{
            val2="No";
        }
        
        return "\nMissileLauncher{" + "\n Capacidad de misiles: " + misiles + "\n Lista de misiles: " + mi + "\n Soporte de Misiles Regulares: " + val1 + "\n Soporte de Super Misiles: " + val2 + '}';
    }
    
}
