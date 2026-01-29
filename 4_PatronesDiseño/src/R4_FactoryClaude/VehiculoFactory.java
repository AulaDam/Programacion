package R4_FactoryClaude;

public class VehiculoFactory {
    
    public static IVehiculo crearVehiculo(String vehiculo) {
        if (vehiculo.equalsIgnoreCase("coche")) {
            return new Coche();
        } else if (vehiculo.equalsIgnoreCase("moto")) {
            return new Moto();
        } else if (vehiculo.equalsIgnoreCase("barco")) {
            return new Barco();
        }
        return null;
    }
    
    
}
