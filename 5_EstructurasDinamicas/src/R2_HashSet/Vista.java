package R2_HashSet;
import java.util.Scanner;

public class Vista {
    
        private Scanner scanner;
        
        public Vista() {
            scanner = new Scanner(System.in);
        }
    
        public void mostrarMenu() {
        System.out.println("\n1. Insertar producto");
        System.out.println("2. Mostrar lista");
        System.out.println("3. Modificar cantidad");
        System.out.println("4. Eliminar producto");
        System.out.println("5. Obtener importe total");
        System.out.println("6. Eliminar lista completa");
        System.out.println("0. Salir");
        }
        
        public int pedirEntero(String mensaje) {
            System.out.print(mensaje);
            int entero = scanner.nextInt();
            scanner.nextLine();
            return entero;
            
        }
        
        public double pedirDouble(String mensaje) {
            System.out.print(mensaje);
            double decimal = scanner.nextDouble();
            scanner.nextLine();
            return decimal;
            
        }
        
        public String pedirTexto(String mensaje) {
            System.out.print(mensaje);
            return scanner.nextLine();
            
        }
        
        public void mostrarMensaje(String mensaje) {
            System.out.print(mensaje);
            
        }
        
        
    

}
