package R3_FactoryPrimero;

public class EnvioCorreo implements IEnvio{

    @Override
    public void enviarPaquete() {
        System.out.println("Enviar con correo");
    }
    
}
