package Pilas;
import java.util.Scanner;
import java.util.Stack;

public class Ejercicio4 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> pila = new Stack<>();
        
        while (true) {
            
            String input = "";
            
            System.out.println("[*] ");
            input = scanner.nextLine();
            
            if (input.equals("+") || input.equals("-") || input.equals("*") || input.equals("/")) {
                
                switch(input) {
                    case "+": {
                        System.out.println("Suma: ");
                        int a;
                        int b;
                        b = pila.pop();
                        a = pila.pop();
                        
                        pila.push(a+b);
                        
                        break;
                    }    
                    case "-": {
                        System.out.println("Resta: ");
                        int a;
                        int b;
                        b = pila.pop();
                        a = pila.pop();
                        
                        pila.push(a-b);
                        
                        break;
                    }    
                    case "*": {
                        System.out.println("Multiplicacion: ");
                        int a;
                        int b;
                        b = pila.pop();
                        a = pila.pop();
                        
                        pila.push(a*b);
                        
                        break;
                    }    
                    case "/": {
                        System.out.println("Division: ");
                        int a;
                        int b;
                        b = pila.pop();
                        a = pila.pop();
                        
                        pila.push(a/b);
                        
                        break;
                    }    
                }
                
            } else {
                
                pila.push(Integer.parseInt(input));
                
            }

            
            
        }
        
        
        
        
        
       

        
    }
    
}
