package R3_FactoryPrimero;

public class EnvioCamionCreator extends EnvioCreator{

    @Override
    protected IEnvio crearEnvio() {
        return new EnvioCamion();
    }
    
}
