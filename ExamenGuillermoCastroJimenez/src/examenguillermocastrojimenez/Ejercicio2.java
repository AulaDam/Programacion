package examenguillermocastrojimenez;
import java.util.Random;

public class Ejercicio2 {
    
    static Random random = new Random();
    
    public static void main(String[] args) {

        int[][] inventario = new int[4][5];
        
        int totalCajas;
        
        rellenarMatriz(inventario);
        
        mostrarMatriz(inventario);
        
        System.out.println("Total cajas:");
        
        totalCajas = totalCajas(inventario);
        System.out.println(totalCajas);
        
        System.out.println("Numero fila con mas cajas 0-3:");
        System.out.println(filaMayor(inventario));
        
        System.out.println("Columna con menos cajas 0-4:");
        //System.out.println(columnaMenor(inventario));
        
        nuevaCajaPosicionVacia(inventario);
        
        
        
        
        

    }
    
    static void rellenarMatriz(int[][] inventario) {
        
        
        for(int i=0; i<inventario.length; i++) {
            for (int j=0; j<inventario[i].length; j++) {
                inventario[i][j] = random.nextInt(10);
            }
        }
        
    }
    
    static void mostrarMatriz(int[][] inventario) {
        
        for(int i=0; i<inventario.length; i++) {
            for (int j=0; j<inventario[i].length; j++) {
                System.out.print(inventario[i][j]);
            }
            System.out.println("");
        }
        
    }
    
    static int totalCajas(int[][] inventario) {
        
        int sumaCajas = 0;
        
        for(int i=0; i<inventario.length; i++) {
            for (int j=0; j<inventario[i].length; j++) {
                sumaCajas = sumaCajas + inventario[i][j];
            }
        }
        
        return sumaCajas;
        
    }
    
    static int filaMayor(int[][] inventario) {
        
        int filaMayor = 0;
        int numeroFila = 0;
        int suma = 0;
        
        
        for(int i=0; i<inventario.length; i++) {
            suma = 0;
            for (int j=0; j<inventario[i].length; j++) {
                suma = suma + inventario[i][j];
                if (suma > filaMayor) { 
                    filaMayor = suma;
                    numeroFila = i;
                }
            }
        }
        
        return numeroFila;
        
    }
    
    static int columnaMenor(int[][] inventario) {
        
        int columnaMenor = 99;
        int numeroColumna = 0;
        int suma = 0;
        
        
        
        for (int i=0; i<inventario.length; i++) {
            for (int j=0; j<inventario[i].length; j++){
                suma = suma + inventario[j][i];
                if (suma < columnaMenor) {
                    columnaMenor = suma;
                    numeroColumna = j;
                }
            }
        }
        
        
        return numeroColumna;
        
       
        
    }
    
    static void nuevaCajaPosicionVacia(int[][] inventario) {
        
        for(int i=0; i<inventario.length; i++) {
            for (int j=0; j<inventario[i].length; j++) {
                if (inventario[i][j] == 0) {
                    inventario[i][j] = random.nextInt(10);
                    break;
                }
            }
        }
    }
    
    
    
    
    
    
    
    
}
