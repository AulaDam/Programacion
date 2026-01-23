package Alumnos;

public class Main {
    public static void main(String[] args) {
        
        
        /*
        Clase Alumno:

        Atributos:

        -nombre (String)
        -edad (int)
        -notaMedia (double)
        -Constructor
        -Getters y setters
        -Método mostrarInfo()

        Clase GestorAlumnos:

        -Un ArrayList<Alumno> para guardar alumnos.

        Métodos para:

        -Añadir alumno
        -Mostrar todos los alumnos
        -Buscar alumno por nombre
        -Calcular la media de todas las notas
        -Eliminar alumno por nombre
        
        Clase Main:
        
        -Crear el gestor
        -Añadir varios alumnos

        Probar todos los métodos
        */
        
        GestorAlumnos gestor = new GestorAlumnos();
        
        Alumno a1 = new Alumno("Maria", 12, 6);
        Alumno a2 = new Alumno("Rei", 16, 8);
        
        gestor.agregarAlumno(a1);
        gestor.agregarAlumno(a2);
        
        System.out.println("LISTA: \n" );
        gestor.mostrarAlumnos();
        
        System.out.println("\nBUSCAR MARIA: ");
        Alumno buscado = gestor.buscarAlumno("Maria");
        if (buscado != null) {
            System.out.println(buscado);
        } else {
            System.out.println("[ERROR] No encontrado ");
        }
        
        System.out.println("\nELIMINAR REI: ");
        gestor.eliminarAlumno("Rei");
        
        System.out.println("\nLISTA FINAL: ");
        gestor.mostrarAlumnos();
        
        
        
        
        
    }
    
}
