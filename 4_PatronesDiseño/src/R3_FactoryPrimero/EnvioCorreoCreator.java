package R3_FactoryPrimero;

public class EnvioCorreoCreator extends EnvioCreator{

    @Override
    protected IEnvio crearEnvio() {
        return new EnvioMoto();
    }
    
}
