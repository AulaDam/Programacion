package Libreria;
import java.util.ArrayList;
import java.util.Scanner;

public class Libreria {
    
    private ArrayList<Area> areas;
    private Scanner scanner;
    
    public Libreria() {
        areas = new ArrayList<>();
        scanner = new Scanner(System.in);
    }
    
    public void mostrarMenu() {
        int opcion = 0;
        
        do {
            System.out.println("[1] Crear un area nueva");
            System.out.println("[2] Gestion de un area");
            System.out.println("[3] Listado de las areas");
            System.out.println("[4] Listado completo por areas");
            System.out.println("[0] Salir");
            System.out.print("Opcion: ");
            
            opcion = scanner.nextInt();
            scanner.nextLine();
            
            switch(opcion) {
                case 1 -> agregarArea();
                case 2 -> gestionArea();
                case 3 -> listarAreas();
                case 4 -> listarAreasCompleto();
            }
            
            
        } while(opcion != 0);
    }
    
    public void agregarArea() {
        System.out.print("[*] Introduce el codigo: ");
        int codigoArea = scanner.nextInt();
        scanner.nextLine();
        System.out.print("[*] Introduce la descripcion: ");
        String descripcion = scanner.nextLine();
        System.out.print("[*] Introduce la ubicacion: ");
        String ubicacion = scanner.nextLine();
        
        Area a = new Area(codigoArea, descripcion, ubicacion);
        
        areas.add(a);
        System.out.printf("[*] Area de codigo %d creada\n", codigoArea);
    }
    
    public void gestionArea() {
        
        if (areas.isEmpty()) {
            System.out.println("ERROR: Aun no hay areas creadas");
            return;
        }
        
        System.out.println("Areas disponibles: ");
        
        for (int i=0; i<areas.size(); i++ ){
            Area a = areas.get(i);
            System.out.printf("[%d] Codigo %d - %s\n", i, a.getCodigo(), a.getDescripcion());
        }
        
        System.out.print("Seleccion un area: ");
        int indice = scanner.nextInt();
        scanner.nextLine();
        
        if (indice < 0 || indice >= areas.size()) {
            System.out.println("ERROR: Indice invalido");
            return;
        }
        
        areas.get(indice).mostrarMenu();
    }
    
    public void listarAreas() {
        
        if (areas.isEmpty()) {
            System.out.println("ERROR: Aun no hay areas creadas");
            return;
        }
        
        for (Area a : areas) {
            System.out.println(a);
            System.out.println("------");
        }
        
    }
    
    public void listarAreasCompleto() {
        
        if(areas.isEmpty()) {
            System.out.println("ERROR: Aun no hay areas creadas");
            return;
        }
        
        for (Area a : areas) {
            System.out.println(a);
            a.listarLibros();
            System.out.println("------");
            
        }
            
            
    }
    
}