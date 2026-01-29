package R2_Singlenton;

public class Main {
    public static void main(String[] args) {
        
        Configuracion configuracion1 = Configuracion.getInstancia();
        configuracion1.mostrarMensaje();
        
        Configuracion configuracion2 = Configuracion.getInstancia();
        configuracion2.mostrarMensaje();
        
        System.out.println(configuracion1 == configuracion2);
        
        

        
        
        
        
        
        
        
        
        
    }
    
}
