
package tarea09_tatianagarcia;
public class SuperMissile extends Missile{
    private String material;

    public SuperMissile() {
        super();
    }

    public SuperMissile(String material, double desplazamiento, double poder) {
        super(desplazamiento, poder);
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "\nSuperMissile{" + "\n MaterialÑ del que esta hecho: " + material + '}'+super.toString();
    }

    @Override
    public void ataque(Traje t) {
        double dam = t.getDamage()+0.01;
        t.setDamage(dam);
    }
    
}
