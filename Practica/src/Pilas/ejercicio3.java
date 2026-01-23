package Pilas;
import java.util.Scanner;
import java.util.Stack;

public class ejercicio3 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> pila = new Stack<>();
        
        System.out.println("Numero: ");
        int numero = scanner.nextInt();
        
        while (numero > 0) {
            
            pila.push(numero%2);
            numero = numero / 2;
            
        }
        
        String binario = "";
        
        while (!pila.isEmpty()) {
            
            binario = binario + pila.pop();
            
        }
        
        System.out.println("Binario: " + binario);
        
            
        
            
        
        
        
        
        
        
        
    }
    
}
