package ejercicio6;
import ejercicio5.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Controlador {
    
    private BDEmpleados baseDeDatos;
    
    Vista vista;
    
    Scanner scanner;
    
    public Controlador() {
        baseDeDatos = new BDEmpleados();
        scanner = new Scanner(System.in);
        vista = new Vista();
    }
    
    public void iniciar() {
        int numeroAdministrativos = vista.pedirEntero("[*] Introduce el numero de administrativos: ");
        int numeroMaquinistas = vista.pedirEntero("[*] Introduce el numero de maquinistas: ");
        int numeroEmpleados = vista.pedirEntero("[*] Introdue el numero de empleados: ");
        
        asignarAdministrativos(numeroAdministrativos);
        asignarMaquinistas(numeroMaquinistas);
        asignarEmpleados(numeroEmpleados);
        
        calcularMediaEdad(baseDeDatos.getAdministrativos());
        calcularMediaEdad(baseDeDatos.getMaquinistas());
        calcularMediaEdad(baseDeDatos.getEmpleados());
        
        int opcion;
        
        do {
            
            vista.mostrarMenuInformacion();
            opcion = vista.pedirEntero("[*] Opcion: ");
            
            switch(opcion) {
                case 1:
                    for (Persona administrativo : baseDeDatos.getAdministrativos()) {
                        System.out.println(administrativo);
                    }
                    break;                    
                case 2: 
                    for (Persona maquinista : baseDeDatos.getMaquinistas()) {
                        System.out.println(maquinista);
                    }
                    break;
                case 3:
                    for (Persona empleado : baseDeDatos.getEmpleados()) {
                        System.out.println(empleado);
                    }
                    break;
                default:
                    System.out.println("ERROR");
                }
            
        } while (opcion != 0);

    }
    
    public void asignarAdministrativos(int numeroAdministrativos) {
        
        for (int i = 0; i < numeroAdministrativos; i++) {
            System.out.println("[" + i +"] Administrativo");
            Administrativo a = new Administrativo();
            baseDeDatos.getAdministrativos().add(a);
        }
        
    }
    
        public void asignarMaquinistas(int numeroMaquinistas) {
        
        for (int i = 0; i < numeroMaquinistas; i++) {
            System.out.println("[" + i +"] Maquinista");
            Maquinista m = new Maquinista();
            baseDeDatos.getMaquinistas().add(m);
        }
        
    }
        
        public void asignarEmpleados(int numeroEmpleados) {
        
        for (int i = 0; i < numeroEmpleados; i++) {
            System.out.println("[" + i +"] Empleado");
            Empleado e = new Empleado();
            baseDeDatos.getEmpleados().add(e);
        }
        
    }
        
        public double calcularMediaEdad(ArrayList<Persona> trabajadores) {
            
            int sumaEdad = 0;
            int contador = 0;
            
            for (Persona trabajador : trabajadores) {
                sumaEdad+=trabajador.edad;
                contador++;
            }
            
            double media = sumaEdad/contador;
            return media;
            
        }
        
        
    
    
    
    
    
}
