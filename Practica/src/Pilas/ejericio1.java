package Pilas;
import java.util.Scanner;
import java.util.Stack;


public class ejericio1 {
    public static void main(String[] args) {
        

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce una cadena: ");
        String texto = scanner.nextLine();
        
        Stack<Character> pila = new Stack<>();
        
        //Recorremos la cadena
        for (Character c : texto.toCharArray()) {
            
            if (c == '(') {
                pila.push(c);
            } else if (c == ')') {
                
                if (pila.isEmpty()) {
                    System.out.println("Incorrecto");
                    return;
                }
                
                pila.pop();
                
            }
            
        }
        
        if (pila.isEmpty()) {
                System.out.println("Correcto");
            } else {
                System.out.println("Incorrecto");
            }
        
        

    }
    
}
