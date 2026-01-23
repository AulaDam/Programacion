package examenguillermocastrojimenez;
import java.util.Random;

public class Ejercicio3 {
    
    static Random random = new Random();
    static int jugador = 0;
    static int turnos = 0;
    
    public static void main(String[] args) {
        
        int[] tablero = new int[65];
        
        while (jugador < 65) {
            
            System.out.print("Dado: ");
            dado();
            
            System.out.print("Jugador: ");
            System.out.println(jugador);
            
            if(comprobarOca()) {
                jugador = jugador + 5;
            }
            
            if(comprobarPuente()) {
                jugador = 12;
            }
            
            if(comprobarCalavera()) {
                jugador = 0;
            }
            
            if(comprobarCarcel()) {
                System.out.println("Pierdes 2 turnos");
                turnos = turnos - 2;
                
            }
            
            if(comprobarMeta()) {
                System.out.println("HAS GANADO");
                jugador = jugador-64;
            }
            
            turnos++;
            
            System.out.println("Turno: " + turnos);
            
            
        }
        
        
        
        
        
        

    }
    
    static void dado() {
        
        int dado = (random.nextInt(6)+1);
        jugador+=dado;
        System.out.println(dado);
        
        
    }
    
    static boolean comprobarOca() {
        if(jugador%5==0) {
            return true;
        } else return false;
    }
    
    static boolean comprobarPuente() {
        if(jugador == 6 || jugador == 12) {
            return true;
        } else return false;
    }
    
    static boolean comprobarCalavera() {
        if(jugador == 56) {
            return true;
        } else return false;
    }
    
    static boolean comprobarCarcel() {
        if(jugador == 38) {
            return true;
        } else return false;
    }
    
    static boolean comprobarMeta() {
        if (jugador >= 64) {
            return true;
        } else return false;
    }
    
}
