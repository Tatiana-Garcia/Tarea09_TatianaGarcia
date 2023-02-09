package tarea09_tatianagarcia;

import java.util.Scanner;

public class Tarea09_TatianaGarcia {
    static Scanner leer = new Scanner(System.in);
    static Traje samus = new Traje();
    public static void main(String[] args) {
        
        int menu;
        do {
            System.out.print("\nMenu de opciones:\n"
                    + "0-Salir\n"
                    + "1-Crear Samus\n"
                    + "2-Info Samus\n"
                    + "3-Agregar addons\n"
                    + "4-Agregar misil\n"
                    + "5-Cambiar de Beam/Arma\n"
                    + "6-Ataque\n\n"
                    + "Ingrese opcion: ");

            menu = leer.nextInt();   
            
            switch (menu) {
                case 0:
                    System.out.println(">>Salida del sistema");
                    break;
                case 1:{
                    samus = Samus();
                    break;
                }
                case 2:{
                    System.out.println(samus);
                    break;
                }
                case 3:{
                    Addons addons = addons();
                    if (addons!=null) {
                        samus.getAddons().add(addons);
                    }
                    break;
                }
                case 4:{
                    Missile misil = agregarmisil();
                    if (misil!=null) {
                        samus.getBeam().getMisil().getMisil().add(misil);
                    }
                    break;
                }
                case 5:{
                    int op;
                    do {
                        System.out.print("Elija la nueva arma:\n"
                                + "1-Dark Beam\n"
                                + "2-Light Beam\n"
                                + "3-Plasma Beam\n\n"
                                + "Ingrese opcion: ");

                        op = leer.nextInt();  
                        switch (op) {
                            case 1:{
                                double velocidad;
                                int municion;
                                System.out.println("Ingrese velocidad de disparo: ");
                                velocidad=leer.nextDouble();
                                System.out.println("Ingrese la cantidad de municion: ");
                                municion=leer.nextInt();
                                MissileLauncher misille=samus.getBeam().getMisil();
                                double carga = samus.getBeam().getCarga();
                                double peso = samus.getBeam().getPeso();
                                double potencia = samus.getBeam().getPotencia();
                                samus.setBeam(new DarkBeam(velocidad, municion,misille , carga,peso , potencia));

                                break;
                            }
                            case 2:{
                                int fotones; 
                                double velocidad; 
                                int municion;

                                do{
                                System.out.println("Ingrese la cantidad de fotones: ");
                                fotones=leer.nextInt();}while(fotones<1||fotones>10);

                                System.out.println("Ingrese velocidad de disparo: ");
                                velocidad=leer.nextDouble();

                                System.out.println("Ingrese la cantidad de municion: ");
                                municion=leer.nextInt();
                                
                                MissileLauncher misille=samus.getBeam().getMisil();
                                double carga = samus.getBeam().getCarga();
                                double peso = samus.getBeam().getPeso();
                                double potencia = samus.getBeam().getPotencia();
                                
                                samus.setBeam(new LightBeam(fotones, velocidad, municion, misille, carga, peso, potencia));

                                break;
                            }
                            case 3:{
                                double tam;
                                double time; 
                                int disparos;

                                System.out.println("Ingrese tamaño del arma: ");
                                tam =leer.nextDouble();
                                System.out.println("Ingrese tiempo de carga: ");
                                time =leer.nextDouble();
                                System.out.println("Ingrese numero de veces que puede disparar sin calentarse: ");
                                disparos=leer.nextInt();
                                MissileLauncher misille=samus.getBeam().getMisil();
                                double carga = samus.getBeam().getCarga();
                                double peso = samus.getBeam().getPeso();
                                double potencia = samus.getBeam().getPotencia();

                                samus.setBeam(new PlasmaBeam(tam, time, disparos, misille, carga, peso, potencia));
                                break;
                            }
                        }
                    }while(op < 1||op>3);
                    break;
                }
                case 6:{
                    samus.getBeam().ataque(samus);
                    for (Missile t : samus.getBeam().getMisil().getMisil()) {
                        t.ataque(samus);
                    }
                    
                    System.out.println(samus);
                    break;
                }
            }
            
        }while(menu != 0);
        
    }//fin del main
    static Missile agregarmisil(){
        Missile retorno = null;
        double desplazamiento; 
        double poder;
        System.out.println("Ingrese velocidad de desplazamiento: ");
        desplazamiento = leer.nextDouble();
        System.out.println("Ingrese poder explosivo: ");
        poder = leer.nextDouble();
        int op;
        do {
            System.out.print("Elija un misil:\n"
                    + "1-Regular Missile\n"
                    + "2-Super Missile\n\n"
                    + "Ingrese opcion: ");

            op = leer.nextInt(); 
            
            switch (op) {
                case 1:
                    if(samus.getBeam().getMisil().getMisil().size()<samus.getBeam().getMisil().getMisiles()&&samus.getBeam().getMisil().isSoporte1()==true){
                        double tam;
                        System.out.println("Ingrese el tamaño: ");
                        tam = leer.nextDouble();
                        retorno = new RegularMissile(tam, desplazamiento, poder);
                    }
                    else{
                        System.out.println("No se puede añadir el misil");
                        return null;
                    }
                    
                    break;
                case 2:
                    if(samus.getBeam().getMisil().getMisil().size()<samus.getBeam().getMisil().getMisiles() && samus.getBeam().getMisil().isSoporte2()==true){
                        String material;
                        System.out.println("Ingrese material: ");
                        leer = new Scanner(System.in);
                        material = leer.nextLine();
                        retorno = new SuperMissile(material, desplazamiento, poder);
                    }
                    else{
                        System.out.println("No se puede añadir el misil");
                        return null;
                    }
                    
                    break;
            }
        }while(op < 1||op>2);
        
        return retorno;
    }
    static Addons addons(){
        Addons retorno;
        String nombre; 
        String funcion;
        String integrar; 
        
        System.out.println("Ingrese nombre: ");
        leer = new Scanner(System.in);
        nombre = leer.nextLine();
        System.out.println("Ingrese su funcion: ");
        leer = new Scanner(System.in);
        funcion = leer.nextLine();
        System.out.println("Ingrese parte del cuerpo de samus donde se va a integrar: ");
        leer = new Scanner(System.in);
        integrar = leer.nextLine();
        
        retorno = new Addons(nombre, funcion, integrar);
        return retorno;
    }
    static Traje Samus(){
        Traje retorno;
        Beam beam;
        double damage = 0; 
        double oxido = 0; 
        double fuerza;
        
        System.out.println("Ingrese la fuerza que tendra Samus: ");
        fuerza = leer.nextDouble();
        beam = addBeam();
        
        retorno = new Traje(beam, damage, oxido, fuerza);
        return retorno;
    }
    static Beam addBeam(){
        Beam retorno = null;
        double carga =100; 
        double peso; 
        double potencia;
        MissileLauncher misille;
        
        System.out.println("Ingrese peso del arma: ");
        peso = leer.nextDouble();
        System.out.println("Ingrese potencia del arma: ");
        potencia = leer.nextDouble();
        
        misille = addmisil();
        
        int op;
        do {
            System.out.print("Elija un arma:\n"
                    + "1-Dark Beam\n"
                    + "2-Light Beam\n"
                    + "3-Plasma Beam\n\n"
                    + "Ingrese opcion: ");

            op = leer.nextInt();  
            switch (op) {
                case 1:{
                    double velocidad;
                    int municion;
                    System.out.println("Ingrese velocidad de disparo: ");
                    velocidad=leer.nextDouble();
                    System.out.println("Ingrese la cantidad de municion: ");
                    municion=leer.nextInt();

                    retorno = new DarkBeam(velocidad, municion, misille, carga, peso, potencia);

                    break;
                }
                case 2:{
                    int fotones; 
                    double velocidad; 
                    int municion;

                    do{
                    System.out.println("Ingrese la cantidad de fotones: ");
                    fotones=leer.nextInt();}while(fotones<1||fotones>10);

                    System.out.println("Ingrese velocidad de disparo: ");
                    velocidad=leer.nextDouble();

                    System.out.println("Ingrese la cantidad de municion: ");
                    municion=leer.nextInt();

                    retorno = new LightBeam(fotones, velocidad, municion, misille, carga, peso, potencia);

                    break;
                }
                case 3:{
                    double tam;
                    double time; 
                    int disparos;

                    System.out.println("Ingrese tamaño del arma: ");
                    tam =leer.nextDouble();
                    System.out.println("Ingrese tiempo de carga: ");
                    time =leer.nextDouble();
                    System.out.println("Ingrese numero de veces que puede disparar sin calentarse: ");
                    disparos=leer.nextInt();

                    retorno = new PlasmaBeam(tam, time, disparos, misille, carga, peso, potencia);
                    break;
                }
            }
        }while(op < 1||op>3);
        
        
        
        return retorno;
    }
    static MissileLauncher addmisil(){
        MissileLauncher retorno;
        int misiles;
        boolean soporte1 = false ;
        boolean soporte2 = false ;
        
        System.out.println("Ingrese capacidad maxima de misiles: ");
        misiles = leer.nextInt();
        int op;
        do {
            System.out.print("Elija un soporte:\n"
                    + "1-Regular Missile\n"
                    + "2-Super Missile\n"
                    + "3-Ambos misiles\n\n"
                    + "Ingrese opcion: ");

            op = leer.nextInt(); 
            switch (op) {
                case 1:{
                    soporte1 = true;
                    soporte2 = false;
                    break;
                }
                case 2:{
                    soporte1 = false;
                    soporte2 = true;
                    break;
                }
                case 3:{
                    soporte1 = true;
                    soporte2 = true;
                    break;
                }
            }
            
        }while(op < 1||op>3);
            
        retorno = new MissileLauncher(misiles, soporte1, soporte2);
        return retorno;
    }
}
