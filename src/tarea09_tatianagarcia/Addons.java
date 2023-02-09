
package tarea09_tatianagarcia;

public class Addons {
    private String nombre; 
    private String funcion;
    private String integrar; 

    public Addons() {
    }

    public Addons(String nombre, String funcion, String integrar) {
        this.nombre = nombre;
        this.funcion = funcion;
        this.integrar = integrar;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFuncion() {
        return funcion;
    }

    public void setFuncion(String funcion) {
        this.funcion = funcion;
    }

    public String getIntegrar() {
        return integrar;
    }

    public void setIntegrar(String integrar) {
        this.integrar = integrar;
    }

    @Override
    public String toString() {
        return "\nAddons{" + "\n Nombre: " + nombre + "\n Funcion: " + funcion + "\n Parte del Cuerpo de samus integrado: " + integrar + '}';
    }
    
    
    
    
}
