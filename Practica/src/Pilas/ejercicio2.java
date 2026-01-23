package Pilas;
import java.util.Scanner;
import java.util.Stack;

public class ejercicio2 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Stack pila = new Stack<>();
        
        System.out.println("Texto:");
        String texto = scanner.nextLine();
        
        for (Character c : texto.toCharArray()) {
            
            pila.push(c);
            
        }
        
        String textoInvertido = "";
        
        while (!pila.isEmpty()) {
            textoInvertido = textoInvertido + pila.pop();
        }
        
        System.out.println(textoInvertido);
        
        
        
        
        
            
        
        
    }
    
}
