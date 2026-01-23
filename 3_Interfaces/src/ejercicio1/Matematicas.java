package ejercicio1;
import java.util.Random;

public class Matematicas implements MathArray{
    
    private Random random;
    
    public Matematicas() {
        random = new Random();
    }
    
    //Calcula el factorial de un numero
    public int factorial(int numero) {
        
        if (numero < 0) {
            throw new IllegalArgumentException("El número no puede ser negativo");
        }
        
        int factorial = 1;
        
        for (int i = 1; i<=numero; i++) {
            factorial *= i;
        }
        
        return factorial;
    }
    
    //Devuelve un numero aleatorio en un intervalo
    public int aleatorio(int primerNumero, int segundoNumero) {
        
        return random.nextInt(primerNumero, segundoNumero);
        
    }

    //Calcula minimo
    @Override
    public int min(int[] array) {
        
        int minimo = Integer.MAX_VALUE;
        
        for (int i : array) {
            if (i < minimo) {
                minimo = i;
            }
        }
        
        return minimo;
        
    }

    //Calcula maximo
    @Override
    public int max(int[] array) {
        int maximo = Integer.MIN_VALUE;
        
        for (int i : array) {
            if (i > maximo) {
                maximo = i;
            }
        }
        
        return maximo;
        
    }

    //Calcula sumatorio
    @Override
    public int suma(int[] array) {
        int suma = 0;
        
        for (int i : array) {
            suma+=i;
        }
        
        return suma;
        
    }
    

    
}
