package R3_FactoryPrimero;

public class EnvioCamion implements IEnvio{

    @Override
    public void enviarPaquete() {
        System.out.println("Enviar con camion");
    }
    
}
