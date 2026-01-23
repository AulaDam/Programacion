package ejercicio2;

public class ArrayReales implements Estadistica{
    
    private double[] arrayReales;
    
    public ArrayReales() {
        arrayReales = new double[10];
    }
    
    public void setArrayReales(double[] arrayReales){
        this.arrayReales = arrayReales;
    }
    
    public double[] getArrayReales(double[] arrayReales) {
        return arrayReales;
    }

    //Calcular minimo
    @Override
    public double minimo() {
        
        if (arrayReales.length == 0) {
            throw new IllegalArgumentException("Array vacio");
        }
        
        double minimo = arrayReales[0];
        
        for (double n : arrayReales) {
            minimo = Math.min(minimo, n);
        }
        
        return minimo;
        
    }

    //Calcular maximo
    @Override
    public double maximo() {
        
        if (arrayReales.length == 0) {
            throw new IllegalArgumentException("Array vacio");
        }
        
        double maximo = arrayReales[0];
        
        for (double n : arrayReales) {
            maximo = Math.max(maximo, n);
        }
        
        return maximo;
        
    }

    //Calcular sumatorio
    @Override
    public double sumatorio() {
        
        if (arrayReales.length == 0) {
            throw new IllegalArgumentException("Array vacio");
        }
        
        double sumatorio = 0;
        
        for (double n : arrayReales) {
            sumatorio += n;
        }
        
        return sumatorio;
        
    }
    
    
}
