package guillermocastrojimenez_evaluacioninicial;
import java.util.Scanner;


public class GuillermoCastroJimenez_EvaluacionInicial {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int numero = (int)(Math.random() * 100) + 1; //Número aleatorio
        
        int respuesta = 0;
        int intentos = 0;
        
        int recordContador = 0;
        int recordGlobal = 10;
        
        
        while(respuesta != numero && intentos<10) { //Juego
            
            //System.out.println("[!]Numero aleatorio: " + numero);
            
            System.out.print("[*] Adivina el número: ");
            respuesta = scanner.nextInt();
            System.out.println("");
            
            intentos++; //Incrementa intentos
            recordContador++; //Incrementa record
            
            if (respuesta != numero) { //Ejecuta si numero es incorrecto
                    System.out.println("Número incorrecto");
                    System.out.println("Te quedan " + (10-intentos) + " intentos");
                
                    if (respuesta > numero) { //Ejecuta pistas
                        System.out.println("Pista: El número pensado es menor");
                    } else if (respuesta < numero) {
                        System.out.println("Pista: El número pensado es mayor");
                    }
                }
            }
        
        if (recordContador < recordGlobal) { //Asigna record
            recordGlobal = recordContador; 
        } 
        
        
        if (respuesta == numero) {
            //Muestra mensaje victoria con intentos y record
            System.out.println("");
            System.out.println("VICTORIA");
            System.out.println("El número pensado era " + numero);
            System.out.println("Número adivinado en " + intentos + " intentos");
            System.out.println("Record: " + recordGlobal);
        } else if (respuesta != numero) {
            //Muestra mensaje de derrota
            System.out.println("");
            System.out.println("DERROTA");
            System.out.println("Te quedaste sin más intentos");
            System.out.println("El numero pensado era el " + numero);
        }
        
        
            
  
            
           
        
        
            
        
        
        
        
        
        
    }
    
}
