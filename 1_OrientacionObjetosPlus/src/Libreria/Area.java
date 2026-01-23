package Libreria;
import java.util.ArrayList;
import java.util.Scanner;

public class Area {
    
    private int codigo;
    private String descripcion;
    private String ubicacion;
    private ArrayList<Libro> libros;
    private Scanner scanner;
    
    public Area(int codigo, String descripcion, String ubicacion) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.ubicacion = ubicacion;
        libros = new ArrayList<>();
        scanner = new Scanner(System.in);
    }
    
    public int getCodigo() {
        return codigo;
    }
    
    public void setCodigo() {
        this.codigo = codigo;
    }
    
    public String getDescripcion() {
        return descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public void mostrarMenu(){
        int opcion = 0;
        
        do {
            System.out.println("[1] Dar de alta un libro");
            System.out.println("[2] Listar todos los libros del área");
            System.out.println("[0] Salir");
            System.out.print("Opcion: ");
            
            opcion = scanner.nextInt();
            scanner.nextLine();
            
            
            switch(opcion) {
                case 1:
                    agregarLibro();
                    break;
                case 2:
                    listarLibros();
                    break;
                default:
                    if(opcion!=0) System.out.println("ERROR: Opcion invalida");
                    break;     
            }
            
        } while(opcion != 0);
    }
    
    public void agregarLibro() {
        System.out.print("[*] Introduce el código: ");
        int codigo = scanner.nextInt();
        scanner.nextLine();
        System.out.print("[*] Introduce el autor: ");
        String autor = scanner.nextLine();
        System.out.print("[*] Introduce el titulo: ");
        String titulo = scanner.nextLine();
        System.out.print("[*] Introduce la editorial: ");
        String editorial = scanner.nextLine();
        System.out.println("[*] Introduce la fecha de publicacion: ");
        int fechaPublicacion = scanner.nextInt();
        scanner.nextLine();
        System.out.println("[*] Introduce el lugar de publicacion: ");
        String lugarPublicacion = scanner.nextLine();
        
        Libro libro = new Libro(codigo, autor, titulo, editorial, fechaPublicacion, lugarPublicacion);
        
        libros.add(libro);
        System.out.printf("[*] Libro de codigo %d creado", codigo);
    }
    
    public void listarLibros() {
        
        if(libros.isEmpty()) {
            System.out.println("ERROR: No hay libros creados aun");
            return;
        }
        
        for (Libro lib : libros) {
            System.out.println(lib);
            System.out.println("------");
        }
    }
    
    public String toString() {
        return String.format("Codigo: %d\nDescripcion: %s\nUbicacion: %s", codigo, descripcion, ubicacion);
    }
    
    
    
    
            
            
}