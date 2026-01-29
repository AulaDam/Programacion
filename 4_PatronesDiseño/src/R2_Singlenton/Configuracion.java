package R2_Singlenton;

public class Configuracion {
    
        //3 partes de un singleton
        //Una clase con constructor privado
        //Una variable static
        //Un meotod publico que sea static
    
    private static Configuracion instancia;
    
    private Configuracion() {
        System.out.println("Inicializando configuracion en el sistema");
    }
    
    public static Configuracion getInstancia() {
        if (instancia == null) {
            instancia = new Configuracion();
        }
        return instancia;
    }
    
    //Metodo del singlenton
    public void mostrarMensaje () {
        System.out.println("Configuracion activa");
    }
    

        
        
    
        
    
    
    
    
    
    
    
    
    
    
}
