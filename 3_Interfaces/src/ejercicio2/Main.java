package ejercicio2;

public class Main {
    public static void main(String args[]) {
        
        ArrayReales arrayReales = new ArrayReales();
        
        double[] array = {2.0, 6.2, 8.7, 1.2, 3.8};
        
        arrayReales.setArrayReales(array);
        
        System.out.println("[*] Maximo: " + arrayReales.maximo());
        System.out.println("[*] Minimo: " + arrayReales.minimo());
        System.out.println("[*] Sumatorio: " + arrayReales.sumatorio());
        
        
        
        
        
        
    }
    
}
