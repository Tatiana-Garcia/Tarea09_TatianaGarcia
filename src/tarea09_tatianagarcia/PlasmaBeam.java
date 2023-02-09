package tarea09_tatianagarcia;
public class PlasmaBeam extends Beam{
    private double tam;
    private double time; 
    private int disparos;

    public PlasmaBeam() {
        super();
    }

    public PlasmaBeam(double tam, double time, int disparos, MissileLauncher misil, double carga, double peso, double potencia) {
        super(misil, carga, peso, potencia);
        this.tam = tam;
        this.time = time;
        this.disparos = disparos;
    }

    public double getTam() {
        return tam;
    }

    public void setTam(double tam) {
        this.tam = tam;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public int getDisparos() {
        return disparos;
    }

    public void setDisparos(int disparos) {
        this.disparos = disparos;
    }

    @Override
    public String toString() {
        return "PlasmaBeam{" + "\n Tamaño de tanque: " + tam + " lts\n Tiempo de carga: " + time + "segundos \n Numero de disparos sin calentarse: " + disparos + '}'+super.toString();
    }
    
    @Override
    public void ataque(Traje t){
        double oxide = t.getOxido()+0.005;
        double nivelcarga = t.getBeam().getCarga()-0.005;
        t.setOxido(oxide);
        t.getBeam().setCarga(nivelcarga);
    }
    
}
