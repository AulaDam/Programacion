package R4_FactoryClaude;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        /**
 * PATRÓN FACTORY - Guía de Implementación
 * 
 * 1. Crear una interfaz o clase abstracta común
 *    - Define el contrato que todos los productos compartirán
 *    - Ejemplo: interface Vehiculo { void conducir(); }
 * 
 * 2. Implementar las clases concretas
 *    - Cada clase implementa la interfaz común
 *    - Ejemplo: Coche, Moto, Camion implements Vehiculo
 * 
 * 3. Crear la clase Factory
 *    - Contiene un método estático que decide qué objeto crear
 *    - Recibe parámetros para determinar el tipo
 *    - Retorna la interfaz común, no las clases concretas
 *    - Ejemplo: VehiculoFactory.crearVehiculo(String tipo)
 * 
 * 4. Usar la Factory en el código cliente
 *    - Llamar al método factory en lugar de usar "new"
 *    - Trabajar con la interfaz, no con clases concretas
 *    - Ejemplo: Vehiculo v = VehiculoFactory.crearVehiculo("coche");
 * 
 * VENTAJAS:
 * - Desacopla la creación del uso de objetos
 * - Facilita añadir nuevos tipos sin modificar código cliente
 * - Centraliza la lógica de creación
 * 
 * CUÁNDO USARLO:
 * - Cuando no sabes de antemano qué tipo exacto crear
 * - Cuando quieres ocultar la lógica de instanciación
 * - Cuando las clases tienen una interfaz común
 */
        
        Scanner scanner = new Scanner(System.in);
        
        String vehiculo;
        
        System.out.print("[*] Vehiculo: ");
        vehiculo = scanner.nextLine();
        IVehiculo miVehiculo = VehiculoFactory.crearVehiculo(vehiculo);
        miVehiculo.conducir();
        
        System.out.print("[*] Vehiculo: ");
        vehiculo = scanner.nextLine();
        IVehiculo otroVehiculo = VehiculoFactory.crearVehiculo(vehiculo);
        otroVehiculo.conducir();
        
        
        
        
        
        
        
        
        
        
    }
    
}
