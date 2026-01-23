package examenguillermocastrojimenez;
import java.util.Random;

public class Ejercicio4 {
    
    static char[][] tablero = new char[8][8];
    static Random random = new Random();
            
    public static void main(String[] args) {
        
        iniciarTablero();
        
        colocarPiezas();
        
        mostrarTablero();
        
        
        
        
        
        
        
    }
    
    static void mostrarTablero() {
        
        for (int i=0; i<tablero.length; i++) {
            for (int j=0; j<tablero[i].length; j++) {
                System.out.print(tablero[i][j]);
            }
            System.out.println("");
        }
        
    }
    
    static void iniciarTablero() {
        
        for (int i=0; i<tablero.length; i++) {
            for (int j=0; j<tablero[i].length; j++){
                tablero[i][j] = '-';
            }
        }
    }
    
    static void colocarPiezas() {
        
        int damas = 0;
        int peon = 0;
        int primeraPosicion;
        int segundaPosicion;
        
        while (damas <= 8) { //Damas
            
            primeraPosicion = random.nextInt(8);
            segundaPosicion = random.nextInt(8);
            
            if (tablero[primeraPosicion][segundaPosicion] == '-') {
                tablero[primeraPosicion][segundaPosicion] = 'D';
                damas++;
            }
            
        }
        
        while (peon <= 0) { //Peon
            primeraPosicion = random.nextInt(8);
            segundaPosicion = random.nextInt(8);
            
            if (tablero[primeraPosicion][segundaPosicion] == '-') {
                tablero[primeraPosicion][segundaPosicion]= 'P';
                peon++;
            }
        }
        
        
    }
    
}
