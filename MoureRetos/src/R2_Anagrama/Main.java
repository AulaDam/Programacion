package R2_Anagrama;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        /*
 * Escribe una función que reciba dos palabras (String) y retorne
 * verdadero o falso (Bool) según sean o no anagramas.
 * - Un Anagrama consiste en formar una palabra reordenando TODAS
 *   las letras de otra palabra inicial.
 * - NO hace falta comprobar que ambas palabras existan.
 * - Dos palabras exactamente iguales no son anagrama.
 */
        
        Scanner scanner = new Scanner(System.in);
        
        do {
            
            System.out.print("[*] Primera palabra: ");
            String primeraPalabra = scanner.nextLine();
            System.out.print("[*] Segunda palabra: ");
            String segundaPalabra = scanner.nextLine();
        
            System.out.println(anagrama(primeraPalabra, segundaPalabra));
        
        } while (true);
        
        
        
        
        
        
    }
    
    static boolean anagrama(String primeraPalabra, String segundaPalabra) {
        
        boolean anagrama = false;
        
        if (primeraPalabra.length() != segundaPalabra.length()) {
            return false;
        } else if (primeraPalabra.equals(segundaPalabra)) {
            return false;
        } else {
            
            for (int i = 0; i<=segundaPalabra.length(); i++) {
                
                char letra = primeraPalabra.charAt(i);
                
                for (int j = 0; j<=segundaPalabra.length(); j++) {
                    
                    if (letra == segundaPalabra.charAt(j)) {
                        anagrama = true;
                        break;
                        
                    }
                    
                }
            }
        }
        
        return anagrama;
        
    }
    
    
    
}
