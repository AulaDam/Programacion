package R5_Grafos;
import java.util.Scanner;
import java.util.ArrayList;

public class Vista {
    
    private Scanner scanner;
    
    public Vista() {
        scanner = new Scanner(System.in);
        
    }
    
    public void mostrarEscena(Escena escena) {
        System.out.println(escena.getDescripcion());
        
        //Si no es el final se muestran todas las decisiones del arraylist de la escena
        if (!escena.esFinal()) {
            System.out.println("Que quieres hacer?");
            for (int i = 0; i < escena.getDecisiones().size(); i++) {
                System.out.println("[" + i+1 + "]" + escena.getDecisiones().get(i));
            }
        }
        
    }
    
    
    
    
    
}
