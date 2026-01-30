package R3_HashMap;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        
        HashMap<Integer, String> pokedex = new HashMap<>();
        
        //Agregar elementos
        pokedex.put(25, "Pikachu");
        pokedex.put(26, "Raichu");
        pokedex.put(01, "Bulbasaur");
        pokedex.put(11, "Metapod");
        
        //Obtener valor
        String pokemon = pokedex.get(26);
        System.out.println("[-] Pokemon 26 es " + pokemon);
        
        //Comprobar si existe una clave
        if (pokedex.containsKey(01)) {
            System.out.println("[-] Bulbasaur esta en la pokedex");
        }
        
        //Modificar valor existente
        pokedex.put(26, "RaichuModificado");
        
        System.out.println(pokedex);
        
        //Eliminar elemento
        pokedex.remove(26);
        
        System.out.println(pokedex);
        
        //Obtener el tamaño
        System.out.println("Tamaño: " + pokedex.size());
        
        //Recorrer el HashMap
        for (int numeroPokedex : pokedex.keySet()) {
            System.out.println(numeroPokedex + ": " + pokedex.get(numeroPokedex));
        }
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
