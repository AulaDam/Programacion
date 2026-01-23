package ejercicio1;

public class Main {
    public static void main(String[] args) {
        
        Matematicas matematicas = new Matematicas();
        
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        System.out.println(matematicas.factorial(12));
        System.out.println(matematicas.aleatorio(1, 10));
        System.out.println(matematicas.min(array));
        System.out.println(matematicas.max(array));
        System.out.println(matematicas.suma(array));
        
        
        

    }
    
}
