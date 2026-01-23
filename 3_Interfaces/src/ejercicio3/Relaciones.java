package ejercicio3;

public class Relaciones implements IRelaciones{
    
    private int valor;
    
    public Relaciones(int valor) {
        this.valor = valor;
    }

    @Override
    public boolean esMayor(Object b) {
        Relaciones otroValor = (Relaciones) b;
        return this.valor > otroValor.valor;
        
    }

    @Override
    public boolean esMenor(Object b) {
        Relaciones otroValor = (Relaciones) b;
        return this.valor < otroValor.valor;
    }

    @Override
    public boolean esIgual(Object b) {
        Relaciones otroValor = (Relaciones) b;
        return this.valor == otroValor.valor;
    }
    
    
    
    
}
